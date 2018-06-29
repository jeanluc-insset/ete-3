package fr.insset.jeanluc.ete.nl.impl;

import java.lang.Object;
import fr.insset.jeanluc.ete.nl.GelExpression;
import fr.insset.jeanluc.ete.nl.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public abstract class LiteralImpl  extends fr.insset.jeanluc.ete.nl.impl.GelExpressionImpl  implements Literal {


    //========================================================================//


    public String getValueAsString() {
        return valueAsString;
    }

    public void setValueAsString(String inValue) {
        valueAsString = inValue;
    }
    public Object getValue() {
        return value;
    }

    public void setValue(Object inValue) {
        value = inValue;
    }







    //========================================================================//


    private String valueAsString;
    private Object value;


}


