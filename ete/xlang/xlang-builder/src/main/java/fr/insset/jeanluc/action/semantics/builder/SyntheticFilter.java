

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;

/**
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


    private     MofClass        clientClass;
    private     MofProperty     filteredProperty;
    private     Invariant       invariant;

}
