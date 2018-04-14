

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class StatementDumper extends DynamicVisitorSupport {

    
    public static void dumpModel(EteModel result) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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
        int i = 0;
        for (Statement aStatement : inStatements) {
            genericVisit(aStatement, builder);
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



}       // StatemenetDumper
