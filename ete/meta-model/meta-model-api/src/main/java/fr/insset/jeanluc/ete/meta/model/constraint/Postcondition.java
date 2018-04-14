package fr.insset.jeanluc.ete.meta.model.constraint;


/**
 *
 * @author jldeleage
 */
public interface Postcondition extends Condition, Comparable<Postcondition> {
    
    public final static String      POSTCONDITION = "post-condition";

    @Override
    public default int compareTo(Postcondition inOther) {
        return 0;
    }

}
