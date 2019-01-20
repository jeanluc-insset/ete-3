    package fr.insset.jeanluc.action.semantics.builder;



import fr.insset.jeanluc.el.dialect.Dialect;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Includes;
import fr.insset.jeanluc.ete.gel.Literal;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.StringLiteral;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * <div>
 * As expected, this class builds an SQL query from an EteQuery instance.
 * </div>
 * 
 * @author jldeleage
 */
public class QueryToSql extends DynamicVisitorSupport implements Dialect {


    public QueryToSql() {
        // there methods build the where/and statements
        register("visit", "fr.insset.jeanluc.ete.gel");
    }


    //==========================================================================//


    public String addSelect(EteQuery inQuery, StringBuilder builder) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        MofProperty root = inQuery.getProperty();
        EnhancedMofClassImpl targetClass = (EnhancedMofClassImpl) root.getType().getRecBaseType();
        EteQuery query = targetClass.getSupport().get(root);
        builder.append("SELECT DISTINCT v0.* FROM ");
        builder.append(query.getTargetClass().getName().toUpperCase());
        builder.append(" AS v0");
        return builder.toString();
    }




    /**
     * If all parameters of a filter are present we must add the joins.<br>
     * 
     * @param inJoin
     * @param builder
     * @return 
     */
    public void addJoin(Join inJoin, StringBuilder builder) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        builder.append(" LEFT OUTER JOIN ");
        builder.append(inJoin.getTargetTable());
        builder.append(" AS ");
        builder.append(inJoin.getTargetVariable());
        builder.append(" ON ");
        builder.append(inJoin.getStartVariable());
        builder.append(".");
        builder.append(inJoin.getStartProperty());
        builder.append("=");
        builder.append(inJoin.getTargetVariable());
        builder.append(".");
        builder.append(inJoin.getTargetProperty());
    }





    protected void addWhere(EteFilter aFilter, StringBuilder builder, boolean firstClause, EteQuery inQuery) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (firstClause) {
            builder.append(" WHERE ");
        } else {
            builder.append("\n     AND ");
        }
        genericVisit(aFilter.getExpression(), builder, inQuery);
    }



    //==========================================================================//


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        StringBuilder builder = (StringBuilder) inParameters[0];
        List<GelExpression> operand = inExpression.getOperand();
        if (operand != null) {
            switch (operand.size()) {
                case 0:
                    System.out.println("noop");
                    return inExpression;
                case 1:
                    addSymbol(inExpression, builder);
                    genericVisit(operand.get(0), inParameters);
                    return inExpression;
                case 2:
                    genericVisit(operand.get(0), inParameters);
                    addSymbol(inExpression, builder);
                    genericVisit(operand.get(1), inParameters);
                    return inExpression;
            }
        }
        return inExpression;
    }


    protected void addSymbol(GelExpression inExpression, StringBuilder builder) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object symbol;
        Method method = inExpression.getClass().getMethod("getSymbol", new Class[0]);
        if (method == null) {
            symbol = inExpression.getValueOf("symbol");
        } else {
            symbol = method.invoke(inExpression, new Object[0]);
        }
        if (symbol != null) {
            builder.append(symbol);
        } else {
            builder.append(inExpression.getClass().getName());
        }
    }


    //==========================================================================//


    public GelExpression visitStep(Step inStep, Object... inParameters) {
        StringBuilder builder = (StringBuilder) inParameters[0];
        Feature toFeature = inStep.getToFeature();
        if (toFeature == null) {
            return inStep;
        }
        EteQuery query = (EteQuery) inParameters[1];
        VariableDefinition parameter = query.getParameter(inStep);
        if (parameter == null) {
            Step    previous = (Step)inStep.getOperand().get(0);
            parameter = query.getParameter(previous);
            builder.append(parameter.getName());
            builder.append(".");
            builder.append(toFeature.getName().toUpperCase());
        } else {
            builder.append(parameter.getName());
            builder.append(".ID");
        }
        return  inStep;
    }

    public Includes visitIncludes(Includes inIncludes, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuilder builder = (StringBuilder) inParameters[0];
        List<GelExpression> operand = inIncludes.getOperand();
        GelExpression firstOperand = operand.get(0);
        if (firstOperand.getType().isCollection()) {
            genericVisit(firstOperand, inParameters);
            builder.append("=");
            genericVisit(operand.get(1), inParameters);
        } else {
            genericVisit(operand.get(1), inParameters);
            builder.append(" IN ");
            genericVisit(firstOperand, inParameters);
        }
        return inIncludes;
    }

    public Self visitSelf(Self inSelf, Object... inParameters) {
        StringBuilder builder = (StringBuilder) inParameters[0];
        builder.append("v0.ID");
        return inSelf;
    }


    public VariableDefinition visitVariableDefinition(VariableDefinition inVariable, Object... inParameters) {
        StringBuilder builder = (StringBuilder) inParameters[0];
        builder.append(":");
        builder.append(inVariable.getName());
        return inVariable;
    }


    public Literal  visitLiteral(Literal inLiteral, Object... inParameters) {
        StringBuilder builder = (StringBuilder) inParameters[0];
        builder.append(inLiteral.getValue());
        return inLiteral;
    }

    public StringLiteral visitStringLiteral(StringLiteral inLiteral, Object... inParameters) {
        StringBuilder builder = (StringBuilder) inParameters[0];
        builder.append("'");
        builder.append(inLiteral.getValueAsString());
        builder.append("'");
        return inLiteral;
    }


}
