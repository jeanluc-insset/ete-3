package fr.insset.jeanluc.action.semantics.builder;



import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import java.util.LinkedList;
import java.util.List;



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


    public List<Step> getJoins() {
        return joins;
    }


    public void addJoin(Step inNav) {
        joins.add(inNav);
    }



    public MofClass     getTargetClass() {
        return (MofClass) property.getType().getRecBaseType();
    }


    public MofClass     getClientClass() {
        return (MofClass) property.getOwningMofClass();
    }


    private     List<Step>                 joins = new LinkedList<>();
    /**
     * Every navigation starting with another property than the associated one
     * is replaced by a variable.<br>
     * When code is generated, the 
     */
    private     List<VariableDefinition>   variables = new LinkedList<>();
    private     List<EteFilter>            filters = new LinkedList<>();
    private     MofProperty                property;

}
