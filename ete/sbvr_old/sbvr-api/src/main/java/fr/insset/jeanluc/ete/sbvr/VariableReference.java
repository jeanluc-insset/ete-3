package fr.insset.jeanluc.ete.sbvr;


import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.sbvr.Step;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface VariableReference  extends Step  {


    public TypedElement getDefinition();
    public void setDefinition(TypedElement inValue);
        

    //========================================================================//



    public default String getSymbol() {
        return "var";
    }


}


