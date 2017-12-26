package fr.insset.jeanluc.gel;


import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;


public interface Operation  extends fr.insset.jeanluc.gel.GelExpression  {


    //========================================================================//


    public List<GelExpression> getOperand();
    public void setOperand(List<GelExpression> inValue);


}


