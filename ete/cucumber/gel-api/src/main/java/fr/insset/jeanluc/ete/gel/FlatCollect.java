package fr.insset.jeanluc.ete.gel;


import fr.insset.jeanluc.ete.gel.CollectionMethodNav;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface FlatCollect  extends CollectionMethodNav  {


        

    //========================================================================//


    public MofType  getType(EteModel inModel);

    public default String getSymbol() {
        return "->";
    }


}

