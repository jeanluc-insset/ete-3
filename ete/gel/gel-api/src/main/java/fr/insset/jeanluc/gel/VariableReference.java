package fr.insset.jeanluc.gel;


import fr.insset.jeanluc.gel.VariableDefinition;
import java.util.List;


public interface VariableReference  extends fr.insset.jeanluc.gel.Navigable  {


    //========================================================================//


    public VariableDefinition getDeclaration();
    public void setDeclaration(VariableDefinition inValue);


}


