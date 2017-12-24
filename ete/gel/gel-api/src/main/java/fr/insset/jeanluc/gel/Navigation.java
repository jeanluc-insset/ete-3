package fr.insset.jeanluc.gel;

// New release using a dialect and dependances
import fr.insset.jeanluc.gel.Navigable;
import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/api.vm")
public interface Navigation  extends fr.insset.jeanluc.gel.Navigable  {




    //========================================================================//


        // fr.insset.jeanluc.ete.meta.model.emof
    // 
        public Feature getToFeature();
    public void setToFeature(Feature inValue);
        // fr.insset.jeanluc.gel
    // 
        public Navigable getFrom();
    public void setFrom(Navigable inValue);
        public List<GelExpression> getParameter();
    public void setParameter(List<GelExpression> inValue);
    public void addParameter(GelExpression inValue);


}