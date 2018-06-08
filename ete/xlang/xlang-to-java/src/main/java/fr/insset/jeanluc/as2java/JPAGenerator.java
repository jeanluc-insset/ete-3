package fr.insset.jeanluc.as2java;




import fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl;
import fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperation;
import fr.insset.jeanluc.action.semantics.builder.EteQuery;
import fr.insset.jeanluc.el.dialect.JavaDialect;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.Different;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Includes;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.StringLiteral;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.impl.*;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.Conditional;
import fr.insset.jeanluc.ete.xlang.DoWhileLoop;
import fr.insset.jeanluc.ete.xlang.ForLoop;
import fr.insset.jeanluc.ete.xlang.Instanciation;
import fr.insset.jeanluc.ete.xlang.MethodInvocation;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.WhileDoLoop;
import fr.insset.jeanluc.ete.xlang.to.xxx.Generator;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * This class is a dialect so it can be used in velocity templates.<br>
 * It overrides the getOperationBody method with the cross compilation of
 * all the statements associated to the method.
 *
 * @author jldeleage
 */
public class JPAGenerator extends DynamicVisitorSupport implements Generator, JavaDialect  {


    private enum LEFT_RIGHT {
        LEFT, RIGHT
    };



    public JPAGenerator() throws InstantiationException {
        this("    ");
    }


    public JPAGenerator(String indentation) throws InstantiationException {
        this.indentation = indentation;
        register("visit", "fr.insset.jeanluc.ete.gel");
        register("visit", "fr.insset.jeanluc.ete.xlang");
        operators = FactoryMethods.newMap(Class.class, String.class);
        operators.put(DifferentImpl.class, "notEqual");
        operators.put(EqualImpl.class, "equal");
        operators.put(GreaterThanImpl.class, "greaterThan");
        operators.put(LessThanImpl.class, "lessThan");
        operators.put(GreaterOrEqualImpl.class, "ge");
        operators.put(LessOrEqualImpl.class, "le");
        operators.put(AddImpl.class, "sum");
        operators.put(SubImpl.class, "diff");
        operators.put(MultImpl.class, "prod");
        operators.put(DivImpl.class, "quot");
    }


    //========================================================================//
    //            G E N E R A T O R   I M P L E M E N T A T I O N             //
    //========================================================================//



    //========================================================================//
    //                              D I A L E C T                             //
    //========================================================================//


    public String getPredicate(EteQuery inQuery) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuffer    buffer = new StringBuffer();
        genericVisit(inQuery.getExpression(), buffer, indentation + indentation, inQuery);
        return buffer.toString();
    }

    public String addChecking(Step inStep) {
        StringBuffer    buffer = new StringBuffer();
        addChecking(inStep, buffer);
        return buffer.toString();
    }

    protected void addChecking(Step inStep, StringBuffer buffer) {
        System.out.println("Dans addChecking : " + inStep + " (" + inStep.getClass().getName() + ")");
        if (inStep instanceof AttributeNav) {
            AttributeNav nav = (AttributeNav) inStep;
            List<GelExpression> operand = inStep.getOperand();
            if (operand != null && operand.size()>0)
                addChecking((Step) operand.get(0), buffer);
            Feature toFeature = nav.getToFeature();
            buffer.append(".get");
            buffer.append(i2uc(toFeature.getName()));
            buffer.append("$()");
        }
        else {
            buffer.append("inFor");
        }
    }
    

    public String getFilter(AttributeNav inNav, String start) {
        StringBuffer buffer = new StringBuffer(start);
        addNavInFilter(inNav, buffer);
        return buffer.toString();
    }

    protected void addNavInFilter(Step inStep, StringBuffer inoutBuffer) {
        List<GelExpression> operand = inStep.getOperand();
        if (operand == null || operand.size() == 0) {
            return;
        }
        AttributeNav nav = (AttributeNav) inStep;
        addNavInFilter((Step) operand.get(0), inoutBuffer);
        inoutBuffer.append(i2uc(nav.getToFeature().getName()));
    }

    /**
     * This method is used to pass the value to a parameter.
     * 
     * @param VariableDeclaration inDeclaration : variable waiting for its value
     * @return String : the expression getting the value of this variable
     */
    public String getJpa(VariableDeclaration inDeclaration) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        GelExpression initValue = inDeclaration.getInitValue();
        StringBuffer buffer = new StringBuffer();
        genericVisit(initValue, buffer);
        return buffer.toString();
    }


    //========================================================================//
    //            V I S I T S   O F   G E L   E X P R E S S I O N S           //
    //========================================================================//


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuffer buffer = (StringBuffer) inParameters[0];
        String indentation = (String) inParameters[1];
        buffer.append("\n");
        buffer.append(indentation);
        buffer.append(indentation);
        String jpaOperator = operators.get(inExpression.getClass());
        if (jpaOperator != null) {
            buffer.append("cb.");
            buffer.append(jpaOperator);
            buffer.append("(");
            boolean notTheFirstOne = false;
            for (GelExpression anExpression : inExpression.getOperand()) {
                if (notTheFirstOne) {
                    buffer.append(", ");
                }
                notTheFirstOne = true;
                genericVisit(anExpression, inParameters);
            }       // for anOperand
        }       // jpaOperator != null
        buffer.append(")");
        return inExpression;
    }


    public VariableDeclaration visitVariableDeclaration(VariableDeclaration inDeclaration, Object... inParameters) {
        StringBuffer buffer = (StringBuffer) inParameters[0];
        EteQuery query = (EteQuery) inParameters[2];
        if (inDeclaration == query.getTargetVariable()) {
            buffer.append("root");
        }
        else {
            String name = inDeclaration.getName();
            buffer.append(name);
        }
        return inDeclaration;
    }


    public Self visitSelf(Self inSelf, Object... inParameters) {
        StringBuffer buffer = (StringBuffer) inParameters[0];
        buffer.append("inFor");
        return inSelf;
    }


    public AttributeNav visitAttributeNav(AttributeNav inNav, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuffer buffer = (StringBuffer) inParameters[0];
        List<GelExpression> operand = inNav.getOperand();
        GelExpression firstOperand = operand.get(0);
        genericVisit(firstOperand, inParameters);
        buffer.append(".get");
        String name = inNav.getToFeature().getName();
        name = i2uc(name);
        buffer.append(name);
        buffer.append("$()");
        return inNav;
    }



    public Includes visitIncludes(Includes inIncludes, Object... inParameters) {
        return inIncludes;
    }

    
    //========================================================================//
    //
    //========================================================================//




    public String getIndentation() {
        return indentation;
    }



    //========================================================================//
    //========================================================================//


    private     String                  indentation;
    private     Map<Class, String>     operators;


}       // JpaGenerator
