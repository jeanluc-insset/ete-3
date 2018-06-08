package fr.insset.jeanluc.ete.meta.model.emof.impl;


import fr.insset.jeanluc.ete.meta.model.emof.Association;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.PackageableElementImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Collection;
import java.util.LinkedList;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;

/**
 *
 * @author jldeleage
 */
public class AssociationImpl extends PackageableElementImpl implements Association {

    public AssociationImpl() throws InstantiationException {
        this.ownedEnd = FactoryMethods.newList(MofProperty.class);
        this.memberEnd = FactoryMethods.newList(MofProperty.class);
    }

    @Override
    public Collection<MofProperty> getMemberEnd() {
        return memberEnd;
    }

    @Override
    public void addMemberEnd(MofProperty inProperty) {
        Collection<MofProperty> localMemberEnd = getMemberEnd();
        if (localMemberEnd.contains(inProperty)) {
            return;
        }
        memberEnd.add(inProperty);
        inProperty.setAssociation(this);
    }

    @Override
    public void removeMemberEnd(MofProperty inProperty) {
        memberEnd.remove(inProperty);
        inProperty.setAssociation(null);
    }

    @Override
    public Collection<MofProperty> getOwnedEnd() {
        return ownedEnd;
    }

    @Override
    public void addOwnedEnd(MofProperty inProperty) {
        Collection<MofProperty> localOwnedEnd = getOwnedEnd();
        if (localOwnedEnd.contains(inProperty)) {
            return;
        }
        ownedEnd.add(inProperty);
    }

    @Override
    public void removeOwnedEnd(MofProperty inProperty) {
        ownedEnd.remove(inProperty);
    }

    private Collection<MofProperty> memberEnd;
    private Collection<MofProperty> ownedEnd;

}
