package fr.insset.jeanluc.ete.gel;


import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;


@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Collect  extends fr.insset.jeanluc.ete.gel.CollectionMethodNav  {


        

    //========================================================================//


    public MofType  getType(EteModel inModel);

    public default String getSymbol() {
        return "->";
    }


}


