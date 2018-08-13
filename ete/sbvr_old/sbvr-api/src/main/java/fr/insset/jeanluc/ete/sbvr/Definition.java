package fr.insset.jeanluc.ete.sbvr;


import fr.insset.jeanluc.ete.sbvr.SbvrExpression;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.sbvr.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Definition  {


    public List<VariableDefinition> getParameters();
    public void setParameters(List<VariableDefinition> inValue);
    public TypedElement getContext();
    public void setContext(TypedElement inValue);
    public SbvrExpression getDefinition();
    public void setDefinition(SbvrExpression inValue);
        

    //========================================================================//





}


