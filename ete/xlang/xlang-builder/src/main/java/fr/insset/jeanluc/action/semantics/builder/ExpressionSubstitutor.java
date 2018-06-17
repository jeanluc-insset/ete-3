

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * Provides utility methods for expressions&nbsp;:<ul>
 * <li>clone</li>
 * <li>substitute</li>
 * <li>areEqual</li>
 * </ul>
 *
 * @author jldeleage
 */
public class ExpressionSubstitutor extends DynamicVisitorSupport {

    public ExpressionSubstitutor() {
        register("visit", "fr.insset.jeanluc.ete.gel");
    }
    

    public GelExpression substitute(GelExpression inWhat, GelExpression inWhere, GelExpression inBy) throws IllegalAccessException {
        try {
            return (GelExpression) genericVisit(inWhere, inWhat, inBy);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(ExpressionSubstitutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inWhat;
    }


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        GelExpression what = (GelExpression) inParameters[0];
        if (ExpressionUtility.areEqual(inExpression, what)) {
            return (GelExpression) inParameters[1];
        }
        GelExpression result = inExpression.getClass().newInstance();
        List<GelExpression> operands = FactoryMethods.newList(GelExpression.class);
        result.setOperand(operands);
        for (GelExpression anOperand : inExpression.getOperand()) {
            operands.add((GelExpression)genericVisit(anOperand, inParameters));
        }
        return result;
    }

}
