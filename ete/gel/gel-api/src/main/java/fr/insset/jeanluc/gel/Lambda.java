package fr.insset.jeanluc.gel;


import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.gel.VariableDefinition;
import java.util.List;


public interface Lambda  extends fr.insset.jeanluc.gel.BinaryOperation  {


    //========================================================================//


    public List<VariableDefinition> getVariables();
    public void setVariables(List<VariableDefinition> inValue);
    public GelExpression getBody();
    public void setBody(GelExpression inValue);


}


