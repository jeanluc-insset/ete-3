package fr.insset.jeanluc.ete.xlang.impl;

import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.xlang.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;


@Generated ("ete - jean-luc@insset.fr - template : ete/src/main/mda/modules/from-spec/class2Implementation.vm")
public class MethodInvocationImpl  extends fr.insset.jeanluc.ete.xlang.impl.StatementImpl  implements MethodInvocation {


    //========================================================================//


    public MofOperation getMethod() {
        return method;
    }

    public void setMethod(MofOperation inValue) {
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


    private MofOperation method;
    private GelExpression target;
    private List<GelExpression> parameters;


}


