package fr.insset.jeanluc.gel.impl;

import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.gel.Navigable;
import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.gel.*;
import java.util.List;



public class NavigationImpl  extends fr.insset.jeanluc.gel.impl.NavigableImpl  implements Navigation {


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

    public List<GelExpression> getParameter() {
        return parameter;
    }

    public void setParameter(List<GelExpression> inValue) {
        parameter = inValue;
    }



    //========================================================================//


        private Feature toFeature;
            private Navigable from;
            private List<GelExpression> parameter;
    

}


