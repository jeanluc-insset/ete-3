#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId};


import ${package}.ete.${parentArtifactId}.GelExpression;
import ${package}.ete.meta.model.types.TypedElement;
import ${package}.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface GelExpression  extends TypedElement  {


    public List<GelExpression> getOperand();
    public void setOperand(List<GelExpression> inValue);
        

    //========================================================================//





}


