package fr.insset.jeanluc.ete.meta.model.types;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.util.XList;

/**
 *
 * @author jldeleage
 */
public interface Classifier extends MofType {
    
    public  default List<MofProperty>          getOwnedAttribute() {
        return getOwnedAttributeAsStream().collect(Collectors.toCollection(XList::new));
    }
    public  void                            addOwnedAttribute(MofProperty inProperty);
    public  void                            removeOwnedAttribute(MofProperty inProperty);
    public  MofProperty                        getOwnedAttribute(String inName);
    public  Stream<MofProperty>                getOwnedAttributeAsStream();

    public  default List<MofOperation>         getOwnedOperation() {
        return getOwnedOperationAsStream().collect(Collectors.toCollection(XList::new));
    }
    public  void                            addOwnedOperation(MofOperation inOperation);
    public  void                            removeOwnedOperation(MofOperation inOperation);
    public  MofOperation                       getOwnedOperation(String inName);
    public  Stream<MofOperation>               getOwnedOperationAsStream();

}

