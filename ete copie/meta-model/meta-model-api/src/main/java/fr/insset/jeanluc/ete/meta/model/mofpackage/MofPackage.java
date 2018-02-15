package fr.insset.jeanluc.ete.meta.model.mofpackage;



import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.Enumeration;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.util.XList;
import fr.insset.jeanluc.util.coll.CompositeCollection;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * diag. 12.4 EMOF Package, p.28
 *
 * @author jldeleage
 */
public interface MofPackage extends PackageableElement {


    public final static String      MOF_PACKAGE     = "mof-package";


    public  Collection<PackageableElement>          getPackagedElementAsCollection();
    public  void                                    addPackagedElement(PackageableElement inPackageableElement);
    public  void                                    removePackagedElement(PackageableElement inPackageableElement);
    public  default PackageableElement              getElementByName(String inName)  {
        for (PackageableElement element : getPackagedElementAsCollection()) {
            if (inName.equals(element.getName())) {
                return element;
            }
        }
        return null;
    }

    public  default Collection<MofPackage>          getPackages() {
        return getPackagesAsStream().collect(Collectors.toCollection(XList::new));
    }
    public  default Collection<MofClass>            getClasses() {
        return getClassesAsStream().collect(Collectors.toCollection(XList::new));
    }
    public  default Collection<MofClass>            getAllClasses() {
        Collection<MofClass>    result = new CompositeCollection<>(getClasses());
        return result;
    }

    public default Collection<Enumeration>          getEnumerations() {
        return getEnumerationsAsStream().collect(Collectors.toCollection(XList::new));
    }


    public  Stream<PackageableElement>              getPackagedElement();

    public  default Stream<MofPackage>              getPackagesAsStream() {
        return getPackagedElement()
                    .filter(p -> p instanceof MofPackage).map(p -> (MofPackage)p);
    }
    public  default Stream<MofClass>                getClassesAsStream() {
        return getPackagedElement()
                    .filter(c -> c instanceof MofClass).map(p -> (MofClass)p);
    }
    public default Stream<Enumeration>              getEnumerationsAsStream() {
        return getPackagedElement()
                    .filter(e -> e instanceof Enumeration).map(p -> (Enumeration)p);
    }

    public  default Stream<MofClass>                getAllClassesAsStream() {
        return getAllClasses().stream();
    }


}
