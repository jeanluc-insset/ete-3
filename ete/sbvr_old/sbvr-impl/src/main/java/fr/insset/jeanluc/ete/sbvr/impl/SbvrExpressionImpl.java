package fr.insset.jeanluc.ete.sbvr.impl;

import fr.insset.jeanluc.ete.sbvr.SbvrExpression;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.sbvr.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class SbvrExpressionImpl  extends fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl  implements SbvrExpression {


    //========================================================================//


    public List<SbvrExpression> getOperand() {
        return operand;
    }

    public void setOperand(List<SbvrExpression> inValue) {
        operand = inValue;
    }






    //========================================================================//


    private List<SbvrExpression> operand;


}


