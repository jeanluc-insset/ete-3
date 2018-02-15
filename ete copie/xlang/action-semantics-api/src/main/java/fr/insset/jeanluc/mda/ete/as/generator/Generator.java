package fr.insset.jeanluc.mda.ete.as.generator;



import fr.insset.jeanluc.ete.as.Statement;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import fr.insset.jeanluc.util.visit.DynamicVisitor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


/**
 *
 */
public interface Generator extends DynamicVisitor {


    public default void generate(List<Statement> inStatements, PrintWriter inoutTarget, String inIndentation) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (Statement  statement : inStatements) {
            genericVisit(statement, inoutTarget, inIndentation);
        }
    }


}