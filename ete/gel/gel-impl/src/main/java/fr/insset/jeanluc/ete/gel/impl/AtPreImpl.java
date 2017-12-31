package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.Navigation;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class AtPreImpl  extends fr.insset.jeanluc.ete.gel.impl.NavigableImpl  implements AtPre {


    //========================================================================//


    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation inValue) {
        navigation = inValue;
    }
    public List<GelExpression> getOperand() {
        return operand;
    }

    public void setOperand(List<GelExpression> inValue) {
        operand = inValue;
    }


    //========================================================================//


    private Navigation navigation;
    private List<GelExpression> operand;


}


