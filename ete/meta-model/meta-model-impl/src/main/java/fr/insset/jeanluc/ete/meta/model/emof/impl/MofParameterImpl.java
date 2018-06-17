package fr.insset.jeanluc.ete.meta.model.emof.impl;


import static fr.insset.jeanluc.ete.defs.Constants.NOT_IMPLEMENTED_YET;
import fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural;
import fr.insset.jeanluc.ete.meta.model.emof.ParameterDirectionKind;
import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;

/**
 *
 * @author jldeleage
 */
public class MofParameterImpl extends TypedElementImpl implements MofParameter {

    @Override
    public ParameterDirectionKind getDirection() {
        return direction;
    }

    @Override
    public void setDirection(ParameterDirectionKind inDirection) {
        direction = inDirection;
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
        throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUpper(UnlimitedNatural inUpper) {
        throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUpper(int inUpper) {
        throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UnlimitedNatural getUpper() {
        return upper;
    }

    private ParameterDirectionKind direction;
    private boolean ordered;
    private boolean unique;
    private int lower;
    private UnlimitedNatural upper;

}
