package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;


public class LiteralImpl implements Literal {


    //========================================================================//


        public String getvalueAsString() {
        return valueAsString;
    }

    public void setvalueAsString(String inValue) {
        valueAsString = inValue;
    }
            public Object getvalue() {
        return value;
    }

    public void setvalue(Object inValue) {
        value = inValue;
    }
    

    //========================================================================//


        private String valueAsString;
            private Object value;
    

}


