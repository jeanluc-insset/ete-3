package fr.insset.jeanluc.ete.xlang.impl;



import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class LoopImpl  extends fr.insset.jeanluc.ete.xlang.impl.StatementImpl  implements Loop {


    //========================================================================//


    public GelExpression getCondition() {
        return condition;
    }

    public void setCondition(GelExpression inValue) {
        condition = inValue;
    }






    //========================================================================//


    private GelExpression condition;


}


