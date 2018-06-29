package fr.insset.jeanluc.ete.nl.impl;

import java.lang.Object;
import fr.insset.jeanluc.ete.nl.Identifier;
import fr.insset.jeanluc.ete.nl.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class VariableDefinitionImpl  extends fr.insset.jeanluc.ete.nl.impl.IdentifierImpl  implements VariableDefinition {


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


