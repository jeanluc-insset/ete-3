package fr.insset.jeanluc.xlang.to.sql;



import fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl;
import fr.insset.jeanluc.action.semantics.builder.EteFilter;
import fr.insset.jeanluc.action.semantics.builder.EteQuery;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class QueryToSql {

    //==========================================================================//
    //                              Q U E R I E S                               //
    //==========================================================================//

    public String getSql(MofProperty inRoot) {
        EnhancedMofClassImpl targetClass = (EnhancedMofClassImpl) inRoot.getType().getRecBaseType();
        EteQuery query = targetClass.getSupport().get(inRoot);
        return getSql(query);
    }

    public String   getSql(EteQuery inRoot) {
        int     numVar = 1;
        StringBuilder   builder = new StringBuilder("SELECT DISTINCT v0.* FROM ");
        builder.append(inRoot.getTargetClass().getName().toUpperCase());
        builder.append(" AS v0");
        for (Step aJoin : inRoot.getJoins()) {
            numVar = buildJoins(builder, aJoin, numVar);
        }
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




    protected void addJoinTable(StringBuilder inoutBuilder, int start, int end, String startName, String targetName, String propName) {
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
    //                              F I L T E R S                               //
    //==========================================================================//


    public String getFilter(EteFilter filter, boolean inFirstOne) {
        StringBuilder   builder = new StringBuilder();
        return builder.toString();
    }


}
