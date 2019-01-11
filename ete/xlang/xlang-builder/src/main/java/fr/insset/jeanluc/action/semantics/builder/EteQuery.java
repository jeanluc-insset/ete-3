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
        variable.setName("" + nextParameterNum++);
        parameters.put(inStep, variable);
        return variable;
    }

    public void addVariable(Step inStep, VariableDefinition inVariable) {
        parameters.put(inStep, inVariable);
    }


    public VariableDefinition   getParameter(Step inStep) {
        return parameters.get(inStep);
    }


    //=========================================================================//


    public Join addJoin(Step inStep) throws InstantiationException, IllegalAccessException {
        Feature feature = inStep.getToFeature();
        MofType featureType = feature.getType();
        String  featureName = feature.getName();
        MofType targetType  = featureType.getRecBaseType();
        String  targetTableName = targetType.getName().toUpperCase();
        String  startParameterName;
        Step firstOperand = (Step)inStep.getOperand().get(0);
        if (firstOperand instanceof Self) {
            startParameterName = "v0";
        } else {
            VariableDefinition exp = parameters.get(firstOperand);
            startParameterName = exp.getName();
        }
        Join    join = null;
        if (featureType.isCollection()) {
            Join    firstJoin = new Join();
            Join    secondJoin = new Join();
            firstJoin.setTargetFeature(feature);
            firstJoin.setReverseNames(false);
            firstJoin.setSrcVariableNameAndField(startParameterName);
            VariableDefinition definition = newVariable();
            firstJoin.setTargetVariableName(definition.getName());
            secondJoin.setTargetFeature(feature);
            secondJoin.setReverseNames(false);
            secondJoin.setSrcVariableNameAndField(targetTableName);
            definition = newVariable();
            secondJoin.setTargetVariableName(definition.getName());
            join = new DoubleJoin(firstJoin, secondJoin);
            parameters.put(inStep, definition);
        } else {
            join = new Join();
            VariableDefinition definition = newVariable();        
            join.setTargetFeature(feature);
            join.setReverseNames(false);
            join.setSrcVariableNameAndField(startParameterName);
            join.setTargetVariableName(definition.getName());
        }

//        Join join = new Join(startParameterName, nextJoinNum, targetTableName, propName, true);
        return join;
    }

    protected VariableDefinition newVariable() throws InstantiationException, IllegalAccessException {
        VariableDefinition definition = (VariableDefinition) FactoryRegistry.newInstance(VariableDefinition.class);
        definition.setName("v" + nextJoinNum++);
        return definition;
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
    private     List<EteFilter>                 filters = new LinkedList<>();
    private     MofProperty                     property;
    private     int                             nextParameterNum=1;
    private     int                             nextJoinNum=1;

}
