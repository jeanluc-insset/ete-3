package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import java.util.Collection;
import java.util.List;

/**
 * WARNING : in Mof, an operation is not a typed element. In Ete, it is.
 *
 * @author jldeleage
 */
public interface MofOperation extends Feature, NamedElement, MultiplicityElement, TypedElement {


    public final static String          MOF_OPERATION = "mof-operation";

    public  Collection<MofParameter>    getOwnedParameter();
    public  void                        addOwnedParameter(MofParameter inParameter);
    public  void                        removeOwnedParameter(MofParameter inParameter);

    public  Collection<MofType>         getRaisedException();
    public  void                        addRaisedException(MofType inMofType);
    public  void                        removeRaisedException(MofType inMofType);

    public  List<Precondition>          getPreconditions();
    public  void                        setPreconditions(List<Precondition> inPreconditions);
    public  void                        addPrecondition(Precondition inPrecondition);

    public  List<Postcondition>         getPostconditions();
    public  void                        setPostconditions(List<Postcondition> inPosticonditions);
    public  void                        addPostcondition(Postcondition inPostcondition);

}
