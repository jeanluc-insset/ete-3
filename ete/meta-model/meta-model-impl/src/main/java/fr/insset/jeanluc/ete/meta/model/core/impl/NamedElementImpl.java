package fr.insset.jeanluc.ete.meta.model.core.impl;

import fr.insset.jeanluc.ete.meta.model.constraint.Constraint;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.Stereotype;
import fr.insset.jeanluc.ete.meta.model.emof.TagValueDeclaration;
import fr.insset.jeanluc.ete.util.XList;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class NamedElementImpl implements NamedElement {


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String inName) {
        name = inName;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String inId) {
        id = inId;
    }

    @Override
    public String toString() {
        return getName();
    }



    public Collection<NamedElement>         getDependances() {
        return dependances;
    }

    public void                             setDependances(Collection<NamedElement> inDependances) {
        dependances = inDependances;
    }

    public void                             addDependance(NamedElement inDependance) {
        if (dependances == null) {
            try {
                dependances = FactoryMethods.newSet(NamedElement.class);
            } catch (InstantiationException ex) {
                throw new RuntimeException("Unable to create a set", ex);
            }
        }
        dependances.add(inDependance);
    }





    @Override
    public Collection<Stereotype> getStereotypes() {
        if (stereotypes == null) {
            try {
                stereotypes = FactoryMethods.newSet(Stereotype.class);
            } catch (InstantiationException ex) {
                Logger.getLogger(NamedElementImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return stereotypes;
    }

    @Override
    public void setStereotypes(Collection<Stereotype> inStereotypes) {
        stereotypes = inStereotypes;
    }

    @Override
    public Map<TagValueDeclaration, Object> getTagValues() {
        return tagValues;
    }

    @Override
    public void setTagValues(Map<TagValueDeclaration, Object> inTagValues) {
        tagValues = inTagValues;
    }

    @Override
    public void addTagValue(TagValueDeclaration inDeclaration, Object inValue) {
        try {
            if (tagValues == null) {
                tagValues = FactoryMethods.newMap(TagValueDeclaration.class, Object.class);
            }
            tagValues.put(inDeclaration, inValue);
        } catch (InstantiationException ex) {
            Logger.getGlobal().warning("Unable to add tag value " + inDeclaration + "=" + inValue);
        }
    }

    @Override
    public Collection<Constraint> getConstraints() {
        return constraints;
    }

    @Override
    public void setConstraints(Collection<Constraint> constraints) {
        this.constraints = constraints;
    }


    @Override
    public void addConstraint(Constraint inConstraint) {
        if (constraints == null) {
            try {
                constraints = FactoryMethods.newSet(Constraint.class);
            } catch (InstantiationException ex) {
                constraints = new HashSet<>();
            }
        }
        constraints.add(inConstraint);
    }

    @Override
    public Collection<NamedElement> getOwnedElements() {
        if (ownedElements == null) {
            ownedElements = new XList<>();
        }
        return ownedElements;
    }

    @Override
    public void setOwnedElements(Collection<NamedElement> inSubElements) {
        ownedElements = inSubElements;
    }




    private String                              name;
    private String                              id;
    private Collection<Stereotype>              stereotypes;
    private Map<TagValueDeclaration, Object>    tagValues;
    private Collection<NamedElement>            dependances;
    private Collection<Constraint>              constraints;
    private Collection<NamedElement>            ownedElements;

}
