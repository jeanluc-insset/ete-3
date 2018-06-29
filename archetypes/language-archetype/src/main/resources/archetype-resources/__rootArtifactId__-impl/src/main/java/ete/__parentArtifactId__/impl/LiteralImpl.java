#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId}.impl;

import java.lang.Object;
import ${package}.ete.${parentArtifactId}.GelExpression;
import ${package}.ete.${parentArtifactId}.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public abstract class LiteralImpl  extends ${package}.ete.${parentArtifactId}.impl.GelExpressionImpl  implements Literal {


    //========================================================================//


    public String getValueAsString() {
        return valueAsString;
    }

    public void setValueAsString(String inValue) {
        valueAsString = inValue;
    }
    public Object getValue() {
        return value;
    }

    public void setValue(Object inValue) {
        value = inValue;
    }







    //========================================================================//


    private String valueAsString;
    private Object value;


}


