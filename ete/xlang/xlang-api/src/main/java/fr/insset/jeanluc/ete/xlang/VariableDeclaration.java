package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface VariableDeclaration  extends Statement  {


    public String getIdentifier();
    public void setIdentifier(String inValue);
    public VariableDefinition getDefinitionExpression();
    public void setDefinitionExpression(VariableDefinition inValue);
    public GelExpression getInitValue();
    public void setInitValue(GelExpression inValue);
        

    //========================================================================//



    public default String getSymbol() {
        return "variable_declaration_statement";
    }


}


