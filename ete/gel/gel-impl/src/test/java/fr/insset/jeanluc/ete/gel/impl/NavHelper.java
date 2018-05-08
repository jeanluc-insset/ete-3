

package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.AtPre;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.VariableReference;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofSequence;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofSequenceImpl;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Builder DP.<br>
 * With this class, one can build an abstract tree for a complex navigation
 * with an expression such that&nbsp;:<br>
 * <code><pre>new NavHelper().startFrom("Session")
 *                  .navigateTo("askedQuestions")
 *                  .navigateTo("checkedAnsers")
 *                  .collect()
 *                  .navigateTo("answer")
 *                  .navigateTo("value")
 *                  .sum();</pre></code><br>
 *
 * @author jldeleage
 */
public class NavHelper {


    public NavHelper startFrom(EteModel inModel, String inContext) throws InstantiationException, IllegalAccessException {
        model = inModel;
        current = (MofType)model.getElementByName(inContext);
        context = current;
        navigation = new SelfImpl();
        navigation.setType(current);
        navigation.setName("self");
        return this;
    }


    public NavHelper startFrom(EteModel inModel, MofClass inClass) throws InstantiationException, IllegalAccessException {
        model = inModel;
        current = inClass;
        context = inClass;
        navigation = new SelfImpl();
        navigation.setType(current);
        navigation.setName("self");
        return this;
    }


    public NavHelper startFrom(EteModel inModel, MofOperation inContext) {
        model = inModel;
        current = inContext.getOwningMofClass();
        context = inContext;
        navigation = new SelfImpl();
        navigation.setType(current);
        navigation.setName("self");
        return this;
    }


    public NavHelper  navigateTo(String inName) {
        MofClass    currentClass = (MofClass)current.getRecBaseType();
        Step        nextStep;
        if (context instanceof MofOperation) {
            MofOperation    operation = (MofOperation) context;
            for (MofParameter aParameter : operation.getOwnedParameter()) {
                if (inName.equals(aParameter.getName())) {
                    VariableReference   variable = new VariableReferenceImpl();
                    variable.setDefinition(aParameter);
                    variable.setType(aParameter.getType());
                    navigation = variable;
                    return this;
                }
            }
        }
        if (navigation != null) {
            MofType     sourceType = navigation.getType();
            if (sourceType.isCollection()) {
                MofCollection   mofColl = (MofCollection) sourceType;
                MofClass sourceClass = (MofClass)mofColl.getRecBaseType();
                MofProperty attribute = sourceClass.getOwnedAttribute(inName);
                nextStep = new CollectImpl();
                MofSequence sequence = new MofSequenceImpl();
                sequence.setBaseType(attribute.getType());
                nextStep.setType(sequence);
            }
            else {
                MofClass    sourceClass = (MofClass) sourceType;
                MofProperty attribute = sourceClass.getOwnedAttribute(inName);
                nextStep = new AttributeNavImpl();
                nextStep.setToFeature(attribute);
                nextStep.setType(attribute.getType());
            }
            addOp(nextStep);
        }
        else {
            MofProperty attribute = currentClass.getOwnedAttribute(inName);
            nextStep = new AttributeNavImpl();
            nextStep.setType(attribute.getType());
            nextStep.setToFeature(attribute);
        }
        current    = nextStep.getType();
        if (current instanceof MofCollection) {
            MofCollection coll = (MofCollection) current;
            current = coll.getRecBaseType();
        }
        navigation = nextStep;
        return this;
    }


    public NavHelper atPre() {
        AtPre   nextStep = new AtPreImpl();
        addOp(nextStep);
        navigation = nextStep;
        return this;
    }

    public NavHelper flatten() {
        Step    nextStep = new FlattenImpl();
        addOp(nextStep);
        MofType baseType = navigation.getType().getRecBaseType();
        MofSequence sequence = new MofSequenceImpl();
        sequence.setBaseType(baseType);
        nextStep.setType(sequence);
        navigation = nextStep;
        return this;
    }

    public NavHelper includes(Step inStep) {
        Step    nextStep = new IncludesImpl();
        addOp(nextStep);
        MofType resultType = (MofType) model.getElementByName("boolean");
        nextStep.setType(resultType);
        nextStep.getOperand().add(inStep);
        navigation = nextStep;
        return this;
    }


    public NavHelper addAnOperand(GelExpression aStep) {
        navigation.getOperand().add(aStep);
        return this;
    }

    public NavHelper sum() {
        Step    nextStep = new SumImpl();
        addOp(nextStep);
        navigation = nextStep;
        return this;
    }


    public Step getNavigation() {
        return navigation;
    }


    protected void addOp(Step nextStep) {
        List    operands = nextStep.getOperand();
        if (operands == null) {
            operands = new LinkedList();
            nextStep.setOperand(operands);
        }
        operands.add(navigation);
        nextStep.setOperand(operands);        
    }


    //========================================================================//

    private     MofType         current;
    private     NamedElement    context;
    private     Step            navigation;
    private     EteModel        model;
}
