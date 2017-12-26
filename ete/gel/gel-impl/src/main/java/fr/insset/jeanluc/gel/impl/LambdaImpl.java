package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;


public class LambdaImpl implements Lambda {


    //========================================================================//


        public Sequence<VariableDefinition> getvariables() {
        return variables;
    }

    public void setvariables(Sequence<VariableDefinition> inValue) {
        variables = inValue;
    }
            public GelExpression getbody() {
        return body;
    }

    public void setbody(GelExpression inValue) {
        body = inValue;
    }
    

    //========================================================================//


        private Sequence<VariableDefinition> variables;
            private GelExpression body;
    

}


