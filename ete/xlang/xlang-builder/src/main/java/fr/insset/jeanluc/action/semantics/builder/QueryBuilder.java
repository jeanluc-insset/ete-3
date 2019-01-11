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
 * <li>we add each invariant context A inv P(A.x, A.y, B.z) to the "dependances of each property involved in the invariant.rgt
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
 *      INNER JOIN PILOT_CERTIFICATE ON p.ID = PILOT_CERTIFICATE.PILOT_ID
 *      INNER JOIN CERTIFICATE ON PILOT_CERTIFICATE.CERTIFICATES_ID = CERTIFICATE.ID
 *      INNER JOIN PLANEMODEL ON CERTIFICATE.PLANEMODEL_ID = PLANEMODEL.ID
 *      WHERE PLANEMODEL.ID = 101
 *          AND p.ID &lt;&gt; 105}&nbsp;: the captain must be certified for the
 *          plane of the flight, the model of the plane has ID 101&nbsp; furthermore
 *          the captain must be different from the copilote whose ID is 105</li>
 * <li>{@code SELECT * FROM APP.PLANE
        INNER JOIN PLANEMODEL ON PLANE.PLANEMODEL_ID = PLANEMODEL.ID
        WHERE PLANEMODEL.ID IN
            (SELECT pm1.ID FROM PLANEMODEL AS pm1
                INNER JOIN CERTIFICATE AS c2 ON c2.PLANEMODEL_ID = pm1.ID
                INNER JOIN PILOT_CERTIFICATE AS pc3 ON pc3.CERTIFICATES_ID = c2.ID
                INNER JOIN PILOT AS p4 ON pc3.PILOT_ID = p4.ID
                INNER JOIN CERTIFICATE AS c5 ON c5.PLANEMODEL_ID = pm1.ID
                INNER JOIN PILOT_CERTIFICATE AS pc6 ON pc6.CERTIFICATES_ID = c5.ID
                INNER JOIN PILOT AS p7 ON pc6.PILOT_ID = p7.ID
                WHERE p4.ID = 103
                AND p7.ID = 105)}&nbsp;: the captain (ID 103) and the copilot (ID
                105) must be certified for the (model of the) plane</li>
 * </ul>
 * In order to build these queries, two EteQuery instances are created.<br>
 * The first one c
 * </div>
 * 
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
            buildQueries(aMofClass);
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
    public void buildQueries(MofClass inMofClass) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Collection<Invariant> invariants = inMofClass.getInvariants();
        for (Invariant anInvariant : invariants) {
            // We should build a filter for each navigation in this invariant
            // First we build a copy of the expression, subsituting a variable
            // to any navigation.
            // The variables are registered in the result inout parameter
            System.out.println("    building filters for " + anInvariant.getSpecificationAsString());
            EnhancedInvariantImpl   inv = (EnhancedInvariantImpl) anInvariant;
            GelExpression expression = inv.getExpression();
            genericVisit(expression, anInvariant, inMofClass);
        }       // loop on invariants
    }       // buildQueries(MofClass)



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
        if (! "Pilot".equals(inMofClass.getName())) return;
        Map<MofProperty, EteQuery> support = inMofClass.getSupport();
        for (MofProperty aProperty : support.keySet()) {
            EteQuery query = support.get(aProperty);
            VariableBuilder builder = new VariableBuilder();
            System.out.println("  Building variables for the query of " + aProperty.getName() + " in the class " + aProperty.getOwningMofClass().getName());
            for (EteFilter aFilter : query.getFilters()) {
                EnhancedInvariantImpl invariant = (EnhancedInvariantImpl) aFilter.getInvariant();
                GelExpression specification = invariant.getExpression();
                GelExpression expression = (GelExpression) builder.genericVisit(specification, aFilter, query, aProperty, inMofClass);
                aFilter.setExpression(expression);
            }
        }
    }       // buildVariables



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


    public GelExpression visitAttributeNav(AttributeNav inNav, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        MofProperty property = (MofProperty) inNav.getToFeature();
        EnhancedInvariantImpl invariant = (EnhancedInvariantImpl) inParameters[0];
        invariant.addToSupport(inNav);
        addInnerJoin(inNav, inNav, (EnhancedInvariantImpl) inParameters[0]);
        return inNav;
    }
    
    public GelExpression visitCollect(Collect inCollect, Object... inParameters) throws InstantiationException {
        MofProperty property = (MofProperty) inCollect.getToFeature();
        EnhancedInvariantImpl invariant = (EnhancedInvariantImpl) inParameters[0];
        invariant.addToSupport(inCollect);
        addInnerJoin(inCollect, inCollect, invariant);
        return inCollect;
    }



    public void addInnerJoin(Step inNav, Step inFullNav, EnhancedInvariantImpl inInvariant) throws InstantiationException {
        GelExpression operand = inNav.getOperand().get(0);
        if (operand instanceof Self) {
            Feature toFeature = inNav.getToFeature();
            MofType targetType = toFeature.getType().getRecBaseType();
            if (targetType instanceof EnhancedMofClassImpl) {
                EnhancedMofClassImpl mofClass = (EnhancedMofClassImpl)targetType;
                Map<MofProperty, EteQuery> support = mofClass.getSupport();
                EteQuery query = support.get(toFeature);
                EteFilter   filter = new EteFilter();
                filter.setInvariant(inInvariant);
                filter.setFilteredProperty((MofProperty) toFeature);
                filter.setExpression(inFullNav);
                query.addFilter(filter);
            }
        } else {
            addInnerJoin((Step)operand, inFullNav, inInvariant);
        }
    }


    //========================================================================//

    /**
     * Visits an expression for an EteFilter AND a property.
     */
    public class VariableBuilder extends DynamicVisitorSupport {


        public VariableBuilder() {
            register("visit", "fr.insset.jeanluc.ete.gel");
        }


        /**
         * By default, recursively clones the expression:
         * the children of the clone are themselves the result of the visit of
         * the operands of {@code inExpression}, they can be variables,
         * parameters or clones of these operands.
         * 
         * @param inExpression
         * @param inParameters
         *      EteFilter a filter we visit the expression for, EteQuery the query
         * the filter belongs to, MofProperty the property we visit the expression
         * for, EnhancedMofClass an EnhancedMofClassImpl the support class of
         * that property
         * aFilter, query, aProperty, inMofClass
         * @return 
         */
        public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            GelExpression result = (GelExpression) FactoryRegistry.newInstance(inExpression.getClass());
            result.setType(inExpression.getType());
            Map<TagValueDeclaration, Object> tagValues = inExpression.getTagValues();
            result.setTagValues(tagValues);
            List<GelExpression> operand = inExpression.getOperand();
            if (operand == null)
                return result;
            List<GelExpression> resultOperand = FactoryMethods.newList(GelExpression.class);
            result.setOperand(resultOperand);
            for (GelExpression anOperand : operand) {
                GelExpression clone = (GelExpression) genericVisit(anOperand, inParameters);
                resultOperand.add(clone);
            }
            return result;
        }


        /**
         * Currently an Includes expression is a kind of Step (this should be
         * fixed in a future release). If we let the standard handling for step
         * expressions, only the first operand is parsed.<br>
         * On the other hand, the standard handling of ordinary expression works
         * fine... So this method invokes visitGelExpression.
         */
        public GelExpression visitIncludes(Includes inExpression, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            return visitGelExpression(inExpression, inParameters);
        }


        /**
         * 
         * The parameters are the filter matching the expression the navigation
         * belongs to, the query containing that filter and its macthing
         * property
         * @param inStep root of the navigation subtree (last step of the navigation)
         * @param Object[] inParameters : filter, query, filtered property. The
         * filter is not used in this method
         * @return inStep if the navigation starts with the property we are
         * building the joins for, a new variable otherwise
         * @throws java.lang.InstantiationException
         * @throws java.lang.IllegalAccessException
         */
        public GelExpression visitStep(Step inStep, Object... inParameters) throws InstantiationException, IllegalAccessException {
            MofProperty queriedProperty = (MofProperty) inParameters[2];
            EteQuery query = (EteQuery) inParameters[1];   
            EteFilter eteFilter = (EteFilter)inParameters[0];
            Step    initialStep = buildJoins(inStep, queriedProperty, query, eteFilter);
            VariableDefinition  variable;
            if (initialStep == null) {
                // We must replace the current expression by a new variable
                System.out.println("      the start property is not the one we are building variables for");
//                EteFilter filter = (EteFilter) inParameters[0];
                variable = query.addParameter(inStep);
                eteFilter.addVariable(inStep, variable);
                return variable;
            } else {
                variable = (VariableDefinition) FactoryRegistry.newInstance(VariableDefinition.class);
                variable.setValue(inStep);
                variable.setType(queriedProperty.getType());
                variable.setName("v0");
                eteFilter.addVariable(inStep, variable);
            }
            // The initial step "is" the filtered property, we keep it.
            return inStep;
        }


        /**
         * Walks recursively through a navigation.
         * 
         * @param step
         * @param numVar
         * @return 
         */
        protected Step buildJoins(Step step, MofProperty inProperty, EteQuery inQuery, EteFilter inFilter) throws InstantiationException, IllegalAccessException {
            List<GelExpression> operand = step.getOperand();
            // NO : we must consider that some subnavigations can start from
            // other entity than the initial context
            if (operand == null) return null;
            if (operand.size() == 0) return null;
            GelExpression first = operand.get(0);
            if (first instanceof Self) {
                Feature initialProperty = step.getToFeature();
                if (inProperty.equals(initialProperty)) {
                    VariableDefinition  variable = (VariableDefinition) FactoryRegistry.newInstance(VariableDefinition.class);
                    variable.setValue(step);
                    variable.setType(initialProperty.getType());
                    variable.setName("v0");
                    inFilter.addVariable(step, variable);
                    inQuery.addVariable(step, variable);
                    return step;
                }
                return null;
            }
            // Let's first build previous joins
            Step initialStep = buildJoins((Step)first, inProperty, inQuery, inFilter);
            if (initialStep == null) {
                // The initial step is not the filtered property, the whole
                // navigation must be replaced by a variable
                return null;
            } else {
                Join join = inQuery.addJoin(step);
                inFilter.addJoin(join);
            }

            // Now we build this step
//            MofProperty property = (MofProperty) step.getToFeature();
//            MofClass    srcClass = (MofClass) property.getOwningMofClass();
//            String      srcName  = srcClass.getName().toUpperCase();
//            String      name     = property.getName().toUpperCase();
//            MofType     type     = property.getType();
//            MofType     baseType = type.getRecBaseType();
//            if (!(baseType instanceof MofClass)) {
//                return initialStep;
//            }
//            String typeName = baseType.getName().toUpperCase();
//            if (type.isCollection()) {
//                // OneToMany or ManyToMany : there is an additional table
//                addJoinTable(numVar-1, numVar,
//                        srcName, typeName, name);
//                numVar +=2 ;
//                String  betweenName = startName + "_" + targetName;
//                addJoin(start, end, betweenName, startName, true);
//                addJoin(end, end+1, targetName, propName, false);
//            } else {
//                addJoin(numVar-1, numVar, typeName, name, false);
//            }
            return initialStep;
        }


        protected void addJoinTable(int start, int end, String startName, String targetName, String propName) {
            System.out.println("Adding a join table from " + startName + " to " + targetName + " for property " + propName);
            String  betweenName = startName + "_" + targetName;
            addJoin(start, end, betweenName, startName, true);
            addJoin(end, end+1, targetName, propName, false);
        }

        protected void addJoin(int srcNumber, int targetNumber, String joinTable, String propName, boolean reverseNumbers) {
            System.out.println("target:" + targetNumber + ", joinTable:" + joinTable);
//            inoutBuilder.append(" LEFT JOIN ");
//            inoutBuilder.append(joinTable);
//            inoutBuilder.append(" AS v");
//            inoutBuilder.append(targetNumber);
            if (reverseNumbers) {
                int aux = srcNumber;
                srcNumber = targetNumber;
                targetNumber = aux;
            }
//            inoutBuilder.append(" ON v");
//            inoutBuilder.append(targetNumber);
//            inoutBuilder.append(".ID=v");
//            inoutBuilder.append(srcNumber);
//            inoutBuilder.append(".");
//            inoutBuilder.append(propName);
//            inoutBuilder.append("_ID");
        }

    }       // VariableBuilder

}       // QueryBuilder

