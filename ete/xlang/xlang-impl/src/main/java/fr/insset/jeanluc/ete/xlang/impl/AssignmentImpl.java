package fr.insset.jeanluc.ete.xlang.impl;



import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class AssignmentImpl  extends fr.insset.jeanluc.ete.xlang.impl.StatementImpl  implements Assignment {


    //========================================================================//


    public GelExpression getValue() {
        return value;
    }

    public void setValue(GelExpression inValue) {
        value = inValue;
    }
    public GelExpression getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(GelExpression inValue) {
        leftValue = inValue;
    }







    //========================================================================//


    private GelExpression value;
    private GelExpression leftValue;


}


