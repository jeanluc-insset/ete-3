package fr.insset.jeanluc.ete.meta.model.emof;



import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.util.XList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 *
 * @author jldeleage
 */
public interface MofClass extends Classifier {
    
    public  default String              getXmiType() {
        return "uml:Class";
    }


    public final static String              MOF_CLASS = "mof-class";

    public  default boolean                 hasSuperClasses() {
        return getSuperTypes().size() > 0;
    }

    public  default Collection<MofClass>    getSuperClass() {
        return getSuperClassAsStream().collect(Collectors.toCollection(XList::new));
    }
    public  default void                    addSuperClass(MofClass inMofClass) {
        addSuperType(inMofClass);
    }

    public  default Stream<MofClass>        getSuperClassAsStream() {
        return getSuperTypes().stream().map(t -> (MofClass)t);
    }

    public  Collection<Invariant>           getInvariants();
    public  void                            setInvariants(Collection<Invariant> inInvariants);
    public  void                            addInvariant(Invariant inInvariant);

    public  boolean                         isAbstract();
    public  void                            setAbstract(boolean inAbstract);

    @Override
    public default  boolean                 isPrimitive() {
        return false;
    }


}
