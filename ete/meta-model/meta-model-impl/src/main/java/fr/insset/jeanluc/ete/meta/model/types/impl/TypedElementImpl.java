package fr.insset.jeanluc.ete.meta.model.types.impl;


import fr.insset.jeanluc.ete.meta.model.core.impl.NamedElementImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author jldeleage
 */
public class TypedElementImpl extends NamedElementImpl implements TypedElement {



    @Override
    public MofType getType() {
        return mofType;
    }

    @Override
    public void setType(MofType inType) {
        mofType = inType;
    }

    @Override
    public Collection<InstanceSpecification> getInstances() {
        return instances;
    }

    @Override
    public void setInstances(Collection<InstanceSpecification> inInstances) {
        instances = inInstances;
    }

    @Override
    public void addInstance(InstanceSpecification inInstance) {
        instances.add(inInstance);
    }

    @Override
    public void removeInstance(InstanceSpecification inInstance) {
        instances.remove(inInstance);
    }



    private MofType                             mofType;
    private Collection<InstanceSpecification>   instances = new HashSet<>();


}
