package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



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


