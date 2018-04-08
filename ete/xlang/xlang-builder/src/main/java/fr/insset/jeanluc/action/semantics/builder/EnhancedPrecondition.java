

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.constraint.impl.PreconditionImpl;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class EnhancedPrecondition extends PreconditionImpl implements EnhancedCondition {


    public EnhancedPrecondition() throws InstantiationException {
        statements = FactoryMethods.newList(Statement.class);
    }


    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public GelExpression getExpression() {
        return gelExpression;
    }

    public void setExpression(GelExpression gelExpression) {
        this.gelExpression = gelExpression;
    }


    private     List<Statement>     statements;
    private     GelExpression       gelExpression;
}
