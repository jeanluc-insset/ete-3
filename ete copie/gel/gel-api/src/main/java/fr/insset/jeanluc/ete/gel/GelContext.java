package fr.insset.jeanluc.ete.gel;


import fr.insset.jeanluc.ete.meta.model.types.MofType;
// import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import javax.annotation.Generated;


/**
 * A context manages variables in a hierarchic architecture.
 *
 * @author jldeleage
 */
@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/language/context.vm")
public interface GelContext<T> {


    public final static String      ROOT         = "root",
                                    MODEL        = "model",
                                    SELF         = "self",
                                    CURRENT      = "current",
                                    CONTEXT      = "context",
                                    RESULT       = "result",
                                    CURRENT_TYPE = "current_type";


    /**
     * Looks for the value of <code>inString</code>
     */
    public T        resolve(String inString);
    /**
     *
     */
    public Object   resolveVariable(String inString);
    /**
     * Looks for an operation with <code>inString</code> as identifier
     */
    public T        resolveOperation(String inString, MofType inType);
    /**
     * Looks for a collection operation whose identifier is the value of
     * <code>inString</code>
     */
    public T        resolveCollOp(String inString);

    /**
     * Adds a local variable
     */
    public void     set(String inString, Object inValue);
    /**
     *  Removes a local variable
     */
    public void     remove(String inString);

    /**
     * Local variables sets management
     */
    public void push();
    public void pop() ;


}


