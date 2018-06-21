package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Allocation  extends Statement  {


    public MofClass getMofClass();
    public void setMofClass(MofClass inValue);
        

    //========================================================================//



    public default String getSymbol() {
        return "allocation";
    }


}


