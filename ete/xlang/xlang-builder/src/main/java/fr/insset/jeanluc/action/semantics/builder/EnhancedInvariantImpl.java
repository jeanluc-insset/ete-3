

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.constraint.impl.InvariantImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class EnhancedInvariantImpl extends InvariantImpl implements Invariant {


    public EnhancedInvariantImpl() throws InstantiationException {
        support = FactoryMethods.newList(Step.class);
    }

        
    public EnhancedInvariantImpl(GelExpression expression) throws InstantiationException {
        this.expression = expression;
        support = FactoryMethods.newList(Step.class);
    }


    public GelExpression getExpression() {
        return expression;
    }

    public void setExpression(GelExpression expression) {
        this.expression = expression;
    }


    public void addToSupport(Step inProperty) {
        support.add(inProperty);
    }


    public Collection<Step> getSupport() {
        return support;
    }





    //========================================================================//


    private     GelExpression      expression;
    /**
     * The list of MofProperties involved in the invariant.<br>
     * Any step of any navigation is stored here.
     */
    private     Collection<Step>   support;

}
