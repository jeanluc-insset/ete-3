package fr.insset.jeanluc.ete.gel;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Lambda  extends fr.insset.jeanluc.ete.gel.BinaryOperation  {


    //========================================================================//


    public List<VariableDefinition> getVariables();
    public void setVariables(List<VariableDefinition> inValue);
    public GelExpression getBody();
    public void setBody(GelExpression inValue);
        

}


