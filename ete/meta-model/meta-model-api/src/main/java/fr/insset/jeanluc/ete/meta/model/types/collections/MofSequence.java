package fr.insset.jeanluc.ete.meta.model.types.collections;


/**
 *
 * @author jldeleage
 */
public interface MofSequence extends MofCollection {
    
    public final static String      MOF_SEQUENCE = "mof-sequence";

    @Override
    public default boolean isOrdered() {
        return true;
    }

    @Override
    public default boolean isDistinct() {
        return true;
    }

    /**
     * @return the java-style name, e.g. List&lt;String&gt;
     */
    @Override
    public default String getName() {
        return "List<" + getBaseType().getName() + ">";
    }
}
