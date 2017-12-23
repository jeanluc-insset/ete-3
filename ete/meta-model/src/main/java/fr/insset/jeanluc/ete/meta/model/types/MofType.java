package fr.insset.jeanluc.ete.meta.model.types;


import fr.insset.jeanluc.ete.meta.model.emof.TagValueDeclaration;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author jldeleage
 */
public interface MofType extends PackageableElement {

    public final static String      MOF_TYPE = "mof-type";

    public Collection<MofType>      getSuperTypes();
    public void                     setSuperTypes(Collection<MofType> inSuperTypes);
    public void                     addSuperType(MofType inSuperType);

    public default boolean          isCollection() {
        return false;
    }

    public default boolean          isPrimitive() {
        return true;
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

}
