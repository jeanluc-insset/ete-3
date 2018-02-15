package fr.insset.jeanluc.ete.meta.model.emof.impl;


import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.impl.MofTypeImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.List;
import java.util.stream.Stream;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;

/**
 *
 * @author jldeleage
 */
public class ClassifierImpl extends MofTypeImpl implements Classifier {

    public ClassifierImpl() throws InstantiationException {
        this.ownedOperation = FactoryMethods.newList(MofOperation.class);
        this.ownedAttribute = FactoryMethods.newList(MofProperty.class);
    }


    //========================================================================//

    @Override
    public List<MofProperty> getOwnedAttribute() {
        return ownedAttribute;
    }

    @Override
    public void addOwnedAttribute(MofProperty inProperty) {
        ownedAttribute.add(inProperty);
        inProperty.setOwningMofClass(this);
    }

    @Override
    public void removeOwnedAttribute(MofProperty inProperty) {
        ownedAttribute.remove(inProperty);
        inProperty.setOwningMofClass(null);
    }

    @Override
    public MofProperty getOwnedAttribute(String inName) {
        for (MofProperty property : getOwnedAttribute()) {
            if (inName.equals(property.getName())) {
                return property;
            }
        }
        return null;
    }

    @Override
    public Stream<MofProperty> getOwnedAttributeAsStream() {
        return ownedAttribute.stream();
    }


    //========================================================================//

    @Override
    public List<MofOperation> getOwnedOperation() {
        return ownedOperation;
    }

    @Override
    public void addOwnedOperation(MofOperation inOperation) {
        ownedOperation.add(inOperation);
        inOperation.setOwningMofClass(this);
    }

    @Override
    public void removeOwnedOperation(MofOperation inOperation) {
        ownedOperation.remove(inOperation);
        inOperation.setOwningMofClass(null);
    }

    @Override
    public MofOperation getOwnedOperation(String inName) {
        for (MofOperation operation : getOwnedOperation()) {
            if (inName.equals(operation.getName())) {
                return operation;
            }
        }
        return null;
    }

    @Override
    public Stream<MofOperation> getOwnedOperationAsStream() {
        return ownedOperation.stream();
    }


    //========================================================================//


    List<MofProperty> ownedAttribute;
    List<MofOperation> ownedOperation;

}
