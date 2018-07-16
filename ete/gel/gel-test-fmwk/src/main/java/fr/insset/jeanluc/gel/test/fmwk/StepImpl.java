package fr.insset.jeanluc.gel.test.fmwk;

import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class StepImpl  extends fr.insset.jeanluc.gel.test.fmwk.GelExpressionImpl  implements Step {


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


