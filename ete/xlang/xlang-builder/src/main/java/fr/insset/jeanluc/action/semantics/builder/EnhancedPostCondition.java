

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.impl.PostconditionImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class EnhancedPostCondition extends PostconditionImpl implements Postcondition {


    public MofProperty getDefinedProperty() {
        return definedProperty;
    }

    public void setDefinedProperty(MofProperty definedProperty) {
        this.definedProperty = definedProperty;
    }

    public List<MofProperty> getFinalUsedValues() {
        return finalUsedValues;
    }

    public void setFinalUsedValues(List<MofProperty> finalUsedValues) {
        this.finalUsedValues = finalUsedValues;
    }

    public List<MofProperty> getInitialUsedValues() {
        return initialUsedValues;
    }

    public void setInitialUsedValues(List<MofProperty> initialUsedValues) {
        this.initialUsedValues = initialUsedValues;
    }





    private     MofProperty             definedProperty;
    private     List<MofProperty>       finalUsedValues = new LinkedList<>();
    private     List<MofProperty>       initialUsedValues = new LinkedList<>();

}
