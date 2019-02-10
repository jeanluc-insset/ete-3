package fr.insset.jeanluc.ete.meta.model.mofpackage;


import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.types.PrimitiveType;
import fr.insset.jeanluc.util.factory.AbstractFactory;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;


/**
 * An EteModel is a MofPackage but may have a "parent" model. This is different
 * from an owning package.
 *
 * @author jldeleage
 */
public interface EteModel extends MofPackage {


    public  final static String     MODEL = "model";

    public NamedElement     getElementById(String inId);
    public void             addElement(NamedElement newInstance);

    public EteModel         getParent();
    public void             setParent(EteModel inParent);


    @Override
    public default PackageableElement getElementByName(String inName) {
        for (PackageableElement element : getPackagedElementAsCollection()) {
            if (inName.equals(element.getName())) {
                return element;
            }
        }
        EteModel    parent = getParent();
        return parent != null ? parent.getElementByName(inName) : null;
    }

 
    public default EteModel createModel() throws InstantiationException, IllegalAccessException {
        EteModel result = (EteModel)FactoryRegistry.newInstance(MODEL);;
        result.setParent(this);
        return result;
    }

    @Override
    public default Collection<MofClass> getAllClasses() {
        try {
            Collection<MofClass> result = FactoryMethods.newList(MofClass.class);
            result.addAll(getClasses());
            EteModel parent = getParent();
            if (parent != null) {
                result.addAll(parent.getAllClasses());
            }
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(EteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getClasses();
    }

    @Override
    public default Collection<PrimitiveType> getAllPrimitiveTypes() {
        try {
            Collection<PrimitiveType> result = FactoryMethods.newList(PrimitiveType.class);
            result.addAll(getPrimitiveTypes());
            EteModel parent = getParent();
            if (parent != null) {
                result.addAll(parent.getAllPrimitiveTypes());
            }
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(EteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getPrimitiveTypes();
    }


}

