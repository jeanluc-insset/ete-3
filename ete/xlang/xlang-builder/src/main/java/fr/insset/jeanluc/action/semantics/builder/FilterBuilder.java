package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.xlang.builder.*;
import fr.insset.jeanluc.ete.xlang.impl.*;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperation;
import fr.insset.jeanluc.action.semantics.builder.EnhancedPostcondition;
import fr.insset.jeanluc.ete.gel.*;
import fr.insset.jeanluc.ete.gel.impl.*;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.impl.FeatureImpl;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofParameterImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofBagImpl;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofCollectionImpl;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofOrderedSetImpl;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofSequenceImpl;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofSetImpl;
import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;
import fr.insset.jeanluc.ete.xlang.Allocation;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.impl.AssignmentImpl;
import fr.insset.jeanluc.ete.xlang.impl.VariableDeclarationImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * 
 * @author jldeleage
 */
public class FilterBuilder extends DynamicVisitorSupport {


    public FilterBuilder() throws InstantiationException, NoSuchMethodException {
        System.out.println("Creation de FilterBuilder");
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
        registry.registerDefaultFactory("atpre", AtPreImpl.class);
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


    public void buildFilters(EteModel inModel) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("Creation des filtres pour le modele");
        Collection<MofClass> allClasses = inModel.getAllClasses();
        for (MofClass aMofClass : allClasses) {
            buildFilters(aMofClass);
        }
    }


    public List<MofOperation> buildFilters(MofClass inMofClass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("Creation des filtres pour la classe cliente");
        List<MofOperation>  result = FactoryMethods.newList(MofOperation.class);
        Collection<Invariant> invariants = inMofClass.getInvariants();
        for (Invariant anInvariant : invariants) {
            buildFilters((EnhancedInvariantImpl) anInvariant, inMofClass);
        }
        return result;
    }

    /**
     * Create
     * 
     * @param anInvariant
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException 
     */
    private void buildFilters(EnhancedInvariantImpl anInvariant, MofClass inMofClass) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("Création des filtres pour l'invariant " + anInvariant.getSpecificationAsString());
        EnhancedMofClassImpl mofClass = (EnhancedMofClassImpl) anInvariant.getContext();
        // Looks for "top level" roles
        Object specification = anInvariant.getSpecification();
        if (specification == null) {
            return;
        }
        // This should add a filter per navigation in the invariant
        System.out.println("Visite de l'expression");
        genericVisit(specification, anInvariant, inMofClass);
    }

    //========================================================================//


    public Object examineObject(Object obj, Object... inParameters) {
        System.out.println("This object has been visited without any specific treatment : " + obj);
        return null;
    }


    //========================================================================//


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExpression.getOperand();
        for (GelExpression anExpression : operand) {
            genericVisit(anExpression, inParameters);
        }
        return inExpression;
    }

    public GelExpression visitAttributeNav(AttributeNav inNav, Object... inParameters) {
        System.out.println("BUILDING A FILTER for " + inParameters[0] + " in " + inParameters[1]);
        SyntheticFilter result = new SyntheticFilter();
        MofProperty toFeature = (MofProperty) inNav.getToFeature();
        result.setFilteredProperty(toFeature);
        result.setInvariant((Invariant) inParameters[0]);
        MofType type = inNav.getType();
        EnhancedMofClassImpl filteredClass = type instanceof EnhancedMofClassImpl ?
            (EnhancedMofClassImpl) type :
            (EnhancedMofClassImpl)inNav.getOperand().get(0).getType();
        filteredClass.addFilter(result);
        result.setClientClass((MofClass) inParameters[1]);
        return inNav;
    }

}       // FilterBuilder


