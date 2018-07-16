package fr.insset.jeanluc.gel.test.fmwk;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.gel.*;
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


