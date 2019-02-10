package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.Operation;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.List;



public class MethodInvocationImpl  extends fr.insset.jeanluc.ete.xlang.impl.StatementImpl  implements MethodInvocation {


    //========================================================================//


    public Operation getMethod() {
        return method;
    }

    public void setMethod(Operation inValue) {
        method = inValue;
    }

    public GelExpression getTarget() {
        return target;
    }

    public void setTarget(GelExpression inValue) {
        target = inValue;
    }

    public List<GelExpression> getParameters() {
        return parameters;
    }

    public void setParameters(List<GelExpression> inValue) {
        parameters = inValue;
    }



    //========================================================================//


        private Operation method;
            private GelExpression target;
            private List<GelExpression> parameters;
    

}


