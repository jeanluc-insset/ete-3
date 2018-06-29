#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId};


import ${package}.ete.${parentArtifactId}.MultOrDiv;
import ${package}.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Div  extends MultOrDiv  {


        

    //========================================================================//



    public default String getSymbol() {
        return "/";
    }


}


