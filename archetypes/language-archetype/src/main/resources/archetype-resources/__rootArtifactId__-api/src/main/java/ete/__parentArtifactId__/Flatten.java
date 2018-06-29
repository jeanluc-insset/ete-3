#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId};


import ${package}.ete.${parentArtifactId}.CollectionMethodNav;
import ${package}.ete.meta.model.mofpackage.EteModel;
import ${package}.ete.meta.model.types.MofType;
import ${package}.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Flatten  extends CollectionMethodNav  {


        

    //========================================================================//


    public MofType  getType(EteModel inModel);

    public default String getSymbol() {
        return "->";
    }


}


