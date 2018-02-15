package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class VariableReferenceImpl  extends fr.insset.jeanluc.ete.gel.impl.StepImpl  implements VariableReference {


    //========================================================================//


    public TypedElement getDefinition() {
        return definition;
    }

    public void setDefinition(TypedElement inValue) {
        definition = inValue;
    }



    //========================================================================//


    private TypedElement definition;


}


