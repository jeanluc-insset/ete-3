package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class OperationImpl  extends fr.insset.jeanluc.ete.gel.impl.GelExpressionImpl  implements Operation {


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


