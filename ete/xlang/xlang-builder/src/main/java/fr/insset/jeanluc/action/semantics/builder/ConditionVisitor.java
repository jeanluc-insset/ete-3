package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.GelContext;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GelParser;
import fr.insset.jeanluc.ete.gel.GelParserBaseVisitor;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.impl.GelContextImpl;
import fr.insset.jeanluc.ete.gel.impl.GelParserWrapper;
import fr.insset.jeanluc.ete.gel.impl.TreeBuilder;
import fr.insset.jeanluc.ete.gel.impl.VariableDefinitionImpl;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import static fr.insset.jeanluc.ete.meta.model.constraint.Invariant.INVARIANT;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import static fr.insset.jeanluc.ete.meta.model.constraint.Postcondition.POSTCONDITION;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.meta.model.io.ModelReader;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
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
    }


    private void registerFactories(FactoryRegistry inoutRegistry) {
        inoutRegistry.registerFactory(MOF_CLASS, fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl.class);
        inoutRegistry.registerFactory(MOF_OPERATION, fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperationImpl.class);
        inoutRegistry.registerFactory(INVARIANT, EnhancedInvariant.class);
        inoutRegistry.registerFactory(POSTCONDITION, EnhancedPostCondition.class);
    }



//    public MofClass visitEnhancedMofClass(MofClass inElement, Object... inParam) {
////        NamedElement       parentElement = (NamedElement) inParam[0];
////        Logger             logger = Logger.getGlobal();
////        if (parentElement instanceof MofPackage) {
////            MofPackage parentPackage = (MofPackage) parentElement;
////            parentPackage.addPackagedElement(inElement);
////            inElement.setOwningPackage(parentPackage);
////            logger.log(Level.INFO, "The XVisitor puts the item {0} into the package {1}", new Object[]{inElement, parentPackage});
////        }
////        else {
////            logger.log(Level.INFO, "The XVisitor could not find any package for ", new Object[]{inElement});
////        }
//        return inElement;
//    }
    
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


    public EnhancedPostCondition    visitEnhancedPostCondition(EnhancedPostCondition inCondition, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Visit of " + inCondition.getSpecificationAsString());

        System.out.println("PARSING AN ENHANCED POST-CONDITION");

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
        SimpleActionSemanticsBuilder builder = new SimpleActionSemanticsBuilder();
        builder.buildStatements(expression, inoutResult);

//        // 4- wrap everything into a "container" and put it into the
//        // the condition itself
//        // TODO : we should share the same container between all conditions on
//        // a single operation, should not we ?
        StatementContainer  container         = new StatementContainer();
        container.setStatements(inoutResult);
        container.setAbstractTree(expression);
        inCondition.setSpecification(container);
        Map<String, List<Statement>> statements = ((EnhancedMofOperationImpl)context).getStatements();
        if (statements == null) {
            statements = new HashMap<>();
            ((EnhancedMofOperationImpl)context).setStatements(statements);
        }
//        List<Statement> get = statements.get("body");
//        if (get == null) {
//            statements.put("body", inoutResult);
//        }
//        else {
//            get.addAll(inoutResult);
//        }
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


    public static void  enableActionSemantics(ModelReader inReader) throws ClassNotFoundException {
        Class.forName("fr.insset.jeanluc.action.semantics.builder.ActionSemanticsAction");
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        inReader.addVisitors(new ConditionVisitor());
    }

    
    //========================================================================//

    
    private     int numCheck = 0;


}
