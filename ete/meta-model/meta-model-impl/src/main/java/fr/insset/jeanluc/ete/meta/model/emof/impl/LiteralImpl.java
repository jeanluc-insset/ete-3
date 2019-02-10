package fr.insset.jeanluc.ete.meta.model.emof.impl;


import fr.insset.jeanluc.ete.meta.model.emof.Literal;

/**
 *
 * @author jldeleage
 */
public class LiteralImpl implements Literal {
    


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    private     Object      value;

}
