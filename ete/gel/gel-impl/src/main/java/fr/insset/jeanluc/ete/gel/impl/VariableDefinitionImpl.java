package fr.insset.jeanluc.ete.gel.impl;

import java.lang.Object;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class VariableDefinitionImpl  extends fr.insset.jeanluc.ete.gel.impl.GelExpressionImpl  implements VariableDefinition {


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


