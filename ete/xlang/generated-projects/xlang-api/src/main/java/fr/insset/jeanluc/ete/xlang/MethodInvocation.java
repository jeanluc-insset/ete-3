package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.Operation;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface MethodInvocation  extends fr.insset.jeanluc.ete.xlang.Statement  {


    //========================================================================//


    public Operation getMethod();
    public void setMethod(Operation inValue);
    public GelExpression getTarget();
    public void setTarget(GelExpression inValue);
    public List<GelExpression> getParameters();
    public void setParameters(List<GelExpression> inValue);


}


