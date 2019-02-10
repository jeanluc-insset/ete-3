package fr.insset.jeanluc.ete.meta.model.types;


/**
 *
 * @author jldeleage
 */
public interface Generalization {


    public final static String      GENERALIZATION  = "generalization";


    public  Classifier  getGeneral();
    public  void        setGeneral(Classifier inGeneral);


    public  Classifier  getSpecific();
    public  void        setSpecific(Classifier inGeneral);


}
