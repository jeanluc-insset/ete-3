package fr.insset.jeanluc.ete.gel;


import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import javax.annotation.Generated;


/**
 * <div>
 * A context manages variables in a stack.
 * </div>
 * <div>
 * When entering a new subexpression, a new set of variables is pushed on top
 * of the stack.
 * </div>
 * <div>
 *  The variables are&nbsp;:
 *  <ul>
 *  <li>MODEL : the model, to resolve global identifiers</li>
 *  <li>CONTEXT : the MofClass or MofOperation which is the initial context of
 *      the whole expression</li>
 *  <li>SELF : the initial context MofClass. If CONTEXT is a MofClass,
 *      SELF == CONTEXT, otherwise SELF = CONTEXT.owningMofClass</li>
 *  <li>ROOT : the initial context MofClass of the current subexpression.</li>
 *  <li>CURRENT : the partial navigation</li>
 *  <li>RESULT : the MofType of the result of CONTEXT is CONTEXT is a
 *      MofOperation, null otherwise</li>
 *   </ul>
 * </div>
 * <div>
 * CONTEXT is used to initialize SELF and to resolve initial identifiers (such
 *      an identifier can be a reference to a parameter).<br>
 * SELF is used to resolve "self" and to initialize ROOT<br>
 * ROOT is used to resolve initial identifiers (such an identifier can be a
 *      reference to a property of ROOT)<br>
 * CURRENT is used to resolve an internal identifier.<br>
 * CURRENT_TYPE is maintained to build complete expressions.
 * </div>
 * <div>
 * 
 * </div>
 * @author jldeleage
 */
@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/language/context.vm")
public interface GelContext<T> {


    public final static String      MODEL        = "model";
    /**
     * The initial Context of the whole expression.<br>
     * It is a MofClass or a MofOperation instance.
     */
    public final static String      CONTEXT      = "context";
    /**
     * The initial context MofClass of the whole expression.<br>
     * If CONTEXT is a MofClass then SELF == CONTEXT, otherwise
     * SELF == CONTEXT.owningClass
     */
    public final static String      SELF         = "self";
    /**
     * The partial wrapping navigation, in case of filtering or
     * mapping.
     */
    public final static String      ROOT         = "root";
    /**
     * The partial navigation.<br>
     * At the beginning of a subexpression, CURRENT == null
     * While traversing the expression, CURRENT changes.
     */
    public final static String      CURRENT      = "current";
    /**
     * The result type of the context MofOperation.<br>
     * If the CONTEXT is a MofClass, RESULT is null.
     */
    public final static String      RESULT       = "result";



    public Object get(String inKey) throws InstantiationException, IllegalAccessException;

    public default TypedElement getContext() throws InstantiationException, IllegalAccessException {
        return (TypedElement)resolve(CONTEXT);
    }


    public default MofType getContextType() throws InstantiationException, IllegalAccessException {
        TypedElement context = getContext();
        if (context instanceof MofOperation) {
            return ((MofOperation)context).getOwningMofClass();
        }
        else {
            return (MofType)context;
        }
    }




    /**
     * Looks for the value of <code>inString</code>
     */
    public T        resolve(String inString) throws InstantiationException, IllegalAccessException;
    /**
     *
     */
    public Object   resolveVariable(String inString) throws InstantiationException, IllegalAccessException;
    /**
     * Looks for an operation with <code>inString</code> as identifier
     */
    public T        resolveOperation(String inString, MofType inType) throws InstantiationException, IllegalAccessException;
    /**
     * Looks for a collection operation whose identifier is the value of
     * <code>inString</code>
     */
    public T        resolveCollOp(String inString) throws InstantiationException, IllegalAccessException;

    public T        resolveIsNew();


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


