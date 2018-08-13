package fr.insset.jeanluc.ete.sbvr.impl;

import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.sbvr.Step;
import fr.insset.jeanluc.ete.sbvr.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class VariableReferenceImpl  extends fr.insset.jeanluc.ete.sbvr.impl.StepImpl  implements VariableReference {


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


