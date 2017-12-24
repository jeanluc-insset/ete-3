package fr.insset.jeanluc.gel.impl;



import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.gel.*;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class GelEvaluator extends DynamicVisitorSupport {




    public GelEvaluator() {
        this.register("visit", "fr.insset.jeanluc.gel");
    }

/*
    public Object visitOperationCallExpression(OperationCallExpression inExpression, Object... inContext) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 1- Collect the values of the operands
        System.out.println("Visiting " + inExpression);
        List<Object>    operandValues = new LinkedList<>();
        for (GelExpression operand : inExpression.getOperand()) {
            Object operandValue = genericVisit(operand, inContext);
            operandValues.add(operandValue);
        }
        // 2- Build an UELExpression from these values
        StringBuilder   builder = new StringBuilder();
        switch (operandValues.size()) {
            case 1:
                break;
            case 2:
                break;
        }
        // 3- Evaluate the UELExpression and return the value
        return null;
    }
*/


    public Object visitLiteral(Literal inLiteral, Object... inContext) {
        System.out.println("Visiting " + inLiteral);
        return null;
    }


    public MofClass visitSelf(Self inSelf, Object... inContext) {
        MofClass result = (MofClass) inSelf.getType();
        return result;
    }
 

    public Feature visitNavigation(Navigation inNavigation, Object... inContext) {
        return inNavigation.getToFeature();
    }


/*
    public Object visitNot(Not inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 1
                return result;
    }
*/
/*
    public Object visitGreaterOrEqual(GreaterOrEqual inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitLambda(Lambda inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitMinus(Minus inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
    public Boolean visitBooleanLiteral(BooleanLiteral inLiteral, Object... inContext) {
        return (Boolean)inLiteral.getValue();
    }
    public Double visitFloatingPointLiteral(FloatingPointLiteral inLiteral, Object... inContext) {
        return (Double)inLiteral.getValue();
    }
/*
    public Object visitAnd(And inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitOpp(Opp inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 1
                return result;
    }
*/
/*
    public Object visitAdd(Add inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitMult(Mult inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitDiv(Div inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitXor(Xor inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitOr(Or inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
    public java.util.Date visitDateLiteral(DateLiteral inLiteral, Object... inContext) {
        return (java.util.Date)inLiteral.getValue();
    }
/*
    public Object visitGreaterThan(GreaterThan inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitDifferent(Different inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
    public String visitStringLiteral(StringLiteral inLiteral, Object... inContext) {
        return (String)inLiteral.getValue();
    }
    public Integer visitIntegerLiteral(IntegerLiteral inLiteral, Object... inContext) {
        return (Integer)inLiteral.getValue();
    }
/*
    public Object visitEqual(Equal inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitAtPre(AtPre inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                return result;
    }
*/
/*
    public Object visitLessOrEqual(LessOrEqual inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/
/*
    public Object visitLessThan(LessThan inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Object> operandValues = getOperandValues(inOperation, inContext);
        Object result = null;
                // arity = 2
                return result;
    }
*/




    //========================================================================//

    public Integer visitAdd(Add inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List    rawOperands = getOperandValues(inOperation, inContext);
        List<Integer>   operands = rawOperands;
        Integer result = operands.get(0) + operands.get(1);
        return result; 
    }


    public Integer visitMult(Mult inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List    rawOperands = getOperandValues(inOperation, inContext);
        List<Integer>   operands = rawOperands;
        Integer result = operands.get(0) * operands.get(1);
        return result; 
    }

    public Integer visitMinus(Minus inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List    rawOperands = getOperandValues(inOperation, inContext);
        List<Integer>   operands = rawOperands;
        Integer result = operands.get(0) - operands.get(1);
        return result; 
    }

    public Boolean visitGreaterThan(GreaterThan inOperation, Object... inContext)
                 throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List    rawOperands = getOperandValues(inOperation, inContext);
        List<Integer>   operands = rawOperands;
        Boolean result = operands.get(0) > operands.get(1);
        return result; 
    }

    protected List<Object> getOperandValues(Operation inOperation, Object inContext)
                                throws IllegalAccessException,
                                        IllegalArgumentException,
                                        InvocationTargetException {
        List<Object>    operandValues = new LinkedList<>();
        for (GelExpression operand : inOperation.getOperand()) {
            Object operandValue = genericVisit(operand, inContext);
            operandValues.add(operandValue);
        }
        return operandValues;
    }



}


