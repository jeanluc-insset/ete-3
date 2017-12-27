package fr.insset.jeanluc.gel.impl;

import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.*;
import java.util.List;



public class LambdaImpl  extends fr.insset.jeanluc.gel.impl.BinaryOperationImpl  implements Lambda {


    //========================================================================//


    public List<VariableDefinition> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableDefinition> inValue) {
        variables = inValue;
    }

    public GelExpression getBody() {
        return body;
    }

    public void setBody(GelExpression inValue) {
        body = inValue;
    }



    //========================================================================//


        private List<VariableDefinition> variables;
            private GelExpression body;
    

}


