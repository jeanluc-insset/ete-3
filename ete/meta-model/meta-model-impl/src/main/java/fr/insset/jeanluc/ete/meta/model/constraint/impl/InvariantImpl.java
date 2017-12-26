package fr.insset.jeanluc.ete.meta.model.constraint.impl;


import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;

/**
 *
 * @author jldeleage
 */
public class InvariantImpl extends ConstraintImpl implements Invariant {

    @Override
    public MofClass getContext() {
        return (MofClass) super.getContext();
    }

}
