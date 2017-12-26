package fr.insset.jeanluc.gel.impl;

import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.*;
import java.util.List;



public class VariableReferenceImpl  extends fr.insset.jeanluc.gel.impl.NavigableImpl  implements VariableReference {


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


