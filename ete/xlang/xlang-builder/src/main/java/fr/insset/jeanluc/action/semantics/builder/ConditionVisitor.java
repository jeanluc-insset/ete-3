package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GelParser;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.impl.GelParserWrapper;
import fr.insset.jeanluc.ete.gel.impl.TreeBuilder;
import fr.insset.jeanluc.ete.gel.impl.VariableDefinitionImpl;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.meta.model.io.ModelReader;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class ConditionVisitor extends DynamicVisitorSupport {

    public ConditionVisitor() {
        register(Precondition.class, "visitPrecondition");
        register(Postcondition.class, "visitPostcondition");
    }

    
    
    /**
     * This method is called for each and every precondition when the model is
     * read.<br>
     * The condition must already have a string specification.<br>
     * We compile it and store into the condition a StatementContainer
     * containing the resulting abstract tree and the statements computing
     * it.<br>
     * Furthermore, the statement containers are sorted on the fly&nbsp;: the
     * order is defined by the precedence graph.
     * 
     * @param inCondition
     * @param inParameters
     * @return 
     */
    public Precondition visitPrecondition(Precondition inCondition, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Visit of " + inCondition.getSpecificationAsString());
        EteModel        model                     = (EteModel)inParameters[1];
        String conditionName = inCondition.getName();
        if (conditionName == null) {
            conditionName = "" + numCheck++;
        }
        Map<String, VariableDefinition> variables = FactoryMethods.newMap(String.class, VariableDefinition.class);
        conditionName = "check_" + conditionName;
        addVariable(conditionName, (MofType)model.getElementByName("boolean"), variables);

        MofOperation    context                   = (MofOperation) inParameters[0];
        List<Statement> statements = getStatements((EnhancedMofOperationImpl) context, "body");
        // This should build a list of statements returning a boolean value
        // If that value is not
        visitACondition(inCondition, model, context, variables, statements);
        return inCondition;
    }

    
    
    /**
     * This method is called for each and every postcondition when the model is
     * read.<br>
     * The condition must already have a string specification.<br>
     * We compile it and store into the condition a StatementContainer
     * containing the resulting abstract tree and the statements computing
     * it.<br>
     * Furthermore, the statement containers are sorted on the fly&nbsp;: the
     * order is defined by the precedence graph.
     * 
     * @param inCondition
     * @param inParameters
     * @return 
     */
    public Postcondition    visitPostcondition(Postcondition inCondition, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Visit of " + inCondition.getSpecificationAsString());

        EnhancedMofOperationImpl    context = (EnhancedMofOperationImpl)inParameters[0];
        List<Statement>             statements    = getStatements(context, "body");
        
        EteModel        model               = (EteModel)inParameters[1];
        Map<String, VariableDefinition> variables  = FactoryMethods.newMap(String.class, VariableDefinition.class);
        addVariable("result", context.getType(), variables);
        visitACondition(inCondition, model, context, variables, statements);
        return inCondition;
    }


    protected void visitACondition(Condition inCondition, EteModel model,
            MofOperation context, Map<String, VariableDefinition> variables,
            List<Statement> result) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Visit of " + inCondition.getSpecificationAsString());

        // 1- parse the condition
        String          specificationAsString = inCondition.getSpecificationAsString();
        GelParser       parser                = GelParserWrapper.newParser(specificationAsString);
        GelParser.GelExpressionContext   ctx  = parser.gelExpression();

        // 2- build expression as an abstract tree
        // TODO : use an abstract factory
        TreeBuilder     treeBuilder           = new TreeBuilder(model, context, variables);
        GelExpression   expression            = treeBuilder.visitGelExpression(ctx);

        // 3- visit the GelExpression to build statements
        //    The statements are added to the preexisting list
        SimpleActionSemanticsBuilder builder = new SimpleActionSemanticsBuilder();
        builder.buildStatements(expression, result);

//        // 4- wrap everything into a "container" and put it into the
//        // the condition itself
//        // TODO : we must share the same container between all conditions on
//        // a single operation.
//        StatementContainer  container         = new StatementContainer();
//        container.setStatements(result);
//        container.setAbstractTree(expression);
//        inCondition.setSpecification(container);
    }


    //========================================================================//


    protected void addVariable(String inIdentifier, MofType inType, Map<String, VariableDefinition> inoutVariables) {
        VariableDefinition resultVariable   = new VariableDefinitionImpl();
        resultVariable.setIdentifier(inIdentifier);
        resultVariable.setType(inType);
        inoutVariables.put(inIdentifier, resultVariable);
    }


    protected List<Statement> getStatements(EnhancedMofOperationImpl inOperation, String inKey) throws InstantiationException {
        Map<String, List<Statement>> statementMap = inOperation.getStatements();
        if (statementMap == null) {
            Map plainMap = FactoryMethods.newMap(String.class, List.class);
            statementMap = plainMap;
            inOperation.setStatements(statementMap);
        }
        List<Statement> statementList = statementMap.get(inKey);
        if (statementList == null) {
            statementList = FactoryMethods.newList(Statement.class);
            statementMap.put(inKey, statementList);
        }
        return statementList;
    }


    //========================================================================//


    public static void  enableActionSemantics(ModelReader inReader) {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        inReader.addVisitors(new ConditionVisitor());
    }

    
    //========================================================================//

    
    private     int numCheck = 0;


}
