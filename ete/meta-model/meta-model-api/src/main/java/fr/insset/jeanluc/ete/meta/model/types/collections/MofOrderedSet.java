package fr.insset.jeanluc.ete.meta.model.types.collections;


/**
 *
 * @author jldeleage
 */
public interface MofOrderedSet extends MofCollection {


    public final static String      MOF_ORDERED_SET = "mof-ordered-set";


    @Override
    public default boolean isOrdered() {
        return true;
    }

    @Override
    public default boolean isDistinct() {
        return false;
    }

}
