package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;


public class OperationImpl implements Operation {


    //========================================================================//


        public Sequence<GelExpression> getoperand() {
        return operand;
    }

    public void setoperand(Sequence<GelExpression> inValue) {
        operand = inValue;
    }
    

    //========================================================================//


        private Sequence<GelExpression> operand;
    

}


