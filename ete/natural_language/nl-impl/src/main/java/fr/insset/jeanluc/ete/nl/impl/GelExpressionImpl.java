package fr.insset.jeanluc.ete.nl.impl;

import fr.insset.jeanluc.ete.nl.GelExpression;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.nl.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
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


