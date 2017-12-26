package fr.insset.jeanluc.gel.impl;

import java.lang.Object;
import fr.insset.jeanluc.gel.*;
import java.util.List;



public class VariableDefinitionImpl  extends fr.insset.jeanluc.gel.impl.GelExpressionImpl  implements VariableDefinition {


    //========================================================================//


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String inValue) {
        identifier = inValue;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object inValue) {
        value = inValue;
    }



    //========================================================================//


        private String identifier;
            private Object value;
    

}


