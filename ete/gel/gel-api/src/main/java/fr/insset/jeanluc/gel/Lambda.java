package fr.insset.jeanluc.gel;

// New release using a dialect and dependances
import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/api.vm")
public interface Lambda  extends fr.insset.jeanluc.gel.BinaryOperation  {


    public default String getSymbol() {
        return "|";
    }
    public default String getJavaOperator() {
        return "=";
    }


    //========================================================================//


        public List<VariableDefinition> getVariables();
    public void setVariables(List<VariableDefinition> inValue);
    public void addVariables(VariableDefinition inValue);
        // fr.insset.jeanluc.gel
    // 
        public GelExpression getBody();
    public void setBody(GelExpression inValue);


}