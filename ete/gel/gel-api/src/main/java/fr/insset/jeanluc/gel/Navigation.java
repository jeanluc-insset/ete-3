package fr.insset.jeanluc.gel;


import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.gel.Navigable;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Navigation  extends fr.insset.jeanluc.gel.Navigable  {


    //========================================================================//


    public Feature getToFeature();
    public void setToFeature(Feature inValue);
    public Navigable getFrom();
    public void setFrom(Navigable inValue);
    public List<GelExpression> getParameter();
    public void setParameter(List<GelExpression> inValue);
        

}


