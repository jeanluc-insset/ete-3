package  fr.insset.jeanluc.ete.sbvr;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;



public interface ParserWrapper {

    /**
     * Parses the expressions and builds the abstract tree.
     * There is no side effect on the model.
     */
    public GelExpression buildAbstractTree(String inExpression, EteModel inModel, TypedElement inContextElement);

    /**
     * Parses the expression and builds the abstract tree. That action may
     * trigger side effects on the model.
     */
    public void          buildAbstractTree(String inExpression, EteModel inoutModel);

}


