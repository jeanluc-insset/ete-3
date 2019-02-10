package fr.insset.jeanluc.ete.meta.model.emof;


import fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural;

/**
 *
 * @author jldeleage
 */
public interface MultiplicityElement {
    
    public  boolean             isOrdered();
    public  void                setOrdered(boolean inOrdered);

    public  boolean             isUnique();
    public  void                setUnique(boolean inUnique);

    public  int                 getLower();
    public  void                setLower(int inLower);
    public  UnlimitedNatural    getUpper();
    public  void                setUpper(UnlimitedNatural inUpper);
    public  void                setUpper(int inUpper);

}
