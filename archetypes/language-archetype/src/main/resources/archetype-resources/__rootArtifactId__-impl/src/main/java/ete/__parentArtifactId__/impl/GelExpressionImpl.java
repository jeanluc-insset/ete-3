#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId}.impl;

import ${package}.ete.${parentArtifactId}.GelExpression;
import ${package}.ete.meta.model.types.TypedElement;
import ${package}.ete.${parentArtifactId}.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class GelExpressionImpl  extends ${package}.ete.meta.model.types.impl.TypedElementImpl  implements GelExpression {


    //========================================================================//


    public List<GelExpression> getOperand() {
        return operand;
    }

    public void setOperand(List<GelExpression> inValue) {
        operand = inValue;
    }






    //========================================================================//


    private List<GelExpression> operand;


}


