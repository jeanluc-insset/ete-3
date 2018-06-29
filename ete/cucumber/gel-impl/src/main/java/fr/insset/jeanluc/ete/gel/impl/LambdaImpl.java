package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.OclOperation;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class LambdaImpl  extends fr.insset.jeanluc.ete.gel.impl.OclOperationImpl  implements Lambda {


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


