package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class VariableReferenceImpl  extends fr.insset.jeanluc.ete.gel.impl.NavigableImpl  implements VariableReference {


    //========================================================================//


    public VariableDefinition getDeclaration() {
        return declaration;
    }

    public void setDeclaration(VariableDefinition inValue) {
        declaration = inValue;
    }


    //========================================================================//


    private VariableDefinition declaration;


}


