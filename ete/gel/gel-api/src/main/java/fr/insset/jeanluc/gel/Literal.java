package fr.insset.jeanluc.gel;


import java.lang.Object;
import java.util.List;


public interface Literal  extends fr.insset.jeanluc.gel.GelExpression  {


    //========================================================================//


    public String getValueAsString();
    public void setValueAsString(String inValue);
    public Object getValue();
    public void setValue(Object inValue);


}


