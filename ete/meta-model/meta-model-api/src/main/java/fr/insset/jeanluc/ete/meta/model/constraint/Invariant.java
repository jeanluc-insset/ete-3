package fr.insset.jeanluc.ete.meta.model.constraint;


import fr.insset.jeanluc.ete.meta.model.emof.MofClass;

/**
 *
 * @author jldeleage
 */
public interface Invariant extends Constraint {


    public final static String      INVARIANT = "invariant";


    @Override
    public MofClass getContext();

}
