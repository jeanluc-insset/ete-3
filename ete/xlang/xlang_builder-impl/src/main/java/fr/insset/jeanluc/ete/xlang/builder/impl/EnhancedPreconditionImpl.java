package fr.insset.jeanluc.ete.xlang.builder.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.builder.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class EnhancedPreconditionImpl  extends fr.insset.jeanluc.ete.meta.model.constraint.impl.PreconditionImpl  implements EnhancedPrecondition {


    //========================================================================//


    public GelExpression getExpression() {
        return expression;
    }

    public void setExpression(GelExpression inValue) {
        expression = inValue;
    }



    //========================================================================//


    private GelExpression expression;


}


