package fr.insset.jeanluc.gel;

// New release using a dialect and dependances
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/api.vm")
public interface Operation  extends fr.insset.jeanluc.gel.GelExpression  {




    //========================================================================//


        public List<GelExpression> getOperand();
    public void setOperand(List<GelExpression> inValue);
    public void addOperand(GelExpression inValue);


}