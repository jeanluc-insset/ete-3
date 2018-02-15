package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class StepImpl  extends fr.insset.jeanluc.ete.gel.impl.GelExpressionImpl  implements Step {


    //========================================================================//


    public Feature getToFeature() {
        return toFeature;
    }

    public void setToFeature(Feature inValue) {
        toFeature = inValue;
    }
    public String getSelector() {
        return selector;
    }

    public void setSelector(String inValue) {
        selector = inValue;
    }



    //========================================================================//


    private Feature toFeature;
    private String selector;


}


