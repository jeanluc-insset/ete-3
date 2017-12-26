package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.types.TypedElement;

/**
 *
 * @author jldeleage
 */
public interface StructuralFeature extends Feature, TypedElement, MultiplicityElement {
    
    public boolean  isReadOnly();
    public void     setReadOnly(boolean inReadOnly);

}
