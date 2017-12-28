package fr.insset.jeanluc.gel;


import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Lambda  extends fr.insset.jeanluc.gel.BinaryOperation  {


    //========================================================================//


    public List<VariableDefinition> getVariables();
    public void setVariables(List<VariableDefinition> inValue);
    public GelExpression getBody();
    public void setBody(GelExpression inValue);


}


