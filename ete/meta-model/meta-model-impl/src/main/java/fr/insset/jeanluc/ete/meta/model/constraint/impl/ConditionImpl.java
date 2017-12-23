/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.constraint.impl;

import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;

/**
 *
 * @author jldeleage
 */
public abstract class ConditionImpl extends ConstraintImpl implements Condition {

    @Override
    public MofOperation getContext() {
        return (MofOperation) super.getContext();
    }

}
