package fr.insset.jeanluc.ete.sbvr;


import fr.insset.jeanluc.ete.sbvr.OclOperation;
import fr.insset.jeanluc.ete.sbvr.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Lambda  extends OclOperation  {


    public List<VariableDefinition> getVariables();
    public void setVariables(List<VariableDefinition> inValue);
        

    //========================================================================//



    public default String getSymbol() {
        return "|";
    }


}


