#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId}.impl;

import ${package}.ete.meta.model.emof.Feature;
import ${package}.ete.${parentArtifactId}.GelExpression;
import ${package}.ete.${parentArtifactId}.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class StepImpl  extends ${package}.ete.${parentArtifactId}.impl.GelExpressionImpl  implements Step {


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


