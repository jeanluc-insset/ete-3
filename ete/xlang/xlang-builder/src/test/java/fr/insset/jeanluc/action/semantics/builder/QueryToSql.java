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
 *
 * @author jldeleage
 */
public class QueryToSql extends DynamicVisitorSupport implements Dialect {


    public QueryToSql() {
        register("visit", "fr.insset.jeanluc.ete.gel");
    }


    public String getSql(MofProperty inRoot) {
        System.out.println("Generating SQL for property " + inRoot.getName());
        EnhancedMofClassImpl targetClass = (EnhancedMofClassImpl) inRoot.getType().getRecBaseType();
        EteQuery query = targetClass.getSupport().get(inRoot);
        return getSql(query, new StringBuilder());
    }

    public String   getSql(EteQuery inRoot, StringBuilder builder) {
        int     numVar = inRoot.getNextVariableNum();
        builder.append("SELECT DISTINCT v0.* FROM ");
        builder.append(inRoot.getTargetClass().getName().toUpperCase());
        builder.append(" AS v0 ");
        for (Step aJoin : inRoot.getJoins()) {
            numVar = buildJoins(builder, aJoin, numVar);
        }
        inRoot.setNextVariableNum(numVar);
        return builder.toString();
    }


    /**
     * Walks recursively to the "leaf" of the navigation (i.e.the "start" of
     * the navigation which should be self) and then builds joins.
     * 
     * @param builder : builder where the query is built
     * @param step : partial navigation to join
     * @param numVar : number of the variable to name the joined table
     * @return : next number to use for the variable
     */
    protected int buildJoins(StringBuilder builder, Step step, int numVar) {
        List<GelExpression> operand = step.getOperand();
        // NO : we must consider that some subnavigations can start from
        // other entity than the initial context
        if (operand == null) return 1;
        if (operand.size() == 0) return 1;
        GelExpression first = operand.get(0);
        if (first instanceof Self) return 1;
        // Let's first build previous joins
        numVar               = buildJoins(builder, (Step) first, numVar);
        // Now we build this step
        MofProperty property = (MofProperty) step.getToFeature();
        MofClass    srcClass = (MofClass) property.getOwningMofClass();
        String      srcName  = srcClass.getName().toUpperCase();
        String      name     = property.getName().toUpperCase();
        MofType     type     = property.getType();
        MofType     baseType = type.getRecBaseType();
        if (!(baseType instanceof MofClass)) {
            return numVar;
        }
        String typeName = baseType.getName().toUpperCase();
        if (type.isCollection()) {
            addJoinTable(builder, numVar-1, numVar,
                    srcName, typeName, name);
            numVar +=2 ;
        } else {
            addJoin(builder, numVar-1, numVar, typeName, name, false);
            numVar++;
        }
        return numVar;
    }



    protected void addWhere(StringBuilder builder, EteFilter aFilter, boolean firstClause) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (firstClause) {
            builder.append(" WHERE ");
        } else {
            builder.append("    AND ");
        }
        genericVisit(aFilter.getExpression(), builder);
    }


    protected void addJoinTable(StringBuilder inoutBuilder, int start, int end, String startName, String targetName, String propName) {
        System.out.println("Adding a join table from " + startName + " to " + targetName + " for property " + propName);
        String  betweenName = startName + "_" + targetName;
        addJoin(inoutBuilder, start, end, betweenName, startName, true);
        addJoin(inoutBuilder, end, end+1, targetName, propName, false);
    }


    /**
     * 
     * @param inoutBuilder : the builder where to build the joins
     * @param srcNumber : number of the variable associated to the table containing the foreign key
     * @param targetNumber : number of the variable associated to the table containing the primary key
     * @param joinTable : name of the table to join
     * @param propName  : name of... the property!
     */
    protected void addJoin(StringBuilder inoutBuilder, int srcNumber, int targetNumber, String joinTable, String propName, boolean reverseNumbers) {
        System.out.println("target:" + targetNumber + ", joinTable:" + joinTable);
        inoutBuilder.append(" LEFT JOIN ");
        inoutBuilder.append(joinTable);
        inoutBuilder.append(" AS v");
        inoutBuilder.append(targetNumber);
        if (reverseNumbers) {
            int aux = srcNumber;
            srcNumber = targetNumber;
            targetNumber = aux;
        }
        inoutBuilder.append(" ON v");
        inoutBuilder.append(targetNumber);
        inoutBuilder.append(".ID=v");
        inoutBuilder.append(srcNumber);
        inoutBuilder.append(".");
        inoutBuilder.append(propName);
        inoutBuilder.append("_ID");
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


    public GelExpression visitStep(Step inStep, Object... inParameters) {
        StringBuilder builder = (StringBuilder) inParameters[0];
        Feature toFeature = inStep.getToFeature();
        if (toFeature == null) {
            return inStep;
        }
        builder.append(toFeature.getName());
        builder.append(".ID");
        return  inStep;
    }

    public Includes visitIncludes(Includes inIncludes, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuilder builder = (StringBuilder) inParameters[0];
        List<GelExpression> operand = inIncludes.getOperand();
        genericVisit(operand.get(0), inParameters);
        builder.append(" contains ");
        genericVisit(operand.get(1), inParameters);
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
        builder.append(inLiteral.getValue());
        builder.append("'");
        return inLiteral;
    }


}
