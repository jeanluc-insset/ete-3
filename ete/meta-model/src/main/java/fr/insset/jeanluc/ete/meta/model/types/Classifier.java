/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.types;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;

/**
 *
 * @author jldeleage
 */
public interface Classifier extends MofType {
    
    public  default List<MofProperty>          getOwnedAttribute() {
        return getOwnedAttributeAsStream().collect(Collectors.toList());
    }
    public  void                            addOwnedAttribute(MofProperty inProperty);
    public  void                            removeOwnedAttribute(MofProperty inProperty);
    public  MofProperty                        getOwnedAttribute(String inName);
    public  Stream<MofProperty>                getOwnedAttributeAsStream();

    public  default List<MofOperation>         getOwnedOperation() {
        return getOwnedOperationAsStream().collect(Collectors.toList());
    }
    public  void                            addOwnedOperation(MofOperation inOperation);
    public  void                            removeOwnedOperation(MofOperation inOperation);
    public  MofOperation                       getOwnedOperation(String inName);
    public  Stream<MofOperation>               getOwnedOperationAsStream();

}
