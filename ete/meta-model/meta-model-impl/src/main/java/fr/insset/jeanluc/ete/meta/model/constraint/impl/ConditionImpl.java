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
