package fr.insset.jeanluc.gel;


import fr.insset.jeanluc.gel.Navigable;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;


public interface Navigation  extends fr.insset.jeanluc.gel.Navigable  {


    //========================================================================//


    public Feature getToFeature();
    public void setToFeature(Feature inValue);
    public Navigable getFrom();
    public void setFrom(Navigable inValue);
    public List<GelExpression> getParameter();
    public void setParameter(List<GelExpression> inValue);


}


