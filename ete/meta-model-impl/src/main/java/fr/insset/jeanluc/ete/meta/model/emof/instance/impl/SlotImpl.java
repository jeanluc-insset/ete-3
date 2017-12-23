/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.emof.instance.impl;

import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.emof.instance.Slot;
import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;

/**
 *
 * @author jldeleage
 */
public class SlotImpl extends TypedElementImpl implements Slot {
    
    public MofProperty getMofProperty() {
        return mofProperty;
    }

    public void setMofProperty(MofProperty mofProperty) {
        this.mofProperty = mofProperty;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    private MofProperty     mofProperty;
    private Object          value;

}
