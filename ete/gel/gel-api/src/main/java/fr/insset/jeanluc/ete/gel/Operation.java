package fr.insset.jeanluc.ete.gel;


import fr.insset.jeanluc.ete.gel.GelExpression;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Operation  extends fr.insset.jeanluc.ete.gel.GelExpression  {


    //========================================================================//


    public List<GelExpression> getOperand();
    public void setOperand(List<GelExpression> inValue);
        

}


