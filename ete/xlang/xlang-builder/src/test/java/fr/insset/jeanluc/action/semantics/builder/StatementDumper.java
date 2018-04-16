

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.xlang.*;
import fr.insset.jeanluc.ete.gel.*;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class StatementDumper extends DynamicVisitorSupport {

    
    public void dumpModel(EteModel result) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        register("visit", "fr.insset.jeanluc.ete.xlang");
        register("visitGel", "fr.insset.jeanluc.ete.xlang");
        for (MofClass aClass : result.getClasses()) {
            for (MofOperation anOperation : aClass.getOwnedOperation()) {
                EnhancedMofOperation thisOperation = (EnhancedMofOperation) anOperation;
                List<Statement> body = thisOperation.getBody();
                StatementDumper dumper = new StatementDumper();
                String toString = dumper.toString(body);
                System.out.println("-------------------------------------------");
                System.out.println(aClass.getName() + "::" + anOperation.getName());
                System.out.println("begin");
                System.out.println(toString);
                System.out.println("end\n");
            }
        }
    }

    public String   toString(List<Statement> inStatements) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuilder   builder = new StringBuilder();
        int i = 1;
        for (Statement aStatement : inStatements) {
            if (i<100) {
                builder.append(' ');
            }
            if (i<10) {
                builder.append(' ');
            }
            builder.append(i);
            builder.append(' ');
            genericVisit(aStatement, builder);
            builder.append('\n');
            i++;
        }
        return builder.toString();
    }

    @Override
    public Object genericVisit(Object inVisited, Object... inParameter) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuilder builder = (StringBuilder) inParameter[0];
        builder.append(inVisited.getClass());
        builder.append('\n');
        return super.genericVisit(inVisited, inParameter); //To change body of generated methods, choose Tools | Templates.
    }


    public Assignment visitAssignment(Assignment inExp, Object... inParams) {
        GelExpression leftValue = inExp.getLeftValue();
        return inExp;
    }


    public fr.insset.jeanluc.ete.gel.Nav visitNav(Nav inNav, Object... inParams) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inNav.getOperand();
        StringBuilder builder = (StringBuilder) inParams[0];
        if (operand.size()>0) {
            genericVisit(operand.get(0), inParams);
            builder.append(".");
        }
        builder.append(inNav.getName());
        return inNav;
    }


}       // StatementDumper
