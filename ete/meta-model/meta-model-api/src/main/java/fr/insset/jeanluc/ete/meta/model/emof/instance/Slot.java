package fr.insset.jeanluc.ete.meta.model.emof.instance;


import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;

/**
 *
 * @author jldeleage
 */
public interface Slot extends TypedElement {
    
    public final static String  SLOT                    = "slot";


    public Object   getValue();
    public void     setValue(Object inValue);

    public MofProperty getMofProperty();
    public void     setMofProperty(MofProperty inProperty);

    @Override
    public default  MofType getType() {
        return getMofProperty().getType();
    }

}
