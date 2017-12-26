package fr.insset.jeanluc.gel.impl;

import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.gel.*;
import java.util.List;



public class OperationImpl  extends fr.insset.jeanluc.gel.impl.GelExpressionImpl  implements Operation {


    //========================================================================//


    public List<GelExpression> getOperand() {
        return operand;
    }

    public void setOperand(List<GelExpression> inValue) {
        operand = inValue;
    }



    //========================================================================//


        private List<GelExpression> operand;
    

}


