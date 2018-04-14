package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.AtPre;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.impl.PostconditionImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jldeleage
 */
public class EnhancedPostcondition extends PostconditionImpl implements EnhancedCondition, Postcondition {


    public EnhancedPostcondition() throws InstantiationException {
        statements = FactoryMethods.newList(Statement.class);
    }



    public MofProperty getDefinedProperty() {
        return definedProperty;
    }

    public void setDefinedProperty(MofProperty definedProperty) {
        this.definedProperty = definedProperty;
    }

    public List<MofProperty> getFinalUsedValues() {
        return finalUsedValues;
    }

    public void setFinalUsedValues(List<MofProperty> finalUsedValues) {
        this.finalUsedValues = finalUsedValues;
    }

    public List<MofProperty> getInitialUsedValues() {
        return initialUsedValues;
    }

    public void setInitialUsedValues(List<MofProperty> initialUsedValues) {
        this.initialUsedValues = initialUsedValues;
    }

    @Override
    public int compareTo(Postcondition inOther) {
        if (isResult()) {
            return 1;
        };
        if (! (inOther instanceof EnhancedPostcondition)) {
            return -1;
        }
        EnhancedPostcondition other = (EnhancedPostcondition) inOther;
        if (other.isResult()) {
            return -1;
        }

        if (other.getFinalUsedValues().contains(definedProperty)) {
            if (finalUsedValues.contains(other.getDefinedProperty())) {
                throw new RuntimeException("Circular definition in " + this.getSpecificationAsString()
                        + " between" + other.getDefinedProperty() + " and " + definedProperty);
            }
            return 1;
        }
        if (finalUsedValues.contains(other.getDefinedProperty())) {
            return -1;
        }
        // We don't care the order, should we ?
        // Maybe we can optimize the code using less auxiliary variables
        // Let's give a try
        if (initialUsedValues.contains(other.getDefinedProperty())) {
            return -1;
        }
        if (other.getInitialUsedValues().contains(definedProperty)) {
            return 1;
        }
        // OK, now we don't care, really.
        return 0;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean inResult) {
        this.result = inResult;
    }


    public GelExpression getExpression() {
        return expression;
    }

    public void setExpression(GelExpression expression) {
        this.expression = expression;
    }


    private     List<Statement>     statements;
    private     MofProperty         definedProperty;
    private     boolean             result;
    private     List<MofProperty>   finalUsedValues = new LinkedList<>();
    private     List<MofProperty>   initialUsedValues = new LinkedList<>();
    private     GelExpression       expression;



}
