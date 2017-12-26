package fr.insset.jeanluc.gel;


import java.lang.Object;
import java.util.List;


public interface VariableDefinition  extends fr.insset.jeanluc.gel.GelExpression  {


    //========================================================================//


    public String getIdentifier();
    public void setIdentifier(String inValue);
    public Object getValue();
    public void setValue(Object inValue);


}


