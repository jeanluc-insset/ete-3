package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class ConditionalImpl  extends fr.insset.jeanluc.ete.xlang.impl.StatementImpl  implements Conditional {


    //========================================================================//


    public GelExpression getCondition() {
        return condition;
    }

    public void setCondition(GelExpression inValue) {
        condition = inValue;
    }
    public Statement getThenPart() {
        return thenPart;
    }

    public void setThenPart(Statement inValue) {
        thenPart = inValue;
    }
    public Statement getElsePart() {
        return elsePart;
    }

    public void setElsePart(Statement inValue) {
        elsePart = inValue;
    }


    //========================================================================//


    private GelExpression condition;
    private Statement thenPart;
    private Statement elsePart;


}


