

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.xlang.Statement;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public interface EnhancedCondition {

    public List<Statement>  getStatements();

    public GelExpression    getExpression();
    public void             setExpression(GelExpression inExpression);

}
