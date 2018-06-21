package fr.insset.jeanluc.gel.evaluation;


import static fr.insset.jeanluc.ete.defs.Constants.NOT_IMPLEMENTED_YET;
import fr.insset.jeanluc.el.evaluator.Evaluator;
import fr.insset.jeanluc.gel.*;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * For all visiting methods, the parameters are :<ul>
 *      <li>the (meta)-model</li>
 *      <li>the contextual class (a MofClass)</li>
 *      <li>the context (the contextual MofClass or a MofOperation of the contextual MofClass)</li>
 *      <li>the objects and variables defined at runtime</li>
 * </ul>
 * 
 * @author jldeleage
 */
public class GelEvaluator extends DynamicVisitorSupport implements Evaluator {

    public GelEvaluator() {
        register("evaluate", "fr.insset.jeanluc.gel");
    }


    //========================================================================//


    @Override
    public void addParameter(String inName, Object inValue) {
        throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object evaluate(String inExpression) {
        throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
    }


    //========================================================================//


    private static class TypeResult {
        Double      leftDouble, rightDouble;
        Integer     leftInt, rightInt;
    }

    private static TypeResult castValues(Object inLeft, Object inRight) {
        TypeResult result = new TypeResult();
        if (inLeft instanceof Integer &&inRight instanceof Integer) {
            result.leftInt = (Integer) inLeft;
            result.rightInt = (Integer) inRight;
            return result;
        }
        result.leftDouble = convertToDouble(inLeft);
        result.rightDouble = convertToDouble(inRight);
        return result;
    }

    private static Double convertToDouble(Object inValue) {
        if (inValue instanceof Integer) {
            Integer integerValue = (Integer) inValue;
            int     intValue = integerValue;
            return (double)intValue;
        }
        return (Double)inValue;
    }

    /**
     * 
     */
//
//    public Object evaluateAdd(Add inAdd, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        Logger      logger = Logger.getGlobal();
//        logger.log(Level.FINE, "Evaluate Add");
//        List<GelExpression> operands = inAdd.getOperand();
//        Object left = genericVisit(operands.get(0), inParameters);
//        Object right = genericVisit(operands.get(1), inParameters);
//        TypeResult castValues = castValues(left, right);
//        if (castValues.rightInt != null) {
//            return castValues.leftInt + castValues.rightInt;
//        }
//        return castValues.leftDouble + castValues.rightDouble;
//    }
//
//    public Object evaluateAnd(And inAnd, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        List<GelExpression> operands = inAnd.getOperand();
//        Boolean left = (Boolean) genericVisit(operands.get(0), inParameters);
//        if (left) {
//            return (Boolean) genericVisit(operands.get(1), inParameters);
//        }
//        return false;
//    }
//
//    public Object evaluateArrow(Arrow inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateAtPre(AtPre inExp, Object... inParameters) {
//        
//        return null;
//    }
//
//    public Object evaluateBooleanLiteral(BooleanLiteral inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateDateLiteral(DateLiteral inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateDifferent(Different inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateDiv(Div inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateDot(Dot inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateEqual(Equal inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateFloatingPointLiteral(FloatingPointLiteral inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateGreaterOrEqual(GreaterOrEqual inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateGreaterThan(GreaterThan inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateIntegerLiteral(IntegerLiteral inExp, Object... inParameters) {
//        int parseInt = Integer.parseInt(inExp.getValue().toString());
//        return parseInt;
//    }
//
//    public Object evaluateLambda(Lambda inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateLessOrEqual(LessOrEqual inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateLessThan(LessThan inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateMinus(Minus inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateMult(Mult inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateOpp(Opp inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateOr(Or inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateSelf(Self inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateStringLiteral(StringLiteral inExp, Object... inParameters) {
//        return inExp.getValue().toString();
//    }
//
//    public Object evaluateVariableDefinition(VariableDefinition inExp, Object... inParameters) {
//        return null;
//    }
//
//    public Object evaluateVariableReference(VariableReference inExp, Object... inParameters) {
//        VariableDefinition declaration = inExp.getDeclaration();
//        return null;
//    }

}
