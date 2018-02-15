package fr.insset.jeanluc.ete.gel;


import fr.insset.jeanluc.ete.gel.VariableDefinition;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Lambda  extends fr.insset.jeanluc.ete.gel.Operation  {


    public List<VariableDefinition> getVariables();
    public void setVariables(List<VariableDefinition> inValue);
        

    //========================================================================//



    public default String getSymbol() {
        return "|";
    }


}


