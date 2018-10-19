

package fr.insset.jeanluc.ete.meta.model.types;

/**
 *
 * @author jldeleage
 */
public interface PrimitiveType extends MofType {

    public final static String      PRIMITIVE_TYPE = "mof-primitive-type";

    @Override
    public default boolean          isPrimitive() {
        return true;
    }

}
