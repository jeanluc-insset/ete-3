package fr.insset.jeanluc.gel.impl;

import java.lang.Object;
import fr.insset.jeanluc.gel.*;
import java.util.List;



public class LiteralImpl  extends fr.insset.jeanluc.gel.impl.GelExpressionImpl  implements Literal {


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


