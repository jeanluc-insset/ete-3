package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Conditional  extends fr.insset.jeanluc.ete.xlang.Statement  {


    //========================================================================//


    public GelExpression getCondition();
    public void setCondition(GelExpression inValue);
    public Statement getThenPart();
    public void setThenPart(Statement inValue);
    public Statement getElsePart();
    public void setElsePart(Statement inValue);


}


