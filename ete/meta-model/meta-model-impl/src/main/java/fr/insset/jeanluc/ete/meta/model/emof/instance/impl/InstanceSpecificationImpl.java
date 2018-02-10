package fr.insset.jeanluc.ete.meta.model.emof.instance.impl;


import fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification;
import fr.insset.jeanluc.ete.meta.model.emof.instance.Slot;
import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;
import fr.insset.jeanluc.ete.util.XList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author jldeleage
 */
public class InstanceSpecificationImpl extends TypedElementImpl implements InstanceSpecification {



    public Collection<Slot> getSlots() {
        return slots;
    }

    public void setSlots(Collection<Slot> slots) {
        this.slots = slots;
    }


    @Override
    public void addSlot(Slot inSlot) {
        slots.add(inSlot);
    }

    @Override
    public void removeSlot(Slot inSlot) {
        slots.remove(inSlot);
    }



    private Collection<Slot>        slots = new XList<>();

}
