package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class LambdaImpl  extends fr.insset.jeanluc.ete.gel.impl.BinaryOperationImpl  implements Lambda {


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


