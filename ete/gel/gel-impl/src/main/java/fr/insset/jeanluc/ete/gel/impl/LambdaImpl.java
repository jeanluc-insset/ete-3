package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class LambdaImpl  extends fr.insset.jeanluc.ete.gel.impl.OperationImpl  implements Lambda {


    //========================================================================//


    public List<VariableDefinition> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableDefinition> inValue) {
        variables = inValue;
    }


    //========================================================================//


    private List<VariableDefinition> variables;


}


