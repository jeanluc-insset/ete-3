package fr.insset.jeanluc.ete.meta.model.emof.impl;


import fr.insset.jeanluc.ete.defs.EteException;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.impl.MofTypeImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;

/**
 * TODO : replace the lists of attributes and operations by maps (name -&gt;
 * item)
 *
 * @author jldeleage
 */
public class MofClassImpl extends ClassifierImpl implements MofClass {

    public MofClassImpl() {
        try {
            this.invariants = FactoryMethods.newList(Invariant.class);
        } catch (InstantiationException ex) {
            throw new EteException(ex);
        }
    }


    //========================================================================//

    @Override
    public boolean isAbstract() {
        return isAbstract;
    }

    @Override
    public void setAbstract(boolean inBoolean) {
        isAbstract = inBoolean;
    }


    //========================================================================//

    @Override
    public Collection<Invariant> getInvariants() {
        return invariants;
    }

    @Override
    public void setInvariants(Collection<Invariant> inInvariants) {
        invariants = inInvariants;
    }

    @Override
    public void addInvariant(Invariant inInvariant) {
        invariants.add(inInvariant);
    }


    //========================================================================//

    Collection<Invariant> invariants;
//    List<MofClass> superClass;
    boolean isAbstract;

}
