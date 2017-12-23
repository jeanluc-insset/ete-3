package fr.insset.jeanluc.el.evaluator;


import java.util.Map;


/**
 *
 * @author jldeleage
 */
public interface Evaluator {

    void addParameter(String inName, Object inValue);

    Object evaluate(String inExpression);
    
    default Object evaluate(String inExpression, Map<String, Object> parameters) {
        for (Map.Entry<String, Object> aParameter : parameters.entrySet()) {
            addParameter(aParameter.getKey(), aParameter.getValue());
        }
        return evaluate(inExpression);
    }

}
