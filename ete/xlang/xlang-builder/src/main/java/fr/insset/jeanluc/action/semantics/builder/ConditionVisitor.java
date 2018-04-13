package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.AtPre;
import fr.insset.jeanluc.ete.gel.GelContext;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GelParser;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.VariableReference;
import fr.insset.jeanluc.ete.gel.impl.GelContextImpl;
import fr.insset.jeanluc.ete.gel.impl.GelParserWrapper;
import fr.insset.jeanluc.ete.gel.impl.TreeBuilder;
import fr.insset.jeanluc.ete.gel.impl.VariableDefinitionImpl;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import static fr.insset.jeanluc.ete.meta.model.constraint.Invariant.INVARIANT;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import static fr.insset.jeanluc.ete.meta.model.constraint.Postcondition.POSTCONDITION;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.builder.BodyBuilder;
import fr.insset.jeanluc.meta.model.io.ModelReader;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The ConditionVisitor builds statements for an "enhanced" condition and stores
 * these statements into the condition itself.
 *
 * @author jldeleage
 */
public class ConditionVisitor extends DynamicVisitorSupport {



    public static void  enableActionSemantics(ModelReader inReader) throws ClassNotFoundException {
        Class.forName("fr.insset.jeanluc.action.semantics.builder.ActionSemanticsAction");
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        inReader.addVisitors(new ConditionVisitor());
    }


    //========================================================================//

   
    
    public ConditionVisitor() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        FactoryRegistry parent = registry.getParent();
        if (parent == null) {
            // Test conditions : the visitor creation is hard coded instead of
            // declared with an action
            registerFactories(registry);
        }
        else {
            // "Normal" conditions : the visitor is created by an action
            registerFactories(parent);
        }
        // Visiting methods registration
        register(Precondition.class, "visitPrecondition");
        register(Postcondition.class, "visitPostcondition");
        register(EnhancedPostcondition.class, "visitEnhancedPostcondition");
        // Registration of the methods to visit gel expression
        register("gelVisit", "fr.insset.jeanluc.ete.gel");
        
    }


    private void registerFactories(FactoryRegistry inoutRegistry) {
        inoutRegistry.registerFactory(MOF_CLASS, fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl.class);
        inoutRegistry.registerFactory(MOF_OPERATION, fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperationImpl.class);
        inoutRegistry.registerFactory(INVARIANT, EnhancedInvariant.class);
        inoutRegistry.registerFactory(POSTCONDITION, EnhancedPostcondition.class);
    }



    //========================================================================//

    
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


    //========================================================================//


//    /**
//     * This method is called for each and every postcondition when the model is
//     * read.<br>
//     * The condition must already have a string specification.<br>
//     * We compile it and store into the condition a StatementContainer
//     * containing the resulting abstract tree and the statements computing
//     * it.<br>
//     * Furthermore, the statement containers are sorted on the fly&nbsp;: the
//     * order is defined by the precedence graph.
//     * 
//     * @param inCondition
//     * @param inParameters
//     * @return 
//     */
//    public Postcondition    visitPostcondition(Postcondition inCondition, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Visit of " + inCondition.getSpecificationAsString());
//
//        System.out.println("Parsing a standard postcondition : " + inCondition + " (" + inCondition.getClass().getName() + ")");
//        EnhancedMofOperationImpl    context = (EnhancedMofOperationImpl)inParameters[0];
//        List<Statement>             statements    = getStatements(context, "body");
//
//        EteModel        model               = (EteModel)inParameters[1];
//        Map<String, VariableDefinition> variables  = FactoryMethods.newMap(String.class, VariableDefinition.class);
//        addVariable("result", context.getType(), variables);
//        GelExpression expression = visitACondition(inCondition, model, context, variables, statements);
//        BodyBuilderOld builder = new BodyBuilderOld();
//        List<Statement> inoutResult = new LinkedList<>();
//        builder.buildStatements(expression, inoutResult);
//        return inCondition;
//    }


    public EnhancedPrecondition    visitEnhancedPrecondition(EnhancedPrecondition inCondition, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Visit of " + inCondition.getSpecificationAsString());

        System.out.println("PARSING A STANDARD ENHANCED PRECONDITION");
        

        EnhancedMofOperationImpl    context = (EnhancedMofOperationImpl)inParameters[0];
        List<Statement>             statements    = getStatements(context, "body");

        EteModel        model               = (EteModel)inParameters[1];
        Map<String, VariableDefinition> variables  = FactoryMethods.newMap(String.class, VariableDefinition.class);
        addVariable("result", context.getType(), variables);
        GelExpression expression = visitACondition(inCondition, model, context, variables, statements);

        extractVariables(expression);

        return inCondition;
    }



    public EnhancedPostcondition    visitEnhancedPostcondition(EnhancedPostcondition inCondition, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Visit of " + inCondition.getSpecificationAsString());

        System.out.println("PARSING A STANDARD ENHANCED POSTCONDITION : " + inCondition.getSpecificationAsString());

        EnhancedMofOperationImpl    context = (EnhancedMofOperationImpl)inParameters[0];
//        context.getPostconditions().add(inCondition);
        List<Statement>             statements    = getStatements(context, "body");

        EteModel        model               = (EteModel)inParameters[1];
        Map<String, VariableDefinition> variables  = FactoryMethods.newMap(String.class, VariableDefinition.class);
        addVariable("result", context.getType(), variables);
        GelExpression expression = visitACondition(inCondition, model, context, variables, statements);
        inCondition.setExpression(expression);

        extractVariables(expression);
        BodyBuilder builder = new BodyBuilder();
        List<Statement> inoutResult = new LinkedList<>();
        builder.buildStatements(expression, inoutResult, context.getLocalVariables());
        inCondition.setStatements(statements);

        return inCondition;
    }



    //========================================================================//
    //      G E L   E X P R E S S I O N   V I S I T O R   M E T H O D S       //
    //========================================================================//


    protected void extractVariables(GelExpression expression) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.genericVisit(expression);
    }


    public AtPre gelVisitAtPre(AtPre inAtPre, Object... parameters) {
        return inAtPre;
    }


    public VariableReference getVisitVariableReference(VariableReference inVariable, Object... parameters) {
        return inVariable;
    }


    //========================================================================//


    
    protected void generateSelectsFromPrecondition(Precondition inCondition) {
        
    }




    //========================================================================//



    protected GelExpression visitACondition(Condition inCondition, EteModel model,
            MofOperation context, Map<String, VariableDefinition> variables,
            List<Statement> inoutResult) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Logger logger = Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor");
        logger.log(Level.INFO, "Visit of " + inCondition.getSpecificationAsString());

        // 1- parse the condition
        String          specificationAsString = inCondition.getSpecificationAsString();
        GelParser       parser                = GelParserWrapper.newParser(specificationAsString);
        GelParser.GelExpressionContext   ctx  = parser.gelExpression();

        // 2- build expression as an abstract tree
        // TODO : use an abstract factory
        GelContext      gelContext            = new GelContextImpl(model, (MofClass)context.getOwningMofClass(), context);
        gelContext.set("model", model);
        gelContext.set("context", context);
        gelContext.set("contextualClass", parser);
        TreeBuilder     treeBuilder           = new TreeBuilder(gelContext);
        GelExpression   expression            = treeBuilder.visitGelExpression(ctx);
        logger.log(Level.FINER, "GelExpression : " + expression);

        // 3- visit the GelExpression to build statements
        //    The statements are added to the preexisting list
        BodyBuilder builder = new BodyBuilder();
        builder.buildStatements(expression, inoutResult, ((EnhancedMofOperationImpl)context).getLocalVariables());
        logger.log(Level.INFO, "Statements : " + inoutResult + " (" + inoutResult.size() + ")");

        EnhancedMofOperationImpl    enhancedMofOperation = (EnhancedMofOperationImpl) context;
        enhancedMofOperation.buildBody();
        return expression;
    }



    protected GelExpression visitAConditionOld(Condition inCondition, EteModel model,
            MofOperation context, Map<String, VariableDefinition> variables,
            List<Statement> inoutResult) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Visit of " + inCondition.getSpecificationAsString());

        // 1- parse the condition
        String          specificationAsString = inCondition.getSpecificationAsString();
        GelParser       parser                = GelParserWrapper.newParser(specificationAsString);
        GelParser.GelExpressionContext   ctx  = parser.gelExpression();

        // 2- build expression as an abstract tree
        // TODO : use an abstract factory
        GelContext      gelContext            = new GelContextImpl(model, (MofClass)context.getOwningMofClass(), context);
        gelContext.set("model", model);
        gelContext.set("context", context);
        gelContext.set("contextualClass", parser);
        TreeBuilder     treeBuilder           = new TreeBuilder(gelContext);
        GelExpression   expression            = treeBuilder.visitGelExpression(ctx);

        // 3- visit the GelExpression to build statements
        //    The statements are added to the preexisting list
//        BodyBuilderOld builder = new BodyBuilderOld();
//        builder.buildStatements(expression, inoutResult);

        // 4- wrap everything into a "container" and put it into the
        // the condition itself
        // TODO : we should share the same container between all conditions on
        // a single operation, should not we ?
//        StatementContainer  container         = new StatementContainer();
//        container.setStatements(inoutResult);
//        container.setAbstractTree(expression);
//        inCondition.setSpecification(container);
//        List<Statement> statements = ((EnhancedMofOperationImpl)context).getBody();
//        if (statements == null) {
//            statements = FactoryMethods.newList(Statement.class);
//            ((EnhancedMofOperationImpl)context).setStatements(statements);
//        }
        return expression;
    }


    //========================================================================//


    protected void addVariable(String inIdentifier, MofType inType, Map<String, VariableDefinition> inoutVariables) {
        VariableDefinition resultVariable   = new VariableDefinitionImpl();
        resultVariable.setIdentifier(inIdentifier);
        resultVariable.setType(inType);
        inoutVariables.put(inIdentifier, resultVariable);
    }


    protected List<Statement> getStatements(EnhancedMofOperationImpl inOperation, String inKey) throws InstantiationException {
        List<Statement> statements = inOperation.getBody();
        return statements;
    }


    //========================================================================//


    

    //========================================================================//


    private     int numCheck = 0;


}
