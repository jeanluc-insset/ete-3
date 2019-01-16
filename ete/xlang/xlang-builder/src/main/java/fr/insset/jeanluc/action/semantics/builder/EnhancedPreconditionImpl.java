

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
public class EnhancedPreconditionImpl extends PreconditionImpl implements EnhancedCondition {


    public EnhancedPreconditionImpl() throws InstantiationException {
        statements = FactoryMethods.newList(Statement.class);
    }


    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }



    @Override
    public Object getExpression() {
        return expression;
    }

    @Override
    public void setExpression(Object expression) {
        this.expression = expression;
    }


    private     List<Statement>     statements;
    private     Object              expression;

}
