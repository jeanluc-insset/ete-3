

package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofSequence;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofSequenceImpl;
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


    public NavHelper startFrom(EteModel inModel, String inContext) {
        model = inModel;
        current = (MofType)model.getElementByName(inContext);
        
        return this;
    }

    public NavHelper startFrom(EteModel inModel, MofOperation inContext) {
        model = inModel;
        current = inContext.getOwningMofClass();
        return this;
    }

    public NavHelper  navigateTo(String inName) {
        MofClass    currentClass = (MofClass)current.getRecBaseType();
        MofProperty attribute = currentClass.getOwnedAttribute(inName);
        Step        nextStep;
        if (navigation != null) {
            MofType     sourceType = navigation.getType();
            if (sourceType.isCollection()) {
                nextStep = new CollectImpl();
                MofSequence sequence = new MofSequenceImpl();
                sequence.setBaseType(attribute.getType());
                nextStep.setType(sequence);
            }
            else {
                nextStep = new AttributeNavImpl();
            }
            addOp(nextStep);
        }
        else {
            nextStep = new AttributeNavImpl();
            nextStep.setType(attribute.getType());
            nextStep.setToFeature(attribute);
        }
        current    = attribute.getType();
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
        List    operands = new LinkedList();
        operands.add(navigation);
        nextStep.setOperand(operands);        
    }

    //========================================================================//

    private     MofType         current;
    private     NamedElement    context;
    private     Step            navigation;
    private     EteModel        model;
}
