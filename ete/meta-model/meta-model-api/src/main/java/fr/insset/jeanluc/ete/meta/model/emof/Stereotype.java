package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import java.util.Collection;

/**
 *
 * @author jldeleage
 */
public interface Stereotype extends PackageableElement {

    public final static String      STEREOTYPE = "stereotype";

    public  default String              getXmiType() {
        return "uml:Stereotype";
    }

    public MofPackage   getProfile();
    public void         setProfile(MofPackage inProfile);

    public Collection<TagValueDeclaration>  getTagValueDeclarations();
    public void                             setTagValueDeclarations(Collection<TagValueDeclaration> inDeclarations);
    public TagValueDeclaration              addTagValueDeclaration(TagValueDeclaration inDeclaration);
    public void                             removeTagValueDeclaration(TagValueDeclaration inDeclaration);
    public TagValueDeclaration              getTagValueDeclaration(String inName);

}
