package fr.insset.jeanluc.action.semantics.builder;



import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



/**
 * <div>
 * An EteQuery is created for every association in the model (any property of
 * type a MofClass).<br>
 * The query contains "filters". A filter is created for every invariant
 * containing the property.<br>
 * Finally, the query contains "joins" which are the navigations starting with
 * the property in these invariants.<br>
 * A map {@code &lt;MofProperty, EteQuery&gt;} is kept in the target class.
 * </div>
 * <div>
 * In the "airways" example, the {@code captain} property, in the {@code Flight}
 * entity, is of type {@code Pilot}.<br>
 * So a query {@code q} is created and the couple {@code (captain, q)} is put
 * into the map of the class {@code Pilot}.<br>
 * The property is involved in two invariants. Consequently the query contains
 * two filters:<ul>
 * <li>{@code self.captain &lt;&gt; self.copilot}</li>
 * <li>{@code self.captain.certificate.planeModel-&gt;(self.plane.planeModel}</li>
 * </ul>
 * Any navigation starting with the {@code captain} property is kept as is, the
 * property itself is replaced by the variable {@code v0}.<br>
 * Any other navigation is stored in the filter and replaced by a variable.<br>
 * Consequently, the first filter becomes:<br>
 * {@code [v0 &lt;&gt; v1, v1=self.copilot ]}<br>
 * and the second filter becomes:<br>
 * {@code [v0.certificate.planeModel-&gt;includes(v1), v1=self.plane.planeModel]}<br>
 * 
 * </div>
 *
 * @author jldeleage
 */
public class EteQuery {

    public EteQuery() throws InstantiationException {
        parameters = FactoryMethods.newMap(Step.class, VariableDefinition.class);
        variables = FactoryMethods.newMap(Step.class, VariableDefinition.class);
        dependencies = FactoryMethods.newList(MofProperty.class);
        filters = FactoryMethods.newList(EteFilter.class);
    }


    public List<EteFilter> getFilters() {
        return filters;
    }

    public MofProperty getProperty() {
        return property;
    }

    public void setProperty(MofProperty property) {
        this.property = property;
    }



    public void addFilter(EteFilter filter) {
        filters.add(filter);
    }




    public MofClass     getTargetClass() {
        return (MofClass) property.getType().getRecBaseType();
    }


    public MofClass     getClientClass() {
        return (MofClass) property.getOwningMofClass();
    }


    public int getNextParameterNum() {
        return nextParameterNum;
    }

    public void setNextParameterNum(int nextParameterNum) {
        this.nextParameterNum = nextParameterNum;
    }



    public Map<Step, VariableDefinition> getParameters() {
        return parameters;
    }

    public void setParameters(Map<Step, VariableDefinition> parameters) {
        this.parameters = parameters;
    }

    public VariableDefinition addParameter(Step inStep) throws InstantiationException, IllegalAccessException {
        VariableDefinition variable = (VariableDefinition) FactoryRegistry.newInstance(VariableDefinition.class);
        variable.setValue(inStep);
        variable.setType(inStep.getType());
        variable.setName("p" + nextParameterNum++);
        parameters.put(inStep, variable);
        variables.put(inStep, variable);
//        Feature toFeature = inStep.getToFeature();
//        addDependency((MofProperty) toFeature);
        return variable;
    }

    public VariableDefinition   getParameter(Step inStep) {
        return parameters.get(inStep);
    }

    public void addVariable(Step inStep, VariableDefinition inVariable) {
        parameters.put(inStep, inVariable);
    }

    protected VariableDefinition newVariable(Step inStep) throws InstantiationException, IllegalAccessException {
        VariableDefinition result = newVariable();
        result.setValue(inStep);
        result.setType(inStep.getToFeature().getType());
        variables.put(inStep, result);
        return result;
    }

    protected VariableDefinition newVariable() throws InstantiationException, IllegalAccessException {
        VariableDefinition definition = (VariableDefinition) FactoryRegistry.newInstance(VariableDefinition.class);
        definition.setName("v" + nextJoinNum++);
        return definition;
    }

    public VariableDefinition getVariable(Step inStep) {
        return variables.get(inStep);
    }


    public boolean isParameter(VariableDefinition inVariable) {
        return parameters.values().contains(inVariable);
    }

    //=========================================================================//


    public Join addJoin(Step inStep, EteFilter inFilter) throws InstantiationException, IllegalAccessException {
        Feature feature = inStep.getToFeature();
        MofType featureType = feature.getType();
        String  featureName = feature.getName().toUpperCase();
        MofType targetType  = featureType.getRecBaseType();
        if (! (targetType instanceof MofClass)) {
            return null;
        }
        String  targetTableName = targetType.getName().toUpperCase();
        String  startParameterName;
        Step firstOperand = (Step)inStep.getOperand().get(0);
        if (firstOperand instanceof Self) {
            startParameterName = "v0";
        } else {
            VariableDefinition exp = variables.get(firstOperand);
            startParameterName = exp.getName();
        }
        Join    join = null;
        if (featureType.isCollection()) {
            VariableDefinition firstVariable = newVariable(inStep);
            String  startTableName = firstOperand.getType().getRecBaseType().getName().toUpperCase();
            String  joinTableName = startTableName + "_" + targetTableName;
            join = new Join(startParameterName, "ID", firstVariable.getName(), joinTableName, startTableName + "_ID");
            inFilter.addJoin(join);
            VariableDefinition secondVariable = newVariable(inStep);
            join = new Join(firstVariable.getName(), featureName + "_ID", secondVariable.getName(), targetTableName, "ID");
            inFilter.addJoin(join);
        } else {
            VariableDefinition newVariable = newVariable(inStep);
            join = new Join(
                    startParameterName,
                    featureName + "_ID",
                    newVariable.getName(),
                    targetTableName,
                    "ID");
            inFilter.addJoin(join);
        }
        return join;
    }

    //=========================================================================//


    public List<MofProperty> getDependencies() {
        System.out.println("Getting dependencies of " + property.getName()
                + " -> " + dependencies.size() + " dependency(ies)");
        return dependencies;
    }


    public void addDependency(MofProperty aProperty) {
        dependencies.add(aProperty);
    }


    //=========================================================================//

    /**
     * Every navigation starting with another property than the associated one
     * is replaced by a parameter.<br>
     * Every step of a navigation starting from the property associated to the
     * query is replaced by a variable.
     * 
     */
    private     Map<Step, VariableDefinition>   parameters;
    private     Map<Step, VariableDefinition>   variables;
    private     List<EteFilter>                 filters;
    private     MofProperty                     property;
    private     int                             nextParameterNum=1;
    private     int                             nextJoinNum=1;
    /**
     * List of properties with the same owning class than property (not the type
     * of property) which are involved in a filter of this query
     */
    private     List<MofProperty>               dependencies;

}
