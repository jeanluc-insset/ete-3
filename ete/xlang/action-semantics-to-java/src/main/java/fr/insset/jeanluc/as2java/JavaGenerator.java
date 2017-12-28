package fr.insset.jeanluc.as2java;




import fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperationImpl;
import fr.insset.jeanluc.action.semantics.builder.StatementContainer;
import fr.insset.jeanluc.el.dialect.JavaDialect;
import fr.insset.jeanluc.ete.as.*;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.FLOAT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.INT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.TYPE_SUFFIX;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.gel.CollectionOperationExpression;
import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.gel.Navigable;
import fr.insset.jeanluc.gel.Navigation;
import fr.insset.jeanluc.gel.Self;
import fr.insset.jeanluc.gel.StringLiteral;
import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.VariableReference;
import fr.insset.jeanluc.mda.ete.as.generator.Generator;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * This class is a dialect so it can be used in velocity templates.<br>
 * It overrides the getOperationBody method with the cross compilation of
 * all the statements associated to the method.
 * 
 * In the QCM example, the Passage.calculeNote should lead to the following
 * code&nbsp;:
 <code><pre>
    return this.getQuestionsPosees()
        .stream()
        .flatMap(q -> q.getReponsesFournies().stream())
        .map(r -> r.getReponse())
        .mapToDouble(r -> r.getValeur())
        .sum();
</pre></code>
 * We generate that code visiting each navigation.
 * When the navigation is * -> 1 we use map
 * When the navigation is 1 -> * and is "terminal" we use the accessor
 * When the navigation is 1 -> * and is not terminale we use stream
 * When the navigation is * -> * we use flatmap
 *
 * @author jldeleage
 */
public class JavaGenerator extends DynamicVisitorSupport implements Generator, JavaDialect  {

    private enum LEFT_RIGHT {
        LEFT, RIGHT
    };



    public JavaGenerator() {
        this("    ");
    }


    public JavaGenerator(String indentation) {
        this.indentation = indentation;
        register("gelVisit", "fr.insset.jeanluc.gel");
        register("asVisit", "fr.insset.jeanluc.ete.as");
        register("mofVisit", "fr.insset.jeanluc.ete.meta.model.emof");
    }


    //========================================================================//
    //                              D I A L E C T                             //
    //========================================================================//


    public String getConditionName(Condition inCondition) {
        StringBuilder    buffer = new StringBuilder();
        String[] name = inCondition.getName().split(" ");
        for (String aPiece : name) {
            buffer.append(aPiece.substring(0, 1).toUpperCase() + aPiece.substring(1));
        }
        return buffer.toString();
    }


    @Override
    public String getOperationBody(MofOperation inOperation, String inIndentation) {
        EnhancedMofOperationImpl operation = (EnhancedMofOperationImpl) inOperation;
        Map<String, List<Statement>> statementMap = operation.getStatements();
        if (statementMap == null) {
            return "";
        }
        List<Statement> statementList = statementMap.get("body");
        this.operation = inOperation;
        StringWriter    stringWriter = new StringWriter();
        PrintWriter     printWriter = new PrintWriter(stringWriter);
        printWriter.append(inIndentation);
        for (Statement aStatement : statementList) {
            try {
                genericVisit(aStatement, printWriter, inIndentation);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(JavaGenerator.class.getName()).log(Level.SEVERE, null, ex);
                printWriter.append("// Unable to compile : ");
                printWriter.append(aStatement.toString());
                printWriter.append('\n');
            }
        }
        printWriter.flush();
        String result = stringWriter.toString();
        Logger      logger = Logger.getGlobal();
        logger.log(Level.FINE, "Operation generee : \n" + result);
        return result;
    }


    protected void processCondition(Condition aCondition, PrintWriter printWriter, String inIndentation) {
        StatementContainer container = (StatementContainer)aCondition.getSpecification();
        List<Statement> statements = container.getStatements();
        for (Statement aStatement : statements) {
            try {
                genericVisit(aStatement, printWriter, inIndentation);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(JavaGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }



    //========================================================================//
    //             V I S I T S   O F   A - S   S T A T E M E N T S            //
    //========================================================================//



    public Object asVisitAssignment(Assignment inAssignment, Object... parameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) parameters[0];
        String      indent = (String) parameters[1];
        GenerationInformation info = new GenerationInformation();
        output.print(indent);
        GelExpression leftValue = inAssignment.getLeftValue();
        if (leftValue instanceof VariableReference) {
            VariableReference   variable = (VariableReference) leftValue;
            VariableDefinition declaration = variable.getDeclaration();
            String identifier = declaration.getIdentifier();
            if ("result".equals(identifier)) {
                output.print("return ");
            }
            else {
                output.print(identifier);
                output.print(" = ");
            }
            genericVisit(inAssignment.getValue(), parameters);
        }
        else if (leftValue instanceof Navigation) {
            info.leftRight = LEFT_RIGHT.LEFT;
            genericVisit(leftValue, output, indent, info);
            output.print("(");
            genericVisit(inAssignment.getValue(), parameters);
            output.print(")");
        }
        output.println(";");
        return inAssignment;
    }


    public Object asVisitVariableDeclaration(VariableDeclaration inDeclaration, Object... parameters) {
        PrintWriter output = (PrintWriter) parameters[0];
        String      indent = (String) parameters[1];
        VariableDefinition definitionExpression = inDeclaration.getDefinitionExpression();
        output.print(indent);
        output.print(definitionExpression.getType());
        output.print(" ");
        output.print(definitionExpression.getIdentifier());
        output.println(";");
        return inDeclaration;
    }


    //------------------------------------------------------------------------//


    public Object asVisitConditional(Conditional inConditional, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print("if (");
        output.println(") {");
        output.print(indent);
        output.print("}");
        Statement elsePart = inConditional.getElsePart();
        if (elsePart != null) {
            output.println(" else {");
            output.print(indent);
            output.println("}");
        }
        else {
            output.println();
        }
        return inConditional;
    }


    public ForLoop  asVisitForLoop(ForLoop inForLoop, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print("for (");
        List<Statement> initialization = inForLoop.getInitialization();
        boolean     notTheFirstOne = false;
        for (Statement anInitializationStatement : initialization) {
            if (notTheFirstOne) {
                output.print(", ");
            }
            else {
                notTheFirstOne = true;
            }
            genericVisit(anInitializationStatement, inParameters);
        }
        output.print(" ; ");
        GelExpression condition = inForLoop.getCondition();
        genericVisit(condition, inParameters);
        output.print(" ; ");
        List<Statement> incrementation = inForLoop.getIncrementation();
        notTheFirstOne = false;
        for (Statement anIncrementationStatement : incrementation) {
            if (notTheFirstOne) {
                output.print(", ");
            }
            else {
                notTheFirstOne = true;
            }
            genericVisit(anIncrementationStatement, inParameters);
        }
        return inForLoop;
    }


    public WhileDoLoop asVisitWhileDoLoop(WhileDoLoop inLoop, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print("while (");
        GelExpression condition = inLoop.getCondition();
        genericVisit(condition, output);
        output.println(") {");
        asVisitBlock(inLoop.getBody(), output, indent + indentation);
        output.print(indent);
        output.println("}");
        return inLoop;
    }


    public DoWhileLoop asVisitDoWhileLoop(DoWhileLoop inLoop, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print("do {");
        asVisitBlock(inLoop.getBody(), output, indent + indentation);
        output.print(indent);
        output.print("} while (");
        GelExpression condition = inLoop.getCondition();
        genericVisit(condition, output);
        output.println(");");
        return inLoop;
    }


    protected List<Statement> asVisitBlock(List<Statement> inBlock, PrintWriter inOutput, String inIndent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (Statement aStatement : inBlock) {
            genericVisit(aStatement, inOutput, inIndent);
        }
        return inBlock;
    }


    //========================================================================//
    //             V I S I T S   O F   A S   E X P R E S S I O N S            //
    //========================================================================//


    public MethodInvocation asVisitMethodInvocation(MethodInvocation inMethod, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        genericVisit(inMethod.getTarget(), inParameters);
        output.print(".");
        output.print(inMethod.getMethod().getName());
        boolean     notTheFirstOne = false;
        for (GelExpression aParameter : inMethod.getParameters()) {
            if (notTheFirstOne) {
                output.print(", ");
            }
            genericVisit(aParameter, inParameters);
        }
        return inMethod;
    }


    public Object asVisitInstanciation(Instanciation inInstanciation, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        output.print("new ");
        output.print(inInstanciation.getMofClass().getName());
        output.print("()");
        return inInstanciation;
    }


    //========================================================================//
    //            V I S I T S   O F   G E L   E X P R E S S I O N S           //
    //========================================================================//


    public Object gelVisitVariableReference(VariableReference inReference, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        output.print(inReference.getDeclaration().getIdentifier());
        return inReference;
    }


    public Object gelVisitVariableDefinition(VariableDefinition inDefinition, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print(inDefinition.getIdentifier());
        return inDefinition;
    }


    public StringLiteral gelVisitStringLiteral(StringLiteral inLiteral, Object... inParameters) {
        PrintWriter output = (PrintWriter)inParameters[0];
        output.print('"');
        output.print(inLiteral.getValue());
        output.print('"');
        return inLiteral;
    }

/**
 *         return this.getQuestionsPosees().stream()
                .flatMap(q -> q.getReponsesFournies().stream())
                .map(r -> r.getReponse())
                .mapToDouble(r -> r.getValeur())
                .sum();
 * 
 * When the navigation is * -> 1 we use map
 * When the navigation is 1 -> * and is "terminal" we use the accessor
 * When the navigation is 1 -> * and is not terminale we use stream
 * When the navigation is * -> * we use flatmap
 */
    public Navigation gelVisitNavigation(Navigation inNavigation, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output      = (PrintWriter)inParameters[0];
        String      indent      = (String)inParameters[1];
        GenerationInformation info;
        if (inParameters.length >= 3) {
            info = (GenerationInformation) inParameters[2];
        }
        else {
            info = new GenerationInformation();
            info.leftRight = LEFT_RIGHT.RIGHT;
        }
        LEFT_RIGHT  leftRight   = info.leftRight;
        info.leftRight= LEFT_RIGHT.RIGHT;
        Navigable from = inNavigation.getFrom();
        genericVisit(from, output, indent, info);
        if (from instanceof Navigation) {
            output.print("\n");
            output.print(indent);
            output.print("        ");
        }
        MofType fromType = from.getType();
        Feature toFeature = inNavigation.getToFeature();
        info.leftRight = leftRight;
        if (fromType instanceof MofCollection) {
            MofType toFeatureType = toFeature.getType();
            if (toFeatureType instanceof MofCollection) {
                output.print(".flatMap(x -> x.");
                genericVisit(toFeature, output, indent, info);
                output.print(".stream())");
            }
            else {
                String  toFeatureTypeName = toFeatureType.getName();
                if ((FLOAT_TYPE + TYPE_SUFFIX).equals(toFeatureTypeName)) {
                    output.print(".mapToDouble");
                } else if ((INT_TYPE + TYPE_SUFFIX).equals(toFeatureTypeName)) {
                    output.print(".mapToInt");
                }else {
                    output.print(".map");
                }
                output.print("(x->x.");
                genericVisit(toFeature, output, indent, info);
                output.print(')');
            }
        } else {
            output.print('.');
            genericVisit(toFeature, output, indent, info);
            MofType toFeatureType = toFeature.getType();
            if (toFeatureType instanceof MofCollection) {
                output.print("\n");
                output.print(indent);
                output.print("        ");
                output.print(".stream()");
            }
        }
        
        return inNavigation;
    }

    public CollectionOperationExpression gelVisitCollectionOperationExpression(CollectionOperationExpression inCollectionOperation, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output      = (PrintWriter)inParameters[0];
        // TODO : look for the right accumulator ; its syntax is not the
        // plain identifier
        genericVisit(inCollectionOperation.getFrom(), inParameters);
        output.print('.');
        output.print(inCollectionOperation.getIdentifier());
        output.print('(');
        for (GelExpression operand : inCollectionOperation.getParameter()) {
            genericVisit(operand, inParameters);
        }
        output.print(')');        
        return inCollectionOperation;
    }

    public Self     gelVisitSelf(Self inSelf, Object... inParameters) {
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print("this");
        return inSelf;
    }


    //========================================================================//
    //                  V I S I T S   O F   M O F   I T E M S                 //
    //========================================================================//


    public MofProperty mofVisitMofProperty(MofProperty inProperty, Object... inParameters) {
        PrintWriter output = (PrintWriter)inParameters[0];
        GenerationInformation info = (GenerationInformation)inParameters[2];
        if (info.leftRight == LEFT_RIGHT.LEFT) {
            output.print("set");
            output.print(upperCaseInit(inProperty.getName()));
        }
        else {
            output.print("get");
            output.print(upperCaseInit(inProperty.getName()));
            output.print("()");
        }
        return inProperty;
    }


    public MofOperation mofVisitMofOperation(MofOperation inOperation, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter)inParameters[0];
        output.print(inOperation.getName());
        output.print('(');
        Navigation  navigation      = (Navigation) inParameters[3];
        boolean     pasLaPremiere   = false;
        for (GelExpression exp : navigation.getParameter()) {
            if (pasLaPremiere) {
                output.print(", ");
            }
            else {
                pasLaPremiere = true;
            }
            genericVisit(exp, inParameters);
        }
        output.print(')');
        return inOperation;
    }


    //========================================================================//
    //                            U T I L I T I E S                           //
    //========================================================================//


    protected void printSemicolumn(Object... inParameters) {
        if (inParameters.length < 2) {
            return;
        }
        PrintWriter output = (PrintWriter) inParameters[0];
        output.println(";");
    }


    protected String upperCaseInit(String inString) {
        return inString.substring(0, 1).toUpperCase() + inString.substring(1);
    }


    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


    private     String          indentation;
    private     MofOperation    operation;



    /**
     * An instance of this class is used as a parameter across the visits.
     */
    private class GenerationInformation {
        public String       indentation;
        public MofOperation operation;
        public LEFT_RIGHT   leftRight;
        public Navigation   caller;
        public boolean      top;
    }       // GenerationInformation

}       // JavaGenerator
