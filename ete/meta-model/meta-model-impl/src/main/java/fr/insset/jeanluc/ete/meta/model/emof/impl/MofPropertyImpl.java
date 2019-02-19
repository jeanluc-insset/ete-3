package fr.insset.jeanluc.ete.meta.model.emof.impl;


import static fr.insset.jeanluc.ete.defs.Constants.NOT_IMPLEMENTED_YET;
import fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural;
import static fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural.UNLIMITED_NATURAL;
import fr.insset.jeanluc.ete.meta.model.emof.AggregationKind;
import fr.insset.jeanluc.ete.meta.model.emof.Association;
import fr.insset.jeanluc.ete.meta.model.emof.Enumeration;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;

/**
 *
 * @author jldeleage
 */
public class MofPropertyImpl extends FeatureImpl implements MofProperty {

    /**
     * Must be called AFTER setting the owning class since it can add a
     * dependance to it.
     * 
     * @param inType 
     */
    @Override
    public void setType(MofType inType) {
        super.setType(inType); //To change body of generated methods, choose Tools | Templates.
        while (inType.isCollection()) {
            MofCollection coll = (MofCollection) inType;
            inType = coll.getBaseType();
        }
        if (inType instanceof MofClass || inType instanceof Enumeration) {
            this.getOwningMofClass().addDependency(inType);
        }
    }






    @Override
    public AggregationKind getAggregationKind() {
        return aggregationKind;
    }

    @Override
    public void setAggregationKind(AggregationKind inAggregationKind) {
        aggregationKind = inAggregationKind;
    }

    @Override
    public Collection<String> getDefault() {
        throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean isComposite() {
        return aggregationKind == AggregationKind.COMPOSITION;
    }

    @Override
    public boolean isDerived() {
        return derived;
    }

    @Override
    public void setDerived(boolean inDerived) {
        derived = inDerived;
    }

    //========================================================================//
    @Override
    public Association getOwningAssociation() {
        return owningAssociation;
    }

    @Override
    public void setOwningAssociation(Association inAssociation) {
        owningAssociation = inAssociation;
    }

    @Override
    public Association getAssociation() {
        return association;
    }

    @Override
    public void setAssociation(Association inAssociation) {
        association = inAssociation;
    }

    @Override
    public MofProperty getOpposite() {
        return opposite;
    }

    @Override
    public void setOpposite(MofProperty inOpposite) {
        if (inOpposite == opposite) {
            return;
        }
        opposite = inOpposite;
        inOpposite.setOpposite(this);
    }

    //========================================================================//
    @Override
    public boolean isReadOnly() {
        return readOnly;
    }

    @Override
    public boolean isStatic() {
        return _static;
    }

    @Override
    public void setStatic(boolean inStatic) {
        _static = inStatic;
    }


    @Override
    public void setReadOnly(boolean inReadOnly) {
        readOnly = inReadOnly;
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

    //========================================================================//
    @Override
    public int getLower() {
        return lower;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }

    @Override
    public UnlimitedNatural getUpper() {
        return upper;
    }

    public void setUpper(UnlimitedNatural upper) {
        this.upper = upper;
    }

    @Override
    public void setUpper(int inUpper) {
        try {
            UnlimitedNatural upper = (UnlimitedNatural) FactoryRegistry.newInstance(UNLIMITED_NATURAL);
            upper.setValue("" + inUpper);
            setUpper(upper);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(MofPropertyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public MofType getQualifierType() {
        return qualifierType;
    }

    @Override
    public void setQualifierType(MofType qualifierType) {
        this.qualifierType = qualifierType;
    }

    @Override
    public String getQualifierName() {
        return qualifierName;
    }

    @Override
    public void setQualifierName(String qualifierName) {
        this.qualifierName = qualifierName;
    }



    //========================================================================//
    private Association         association;
    private Association         owningAssociation;
    private MofProperty         opposite;
    private AggregationKind     aggregationKind;
    private boolean             readOnly;
    private boolean             ordered;
    private boolean             derived;
    private boolean             unique;
    private boolean             _static;
    private int                 lower;
    private UnlimitedNatural    upper;
    private String              defaultValue;
    private MofType             qualifierType;
    private String              qualifierName;
}
