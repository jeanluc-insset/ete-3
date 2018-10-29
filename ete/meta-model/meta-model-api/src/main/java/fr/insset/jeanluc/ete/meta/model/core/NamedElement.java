package fr.insset.jeanluc.ete.meta.model.core;


import fr.insset.jeanluc.ete.meta.model.constraint.Constraint;
import fr.insset.jeanluc.ete.meta.model.emof.TagValueDeclaration;
import fr.insset.jeanluc.ete.meta.model.emof.Stereotype;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public interface NamedElement extends MofElement {

    /**
     * Conceptually it is a static method (all the instances of a same class
     * return the same value) but it is declared as an instance method to allow
     * polymorphism
     */
    public  String                          getXmiType();

    public  String                          getName();
    public  void                            setName(String inName);

    public default String                   getQualifiedName() {
        return getName();
    }


    public Collection<NamedElement>         getDependencies();
    public void                             setDependencies(Collection<NamedElement> inDependances);
    public void                             addDependency(NamedElement inDependance);

    public Collection<Stereotype>           getStereotypes();
    public void                             setStereotypes(Collection<Stereotype> inStereotypes);
    public default void                     addStereotype(Stereotype inStereotype) {
        getStereotypes().add(inStereotype);
    }

    public Map<TagValueDeclaration, Object> getTagValues();
    public void                             setTagValues(Map<TagValueDeclaration, Object> inTagValues);
    public void                             addTagValue(TagValueDeclaration inDeclaration, Object inValue);
    public default Object                   getValueOf(TagValueDeclaration inDeclaration) {
        Map<TagValueDeclaration, Object> tagValues = getTagValues();
        if (tagValues != null) {
            return tagValues.get(inDeclaration);
        }
        return null;
    }
    public default Object                    getValueOf(String inTagValueName) {
        Map<TagValueDeclaration, Object> tagValues = getTagValues();
        if (tagValues != null) {
            for (Map.Entry<TagValueDeclaration, Object> entry : tagValues.entrySet()) {
                if (entry.getKey().getName().equals(inTagValueName)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }


    /**
     * WARNING : should be overridden by items able to inherit their
     * stereotypes.
     * 
     * @param inStereotypeName
     * @return true if this is marked with a stereotype named inStereotypeName.
     */
    public default boolean          hasStereotype(String inStereotypeName) {
        Logger logger = Logger.getLogger("fr.insset.jeanluc.ete.meta.model.core.NamedElement");
        for (Stereotype stereotype : getStereotypes()) {
            logger.log(Level.FINE, "Checking whether stereotype {0} equals to {1}", new Object[]{inStereotypeName, stereotype.getName()});
            if (inStereotypeName.equals(stereotype.getName())) {
                logger.log(Level.FINE,"       check OK");
                return true;
            }
        }
        return false;
    }

    /**
     * WARNING : should be overridden by items able to inherit their
     * stereotypes.
     * 
     * @param inStereotypeName
     * @return the first stereotype named inStereotypeName and marking this.
     */
    public default Stereotype       getStereotype(String inStereotypeName) {
        for (Stereotype stereotype : getStereotypes()) {
            if (inStereotypeName.equals(stereotype.getName())) {
                return stereotype;
            }
        }
        return null;
    }

    // Added by JLD 2017/08/18
    public Collection<Constraint>   getConstraints();
    public void                     setConstraints(Collection<Constraint> inConstraints);
    public default void             addConstraint(Constraint inConstraint) {
        getConstraints().add(inConstraint);
    }


    // Added by JLD 2018/01/11
    public Collection<NamedElement> getOwnedElements();
    public void                     setOwnedElements(Collection<NamedElement> inSubElements);
    public default void             addOwnedElement(NamedElement inSubElement) throws InstantiationException {
        Collection<NamedElement> ownedElements = getOwnedElements();
        if (ownedElements == null) {
            ownedElements = FactoryMethods.newList(NamedElement.class);
            setOwnedElements(ownedElements);
        }
        ownedElements.add(inSubElement);
    }
    public default void             removeOwnedElement(NamedElement inSubElement) {
        Collection<NamedElement> ownedElements = getOwnedElements();
        if (ownedElements == null) {
            return;
        }
        ownedElements.remove(inSubElement);
    }
    


}
