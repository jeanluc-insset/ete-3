package fr.insset.jeanluc.ete.as;


// import fr.insset.jeanluc.ete.meta.model.emof.Feature;
// import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
// import fr.insset.jeanluc.gel.api.GelExpression;
// import fr.insset.jeanluc.gel.api.Navigable;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/api.vm")
public interface Conditional  extends fr.insset.jeanluc.ete.as.Statement  {




    //========================================================================//


        // fr.insset.jeanluc.gel
    // 
        public  fr.insset.jeanluc.gel.GelExpression getCondition();
    public void setCondition( fr.insset.jeanluc.gel.GelExpression inValue);
        // fr.insset.jeanluc.ete.as
    // 
        public  fr.insset.jeanluc.ete.as.Statement getThenPart();
    public void setThenPart( fr.insset.jeanluc.ete.as.Statement inValue);
        // fr.insset.jeanluc.ete.as
    // 
        public  fr.insset.jeanluc.ete.as.Statement getElsePart();
    public void setElsePart( fr.insset.jeanluc.ete.as.Statement inValue);


}