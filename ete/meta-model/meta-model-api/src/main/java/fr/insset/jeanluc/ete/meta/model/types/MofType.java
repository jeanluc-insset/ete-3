package fr.insset.jeanluc.ete.meta.model.types;


import fr.insset.jeanluc.ete.meta.model.core.MofElement;
import fr.insset.jeanluc.ete.meta.model.emof.TagValueDeclaration;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author jldeleage
 */
public interface MofType extends PackageableElement {

    public final static String      MOF_TYPE = "mof-type";

    public Collection<MofType>      getSuperTypes();
    public void                     setSuperTypes(Collection<MofType> inSuperTypes);
    public void                     addSuperType(MofType inSuperType);

    public default MofType          getRecBaseType() {
        if (isCollection()) {
            MofCollection coll = (MofCollection)this;
            return coll.getBaseType().getRecBaseType();
        }
        return this;
    }

    public default boolean          isCollection() {
        return false;
    }

    public default boolean          isPrimitive() {
        return false;
    }


    @Override
    public default Object          getValueOf(String inTagValueName) {
        Map<TagValueDeclaration, Object> tagValues = getTagValues();
        if (tagValues != null) {
            for (Map.Entry<TagValueDeclaration, Object> entry : tagValues.entrySet()) {
                if (entry.getKey().getName().equals(inTagValueName)) {
                    return entry.getValue();
                }
            }
        }
        for (MofType aSuperType : getSuperTypes()) {
            Object inheritedValue = aSuperType.getValueOf(inTagValueName);
            if (inheritedValue != null) {
                return inheritedValue;
            }
        }
        return null;
    }


    public default Set<MofElement> getAllDependances() {
        Set<MofElement>    result = getDependance();
        Collection<MofType> superTypes = getSuperTypes();
        for (MofType aType : superTypes) {
            result.addAll(aType.getAllDependances());
        }
        return result;
    }


    public default boolean  isEnumeration() {
        return false;
    }


}
