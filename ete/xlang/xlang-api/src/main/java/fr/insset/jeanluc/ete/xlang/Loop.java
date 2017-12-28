package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.Statement;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Loop  extends fr.insset.jeanluc.ete.xlang.Statement  {


    //========================================================================//


    public List<Statement> getBody();
    public void setBody(List<Statement> inValue);
    public GelExpression getCondition();
    public void setCondition(GelExpression inValue);


}


