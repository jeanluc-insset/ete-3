

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.List;

/**
 * A SyntheticFilter aims to be translated to filter expressions in a stream
 * or where statements in an SQL query.<br>
 * For example, the invariant <code>captain &lt;&gt; copilot</code> gives two
 * filters&nbsp;:<ul>
 * <li>
 *      <ul>
 *          <li>filtered class : Pilot</li>
 *          <li>client class : Flight</li>
 *          <li>filtered property : captain</li>
 *      </ul>
 *      <ul>
 *          <li>filtered class : Pilot</li>
 *          <li>client class : Flight</li>
 *          <li>filtered property : copilot</li>
 *      </ul>
 * </li>
 * </ul>
 * The first instance will hold the additional information :<ul>
 * <li></li>
 * </ul>
 * With all this information, the JPA Generator will generate for that instance :<br>
 * <code><pre>public CriteriaQuery&lt;Pilot&gt; filterCaptainForCrew(Flight inFlight, CriteriaQuery inQuery) {
 *    
 *    return inQuery;
 * }
 * </pre></code>
 *
 * @author jldeleage
 */
public class SyntheticFilter {

    public MofClass getClientClass() {
        return clientClass;
    }

    public void setClientClass(MofClass clientClass) {
        this.clientClass = clientClass;
    }

    public MofProperty getFilteredProperty() {
        return filteredProperty;
    }

    public void setFilteredProperty(MofProperty filteredProperty) {
        this.filteredProperty = filteredProperty;
    }

    public Invariant getInvariant() {
        return invariant;
    }

    public void setInvariant(Invariant invariant) {
        this.invariant = invariant;
    }


    //========================================================================//


    private     MofClass        clientClass;
    private     MofProperty     filteredProperty;
    private     Invariant       invariant;
    private     GelExpression   expression;
    private     String          variableName;

}
