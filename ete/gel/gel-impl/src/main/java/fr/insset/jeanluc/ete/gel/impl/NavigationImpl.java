package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.Navigable;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class NavigationImpl  extends fr.insset.jeanluc.ete.gel.impl.NavigableImpl  implements Navigation {


    //========================================================================//


    public Feature getToFeature() {
        return toFeature;
    }

    public void setToFeature(Feature inValue) {
        toFeature = inValue;
    }
    public Navigable getFrom() {
        return from;
    }

    public void setFrom(Navigable inValue) {
        from = inValue;
    }
    public List<GelExpression> getOperand() {
        return operand;
    }

    public void setOperand(List<GelExpression> inValue) {
        operand = inValue;
    }


    //========================================================================//


    private Feature toFeature;
    private Navigable from;
    private List<GelExpression> operand;


}


