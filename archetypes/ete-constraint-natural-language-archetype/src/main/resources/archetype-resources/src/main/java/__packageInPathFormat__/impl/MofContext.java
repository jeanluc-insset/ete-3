package ${package}.impl;



import fr.insset.jeanluc.ete.gel.GelContext;
import static fr.insset.jeanluc.ete.gel.GelContext.CURRENT;
import static fr.insset.jeanluc.ete.gel.GelContext.ROOT;
import static fr.insset.jeanluc.ete.gel.GelContext.SELF;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.VariableReference;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * <div>
 * A context is used to resolve identifiers and keep track of partial navigation.<br>
 * Putting it simple, a context is a stack of maps String -&gt; TypedElement.
 * </div>
 * 
 * <div>
 * For example, when parsing the string<br>
 * <code>captain.certificates.planeModel -&gt;includes(plane.planeModel)</code><br>
 * the "captain" identifier is resolved within the Flight context since the
 * initial context of the invariant is the Flight class.<br>
 * Then the "certificates" identifier is resolved within the Pilot context (type
 * of the former resolution).<br>
 * Then planeModel is resolved within the Collection&lt;Certificate&gt; context.<br>
 * As we navigate through the expression, the current class changes.
 * </div>
 *
 * @author jldeleage
 */
public class MofContext implements GelContext<GelExpression> {


    public MofContext(TypedElement inContext, EteModel inModel) {
        VariableSet     initialSet = new VariableSet();
        initialSet.put(CONTEXT, inContext);
        TypedElement    current = inContext;
        if (inContext instanceof MofOperation) {
            MofOperation operation = (MofOperation) inContext;
            current = operation.getOwningMofClass();
            for (MofParameter aParameter : operation.getOwnedParameter()) {
                initialSet.put(aParameter.getName(), aParameter);
            }
        }
        initialSet.put(SELF, current);
        try {
            // ROOT should not be a model object but a navigation
            Self      root = (Self) FactoryRegistry.newInstance(SELF);
            root.setType((MofType)current);
            initialSet.put(ROOT, root);
        } catch (InstantiationException ex) {
            Logger.getLogger(MofContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MofContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        initialSet.put(MODEL, inModel);
        stack.add(initialSet);
    }       // constructor MofContext



    //========================================================================//
    

    @Override
    public GelExpression resolve(String inString) throws InstantiationException, IllegalAccessException {
        if (SELF.equals(inString)) {
            return resolveSelf();
        }
        GelExpression result = null;
        // can we extend the current navigation ? or A current navigation ?
        for (int i=0 ; i<stack.size() ; i++) {
            result = resolveInCurrent(inString, i);
            if (result != null) {
                break;
            }
        }
        if (result == null) {
            // There is no partial navigation to extend, let's try to get
            // an attribute of the contextual class
            MofClass context = (MofClass) get(SELF);
            MofProperty ownedAttribute = context.getOwnedAttribute(inString);
            if (ownedAttribute == null) {
                return null;
            }
            Self current = (Self) FactoryRegistry.newInstance(SELF);
            current.setType(context);
            result = buildStep(current, ownedAttribute);
        }
        // We must update the variables
        if (result == null) {
            return null;
        }
        set(CURRENT, result);
        return result;
    }


    @Override
    public Object resolveVariable(String inString) throws InstantiationException, IllegalAccessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GelExpression resolveOperation(String inString, MofType inType) throws InstantiationException, IllegalAccessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GelExpression resolveCollOp(String inString) throws InstantiationException, IllegalAccessException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GelExpression resolveIsNew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(String inString, Object inValue) {
        VariableSet variables = stack.get(0);
        variables.put(inString, (TypedElement)inValue);
    }

    @Override
    public void remove(String inString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    //========================================================================//



    @Override
    public Object get(String inKey) throws InstantiationException, IllegalAccessException {
        Iterator<VariableSet> iterator = stack.iterator();
        while (iterator.hasNext()) {
            VariableSet next = iterator.next();
            Object result = next.get(inKey);
            if (result != null) {
                return result;
            }
        }
        return null;
    }


    protected Self resolveSelf() throws InstantiationException, IllegalAccessException {
        Self    self = (Self) FactoryRegistry.newInstance("self");
        self.setName("self");
        self.setType((MofType)get(SELF));
        return self;        
    }


    protected GelExpression resolveRecursively(String inIdentifier) throws InstantiationException, IllegalAccessException {
        for (int i=0 ; i<stack.size() ; i++) {
            GelExpression result = resolveInCurrent(inIdentifier, i);
            if (result != null) {
                return result;
            }
        }
        return null;
    }       // resolveRecursively


    /**
     * Looks for an attribute in the current navigation.<br>
     * The search is performed from CURRENT if it is not null, from ROOT
     * otherwise.
     * 
     * @param inIdentifier
     * @param inIndex
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    protected GelExpression resolveInCurrent(String inIdentifier, int inIndex) throws InstantiationException, IllegalAccessException {
        if (inIndex >= stack.size()) {
            return null;
        }

        VariableSet currentVariables = (VariableSet)stack.get(inIndex);
        TypedElement parameter = currentVariables.get(inIdentifier);
        if (parameter != null) {
            VariableReference   ref = (VariableReference) FactoryRegistry.newInstance("var");
            ref.setDefinition(parameter);
            ref.setType(parameter.getType());
            ref.setName(parameter.getName());
            return ref;
        }

        Step    current = (Step) currentVariables.get(CURRENT);
        if (current == null) {
            current = (Step) currentVariables.get(ROOT);
        }
        if (current == null) {
            return null;
        }
        MofType currentType = null;
        currentType = current.getType().getRecBaseType();
        if (currentType instanceof MofClass) {
            MofProperty ownedAttribute = ((MofClass)currentType).getOwnedAttribute(inIdentifier);
            if (ownedAttribute == null) {
                return null;
            }
            return buildStep(current, ownedAttribute);
        }

        return null;
    }



    /**
     * Creates and initializes a new instance of the class registered for ".att"
     * (or of a collection).
     */
    protected Step  buildStep(Step current, MofProperty ownedAttribute) throws InstantiationException, IllegalAccessException {
        // This should never happen since we have initialized a ROOT object with
        // a "self navigation"
        if (current == null) {
            current = (Step) FactoryRegistry.newInstance("self");
            current.setType((MofType) get(SELF));
        }
        MofType type = current.getType();
        Step nav = type.isCollection() ? (Step) FactoryRegistry.newInstance("collect") : (Step) FactoryRegistry.newInstance(".att");
        List<GelExpression>     operands = FactoryMethods.newList(GelExpression.class);
        nav.setOperand(operands);
        operands.add(current);
        nav.setToFeature(ownedAttribute);
        MofType nextType;
        if (type.isCollection()) {
            nextType = clone(type, ownedAttribute.getType());
        } else {
            nextType = ownedAttribute.getType();
        }
        nav.setType(nextType);
        set(CURRENT, nav);
        return nav;        
    }



    //========================================================================//


    /**
     * Adds a new set of variables on top of the stack.<br>
     * The ROOT variable is initialized with the type of the current
     */
    @Override
    public final void push() {
            VariableSet newSet = new VariableSet();
            VariableSet top    = stack.get(0);
            GelExpression   current = (GelExpression) top.get(CURRENT);
            if (current != null) {
                MofType currentType = current.getType().getRecBaseType();
                newSet.put(ROOT, currentType);
            }
            stack.add(0, newSet);
    }


    @Override
    public void pop() {
        stack.remove(0);
    }



    //========================================================================//
    //                           U T I L I T I E S                            //
    //========================================================================//


    /**
     * When collecting a property (i.e. navigating from a collection), the
     * result is a collection of the target type elements, so the type is
     * collection&lt;target type&gt;.<br>
     * Unfortunately, this can be recursive in case the source is a collection
     * of collections of&nbsp;...<br>
     * As a consequence we need to clone the source type.
     */
    protected MofType clone(MofType inSrc, MofType inBaseType) {
        if (inSrc.isCollection()) {
            try {
                MofCollection   srcColl = (MofCollection)inSrc;
                MofCollection   result = (MofCollection)FactoryRegistry.newInstance(srcColl.getSymbol());
                result.setBaseType(clone(srcColl.getBaseType(), inBaseType));
                return result;
            } catch (InstantiationException | IllegalAccessException ex) {
                throw new RuntimeException(ex);
            }
        }
        else {
            return inBaseType;
        }
    }


    //========================================================================//


    private class VariableSet extends HashMap<String, TypedElement> {
    }       // VariableSet


    //========================================================================//


    private Stack<VariableSet>      stack = new Stack<>();

}       // MofContext
