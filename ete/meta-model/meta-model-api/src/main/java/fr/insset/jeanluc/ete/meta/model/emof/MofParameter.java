package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.Collection;

/**
 *
 * @author jldeleage
 */
public interface MofParameter extends MultiplicityElement, TypedElement {


    public  default String              getXmiType() {
        return "uml:Parameter";
    }

    public final static String  MOF_PARAMETER = "parameter";


    public  ParameterDirectionKind  getDirection();
    public  void                    setDirection(ParameterDirectionKind inDirection);

}
