/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.emof.instance.impl;

import fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification;
import fr.insset.jeanluc.ete.meta.model.emof.instance.Slot;
import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;
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



    private Collection<Slot>        slots = new LinkedList<>();

}
