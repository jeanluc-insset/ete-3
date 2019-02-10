package fr.insset.jeanluc.ete.as;


// import fr.insset.jeanluc.ete.meta.model.emof.Feature;
// import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
// import fr.insset.jeanluc.gel.api.GelExpression;
// import fr.insset.jeanluc.gel.api.Navigable;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/api.vm")
public interface ForLoop  extends fr.insset.jeanluc.ete.as.Loop  {




    //========================================================================//


        public List<Statement> getInitialization();
    public void setInitialization(List<Statement> inValue);
    public void addInitialization(Statement inValue);
        public List<Statement> getIncrementation();
    public void setIncrementation(List<Statement> inValue);
    public void addIncrementation(Statement inValue);


}