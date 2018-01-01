package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class GelExpressionImpl  extends fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl  implements GelExpression {


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


