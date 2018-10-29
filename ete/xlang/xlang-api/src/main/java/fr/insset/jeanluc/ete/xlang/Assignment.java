package fr.insset.jeanluc.ete.xlang;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated("jean-luc@insset.fr template : ete/src/main/mda/modules/from-spec/class2interface.vm")
public interface Assignment  extends Statement  {


    public GelExpression getValue();
    public void setValue(GelExpression inValue);
    public GelExpression getLeftValue();
    public void setLeftValue(GelExpression inValue);
        

    //========================================================================//



    public default String getSymbol() {
        return "assignment_statement";
    }


}


