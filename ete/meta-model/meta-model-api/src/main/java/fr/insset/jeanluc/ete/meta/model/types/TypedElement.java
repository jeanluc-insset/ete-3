/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.types;

import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification;
import java.util.Collection;

/**
 *
 * @author jldeleage
 */
public interface TypedElement extends NamedElement {
    
    public Collection<InstanceSpecification>     getInstances();
    public void         setInstances(Collection<InstanceSpecification> inInstances);
    public void         addInstance(InstanceSpecification inInstance);
    public void         removeInstance(InstanceSpecification inInstance);

    public  MofType     getType();
    public  void        setType(MofType inType);

}
