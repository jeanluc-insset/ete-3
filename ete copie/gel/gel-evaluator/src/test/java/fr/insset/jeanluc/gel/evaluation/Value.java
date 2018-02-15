package fr.insset.jeanluc.gel.evaluation;



import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author jldeleage
 */
public class Value {


    public MofType getType() {
        return type;
    }

    public void setType(MofType type) {
        this.type = type;
    }



    public Object getValue(MofProperty inProperty) {
        return slots.get(inProperty);
    }

    public void setValue(MofProperty inProperty, Object inValue) {
        slots.put(inProperty, inValue);
    }



    private Map<MofProperty, Object> slots = new HashMap<>();
    private MofType                  type;


}
