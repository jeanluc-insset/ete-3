package fr.insset.jeanluc.ete.gel;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Navigation;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface AtPre  extends fr.insset.jeanluc.ete.gel.Navigable  {


    //========================================================================//


    public Navigation getNavigation();
    public void setNavigation(Navigation inValue);
    public List<GelExpression> getOperand();
    public void setOperand(List<GelExpression> inValue);
        

}


