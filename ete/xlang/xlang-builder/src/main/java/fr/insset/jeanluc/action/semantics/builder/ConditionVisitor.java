package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.GelContext;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GelParser;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.impl.GelContextImpl;
import fr.insset.jeanluc.ete.gel.impl.GelParserWrapper;
import fr.insset.jeanluc.ete.gel.impl.TreeBuilder;
import fr.insset.jeanluc.ete.gel.impl.VariableDefinitionImpl;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
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
import fr.insset.jeanluc.ete.xlang.builder.BodyBuilder;
import fr.insset.jeanluc.meta.model.io.ModelReader;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * When visiting a method, the ConditionVisitor builds the GEL abstract tree
 * for that condition.<br>
 * When visiting an EteModel, the ConditionVisitor builds the statements of the
 * body for each and every operation in the model (actually, each operation
 * in a not ignorable MofClass).
 *
 * @author jldeleage
 */
public class ConditionVisitor extends DynamicVisitorSupport {

    public static final String      VISIT_OF              = "Visit of {0}";
    public static final String      PARSING_PRECONDITION  = "PARSING A STANDARD ENHANCED PRECONDITION";
    public static final String      PARSING_POSTCONDITION = "PARSING A STANDARD ENHANCED POSTCONDITION {0}";


    public static void  enableActionSemantics(ModelReader inReader) throws ClassNotFoundException {
        Class.forName("fr.insset.jeanluc.action.semantics.builder.XLangAction");
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
        register(Invariant.class, "visitEnhancedInvariantImpl");
        register(EnhancedPostcondition.class, "visitEnhancedPostcondition");
        // Registration of the methods to visit gel expression
        register("gelVisit", "fr.insset.jeanluc.ete.gel");
        register(EteModel.class, "visitEteModel");
        
    }


    private void registerFactories(FactoryRegistry inoutRegistry) {
        inoutRegistry.registerFactory(MOF_CLASS, fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl.class);
        inoutRegistry.registerFactory(MOF_OPERATION, fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperationImpl.class);
        inoutRegistry.registerFactory(INVARIANT, EnhancedInvariantImpl.class);
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
     * @throws java.lang.InstantiationException 
     * @throws java.lang.IllegalAccessException 
     * @throws java.lang.reflect.InvocationTargetException 
     */
    public Precondition visitPrecondition(Precondition inCondition, Object... inParameters) throws InstantiationException {
        Logger.getLogger(getClass().getName()).log(Level.FINE, VISIT_OF, inCondition.getSpecificationAsString());
        EteModel        model                     = (EteModel)inParameters[1];
        String conditionName = inCondition.getName();
        if (conditionName == null) {
            conditionName = "" + numCheck++;
        }
        Map<String, VariableDefinition> variables = FactoryMethods.newMap(String.class, VariableDefinition.class);
        conditionName = "check_" + conditionName;
        addVariable(conditionName, (MofType)model.getElementByName("boolean"), variables);

        MofOperation    context                   = (MofOperation) inParameters[0];
        // This should build a list of statements returning a boolean value
        // If that value is not
        visitACondition(inCondition, model, context);
        return inCondition;
    }


    //========================================================================//



    public EnhancedPrecondition    visitEnhancedPrecondition(EnhancedPrecondition inCondition, Object... inParameters) throws InstantiationException {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.log(Level.FINE, VISIT_OF, inCondition.getSpecificationAsString());

        logger.info(PARSING_PRECONDITION);
        

        EnhancedMofOperationImpl    context = (EnhancedMofOperationImpl)inParameters[0];

        Map<String, VariableDefinition> variables  = FactoryMethods.newMap(String.class, VariableDefinition.class);
        addVariable("result", context.getType(), variables);

        return inCondition;
    }



    public EnhancedPostcondition    visitEnhancedPostcondition(EnhancedPostcondition inCondition, Object... inParameters) throws InstantiationException {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.log(Level.FINE, VISIT_OF, inCondition.getSpecificationAsString());

        logger.log(Level.INFO, PARSING_POSTCONDITION, inCondition.getSpecificationAsString());

        EnhancedMofOperationImpl    context = (EnhancedMofOperationImpl)inParameters[0];

        EteModel        model               = (EteModel)inParameters[1];
        Map<String, VariableDefinition> variables  = FactoryMethods.newMap(String.class, VariableDefinition.class);
        addVariable("result", context.getType(), variables);
        GelExpression expression = visitACondition(inCondition, model, context);
        inCondition.setExpression(expression);

        return inCondition;
    }


    //========================================================================//


    public EnhancedInvariantImpl    visitEnhancedInvariantImpl(EnhancedInvariantImpl inInvariant, Object... inParameters) {
        EteModel        model               = (EteModel)inParameters[1];
        MofClass        context = (MofClass) inParameters[0];
        GelExpression expression = visitAnInvariant(inInvariant, model, context);
        inInvariant.setExpression(expression);
        return inInvariant;
    }


    //========================================================================//


    /**
     * When we have read the whole model we can build statements.
     * 
     * @param inModel
     * @param inParameters
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException 
     */
    public EteModel visitEteModel(EteModel inModel, Object... inParameters) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        BodyBuilder builder = new BodyBuilder();
        builder.buildStatements(inModel);
        FilterBuilder filterBuilder = new FilterBuilder();
        filterBuilder.buildQueries(inModel);
        return inModel;
    }


    //========================================================================//
    //      G E L   E X P R E S S I O N   V I S I T O R   M E T H O D S       //
    //========================================================================//


    // Currently, there is no specific visit of GEL expressions.


    //========================================================================//



    protected GelExpression visitACondition(Condition inCondition, EteModel model,
            MofOperation context) {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.log(Level.INFO, VISIT_OF, inCondition.getSpecificationAsString());

        // 1- parse the condition
        String          specificationAsString = inCondition.getSpecificationAsString();
        GelParser       parser                = GelParserWrapper.newParser(specificationAsString);
        GelParser.GelExpressionContext   ctx  = parser.gelExpression();

        // 2- build expression as an abstract tree
        // Should we use an abstract factory ?
        // The context is generated...
        GelContext      gelContext            = new GelContextImpl(model, (MofClass)context.getOwningMofClass(), context);
        gelContext.set("model", model);
        gelContext.set("context", context);
        gelContext.set("contextualClass", parser);
        TreeBuilder     treeBuilder           = new TreeBuilder(gelContext);
        GelExpression   expression            = treeBuilder.visitGelExpression(ctx);
        ((EnhancedPostcondition)inCondition).setExpression(expression);
        logger.log(Level.FINER, "GelExpression : {0}", expression);

        return expression;
    }

    protected GelExpression visitAnInvariant(Invariant inCondition, EteModel model,
            MofClass context) {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.log(Level.INFO, VISIT_OF, inCondition.getSpecificationAsString());

        // 1- parse the condition
        String          specificationAsString = inCondition.getSpecificationAsString();
        GelParser       parser                = GelParserWrapper.newParser(specificationAsString);
        GelParser.GelExpressionContext   ctx  = parser.gelExpression();

        // 2- build expression as an abstract tree
        // Should we use an abstract facotry ?
        // The GelContext class is generated...
        GelContext      gelContext            = new GelContextImpl(model, context, context);
        gelContext.set("model", model);
        gelContext.set("context", context);
        gelContext.set("contextualClass", parser);
        TreeBuilder     treeBuilder           = new TreeBuilder(gelContext);
        GelExpression   expression            = treeBuilder.visitGelExpression(ctx);
        ((EnhancedInvariantImpl)inCondition).setExpression(expression);
        logger.log(Level.FINER, "GelExpression : {0}", expression);

        return expression;
    }


    //========================================================================//


    protected void addVariable(String inIdentifier, MofType inType, Map<String, VariableDefinition> inoutVariables) {
        VariableDefinition resultVariable   = new VariableDefinitionImpl();
        resultVariable.setIdentifier(inIdentifier);
        resultVariable.setType(inType);
        inoutVariables.put(inIdentifier, resultVariable);
    }


    //========================================================================//


    private     int numCheck = 0;


}
