package fr.insset.jeanluc.ete.meta.model.emof.impl;


import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Collection;
import java.util.List;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;

/**
 *
 * @author jldeleage
 */
public class MofOperationImpl extends FeatureImpl implements MofOperation {

    public MofOperationImpl() throws InstantiationException {
        this.ownedParameter = FactoryMethods.newList(MofParameter.class);
        this.raisedException = FactoryMethods.newSet(MofType.class);
        this.preconditions = FactoryMethods.newList(Precondition.class);
        this.postconditions = FactoryMethods.newList(Postcondition.class);
    }

    @Override
    public Collection<MofParameter> getOwnedParameter() {
        return ownedParameter;
    }

    @Override
    public void addOwnedParameter(MofParameter inParameter) {
        ownedParameter.add(inParameter);
        MofType type = inParameter.getType();
        while (type.isCollection()) {
            MofCollection coll = (MofCollection) type;
            type = coll.getBaseType();
        }
        if (type instanceof MofClass) {
            addDependance(type);
        }
    }

    @Override
    public void removeOwnedParameter(MofParameter inParameter) {
        ownedParameter.remove(inParameter);
    }

    @Override
    public Collection<MofType> getRaisedException() {
        return raisedException;
    }

    @Override
    public void addRaisedException(MofType inMofType) {
        raisedException.add(inMofType);
    }

    @Override
    public void removeRaisedException(MofType inMofType) {
        raisedException.remove(inMofType);
    }

    @Override
    public boolean isOrdered() {
        return ordered;
    }

    @Override
    public void setOrdered(boolean inOrdered) {
        ordered = inOrdered;
    }

    @Override
    public boolean isUnique() {
        return unique;
    }

    @Override
    public void setUnique(boolean inUnique) {
        unique = inUnique;
    }

    @Override
    public int getLower() {
        return lower;
    }

    @Override
    public void setLower(int inLower) {
        lower = inLower;
    }

    @Override
    public void setUpper(UnlimitedNatural inUpper) {
        upper = inUpper;
    }

    @Override
    public void setUpper(int inUpper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UnlimitedNatural getUpper() {
        return upper;
    }

    @Override
    public List<Precondition> getPreconditions() {
        return preconditions;
    }

    @Override
    public void setPreconditions(List<Precondition> inPreconditions) {
        preconditions = inPreconditions;
    }

    @Override
    public void addPrecondition(Precondition inPrecondition) {
        preconditions.add(inPrecondition);
    }

    @Override
    public List<Postcondition> getPostconditions() {
        return postconditions;
    }

    @Override
    public void setPostconditions(List<Postcondition> inPostconditions) {
        postconditions = inPostconditions;
    }

    @Override
    public void addPostcondition(Postcondition inPostcondition) {
        postconditions.add(inPostcondition);
    }


    private List<MofParameter>          ownedParameter;
    private Collection<MofType>         raisedException;
    private boolean                     ordered;
    private boolean                     unique;
    private int                         lower;
    private UnlimitedNatural            upper;

    private List<Precondition>          preconditions;
    private List<Postcondition>         postconditions;
}
