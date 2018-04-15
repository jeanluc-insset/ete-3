package fr.insset.jeanluc.ete.xlang.generator;


import fr.insset.jeanluc.el.dialect.Dialect;
import fr.insset.jeanluc.ete.xlang.Statement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Generator extends Dialect  {


    public List<Statement> getStatements(String inKey);
    public void setStatements(String inKey, List<Statement> inValue);
                

    //========================================================================//





}


