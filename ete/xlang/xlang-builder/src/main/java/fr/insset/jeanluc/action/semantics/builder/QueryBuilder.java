package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.xlang.impl.*;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.gel.*;
import fr.insset.jeanluc.ete.gel.impl.*;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.emof.TagValueDeclaration;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * <div>
 * An instance of this class builds a query for every property and adds a filter
 * for every invariant involving that property.<br>
 * For example in the airflight domain, within the context of the Flight class,
 * the "crew invariant" states that the captain and the copilot must be two
 * distinct Pilots.<br>
 * This leads to build four operations :
 * <ul>
 * <li><code>getAllPilotAsCaptainForFlight(inContext : Flight) : Pilot[*]</code></li>
 * <li><code>filterCaptainForCrew(inContext : Flight) : Pilot[*]</code></li>
 * <li><code>getAllPilotAsCopilotForFlight(inContext : Flight) : Pilot[*]</code></li>
 * <li><code>filterCopilotForCrew(inContext : Flight) : Pilot[*]</code></li>
 * </ul>
 * The getXxx operations are queries.<br>
 * The filterXxx operations are ... filters !<br>
 * Furthermore, the captain must be licensed. The invariant<br>
 * context Flight inv captainMusBeLicenced: self.captain.licences.type -&gt; includes(self.plane.type)
 * <br>
 * adds the filter<br>
 * <code>filterCaptainForCaptainIsCertified(inContext : Flight)</code><br>
 * Remark : these queries and filters are added to the Pilot class but they are
 * built while parsing the invariants of the Flight class.
 * </div>
 * <div>
 * While traversing a GelExpression, the FilterBuilder builds another
 * GelExpression ; this GelExpression is the same than the traversed
 * GelExpression but navigations are replaced by variables.<br>
 * </div>
 * <div>
 * Summary :<ul>
 * <li>we add each property A.x : B to the "support" of B</li>
 * <li>we add each invariant context A inv P(A.x, A.y, B.z) to the "dependencies of each property involved in the invariant.rgt
 * B can be reached transitively</li>
 * <li>we build a filter expression for each property B.z involved in invariant P in A (B can be A)</li>
 * <li>the filter means "filter instances of B such that A::P is true for a"</li>
 * <li>when generating code, each variable in the support is translated to a query <code>getBbbAsXxxFor(aaa : Aaa)</code></li>
 * <li>and each filter is translated to a... filter <code>filterBbbForPpp(aaa : Aaa)</code></li>
 * <li>the query invokes the filters</li>
 * </ul>
 * </div>
 * <div>
 * Actually, the process is slightly more complicated. If an invariant P in
 * context Aaa contains an expression such that : self.xxxx.yyy.zzz.ttt, we build
 * four filters (Aaa.xxx is of type Xxx, Xxx.yyy is of type Yyy, Yyy.zzz is of
 * type Zzz and Zzz.ttt is of type Ttt)
 * <ul>
 * <li><code>filterAllXxxAsXxxInPppFor(Aaa aaa)</code> in class Xxx</li>
 * <li><code>filterAllYyyAsXxxInPppFor(Aaa aaa)</code> in class Yyy</li>
 * <li><code>filterAllZzzAsXxxInPppFor(Aaa aaa)</code> in class Zzz</li>
 * <li><code>filterAllTttAsXxxInPppFor(Aaa aaa)</code> in class Ttt</li>
 * </ul>
 * </div>
 * <div>
 * The EteQuery aims to help the SqlDialect to generate the following
 * statements&nbsp;:<ul>
 * <li>{@code SELECT DISTINCT p.* FROM APP.PILOT AS p
 *      LEFT JOIN PILOT_CERTIFICATE ON p.ID = PILOT_CERTIFICATE.PILOT_ID
 *      LEFT JOIN CERTIFICATE ON PILOT_CERTIFICATE.CERTIFICATES_ID = CERTIFICATE.ID
 *      LEFT JOIN PLANEMODEL ON CERTIFICATE.PLANEMODEL_ID = PLANEMODEL.ID
 *      WHERE PLANEMODEL.ID = 101
 *          AND p.ID &lt;&gt; 105}&nbsp;: the captain must be certified for the
 *          plane of the flight, the model of the plane has ID 101&nbsp; furthermore
 *          the captain must be different from the copilote whose ID is 105</li>
 * <li>{@code SELECT * FROM APP.PLANE AS v0
        LEFT JOIN PLANEMODEL AS v1 ON v0.PLANEMODEL_ID = v1.ID
        LEFT JOIN CERTIFICATE AS v2 ON v2.PLANEMODEL_ID = v1.ID
        LEFT JOIN PILOT_CERTIFICATE AS v3 ON v3.CERTIFICATES_ID = v2.ID
        LEFT JOIN PILOT AS v4 ON v3.PILOT_ID = v4.ID
        LEFT JOIN PLANEMODEL AS v5 ON v0.PLANEMODEL_ID = v5.ID
        LEFT JOIN CERTIFICATE AS v6 ON v6.PLANEMODEL_ID = v5.ID
        LEFT JOIN PILOT_CERTIFICATE AS v7 ON .CERTIFICATES_ID = v6.ID
        LEFT JOIN PILOT AS v8 ON v7.PILOT_ID = v8.ID
    WHERE v4.ID = 103
        AND v8.ID = 105)}: the captain (ID 103) and the copilot (ID
   105) must be certified for the (model of the) plane</li>
 * </ul>
 * In order to build these queries, two EteQuery instances are created.<br>
 * </div>
 * BEWARE : an includes operator must be traversed in reversed order when the
 * filter for the right expression is built.<br>
 * For example, the above query for the plane in the Flight class translates
 * {@code captain.certificates.planeModel->includes...} to
 * {@code LEFT JOIN CERTIFICATE AS v2 ON v2.PLANEMODEL_ID = v1.ID
        LEFT JOIN PILOT_CERTIFICATE AS v3 ON v3.CERTIFICATES_ID = v2.ID
        LEFT JOIN PILOT AS v4 ON v3.PILOT_ID = v4.ID}<br>
 * <div>
 * 
 * </div>
 * 
 * @author jldeleage
 */
public class QueryBuilder extends DynamicVisitorSupport {


    public QueryBuilder() throws InstantiationException, NoSuchMethodException {
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
        registry.registerDefaultFactory("step", StepImpl.class);
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
        registry.registerDefaultFactory(VariableDefinition.class, VariableDefinitionImpl.class);
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


    public void buildQueries(EteModel inModel) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Collection<MofClass> allClasses = inModel.getAllClasses();

        System.out.println("--------------------------------");
        System.out.println("B U I L D I N G   Q U E R I E S");
        System.out.println("1- building supports");
        for (MofClass aMofClass : allClasses) {
            System.out.println("    examining " + aMofClass.getName());
            for (MofProperty aProperty : aMofClass.getAllAttributes()) {
                // By default it is a "plain" query, without any join nor filter
                EteQuery    query = new EteQuery();
                query.setProperty(aProperty);
                MofType type = aProperty.getType();
                if (type instanceof EnhancedMofClassImpl) {
                    EnhancedMofClassImpl    targetClass = (EnhancedMofClassImpl) type;
                    targetClass.addQuery(query);
                }
            }       // loop on properties
        }       // loop on classes
        System.out.println("2- Actual building of queries and filters");
        for (MofClass aMofClass : allClasses) {
            buildFilters(aMofClass);
        }
        System.out.println("3- Building and numbering variables");
        for (MofClass aMofClass : allClasses) {
            buildVariables((EnhancedMofClassImpl) aMofClass);
        }
        System.out.println("Q U E R I E S   A R E   B U I L T");
        System.out.println("---------------------------------");
    }


    /**
     * <div>
     * Plain queries have been instantiated by the {@link buildQueries(EteModel)}
     * method.<br>
     * This method parses the invariants of the inMofClass and adds corresponding
     * filters and joins to the corresponding queries.<br>
     * When a property is found in an invariant the query is is retrieved in the
     * "target" class' support.
     * </div>
     * <div>
     * Currently, only "first steps" of navigations are stored in the queries.<br>
     * For example,the {@code captain.certificates.planeModel-&gt;includes(self.plane.planeMode)}
     * does not generate any filter nor join in the {@code Pilot::certificates},
     * {@code Plane::planeModel} and {@code Certificate::planeModel} properties
     * but in the {@code Flight::captain} and {@code Flight::plane} properties.
     * </div>
     * 
     * @param inMofClass
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException 
     */
    public void buildFilters(MofClass inMofClass) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        System.out.println("    building filters for " + inMofClass.getName());
        Collection<Invariant> invariants = inMofClass.getInvariants();
        for (Invariant anInvariant : invariants) {
            // We should build a filter for each navigation in this invariant
            // First we build a copy of the expression, subsituting a variable
            // to any navigation.
            // The variables are registered in the result inout parameter
            System.out.println("        building filters for " + anInvariant.getName() + ": " + anInvariant.getSpecificationAsString());
            EnhancedInvariantImpl   inv = (EnhancedInvariantImpl) anInvariant;
            GelExpression expression = inv.getExpression();
            genericVisit(expression, anInvariant, inMofClass);
        }       // loop on invariants
    }       // buildFilters(MofClass)


    //========================================================================//


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExpression.getOperand();
        if (operand == null) return inExpression;
        for (GelExpression anOperand : operand) {
            genericVisit(anOperand, inParameters);
        }
        return inExpression;
    }


    /**
     * Creates a filter linked to the first step of this navigation
     * 
     * @param inStep
     * @param inParameters
     * @return
     * @throws InstantiationException 
     */
    public Step visitStep(Step inStep, Object... inParameters) throws InstantiationException {
        // 1 Create a new filter
        System.out.println("            Creating a new filter for "
                + inStep.getToFeature().getOwningMofClass().getName()
                + "::" + inStep.getToFeature().getName());
        EteFilter filter = new EteFilter();
        // 2 Link the filter to the invariant
        EnhancedInvariantImpl invariant = (EnhancedInvariantImpl) inParameters[0];
        filter.setInvariant(invariant);
        // 3 Set the filtered property
        Step first = getFirst(inStep);
        System.out.println("               the first step is "
                + first.getToFeature().getOwningMofClass().getName()
                + "::" + first.getToFeature().getName());
        MofProperty prop = (MofProperty) first.getToFeature();
        filter.setFilteredProperty(prop);
        // 4 Link the query to the filter
        EnhancedMofClassImpl type = (EnhancedMofClassImpl) prop.getType();
        Map<MofProperty, EteQuery> support = type.getSupport();
        EteQuery eteQuery = support.get(first.getToFeature());
        eteQuery.addFilter(filter);
        return inStep;
    }


    public GelExpression visitIncludes(Includes inIncludes, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return visitGelExpression(inIncludes, inParameters);
    }

    public static Step getFirst(Step inExpression) {
        Step result = inExpression;
        do {
            List<GelExpression> operand = result.getOperand();
            if (operand == null) return result;
            GelExpression prev = operand.get(0);
            if (prev instanceof Self) {
                return result;
            }
            result = (Step) prev;
        } while (true);
    }



    //========================================================================//


    /**
     * <div>
     * Once we get a filter we build the actual expression in that filter.<br>
     * This could be done while creating the filter but it is easier to do after.
     * </div>
     * <div>
     * A filter is created for a property and an expression.<br>
     * Every navigation starting with that property in this expression must be
     * kept and joins must be computer; every other navigation must be replaced
     * with a variable.
     * </div>
     * 
     * @param inMofClass 
     */
    public void buildVariables(EnhancedMofClassImpl inMofClass) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Map<MofProperty, EteQuery> support = inMofClass.getSupport();
        VariableBuilder builder = new VariableBuilder();
        for (MofProperty aProperty : support.keySet()) {
            EteQuery query = support.get(aProperty);
            System.out.println("  Building variables for the query of " + aProperty.getName() + " in the class " + aProperty.getOwningMofClass().getName());
            for (EteFilter aFilter : query.getFilters()) {
                System.out.println("    Building variables and joins for " + aProperty.getName() + " invariant " + aFilter.getInvariant().getName());
                builder.buildFor(aFilter);
            }
        }
    }       // buildVariables


    //========================================================================//


    /**
     * Parses the expression of an invariant for a filter. This gives two
     * results:<ul>
     * <li>builds a quasi-clone of the expression of the invariant</li>
     * <li>builds joins of that filter</li>
     * </ul>
     */
    public static class VariableBuilder extends DynamicVisitorSupport {

        private final static int    FILTER = 0,
                                    PROPERTY = 1,
                                    QUERY = 2;


        public VariableBuilder() {
            register("build", "fr.insset.jeanluc.ete.gel");
        }


        /**
         * Actually builds the expression of the filter. This expression contains
         * variable instead of navigations.<br>
         * By the way, builds the joins of the filter.
         */
        public void buildFor(EteFilter inFilter) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            EnhancedInvariantImpl invariant = (EnhancedInvariantImpl) inFilter.getInvariant();
            GelExpression expression = invariant.getExpression();
            MofProperty filteredProperty = inFilter.getFilteredProperty();
            EnhancedMofClassImpl mofClass = (EnhancedMofClassImpl) filteredProperty.getType();
            Map<MofProperty, EteQuery> support = mofClass.getSupport();
            EteQuery eteQuery = support.get(filteredProperty);
            GelExpression clone = (GelExpression) genericVisit(expression, inFilter, filteredProperty, eteQuery);
            inFilter.setExpression(clone);
        }


        /**
         * Builds a kind of clone of the input expression.<br>
         * The result is not a true clone since the navigations are substituted
         * with variables.<br>
         * At the same time, builds joins and registers them in the filter.
         * 
         * @param inExpression
         * @param inParameters
         * @return
         * @throws InstantiationException
         * @throws IllegalAccessException 
         */
        public GelExpression buildGelExpression(GelExpression inExpression, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            GelExpression result = (GelExpression) FactoryRegistry.newInstance(inExpression.getClass());
            result.setType(inExpression.getType());
            List<GelExpression> operand = inExpression.getOperand();
            List<GelExpression> resultOperand = FactoryMethods.newList(GelExpression.class);
            result.setOperand(resultOperand);
            if (operand == null) return result;
            for (GelExpression anOperand : operand) {
                resultOperand.add((GelExpression) genericVisit(anOperand, inParameters));
            }
            return result;
        }


        public GelExpression buildLiteral(Literal inExpression, Object... inParameters) {
            return inExpression;
        }

        /**
         * Builds the joins and returns the variable linked to the first join.
         */
        public GelExpression buildStep(Step inStep, Object... inParameters) throws InstantiationException, IllegalAccessException {
            EteQuery query = (EteQuery)inParameters[QUERY];
            MofProperty property = query.getProperty();
            Step first = getFirst(inStep);
            if (!first.getToFeature().equals(property)) {
                VariableDefinition aParameter = query.addParameter(inStep);
                query.addDependency((MofProperty) first.getToFeature());
                EteFilter filter = (EteFilter) inParameters[FILTER];
                filter.addVariable(inStep, aParameter);
                return aParameter;
            }
            GelExpression addJoins = addJoins(inStep, inParameters);
            return addJoins;
        }


        protected GelExpression addJoins(Step inStep, Object... inParameters) throws InstantiationException, IllegalAccessException {
            List<GelExpression> operand = inStep.getOperand();
            if (operand == null) return null;
            String  startVariable = "v0";
            VariableDefinition previousVariable = null;
            VariableDefinition result = null;
            if (operand.size()>0) {
                // First we build the previous joins
                Step src = (Step) operand.get(0);
                if (src instanceof Self) {
                    EteQuery query = (EteQuery) inParameters[QUERY];
                    result = (VariableDefinition) FactoryRegistry.newInstance(VariableDefinition.class);
                    result.setName("v0");
                    result.setType(inStep.getType());
                    query.addVariable(inStep, previousVariable);
                    EteFilter filter = (EteFilter) inParameters[FILTER];
//                    filter.addVariable(inStep, previousVariable);
                    return result;
                }
                result = (VariableDefinition) addJoins((Step) operand.get(0), inParameters);
                if (result == null) {
                    startVariable = "v0";
                } else {
                    startVariable = result.getName();
                }
            };
            // Now we build this one (or these ones since a single step can be
            // translated to two joins)
            Feature toFeature = inStep.getToFeature();
            String  featureName = toFeature.getName();
            Classifier owningMofClass = toFeature.getOwningMofClass();
            MofType targetType = toFeature.getType();
            MofType targetBaseType = targetType.getRecBaseType();
            // if the type of this step is not a table, we must not create a join
            if (! (targetBaseType instanceof MofClass)) {
                Step  nav = (Step) FactoryRegistry.newInstance("step");
                operand = FactoryMethods.newList(GelExpression.class);
                operand.add(result);
                nav.setOperand(operand);
                nav.setToFeature(toFeature);
                nav.setType(targetType);
                return nav;
            }
            EteQuery query = (EteQuery)inParameters[QUERY];
            EteFilter filter = (EteFilter)inParameters[FILTER];
            String  targetTableName = targetType.getRecBaseType().getName().toUpperCase();
            if (targetType.isCollection()) {
                String  auxTableName = owningMofClass.getName().toUpperCase() + "_" + targetTableName;
                System.out.println("             auxTableName :" + auxTableName);
                VariableDefinition firstVariable= query.newVariable();
                Join firstJoin = new Join(startVariable, "ID", firstVariable.getName(), auxTableName, owningMofClass.getName() + "_ID");
                VariableDefinition secondVariable= query.newVariable(inStep);
                Join secondJoin = new Join(firstVariable.getName(), featureName + "_ID",secondVariable.getName(), targetTableName, "ID");
                filter.addJoin(firstJoin);
                filter.addJoin(secondJoin);
                return secondVariable;
            } else {        // The target type is not a collection
                VariableDefinition variable = query.newVariable(inStep);
                Join join = new Join(startVariable, featureName + "_ID", variable.getName(), targetTableName, "ID");
                filter.addJoin(join);
                return variable;
            }
        }



        /**
         * If the left hand of the includes is not the filtered property we must
         * traverse it in reverse order.
         * 
         * @param inIncludes
         * @param inParameters
         * @return 
         */
        public GelExpression buildIncludes(Includes inIncludes, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
            List<GelExpression> operand = inIncludes.getOperand();
            Step    left = (Step) operand.get(0);
            Step    right = (Step) operand.get(1);
            Step firstLeft = getFirst(left);
            Step firstRight = getFirst(right);
            MofProperty filteredProperty = (MofProperty) inParameters[PROPERTY];
            GelExpression result = (GelExpression) FactoryRegistry.newInstance("equal");
            List<GelExpression> resultOperand = FactoryMethods.newList(GelExpression.class);
            result.setOperand(resultOperand);
            if (firstLeft.getToFeature().equals(filteredProperty)) {
                GelExpression leftResult = (GelExpression) genericVisit(left, inParameters);
                GelExpression rightResult = (GelExpression) genericVisit(right, inParameters);
                resultOperand.add(leftResult);
                resultOperand.add(rightResult);
            } else {
                VariableDefinition rightResult = (VariableDefinition) genericVisit(right, inParameters);
                EteQuery    query = (EteQuery) inParameters[QUERY];
                GelExpression leftResult = reverseVisit(left, inParameters[0], inParameters[1], inParameters[2], rightResult);
                resultOperand.add(leftResult);
                VariableDefinition theParameter = query.addParameter(firstLeft);
                query.addDependency((MofProperty) firstLeft.getToFeature());
                EteFilter filter = (EteFilter) inParameters[FILTER];
                filter.addVariable(firstLeft, theParameter);
                resultOperand.add(theParameter);
            }
            return result;
        }


        /**
         * In case of an includes for example, we must first traverse the right
         * operand in direct order then the left one in reverse order.
         * 
         * @param inStep
         * @param inParameters
         * @return
         * @throws InstantiationException
         * @throws IllegalAccessException 
         */
        protected GelExpression reverseVisit(Step inStep, Object... inParameters) throws InstantiationException, IllegalAccessException {
            Step    current = inStep;
            VariableDefinition variable = null;
            VariableDefinition previous = (VariableDefinition) inParameters[3];
            EteQuery query = (EteQuery)inParameters[QUERY];
            EteFilter filter = (EteFilter)inParameters[FILTER];
            while (current != null) {
                List<GelExpression> operand = current.getOperand();
                if (operand == null || operand.size() == 0) {
                    break;
                }
                Step  start = (Step) operand.get(0);
                if (start instanceof Self) {
                    break;
                }
                Feature toFeature = current.getToFeature();
                String  featureName = toFeature.getName();
                Classifier owningMofClass = toFeature.getOwningMofClass();
                MofType targetType = toFeature.getType();
                if (targetType.isCollection()) {
                    targetType = targetType.getRecBaseType();
                    String  targetTableName = owningMofClass.getName().toUpperCase();
                    String  auxTableName = targetTableName + "_" + targetType.getName().toUpperCase();
                    variable = query.newVariable();
                    String auxVariableName = variable.getName();
                    Join join = new Join(previous.getName(), "ID", auxVariableName, auxTableName, featureName + "_ID");
                    filter.addJoin(join);
                    variable = query.newVariable();
                    String previousName = previous.getName().toUpperCase();
                    join = new Join(auxVariableName, targetTableName + "_ID", variable.getName(), targetTableName, "ID");
                    filter.addJoin(join);
                } else {
                    String  targetTableName = owningMofClass.getName().toUpperCase();
                    variable = query.newVariable(current);
                    Join join = new Join(previous.getName(), "ID", variable.getName(), targetTableName, featureName + "_ID");
                    filter.addJoin(join);
                }
                // Let' make a step "forward" (actually backward since it is a
                // reverse traversal)
                previous = variable;
                current = (Step) start;
            }
            // No : we should return a variable pointing to the first step (the
            // last traversed step)
            return variable;
        }

        protected void addJoin(Step inStep, EteFilter inFilter, EteQuery inQuery) {
            Feature toFeature = inStep.getToFeature();
            if (toFeature == null) return;
            if (toFeature.getOwningMofClass()==null) {
                System.out.println("*** The feature " + toFeature.getName() + " has no owning class");
                return;
            }
            if (toFeature.getType() == null) {
                System.out.println("*** The feature " + toFeature.getName() + " has no type");
            }
            System.out.println("                adding a join for "
                    + toFeature.getOwningMofClass().getName()
                    + "::" + toFeature.getName()
                    + " -> " + toFeature.getType().getName());
        }


    }       // VariableBuilder


}       // QueryBuilder

