package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.List;



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


