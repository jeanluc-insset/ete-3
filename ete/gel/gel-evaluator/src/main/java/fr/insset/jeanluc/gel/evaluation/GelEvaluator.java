/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.gel.evaluation;

import fr.insset.jeanluc.ete.gel.*;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author jldeleage
 */
public class GelEvaluator extends DynamicVisitorSupport {

    public GelEvaluator() {
        register("visit", "fr.insset.jeanluc.ete.gel");
    }




    public Object eval(GelExpression inExpression, Object inSelf) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Map<String, Object> context = new HashMap<>();
        context.put("self", inSelf);
        context.put("this", inSelf);
        return genericVisit(inExpression, context);
    }

    public Object eval(GelExpression inExpression, Map<String, Object> inContext) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return genericVisit(inExpression, inContext);
    }


    //==========================================================================//


    public Object visitAdd(Add inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Number a = (Number) genericVisit(operand.get(0), inParameters);
        Number b = (Number) genericVisit(operand.get(1), inParameters);
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() + b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() + b.longValue();
        } else {
            return a.intValue() + b.intValue();
        }
    }

    public Object visitSub(Sub inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Number a = (Number) genericVisit(operand.get(0), inParameters);
        Number b = (Number) genericVisit(operand.get(1), inParameters);
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() - b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() - b.longValue();
        } else {
            return a.intValue() - b.intValue();
        }
    }

    public Object visitMult(Mult inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Number a = (Number) genericVisit(operand.get(0), inParameters);
        Number b = (Number) genericVisit(operand.get(1), inParameters);
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() * b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() * b.longValue();
        } else {
            return a.intValue() * b.intValue();
        }
    }

    public Object visitDiv(Div inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Number a = (Number) genericVisit(operand.get(0), inParameters);
        Number b = (Number) genericVisit(operand.get(1), inParameters);
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() / b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() / b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() / b.longValue();
        } else {
            return a.intValue() / b.intValue();
        }
    }

    public Object visitGreaterThan(GreaterThan inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Comparable a = (Comparable) genericVisit(operand.get(0), inParameters);
        Comparable b = (Comparable) genericVisit(operand.get(1), inParameters);
        return (a.compareTo(b) > 0);
    }


    public Object visitGreaterOrEqual(GreaterOrEqual inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Comparable a = (Comparable) genericVisit(operand.get(0), inParameters);
        Comparable b = (Comparable) genericVisit(operand.get(1), inParameters);
        return (a.compareTo(b) >= 0);
    }


    public Object visitLessThan(LessThan inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Comparable a = (Comparable) genericVisit(operand.get(0), inParameters);
        Comparable b = (Comparable) genericVisit(operand.get(1), inParameters);
        return (a.compareTo(b) < 0);
    }


    public Object visitLessOrEqual(LessOrEqual inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Comparable a = (Comparable) genericVisit(operand.get(0), inParameters);
        Comparable b = (Comparable) genericVisit(operand.get(1), inParameters);
        return (a.compareTo(b) > 0);
    }


    public Object visitEqual(Equal inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Object a = genericVisit(operand.get(0), inParameters);
        Object b = genericVisit(operand.get(1), inParameters);
        return Objects.equals(a, b);
    }


    public Object visitDifferent(Different inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Object a = genericVisit(operand.get(0), inParameters);
        Object b = genericVisit(operand.get(1), inParameters);
        return ! (Objects.equals(a, b));
    }


    public Object visitAnd(And inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Boolean a = (Boolean) genericVisit(operand.get(0), inParameters);
        Boolean b = (Boolean) genericVisit(operand.get(1), inParameters);
        return (a && b);
    }


    public Object visitOr(Or inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Boolean a = (Boolean) genericVisit(operand.get(0), inParameters);
        Boolean b = (Boolean) genericVisit(operand.get(1), inParameters);
        return (a || b);
    }

    public Object visitXor(Xor inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExp.getOperand();
        Boolean a = (Boolean) genericVisit(operand.get(0), inParameters);
        Boolean b = (Boolean) genericVisit(operand.get(1), inParameters);
        return (a ^ b);
    }

    //==========================================================================//

    public Object visitStep(Step inExp, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        List<GelExpression> operand = inExp.getOperand();
        Object a = genericVisit(operand.get(0), inParameters);
        Feature toFeature = inExp.getToFeature();
        if (toFeature instanceof MofProperty) {
            MofProperty property = (MofProperty) toFeature;
            String name = property.getName();
            name = "get"
                    + name.substring(0,1).toUpperCase()
                    + name.substring(1);
            if (a instanceof Collection) {
                List result = new LinkedList();
                Collection b = (Collection) a;
                for (Object anItem : b) {
                    result.add(get(anItem, name));
                }
                return result;
            } else {
                return get(a, name);
            }
        }
        return null;
    }


    protected Object get(Object inSrc, String inTarget) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = inSrc.getClass().getMethod(inTarget, new Class[0]);
        Object result = method.invoke(inSrc, new Object[0]);
        return result;
    }


    public Object visitIdentifier(Identifier inExp, Object... inParameters) {
        Map<String, Object> context = (Map<String, Object>) inParameters[0];
        String name = inExp.getName();
        System.out.println("Looking for the object " + name);
        return context.get(name);
    }

}
