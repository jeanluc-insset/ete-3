package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface MethodInvocation  extends fr.insset.jeanluc.ete.xlang.Statement  {


    public MofOperation getMethod();
    public void setMethod(MofOperation inValue);
    public GelExpression getTarget();
    public void setTarget(GelExpression inValue);
    public List<GelExpression> getParameters();
    public void setParameters(List<GelExpression> inValue);
        

    //========================================================================//



}


