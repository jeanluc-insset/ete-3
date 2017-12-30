package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.ete.gel.GelExpression;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Assignment  extends fr.insset.jeanluc.ete.xlang.Statement  {


    //========================================================================//


    public GelExpression getValue();
    public void setValue(GelExpression inValue);
    public GelExpression getLeftValue();
    public void setLeftValue(GelExpression inValue);
        

}


