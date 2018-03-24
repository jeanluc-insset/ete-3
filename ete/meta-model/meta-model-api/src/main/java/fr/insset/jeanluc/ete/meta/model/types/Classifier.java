package fr.insset.jeanluc.ete.meta.model.types;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.util.XList;
import fr.insset.jeanluc.util.factory.FactoryMethods;

/**
 *
 * @author jldeleage
 */
public interface Classifier extends MofType {
    


    public  default List<MofProperty>          getOwnedAttribute() {
        return getOwnedAttributeAsStream().collect(Collectors.toCollection(XList::new));
    }
    public  void                               addOwnedAttribute(MofProperty inProperty);
    public  void                               removeOwnedAttribute(MofProperty inProperty);
    public  MofProperty                        getOwnedAttribute(String inName);
    public  Stream<MofProperty>                getOwnedAttributeAsStream();
    public default List<MofProperty>           getAllAttributes() throws InstantiationException {
        List<MofProperty>   result = FactoryMethods.newList(MofProperty.class);
        for (MofType aType : getSuperTypes()) {
            if (aType instanceof Classifier) {
                Classifier aClassifier = (Classifier)aType;
                result.addAll(aClassifier.getAllAttributes());
            }
        }
        result.addAll(getOwnedAttribute());
        return result;
    }

    public  default List<MofOperation>         getOwnedOperation() {
        return getOwnedOperationAsStream().collect(Collectors.toCollection(XList::new));
    }
    public default List<MofOperation>           getAllOperations() throws InstantiationException {
        List<MofOperation>   result = FactoryMethods.newList(MofOperation.class);
        for (MofType aType : getSuperTypes()) {
            if (aType instanceof Classifier) {
                Classifier aClassifier = (Classifier)aType;
                result.addAll(aClassifier.getAllOperations());
            }
        }
        result.addAll(getOwnedOperation());
        return result;
    }
    public  void                               addOwnedOperation(MofOperation inOperation);
    public  void                               removeOwnedOperation(MofOperation inOperation);
    public  MofOperation                       getOwnedOperation(String inName);
    public  Stream<MofOperation>               getOwnedOperationAsStream();

}

