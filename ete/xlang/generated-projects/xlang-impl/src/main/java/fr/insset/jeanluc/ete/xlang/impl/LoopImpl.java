package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.List;



public class LoopImpl  extends fr.insset.jeanluc.ete.xlang.impl.StatementImpl  implements Loop {


    //========================================================================//


    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> inValue) {
        body = inValue;
    }

    public GelExpression getCondition() {
        return condition;
    }

    public void setCondition(GelExpression inValue) {
        condition = inValue;
    }



    //========================================================================//


        private List<Statement> body;
            private GelExpression condition;
    

}


