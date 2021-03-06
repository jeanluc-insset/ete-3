package fr.insset.jeanluc.xlang.to.c;


import fr.insset.jeanluc.action.semantics.builder.EnhancedCondition;
import fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperation;
import fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperationImpl;
import fr.insset.jeanluc.action.semantics.builder.StatementContainer;
import fr.insset.jeanluc.el.dialect.JavaDialect;
import fr.insset.jeanluc.ete.gel.AtPre;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.Collect;
import fr.insset.jeanluc.ete.gel.Flatten;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.OclOperation;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.StringLiteral;
import fr.insset.jeanluc.ete.gel.Sum;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.VariableReference;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Allocation;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.Conditional;
import fr.insset.jeanluc.ete.xlang.DoWhileLoop;
import fr.insset.jeanluc.ete.xlang.ForLoop;
import fr.insset.jeanluc.ete.xlang.Instanciation;
import fr.insset.jeanluc.ete.xlang.MethodInvocation;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.WhileDoLoop;
import fr.insset.jeanluc.ete.xlang.to.xxx.CBasedGenerator;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * 
 * 
 * <div>
 * This class is a dialect so it can be used in velocity templates.<br>
 * It overrides the getOperationBody method with the cross compilation of
 * all the statements associated to the method.
 * </div>
 * 
 * <div>
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
 * </div>
 * 
 * <div>
 * In the bank example, the Account.deposit method should lead to the
 * following code&nbsp;:<br>
 * <pre><code>
 * setBalance(getBalance() + inAmount);
 * </code></pre>
 * The withdraw method should lead to the code&nbsp;:<br>
 * <pre><code>
 * if (getBalance() - inAmount &lt; minBalance)
 *      throw new ExcessiveOverdraftException();
 * setBalance(getBalance() - inAmount);
 * </code></pre>
 * </div>
 *
 * @author jldeleage
 */
public class CGenerator extends CBasedGenerator  {



    public CGenerator() throws InstantiationException {
        this("    ");
    }


    public CGenerator(String indentation) throws InstantiationException  {
        this.indentation = indentation;
        register("gelVisit", "fr.insset.jeanluc.ete.gel");
        register("xlangVisit", "fr.insset.jeanluc.ete.xlang");
        register("mofVisit", "fr.insset.jeanluc.ete.meta.model.emof");
    }


    //========================================================================//
    //            G E N E R A T O R   I M P L E M E N T A T I O N             //
    //========================================================================//



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



    public String getOperationBody(MofOperation inOperation, String inIndentation) {
        EnhancedMofOperationImpl operation = (EnhancedMofOperationImpl) inOperation;
        List<Precondition> preconditions = operation.getPreconditions();
        List<Postcondition> postconditions = operation.getPostconditions();
        StringWriter    stringWriter = new StringWriter();
        PrintWriter     printWriter = new PrintWriter(stringWriter);
        printWriter.append(inIndentation);
        printWriter.append("// number of preconditions : " + preconditions.size());
        printWriter.append("\n");
        for (Condition aCondition : preconditions) {
            processCondition(aCondition, printWriter, inIndentation);
        }
        for (Condition aCondition : postconditions) {
            processCondition(aCondition, printWriter, inIndentation);
        }
        List<Statement> statementList = operation.getStatements();
        printWriter.append('\n');
        printWriter.append(inIndentation);
        for (Statement aStatement : statementList) {
            try {
                genericVisit(aStatement, printWriter, inIndentation, operation);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(CGenerator.class.getName()).log(Level.SEVERE, null, ex);
                printWriter.append("\n// Unable to compile : ");
                printWriter.append(aStatement.toString());
                printWriter.append(ex.toString());
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
        printWriter.print("\n");
        printWriter.print(inIndentation);
        printWriter.print("// ");
        try {
            printWriter.print(aCondition.getSpecificationAsString());
        }
        catch (Exception ex) {
            printWriter.printf("PB : " + ex);
        }
        EnhancedCondition condition = (EnhancedCondition) aCondition;
        List<Statement> statements = condition.getStatements();
        for (Statement aStatement : statements) {
            try {
                printWriter.print("\n");
                genericVisit(aStatement, printWriter, inIndentation);
            } catch (Exception ex) {
                printWriter.printf("PB : " + ex.getMessage());
                Logger.getLogger(CGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    //========================================================================//
    //           V I S I T S   O F   X L A N G   S T A T E M E N T S          //
    //========================================================================//


    public Object xlangVisitVariableDeclaration(VariableDeclaration inDeclaration, Object... parameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) parameters[0];
        String      indent = (String) parameters[1];
        VariableDefinition definitionExpression = inDeclaration.getDefinitionExpression();
        output.print(indent);
        output.print("t_");
        output.print(definitionExpression.getType());
        output.print(" *");
        output.print(definitionExpression.getIdentifier());
        output.print(" = ");
        genericVisit(definitionExpression.getValue(), parameters);
        output.println(";");
        return inDeclaration;
    }


    /**
     * The expression <code>self.address.town.country</code> must be compiled as
     * <code>self->address->town->country = ...</code> or as
     * <code>getAddress().getTown().getCountry()</code> depending on whether
     * it is used on the left part of an assignment or not.<br>
     * When starting visiting the left part of an assignment, the visitor sets
     * the third parameter to true. Any visit should set back to false that
     * parameter 
     * 
     */
    public Object xlangVisitAssignment(Assignment inAssignment, Object... parameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) parameters[0];
        String      indent = (String) parameters[1];
        output.print(indent);
        GelExpression leftValue = inAssignment.getLeftValue();
        if (leftValue instanceof VariableDefinition) {
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
        else if (leftValue instanceof Step) {
            Step    leftStep = (Step) leftValue;
            List<GelExpression> operand = leftStep.getOperand();
            if (operand != null && operand.size() > 0) {
                genericVisit(operand.get(0), parameters);
                output.print("->");
            }
            Feature feature = leftStep.getToFeature();
            output.print(i2lc(feature.getName()));
            output.print(" = ");
            genericVisit(inAssignment.getValue(), parameters);
        }
        output.println(";");
        return inAssignment;
    }




    public MethodInvocation xlangVisitMethodInvocation(MethodInvocation inMethod, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        output.print(inMethod.getMethod().getName());
        output.print("(");
        genericVisit(inMethod.getTarget(), inParameters);
        boolean     notTheFirstOne = false;
        for (GelExpression aParameter : inMethod.getParameters()) {
            if (notTheFirstOne) {
                output.print(", ");
            }
            notTheFirstOne = true;
            genericVisit(aParameter, inParameters);
        }
        output.print(")");
        return inMethod;
    }

    public Object xlangVisitInstanciation(Instanciation inInstanciation, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        
        output.print("malloc(sizeof(t_");
        output.print(inInstanciation.getMofClass().getName());
        output.print("));\n");
        return inInstanciation;
    }



    public Object xlangVisitAllocation(Allocation inInstanciation, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output = (PrintWriter) inParameters[0];
        String      indent = (String) inParameters[1];
        output.print(indent);
        GelExpression get = inInstanciation.getOperand().get(0);
        get = get.getOperand().get(0);
        genericVisit(get, inParameters);
        output.print(" = malloc(sizeof(t_");
        output.print(inInstanciation.getMofClass().getName());
        output.print("));\n");
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


    public Object gelVisitVariableReference(VariableReference inReference, Object... inParameters) {
        PrintWriter output = (PrintWriter) inParameters[0];
        output.print(inReference.getName());
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
        output.print("self");
        return inSelf;
    }


//    public Object gelVisitVariableReference(VariableReference inVariable, Object... inParameters) {
//        PrintWriter output      = (PrintWriter)inParameters[0];
//        TypedElement definition = inVariable.getDefinition();
//        output.print(definition.getName());
//        return inVariable;
//    }


    //------------------------------------------------------------------------//


    public OclOperation gelVisitOclOperation(OclOperation inOperation, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inOperation.getOperand();
        genericVisit(operand.get(0), inParameters);
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print(inOperation.getValueOf("symbol"));
        genericVisit(operand.get(1), inParameters);
        return inOperation;
    }


    //------------------------------------------------------------------------//


    public AtPre gelVisitAtPre(AtPre inAtPre, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        GelExpression get = inAtPre.getOperand().get(0);
        EnhancedMofOperation operation = (EnhancedMofOperation) inParameters[2];
        Map<GelExpression, VariableDeclaration> localVariables = operation.getLocalVariables();
        VariableDeclaration variable = localVariables.get(get);
        String name = variable.getDefinitionExpression().getIdentifier();
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print(name);
        return inAtPre;
    }

    public Allocation visitAllocation(Allocation inNew, Object... inParameters) throws IllegalAccessException, IllegalArgumentException {
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print("malloc(sizeof(");
        output.print(inNew.getMofClass().getName());
        output.print("))");
        return inNew;
    }


    //------------------------------------------------------------------------//



    public Sum gelVisitSum(Sum inSum, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        genericVisit(inSum.getOperand().get(0), inParameters);
        PrintWriter output      = (PrintWriter)inParameters[0];
        output.print(".sum()");
        return inSum;
    }


    public Flatten gelVisitFlatten(Flatten inFlatten, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Step left = (Step) inFlatten.getOperand().get(0);
        genericVisit(left.getOperand().get(0), inParameters);
        PrintWriter output      = (PrintWriter)inParameters[0];
        String      indent = (String) inParameters[1];
        output.print("\n");
        output.print(indent);
        output.print(indentation);
        output.print("// flatten is not translated");
        return inFlatten;
    }


    public Collect gelVisitCollect(Collect inCollect, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output      = (PrintWriter)inParameters[0];
        String      indent = (String) inParameters[1];
        output.print("\n");
        output.print(indent);
        output.print(indentation);
        output.print("// collect is not translated");
        return inCollect;
    }


    
/**
 *          The expression
 * 
 *          askedQuestions.checkedAnswers.flatten.answer.value.sum
 * 
 *          is translated to
 * 
 *         return this.getAskedQuestions().stream()
                .flatMap(q -> q.getCheckedAnswsers().stream())
                .map(r -> r.getAnswer())
                .mapToDouble(r -> r.getValue())
                .sum();
 * 
 * When the navigation is * -> 1 we use map
 * When the navigation is 1 -> * and is "terminal" we use the accessor
 * When the navigation is 1 -> * and is not terminal we use stream
 * When the navigation is * -> * we use flatmap
 */
    public AttributeNav gelVisitAttributeNav(AttributeNav inAttributeNav, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output          = (PrintWriter)inParameters[0];
        String      indent = indentation + (String) inParameters[1];

        List<GelExpression> operand = inAttributeNav.getOperand();
        if (operand != null && operand.size() > 0) {
            genericVisit(operand.get(0), inParameters);
            output.print("->");
        }

        Feature feature     = inAttributeNav.getToFeature();
        String  featureName = feature.getName();
        output.print(i2lc(featureName));
        if (feature.getType().isCollection()) {
            output.print("[");
            output.print("\n");
            output.print(indent);
            output.print("// collect is not translated");
            output.print("\n");
            output.print(indent);
            output.print("]");
        }
        return inAttributeNav;
    }


    //========================================================================//
    //                  V I S I T S   O F   M O F   I T E M S                 //
    //========================================================================//


    public MofProperty mofVisitMofProperty(MofProperty inProperty, Object... inParameters) {
        PrintWriter output = (PrintWriter)inParameters[0];
        return inProperty;
    }



    //========================================================================//
    //                            U T I L I T I E S                           //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


    private     String                          indentation;
    private     Map<String, List<Statement>>    statements = new HashMap<>();
    private     List<GelExpression>             expressionsAtPre = new LinkedList<>();


}       // JavaGenerator
