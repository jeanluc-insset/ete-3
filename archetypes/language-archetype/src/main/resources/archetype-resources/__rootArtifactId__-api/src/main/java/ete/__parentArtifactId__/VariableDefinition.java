#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId};


import ${package}.ete.${parentArtifactId}.Identifier;
import java.lang.Object;
import ${package}.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface VariableDefinition  extends Identifier  {


    public String getIdentifier();
    public void setIdentifier(String inValue);
    public Object getValue();
    public void setValue(Object inValue);
        

    //========================================================================//



    public default String getSymbol() {
        return "let";
    }


}


