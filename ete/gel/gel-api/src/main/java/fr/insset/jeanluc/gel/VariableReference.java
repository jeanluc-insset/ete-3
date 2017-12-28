package fr.insset.jeanluc.gel;


import fr.insset.jeanluc.gel.VariableDefinition;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface VariableReference  extends fr.insset.jeanluc.gel.Navigable  {


    //========================================================================//


    public VariableDefinition getDeclaration();
    public void setDeclaration(VariableDefinition inValue);


}


