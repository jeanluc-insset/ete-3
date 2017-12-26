package fr.insset.jeanluc.ete.meta.model.datatype.impl;


import fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural;

/**
 *
 * @author jldeleage
 */
public class UnlimitedNaturalImpl extends DataTypeImpl implements UnlimitedNatural {

    public UnlimitedNaturalImpl() throws InstantiationException {
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String inValue) {
        value = inValue;
    }

    private String value;

}
