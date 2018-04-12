package fr.insset.jeanluc.ete.xlang.builder;


import fr.insset.jeanluc.ete.xlang.Statement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface EnhancedOperation  extends fr.insset.jeanluc.ete.meta.model.emof.MofOperation  {


    public List<Statement> getStatements();
    public void setStatements(List<Statement> inValue);
        

    //========================================================================//

    public void buildStatements();




}


