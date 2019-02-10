package fr.insset.jeanluc.ete.meta.model.constraint;


import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;

/**
 *
 * @author jldeleage
 */
public interface Invariant extends Constraint {


    public final static String      INVARIANT = "invariant";


    /**
     * Covariance of the result...
     * 
     * @return 
     */
    @Override
    public MofClass getContext();

    @Override
    public void setContext(NamedElement inElement);

}
