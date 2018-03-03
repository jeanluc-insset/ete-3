

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
public class EnhancedPostCondition extends PostconditionImpl implements Comparable<EnhancedPostCondition>, Postcondition {


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


    @Override
    public int compareTo(EnhancedPostCondition o) {
        // TODO : if the defined property is "result" then this is greater than
        // any other condition
        if (o.getFinalUsedValues().contains(definedProperty)) {
            if (finalUsedValues.contains(o.getDefinedProperty())) {
                throw new RuntimeException("Circular definition in " + this.getSpecificationAsString()
                        + " between" + o.getDefinedProperty() + " and " + definedProperty);
            }
            return 1;
        }
        if (finalUsedValues.contains(o.getDefinedProperty())) {
            return -1;
        }
        // We don't care the order, should we ?
        // Maybe we can optimize the code using less auxiliary variables
        // Let's give a try
        if (initialUsedValues.contains(o.getDefinedProperty())) {
            return -1;
        }
        if (o.getInitialUsedValues().contains(definedProperty)) {
            return 1;
        }
        // OK, now we don't care, really.
        return 0;
    }



    private     MofProperty             definedProperty;
    private     List<MofProperty>       finalUsedValues = new LinkedList<>();
    private     List<MofProperty>       initialUsedValues = new LinkedList<>();


}
