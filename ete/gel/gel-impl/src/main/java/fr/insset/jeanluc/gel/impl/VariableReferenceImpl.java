package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;


public class VariableReferenceImpl implements VariableReference {


    //========================================================================//


        public VariableDefinition getdeclaration() {
        return declaration;
    }

    public void setdeclaration(VariableDefinition inValue) {
        declaration = inValue;
    }
    

    //========================================================================//


        private VariableDefinition declaration;
    

}


