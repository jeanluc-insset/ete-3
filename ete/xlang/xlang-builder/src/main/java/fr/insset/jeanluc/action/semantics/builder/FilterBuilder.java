package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.xlang.impl.*;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.gel.*;
import fr.insset.jeanluc.ete.gel.impl.*;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.impl.AssignmentImpl;
import fr.insset.jeanluc.ete.xlang.impl.VariableDeclarationImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * <div>
 * An instance of this class builds a filter for every property used in any
 * invariant.<br>
 * For example in the airflight domain, within the context of the Flight class,
 * the "crew invariant" states that the captain and the copilot must be two
 * distinct Pilots.<br>
 * This leads to build two operations :<br>
 * <code><pre>getCopilotForCrew(inContext : Flight) : Pilot[*]
 * filterCaptainForCrew(inContext : Flight) : Pilot[*]
 * </pre></code>
 * Furthermore, the captain must be licensed. The invariant<br>
 * context Flight inv captainMusBeLicenced: self.captain.licences.type -&gt; includes(self.plane.type)
 * <br>
 * leads to the operation<br>
 * Finally, two synthetic queries are added :<br>
 * <code>getCaptainForFlight(inFlight : Flight)<br>
 * getCopilotForFlight(inFlight : Flight)</code>
 * <code>filterCaptainForTheCaptainMustBeLicensed(inContext : Flight) : Pilot[*]</code><br>
 * Remark : these filters must be added to the Pilot class but they are built
 * while parsing the invariants of the Flight class.
 * </div>
 * <div>
 * While traversing a GelExpression, the FilterBuilder builds a another
 * GelExpression ; this GelExpression is the same than the traversed
 * GelExpression but navigations are replaced by variables.<br>
 * </div>
 * 
 * @author jldeleage
 */
public class FilterBuilder extends DynamicVisitorSupport {


    public FilterBuilder() throws InstantiationException, NoSuchMethodException {
        register("visit", "fr.insset.jeanluc.ete.gel");
        Method[] methods = getClass().getMethods();
        for (Method aMethod : methods) {
            if ("examineObject".equals(aMethod.getName()))
                register(Object.class, aMethod);
        }
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(Assignment.class, AssignmentImpl.class);
        registry.registerDefaultFactory("stringliteral", StringLiteralImpl.class);
        registry.registerDefaultFactory("lessthan", LessThanImpl.class);
        registry.registerDefaultFactory("sub", SubImpl.class);
        registry.registerDefaultFactory("variabledefinition", VariableDefinitionImpl.class);
        registry.registerDefaultFactory("greaterorequal", GreaterOrEqualImpl.class);
        registry.registerDefaultFactory("mod", ModImpl.class);
        registry.registerDefaultFactory("equal", EqualImpl.class);
        registry.registerDefaultFactory("add", AddImpl.class);
        registry.registerDefaultFactory("different", DifferentImpl.class);
        registry.registerDefaultFactory("div", DivImpl.class);
        registry.registerDefaultFactory("multordiv", MultOrDivImpl.class);
        registry.registerDefaultFactory("collect", CollectImpl.class);
        registry.registerDefaultFactory("gelexpression", GelExpressionImpl.class);
        registry.registerDefaultFactory("variablereference", VariableReferenceImpl.class);
        registry.registerDefaultFactory("dateliteral", DateLiteralImpl.class);
        registry.registerDefaultFactory("includes", IncludesImpl.class);
        registry.registerDefaultFactory("average", AverageImpl.class);
        registry.registerDefaultFactory("or", OrImpl.class);
        registry.registerDefaultFactory("methodnav", MethodNavImpl.class);
        registry.registerDefaultFactory("lessorequal", LessOrEqualImpl.class);
        registry.registerDefaultFactory("floatingpointliteral", FloatingPointLiteralImpl.class);
        registry.registerDefaultFactory("select", SelectImpl.class);
        registry.registerDefaultFactory("nav", NavImpl.class);
        registry.registerDefaultFactory("not", NotImpl.class);
        registry.registerDefaultFactory("greaterthan", GreaterThanImpl.class);
        registry.registerDefaultFactory("attributenav", AttributeNavImpl.class);
        registry.registerDefaultFactory("@pre", AtPreImpl.class);
        registry.registerDefaultFactory("xor", XorImpl.class);
        registry.registerDefaultFactory("self", SelfImpl.class);
        registry.registerDefaultFactory("booleanliteral", BooleanLiteralImpl.class);
        registry.registerDefaultFactory("oclfinaloperation", OclFinalOperationImpl.class);
        registry.registerDefaultFactory("oclistypeof", OclIsTypeOfImpl.class);
        registry.registerDefaultFactory("literal", LiteralImpl.class);
        registry.registerDefaultFactory("isdeleted", IsDeletedImpl.class);
        registry.registerDefaultFactory("mult", MultImpl.class);
        registry.registerDefaultFactory("step", StepImpl.class);
        registry.registerDefaultFactory("result", ResultImpl.class);
        registry.registerDefaultFactory("ocloperation", OclOperationImpl.class);
        registry.registerDefaultFactory("and", AndImpl.class);
        registry.registerDefaultFactory("identifier", IdentifierImpl.class);
        registry.registerDefaultFactory("flatten", FlattenImpl.class);
        registry.registerDefaultFactory("oclastype", OclAsTypeImpl.class);
        registry.registerDefaultFactory("integerliteral", IntegerLiteralImpl.class);
        registry.registerDefaultFactory("lambda", LambdaImpl.class);
        registry.registerDefaultFactory("isnew", IsNewImpl.class);
        registry.registerDefaultFactory("oclisnew", OclIsNewImpl.class);
        registry.registerDefaultFactory("collectionmethodnav", CollectionMethodNavImpl.class);
        registry.registerDefaultFactory("opp", OppImpl.class);
        registry.registerDefaultFactory("addorsub", AddOrSubImpl.class);
        registry.registerDefaultFactory("ocliskindof", OclIsKindOfImpl.class);
        registry.registerDefaultFactory("flatcollect", FlatCollectImpl.class);
        registry.registerDefaultFactory("excludes", ExcludesImpl.class);
        registry.registerDefaultFactory("sum", SumImpl.class);
        registry.registerDefaultFactory("whiledoloop", WhileDoLoopImpl.class);
        registry.registerDefaultFactory("allocation", AllocationImpl.class);
        registry.registerDefaultFactory("loop", LoopImpl.class);
        registry.registerDefaultFactory("variabledeclaration", VariableDeclarationImpl.class);
        registry.registerDefaultFactory("methodinvocation", MethodInvocationImpl.class);
        registry.registerDefaultFactory("xlangexception", XLangExceptionImpl.class);
        registry.registerDefaultFactory("forloop", ForLoopImpl.class);
        registry.registerDefaultFactory("statement", StatementImpl.class);
        registry.registerDefaultFactory("dowhileloop", DoWhileLoopImpl.class);
        registry.registerDefaultFactory("conditional", ConditionalImpl.class);
        registry.registerDefaultFactory("assignment", AssignmentImpl.class);
        registry.registerDefaultFactory("instanciation", InstanciationImpl.class);
    }


    //========================================================================//


    public void buildQueries(EteModel inModel) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Collection<MofClass> allClasses = inModel.getAllClasses();

        System.out.println("--------------------------------");
        System.out.println("B U I L D I N G   Q U E R I E S");
        System.out.println("1- building supports");
        for (MofClass aMofClass : allClasses) {
            System.out.println("Examining " + aMofClass.getName());
            for (MofProperty aProperty : aMofClass.getAllAttributes()) {
                MofType type = aProperty.getType();
                if (type instanceof EnhancedMofClassImpl) {
                    EnhancedMofClassImpl    targetClass = (EnhancedMofClassImpl) type;
                    System.out.println("Adding " + aProperty.getName() + " to the support of " + targetClass.getName());
                    targetClass.getSupport().put(aProperty, FactoryMethods.newList(EteQuery.class));
                    // Debugging only : the next line MUST BE REMOVED
                    targetClass.getSupport();
                }
            }       // loop on properties
        }       // loop on classes
        System.out.println("2- Actual building of queries");
        for (MofClass aMofClass : allClasses) {
            buildQueries(aMofClass);
        }
        System.out.println("Q U E R I E S   A R E   B U I L T");
        System.out.println("---------------------------------");
    }


    public void buildQueries(MofClass inMofClass) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Collection<Invariant> invariants = inMofClass.getInvariants();
        for (Invariant anInvariant : invariants) {
            // We should build a query for each navigation in this invariant
            // First we build a copy of the expression, subsituting a variable
            // to any navigation.
            // The variables are registered in the result inout parameter
            System.out.println("Building queries for " + anInvariant.getSpecificationAsString());
            List<VariableDeclaration>  result = FactoryMethods.newList(VariableDeclaration.class);
            GelExpression copy = buildQueries((EnhancedInvariantImpl) anInvariant, inMofClass, result);
            // Now the result contains all the variables found across the invariants
            // of this class
            // For each variable, we must build a query in the TARGET class
            for (VariableDeclaration aDeclaration : result) {
                System.out.println("Variable found : " + aDeclaration.getName()
                        + " " + aDeclaration.getType().getName()
                        + " " + aDeclaration.getInitValue().getClass()
                        + " dans " + anInvariant.getSpecificationAsString());
                Logger.getGlobal().log(Level.INFO,"Variable found : {0} ({1}) = {2} in {3}",
                        new Object[]{
                            aDeclaration.getName(),
                            aDeclaration.getType().getName(),
                            aDeclaration.getInitValue().getClass(),
                            anInvariant.getSpecificationAsString()
                        });
                MofType type = aDeclaration.getType();
                if (type instanceof EnhancedMofClassImpl) {
                    buildOneQuery(inMofClass, (EnhancedMofClassImpl) type,
                            aDeclaration, anInvariant, copy, result);
                }
                else {
                    Logger.getGlobal().info("That navigation is not a MofClass");
                }
            }       // loop on variables
        }       // loop on invariants
    }       // buildQueries(MofClass)


    protected void buildOneQuery(MofClass inMofClass,
        EnhancedMofClassImpl targetClass, VariableDeclaration aDeclaration,
        Invariant anInvariant, GelExpression copy, List<VariableDeclaration> result) {
        EteQuery query = new EteQuery();
        query.setClientClass(inMofClass);
        AttributeNav nav = (AttributeNav) aDeclaration.getInitValue();
        MofProperty toFeature = (MofProperty) nav.getToFeature();
        String name = toFeature.getName();
        String      invariantName = anInvariant.getName();
        invariantName = invariantName.substring(0,1).toUpperCase() + invariantName.substring(1);
        name += "For" + invariantName;
        query.setFilteredProperty(toFeature);
        query.setExpression(copy);
        query.setPropertyName(name);
        query.setTargetVariable(aDeclaration);
        query.setInvariant(anInvariant);
        result.stream().filter(other -> !(other.equals(aDeclaration))).forEach(query::addVariable);
        targetClass.addQuery(query);
    }


    /**
     * 
     * @param anInvariant
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException 
     */
    private GelExpression buildQueries(EnhancedInvariantImpl anInvariant, MofClass inMofClass, List<VariableDeclaration> inoutVariables) throws IllegalAccessException, InvocationTargetException {
        // Looks for "top level" roles (i.e. properties of self)
        Object specification = anInvariant.getExpression();
        if (specification == null) {
            return null;
        }
        // This should add a filter per navigation in the invariant
        // At the same time, it builds a list of variables (a navigation,
        // a variable)
        // The returned GelExpression uses these variables instead of
        // navigations.
        // Each query is about one of these variables.
        return (GelExpression) genericVisit(specification, anInvariant, inMofClass, inoutVariables);
    }

    //========================================================================//


    public Object examineObject(Object obj, Object... inParameters) {
        Logger.getGlobal().log(Level.INFO, "This object has been visited without any specific treatment : {0}", obj);
        return null;
    }


    //========================================================================//



    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<? extends GelExpression> aClass = inExpression.getClass();
        GelExpression result = aClass.newInstance();
        List<GelExpression> operand = inExpression.getOperand();
        if (operand != null) {
             List<GelExpression> resultOperands = FactoryMethods.newList(GelExpression.class);
            result.setOperand(resultOperands);
            result.setType(inExpression.getType());
            for (GelExpression anExpression : operand) {
                GelExpression anOperand = (GelExpression) genericVisit(anExpression, inParameters);
                if (anOperand != null) {
                    resultOperands.add(anOperand);
                }
            }
        }
        return result;
    }


    public GelExpression visitAttributeNav(AttributeNav inNav, Object... inParameters) {
        System.out.println("Visit of a navigation to the attribute " + inNav.getName());
        VariableDeclaration  definition = new VariableDeclarationImpl();
        definition.setInitValue(inNav);
        definition.setType(inNav.getType());
        Feature toFeature = inNav.getToFeature();
        EnhancedInvariantImpl invariant = (EnhancedInvariantImpl) inParameters[0];
        String  invariantName = invariant.getName();
        invariantName = invariantName != null ? invariantName.substring(0,1).toUpperCase() + invariantName.substring(1) : "anon";
        String  propertyName = toFeature.getName() + "In" + invariantName + numVar++;
        definition.setName(propertyName);
        List<VariableDeclaration> variables = (List<VariableDeclaration>) inParameters[2];
        variables.add(definition);
        return definition;
    }


    /**
     * Builds the actual expression for a Query
     */
    public class ExpressionBuilder extends DynamicVisitorSupport {
        public ExpressionBuilder(EteQuery inQuery) {
        }
        public GelExpression visitAttributeNav(AttributeNav inNav, Object... inParameters) {
            return inNav;
        }
    }       // ExpressionBuilder


    //========================================================================//


    private     int                 numVar;


}       // FilterBuilder

