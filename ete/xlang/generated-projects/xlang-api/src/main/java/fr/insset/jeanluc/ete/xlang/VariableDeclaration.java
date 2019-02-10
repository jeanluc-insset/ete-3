package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface VariableDeclaration  extends fr.insset.jeanluc.ete.xlang.Statement  {


    //========================================================================//


    public String getIdentifier();
    public void setIdentifier(String inValue);
    public VariableDefinition getDefinitionExpression();
    public void setDefinitionExpression(VariableDefinition inValue);
    public GelExpression getInitValue();
    public void setInitValue(GelExpression inValue);


}


