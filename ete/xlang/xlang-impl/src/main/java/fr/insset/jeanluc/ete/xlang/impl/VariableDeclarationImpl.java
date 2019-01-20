package fr.insset.jeanluc.ete.xlang.impl;



import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class VariableDeclarationImpl  extends fr.insset.jeanluc.ete.xlang.impl.StatementImpl  implements VariableDeclaration {


    //========================================================================//


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String inValue) {
        identifier = inValue;
    }
    public VariableDefinition getDefinitionExpression() {
        return definitionExpression;
    }

    public void setDefinitionExpression(VariableDefinition inValue) {
        definitionExpression = inValue;
    }
    public GelExpression getInitValue() {
        return initValue;
    }

    public void setInitValue(GelExpression inValue) {
        initValue = inValue;
    }








    //========================================================================//


    private String identifier;
    private VariableDefinition definitionExpression;
    private GelExpression initValue;


}


