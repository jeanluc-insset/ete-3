

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.Equal;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GreaterThan;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.Conditional;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.impl.AssignmentImpl;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class CheckBuilder extends DynamicVisitorSupport {

    public CheckBuilder() {
        register("visit", "fr.insset.jeanluc.ete.gel");
        FactoryRegistry.getRegistry().registerDefaultFactory(Assignment.class, AssignmentImpl.class);
    }

    public void buildStatements(GelExpression inExpression, List<Statement> inoutStatements) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        // create an if statement of the form :
        // if not inExpression throw new Exception(...)
        Conditional condition = (Conditional) FactoryRegistry.newInstance(Conditional.class);
        condition.setCondition(inExpression);
        condition.setOperand(null);
        inoutStatements.add(condition);
    }


    //========================================================================//


    public Equal visitEqual(Equal inEqual, Object... inParameters) throws InstantiationException, IllegalAccessException {
        Logger      logger = Logger.getGlobal();
        logger.log(Level.FINE, "Visit of an equality");
        Conditional condition = (Conditional) FactoryRegistry.newInstance(Conditional.class);

        return inEqual;
    }

    public GreaterThan  visitGreaterThan(GreaterThan inGreaterThan, Object... inParameters) {
        return inGreaterThan;
    }


}
