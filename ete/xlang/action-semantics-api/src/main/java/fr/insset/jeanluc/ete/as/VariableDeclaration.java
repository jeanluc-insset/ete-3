package fr.insset.jeanluc.ete.as;


// import fr.insset.jeanluc.ete.meta.model.emof.Feature;
// import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
// import fr.insset.jeanluc.gel.api.GelExpression;
// import fr.insset.jeanluc.gel.api.Navigable;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/api.vm")
public interface VariableDeclaration  extends fr.insset.jeanluc.ete.as.Statement  {




    //========================================================================//


        public String getIdentifier();
    public void setIdentifier(String inValue);
        // fr.insset.jeanluc.gel
    // 
        public  fr.insset.jeanluc.gel.VariableDefinition getDefinitionExpression();
    public void setDefinitionExpression( fr.insset.jeanluc.gel.VariableDefinition inValue);
        // fr.insset.jeanluc.gel
    // 
        public  fr.insset.jeanluc.gel.GelExpression getInitValue();
    public void setInitValue( fr.insset.jeanluc.gel.GelExpression inValue);


}