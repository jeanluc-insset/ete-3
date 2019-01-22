package fr.insset.jeanluc.ete.meta.model.constraint;


import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;

/**
 *
 * @author jldeleage
 */
public interface Condition extends Constraint {


    @Override
    public MofOperation    getContext();
    public default void    setExpression(Object inExpression){
        
    }
    public default Object getExpression() {
        return null;
    }

}
