package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public interface Enumeration extends Classifier {
    
    public final static String      MOF_ENUMERATION = "enumeration";

    public  default String              getXmiType() {
        return "uml:Enumeration";
    }


    public List<Literal>    getLiteral();
    public void             setLiteral(List<Literal> inLiterals);
    public void             addLiteral(Literal inLiteral);

    public default boolean  isEnumeration() {
        return true;
    }

}
