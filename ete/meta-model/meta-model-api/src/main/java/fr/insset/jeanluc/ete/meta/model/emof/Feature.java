package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;

/**
 *
 * @author jldeleage
 */
public interface Feature extends TypedElement, NamedElement {

    public Classifier getOwningMofClass();

    public void setOwningMofClass(Classifier inMofClass);

}
