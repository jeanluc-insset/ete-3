package fr.insset.jeanluc.ete.sbvr.impl;

import fr.insset.jeanluc.ete.sbvr.SbvrExpression;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.sbvr.VariableDefinition;
import fr.insset.jeanluc.ete.sbvr.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class DefinitionImpl  implements Definition {


    //========================================================================//


    public List<VariableDefinition> getParameters() {
        return parameters;
    }

    public void setParameters(List<VariableDefinition> inValue) {
        parameters = inValue;
    }
    public TypedElement getContext() {
        return context;
    }

    public void setContext(TypedElement inValue) {
        context = inValue;
    }
    public SbvrExpression getDefinition() {
        return definition;
    }

    public void setDefinition(SbvrExpression inValue) {
        definition = inValue;
    }








    //========================================================================//


    private List<VariableDefinition> parameters;
    private TypedElement context;
    private SbvrExpression definition;


}


