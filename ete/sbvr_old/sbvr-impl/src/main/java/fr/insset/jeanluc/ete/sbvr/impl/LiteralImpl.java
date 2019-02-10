package fr.insset.jeanluc.ete.sbvr.impl;

import fr.insset.jeanluc.ete.sbvr.SbvrExpression;
import java.lang.Object;
import fr.insset.jeanluc.ete.sbvr.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public abstract class LiteralImpl  extends fr.insset.jeanluc.ete.sbvr.impl.SbvrExpressionImpl  implements Literal {


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


