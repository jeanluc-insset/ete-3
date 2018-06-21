

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.constraint.impl.InvariantImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class EnhancedInvariantImpl extends InvariantImpl implements Invariant {

    public GelExpression getExpression() {
        return expression;
    }

    public void setExpression(GelExpression expression) {
        this.expression = expression;
    }

    public List<MofProperty> getSupport() {
        return support;
    }

    public void setSupport(List<MofProperty> support) {
        this.support = support;
    }



    //========================================================================//


    private     GelExpression               expression;
    private     List<MofProperty>           support = new LinkedList<>();

}
