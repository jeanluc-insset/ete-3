package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.types.MofType;
import java.util.Collection;

/**
 *
 * @author jldeleage
 */
public interface MofProperty extends StructuralFeature {


    public final static String      MOF_PROPERTY = "property";


    public  default String              getXmiType() {
        return "uml:Property";
    }

    public  AggregationKind         getAggregationKind();
    public  void                    setAggregationKind(AggregationKind inAggregationKind);

    public  Collection<String>      getDefault();

    // Added by JLD 2017/08/17
    public  boolean                 isStatic();
    public  void                    setStatic(boolean inStatic);
    // Added by JLD 2017/08/17
    public  boolean                 isReadOnly();
    public  void                    setReadOnly(boolean inReadOnly);
    // Added by JLD 2017/08/18
    public String                   getDefaultValue();
    public void                     setDefaultValue(String inDefaultValue);

    public  boolean                 isComposite();

    public  boolean                 isDerived();
    public  void                    setDerived(boolean inDerived);

    public  Association             getOwningAssociation();
    public  void                    setOwningAssociation(Association inAssociation);

    public  Association             getAssociation();
    public  void                    setAssociation(Association inAssociation);

    public  MofProperty             getOpposite();
    public  void                    setOpposite(MofProperty inOpposite);

    // Added by JLD 2017/08/21
    public  MofType                 getQualifierType();
    public  void                    setQualifierType(MofType inType);
    public  String                  getQualifierName();
    public  void                    setQualifierName(String inName);

}
