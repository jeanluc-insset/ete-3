package fr.insset.jeanluc.ete.gel.impl;

import java.lang.Object;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public abstract class LiteralImpl  extends fr.insset.jeanluc.ete.gel.impl.GelExpressionImpl  implements Literal {


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


