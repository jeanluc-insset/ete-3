package fr.insset.jeanluc.as2java;


import fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperationImpl;
import fr.insset.jeanluc.action.semantics.builder.StatementContainer;
import fr.insset.jeanluc.el.dialect.JavaDialect;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.Collect;
import fr.insset.jeanluc.ete.gel.Flatten;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.StringLiteral;
import fr.insset.jeanluc.ete.gel.Sum;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.FLOAT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.INT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.TYPE_SUFFIX;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.Conditional;
import fr.insset.jeanluc.ete.xlang.DoWhileLoop;
import fr.insset.jeanluc.ete.xlang.ForLoop;
import fr.insset.jeanluc.ete.xlang.Instanciation;
import fr.insset.jeanluc.ete.xlang.MethodInvocation;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.WhileDoLoop;
import fr.insset.jeanluc.ete.xlang.generator.Generator;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * This class is a dialect so it can be used in velocity templates.<br>
 * It overrides the getOperationBody method with the cross compilation of
 * all the statements associated to the method.
 * 
 * In the QCM example, the Session.computeMark should lead to the following
 * code&nbsp;:
 <code><pre>
    return this.getAskedQuestions()
        .stream()
        .flatMap(q -> q.getCheckedAnswers().stream())
        .map(r -> r.getAnswer())
        .mapToDouble(r -> r.getValue())
        .sum();
</pre></code>
 * We generate that code visiting each navigation.
 * When the post-assertion is "result = ..." we print "return"
 * When the navigation is 1 -> 1 we use map
 * When the navigation is 1 -> * and is "terminal" we use the accessor
 * When the navigation is 1 -> * and is not terminal we use stream
 * When the navigation is * -> * we use flatmap
 * When the navigation is xxx -> double we use mapToDouble
 * When the navigation is xxx -> double* we use flatMapToDouble
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
        register("gelVisit", "fr.insset.jeanluc.ete.gel");
        register("xlangVisit", "fr.insset.jeanluc.ete.xlang");
        register("mofVisit", "fr.insset.jeanluc.ete.meta.model.emof");
    }


    //========================================================================//
    //            G E N E R A T O R   I M P L E M E N T A T I O N             //
    //========================================================================//


    @Override
    public List<Statement> getStatements(String inKey) {
        return statements.get(inKey);
    }

    @Override
    public void setStatements(String inKey, List<Statement> inValue) {
        statements.put(inKey, inValue);
    }


    //========================================================================//
    //                              D I A L E C T                             //
    //========================================================================//


    public String getConditionName(Condition inCondition) {
        StringBuilder    buffer = new StringBuilder();
        String[] name = inCondition.getName().split(" ");
        for (String aPiece : name) {
            buffer.append(i2uc(aPiece));
        }
        return buffer.toString();
    }


    @Override
    public String getOperationBody(MofOperation inOperation, String inIndentation) {
            EnhancedMofOperationImpl operation = (EnhancedMofOperationImpl) inOperation;
            List<Precondition> preconditions = operation.getPreconditions();
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
                    printWriter.append(indentation);
                    printWriter.append("throw new RuntimeException();");
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
    //           V I S I T S   O F   X L A N G   S T A T E M E N T S          //
    //========================================================================//



    public Object xlangVisitVariableDeclaration(VariableDeclaration inDeclaration, Object... parameters) {
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


    public Object xlangVisitAssignment(Assignment inAssignment, Object... parameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) parameters[0];
        String      indent = (String) parameters[1];
        GenerationInformation info = new GenerationInformation();
        output.print(indent);
        GelExpression leftValue = inAssignment.getLeftValue();
        if (leftValue instanceof VariableDefinition) {
//            VariableReference   variable = (VariableReference) leftValue;
//            VariableDefinition declaration = variable.getDeclaration();
            VariableDefinition declaration = (VariableDefinition) leftValue;
            String identifier = declaration.getName();
            if ("result".equals(identifier)) {
                output.print("return ");
            }
            else {
                output.print(identifier);
                output.print(" = ");
            }
            genericVisit(inAssignment.getValue(), parameters);
        }
        else if (leftValue instanceof Nav) {
            info.leftRight = LEFT_RIGHT.LEFT;
            genericVisit(leftValue, output, indent, info);
            output.print("(");
            genericVisit(inAssignment.getValue(), parameters);
            output.print(")");
        }
        output.println(";");
        return inAssignment;
    }



    public MethodInvocation xlangVisitMethodInvocation(MethodInvocation inMethod, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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


    public Object xlangVisitInstanciation(Instanciation inInstanciation, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        output.print("new ");
        output.print(inInstanciation.getMofClass().getName());
        output.print("()");
        return inInstanciation;
    }


    //------------------------------------------------------------------------//


    public Object xlangVisitConditional(Conditional inConditional, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print("if (");
        output.println(") {");
        output.print(indent);
        output.print("}");
        Statement elsePart = (Statement) inConditional.getOperand().get(0);
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


    /*
     * TODO : Do we really need such a structure in the abstract syntax ? Maybe.
     */
    public ForLoop  xlangVisitForLoop(ForLoop inForLoop, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print("for (");
        Statement initialization = (Statement) inForLoop.getOperand().get(0);
        boolean     notTheFirstOne = false;
//        for (Statement anInitializationStatement : initialization) {
//            if (notTheFirstOne) {
//                output.print(", ");
//            }
//            else {
//                notTheFirstOne = true;
//            }
//            genericVisit(anInitializationStatement, inParameters);
//        }
        output.print(" ; ");
        GelExpression condition = inForLoop.getCondition();
        genericVisit(condition, inParameters);
        output.print(" ; ");
        Statement incrementation = (Statement) inForLoop.getOperand().get(0);
        notTheFirstOne = false;
//        for (Statement anIncrementationStatement : incrementation) {
//            if (notTheFirstOne) {
//                output.print(", ");
//            }
//            else {
//                notTheFirstOne = true;
//            }
//            genericVisit(anIncrementationStatement, inParameters);
//        }
        output.print(") {\n");
        String  myIndent = indent + "    ";
        inForLoop.getOperand();
        output.print(indent);
        output.println("}");
        return inForLoop;
    }


    public WhileDoLoop xlangVisitWhileDoLoop(WhileDoLoop inLoop, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print("while (");
        GelExpression condition = inLoop.getCondition();
        genericVisit(condition, output);
        output.println(") {");
        xlangVisitBlock(inLoop.getOperand(), output, indent + indentation);
        output.print(indent);
        output.println("}");
        return inLoop;
    }


    public DoWhileLoop xlangVisitDoWhileLoop(DoWhileLoop inLoop, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        output.print("do {");
        xlangVisitBlock(inLoop.getOperand(), output, indent + indentation);
        output.print(indent);
        output.print("} while (");
        GelExpression condition = inLoop.getCondition();
        genericVisit(condition, output);
        output.println(");");
        return inLoop;
    }


    protected List<? super Statement> xlangVisitBlock(List<? super Statement> inBlock, PrintWriter inOutput, String inIndent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (Object aStatement : inBlock) {
            genericVisit(aStatement, inOutput, inIndent);
        }
        return inBlock;
    }



    //========================================================================//
    //            V I S I T S   O F   G E L   E X P R E S S I O N S           //
    //========================================================================//


    public Object gelVisitVariableReference(VariableDefinition inReference, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        output.print(inReference.getIdentifier());
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


    //------------------------------------------------------------------------//


    public Self     gelVisitSelf(Self inSelf, Object... inParameters) {
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print("this");
        return inSelf;
    }


    //------------------------------------------------------------------------//


    public Sum gelVisitSum(Sum inSum, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        genericVisit(inSum.getOperand().get(0), inParameters);
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print(".sum()");
        return inSum;
    }

    
    public Flatten gelVisitFlatten(Flatten inFlatten, Object... inParameters) {
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print(".map(x -> x)");
        return inFlatten;
    }


    public Collect gelVisitCollect(Collect inCollect, Object... inParameters) {
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print(".map(x -> x)");
        return inCollect;
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
    public AttributeNav gelVisitAttributeNav(AttributeNav inAttributeNav, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output      = (PrintWriter)inParameters[0];
        GelExpression left = null;
        List<GelExpression> operand = inAttributeNav.getOperand();
        MofType       leftType, rightType;
        if (operand == null || (left=operand.get(0)) == null) {
//            output.print("this");
            leftType = inAttributeNav.getToFeature().getOwningMofClass();
        }
        else {
            leftType = left.getType();
            this.genericVisit(left, inParameters);
            output.print('.');
        }
        rightType = inAttributeNav.getType();
        System.out.println("Navigating from " + leftType + " to " + rightType);
        output.print("get");
        String  name = inAttributeNav.getToFeature().getName();
        output.append(name.substring(0, 1).toUpperCase());
        output.append(name.substring(1));
        output.append("()");
        if (!leftType.isCollection()) {
            if (rightType.isCollection()) {
                output.append(".stream()");
            }
        }
        else {
            // leftType.isCollection()
            if (rightType.isCollection()) {
                MofCollection rightTypeColl = (MofCollection) rightType;
                MofType rightBaseType = rightTypeColl.getBaseType();
                if (rightBaseType.isCollection()) {
                    
                }
            }
        }
        return inAttributeNav;
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

/*
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
*/

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


    private     String                          indentation;
    private     MofOperation                    operation;
    private     Map<String, List<Statement>>    statements = new HashMap<>();



    /**
     * An instance of this class is used as a parameter across the visits.
     */
    private class GenerationInformation {
        public String       indentation;
        public MofOperation operation;
        public LEFT_RIGHT   leftRight;
        public Nav          caller;
        public boolean      top;
    }       // GenerationInformation

}       // JavaGenerator
