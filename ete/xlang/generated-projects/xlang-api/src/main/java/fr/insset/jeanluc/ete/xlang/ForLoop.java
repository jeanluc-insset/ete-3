package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.ete.xlang.Statement;
import java.util.List;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface ForLoop  extends fr.insset.jeanluc.ete.xlang.Loop  {


    //========================================================================//


    public List<Statement> getInitialization();
    public void setInitialization(List<Statement> inValue);
    public List<Statement> getIncrementation();
    public void setIncrementation(List<Statement> inValue);


}


