package fr.insset.jeanluc.ete.as;


// import fr.insset.jeanluc.ete.meta.model.emof.Feature;
// import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
// import fr.insset.jeanluc.gel.api.GelExpression;
// import fr.insset.jeanluc.gel.api.Navigable;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/api.vm")
public interface MethodInvocation  {




    //========================================================================//


        // fr.insset.jeanluc.ete.meta.model.emof
    // 
        public  fr.insset.jeanluc.ete.meta.model.emof.MofOperation getMethod();
    public void setMethod( fr.insset.jeanluc.ete.meta.model.emof.MofOperation inValue);
        // fr.insset.jeanluc.gel
    // 
        public  fr.insset.jeanluc.gel.GelExpression getTarget();
    public void setTarget( fr.insset.jeanluc.gel.GelExpression inValue);
        public List<GelExpression> getParameters();
    public void setParameters(List<GelExpression> inValue);
    public void addParameters(GelExpression inValue);


}