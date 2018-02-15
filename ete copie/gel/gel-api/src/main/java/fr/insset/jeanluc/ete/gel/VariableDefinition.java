package fr.insset.jeanluc.ete.gel;


import java.lang.Object;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface VariableDefinition  extends fr.insset.jeanluc.ete.gel.Identifier  {


    public String getIdentifier();
    public void setIdentifier(String inValue);
    public Object getValue();
    public void setValue(Object inValue);
        

    //========================================================================//



    public default String getSymbol() {
        return "let";
    }


}


