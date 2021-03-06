package fr.insset.jeanluc.action.semantics.builder;



import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * <div>
 * An EteFilter is used to add "join" and "where" clauses to an EteQuery.<br>
 * 
 * For every navigation of every invariant one or more filters are generated.<br>
 * Each filter is added to a query.
 * </div>
 * <div>
 * For example, if the navigation self.xxx.yyy.zzz is used in an invariant Ppp of
 * the A class, where A::xxx is instance of the X class, X::yyy is
 * instance of the class Y and Y::zzz is instance of the Z class, we build
 * the following queries and filters filters&nbsp;:<ul>
 * <li>the query <code>getAllXAsXxxFor(A aaa)</code>. The query contains
 * the filters&nbsp;:<ul>
 *      <li>filterXAsXxxInPppFor(Aaa aaa, Object inoutQuery)</li>
 *      <li>filterYAsYyyInPppFor(Aaa aaa, Object inoutQuery)</li>
 *      <li>filterZAsZzzInPppFor(Aaa aaa, Object inoutQuery)</li>
 * </ul>
 * </li>
 * <li>the query <code>getAllYAsYyyFor(X xxx)</code>. The query contains
 * the filters&nbsp;:<ul>
 *      <li>filterYAsYyyInPppFor(X xxx, Object inoutQuery)</li>
 *      <li>filterZAsZzzInPppFor(Y yyy, Object inoutQuery)</li>
 * </ul>
 * </li>
 * <li>the query <code>getAllZAsZzzFor(Y yyy)</code>. The query contains
 * the filter&nbsp;:<ul>
 *      <li>filterZAsZzzInPppFor(Y yyy, Object inoutQuery)</li>
 * </ul>
 * </li>
 * </ul>
 * </div>
 * <div>
 * More concretely, let's consider the "captainIsCertified" invariant in
 * Flight class, in the insset-airways sample&nbsp;:<br>
 * <code>self.captain.certificates.planeModel->includes(self.plane.planeModel)</code><br>
 * We build the queries and filters&nbsp;:<ul>
 * <li>
 * the query <code>getAllPilotAsCaptainFor(Flight flight)</code> which contains
 * the filters&nbsp;:<ul>
 *      <li><code>filterPilotAsCaptainInCaptainIsCertifiedFor(Flight flight)</code></li>
 * </ul>
 * </li>
 * <li>
 * the query <code> getAllCertificateAsCertificateFor(Pilot pilot)</code> which
 * contains the filter&nbsp;:<ul>
 *      <li>filterCertificateInCaptainIsCertifiedFor(Pilot pilot)*</li>
 * </ul>
 * </li>
 * <li>
 * the query <code>getAllPlaneModelAsPlaneModelFor(Certificate certificate)</code>
 * which contains the filter&nbsp;:<ul>
 *      <li>filterPlaneModelInCaptaintIsCertifiedFor(Certificate certificate)*</li>
 * </ul>
 * </li>
 * <li>
 * the query <code>getAllPlaneAsPlaneFor(Flight flight)</code>
 * which contains the filter&nbsp;:<ul>
 *      <li><code>filterPlaneAsPlaneInCaptainIsCertified(Flight flight)</code></li>
 * </ul>
 * </li>
 * <li>
 * the query <code>getAllPlaneModelAsPlaneModelFor(Plane plane)</code> which
 * contains the filter&nbsp;:<ul>
 *      <li><code>filterPlaneModelAsPlaneModelInCaptainIsCertifiedFor(Plane plane)</code></li>
 * </ul>
 * </li>
 * </ul>
 * The filters marked with "*" do not do anything.
 * </div>
 * 
 * <div>
 * A filter 
 * </div>
 * 
 * @author jldeleage
 */
public class EteFilter {

    public EteFilter() throws InstantiationException {
        variables = FactoryMethods.newMap(Step.class, VariableDefinition.class);
        joins     = FactoryMethods.newList(Join.class);
    }


    public MofProperty getFilteredProperty() {
        return filteredProperty;
    }

    public void setFilteredProperty(MofProperty filteredProperty) {
        this.filteredProperty = filteredProperty;
    }


    //==========================================================================//


    public Invariant getInvariant() {
        return invariant;
    }

    public void setInvariant(Invariant invariant) {
        this.invariant = invariant;
    }


    //==========================================================================//


    public GelExpression getExpression() {
        return expression;
    }

    public void setExpression(GelExpression expression) {
        this.expression = expression;
    }



    //==========================================================================//


    public List<Join> getJoins() {
        return joins;
    }

    public void setJoins(List<Join> joins) {
        this.joins = joins;
    }

    public void addJoin(Join inJoin) {
        joins.add(inJoin);
    }



    //==========================================================================//


    public Map<Step, VariableDefinition> getVariables() {
        return variables;
    }

    public void setVariables(Map<Step, VariableDefinition> variables) {
        this.variables = variables;
    }

    public void addVariable(Step inStep, VariableDefinition inVariable) {
        if (inVariable.getName().equals("v0")) {
            return;
        }
        variables.put(inStep, inVariable);
    }

    public VariableDefinition getVariable(Step inStep) {
        return variables.get(inStep);
    }


    public List<VariableDefinition> getParameters() throws InstantiationException {
        List<VariableDefinition>    result = FactoryMethods.newList(VariableDefinition.class);
        for (VariableDefinition def : variables.values()) {
            if (! (def.getName()).equals("v0")) {
                result.add(def);
            }
        }
        return result;
    }



    //==========================================================================//

    
    private     MofProperty         filteredProperty;
    private     Invariant           invariant;
    /**
     * <div>
     * It is the original expression of the invariant where some navigations are
     * replaced by parameters (actually variables). The navigations starting with
     * the filteredProperty are associated to variable but are not substituted,
     * other navigations are substituted.
     * </div>
     * <div>
     * In the airways sample, the {@code captain} property is associated to two
     * filters.<br>
     * The first one is created from the {@code captain <> copilot}
     * invariant and the second one is created from
     * {@code captain.certificates.planeModel->includes(self.plane.planeModel)}.<br>
     * The second filter has the expression&nbsp;<br>
     * {@code v3 = v4}<br>
     * </div>
     */
    private     GelExpression                 expression;
    private     List<Join>                    joins;
    /**
     * Every navigation starting with another property than the associated one
     * is replaced by a variable.<br>
     * 
     */
    private     Map<Step, VariableDefinition>   variables;

}
