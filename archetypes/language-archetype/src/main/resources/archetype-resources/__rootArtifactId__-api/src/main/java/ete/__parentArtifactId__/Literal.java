#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId};


import java.lang.Object;
import ${package}.ete.${parentArtifactId}.GelExpression;
import ${package}.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Literal  extends GelExpression  {


    public String getValueAsString();
    public void setValueAsString(String inValue);
    public Object getValue();
    public void setValue(Object inValue);
        

    //========================================================================//





}


