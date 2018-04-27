

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;



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
    

    public GelExpression substitute(GelExpression inWhat, GelExpression inWhere, GelExpression inBy) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return (GelExpression) genericVisit(inWhere, inWhat, inBy);
    }


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        GelExpression what = (GelExpression) inParameters[0];
        if (ExpressionUtility.equal(inExpression, what)) {
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
