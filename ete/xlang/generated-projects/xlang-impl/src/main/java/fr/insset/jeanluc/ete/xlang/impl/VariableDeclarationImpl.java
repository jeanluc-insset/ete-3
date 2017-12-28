package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.List;



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


