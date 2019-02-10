package fr.insset.jeanluc.ete.sbvr.impl;

import fr.insset.jeanluc.ete.sbvr.SbvrExpression;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.sbvr.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class StepImpl  extends fr.insset.jeanluc.ete.sbvr.impl.SbvrExpressionImpl  implements Step {


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


