package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.types.MofType;

/**
 *
 * @author jldeleage
 */
public interface TagValueDeclaration extends NamedElement {
    
    public final static String      TAG_VALUE_DECLARATION = "tag_value_declaration";

    public  MofType     getValueType();
    public  void        setValueType(MofType inType);

}
