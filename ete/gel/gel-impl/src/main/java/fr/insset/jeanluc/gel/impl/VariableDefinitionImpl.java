package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;


public class VariableDefinitionImpl implements VariableDefinition {


    //========================================================================//


        public String getidentifier() {
        return identifier;
    }

    public void setidentifier(String inValue) {
        identifier = inValue;
    }
            public Object getvalue() {
        return value;
    }

    public void setvalue(Object inValue) {
        value = inValue;
    }
    

    //========================================================================//


        private String identifier;
            private Object value;
    

}


