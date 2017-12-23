/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.emof.instance;

import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.Collection;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import static fr.insset.jeanluc.ete.meta.model.emof.instance.Slot.SLOT;

/**
 *
 * @author jldeleage
 */
public interface InstanceSpecification extends TypedElement {

    public final static String  INSTANCE_SPECIFICATION  = "instance";


    public  Collection<Slot>    getSlots();
    public  void                setSlots(Collection<Slot> inSlots);
    public  void                addSlot(Slot inSlot);
    public  void                removeSlot(Slot inSlot);

    public  default Object      getValue(MofProperty inProperty) {
        for (Slot s : getSlots()) {
            if (inProperty.equals(s.getMofProperty())) {
                return s.getValue();
            }
        }
        return null;
    }

    public  default void         setValue(MofProperty inProperty, Object inValue) throws InstantiationException, IllegalAccessException {
        for (Slot s : getSlots()) {
            if (inProperty.equals(s.getMofProperty())) {
                s.setValue(inValue);
                return;
            }
        }
        Slot newSlot = (Slot)FactoryRegistry.newInstance(SLOT);
        addSlot(newSlot);
        newSlot.setValue(inValue);
    }

}
