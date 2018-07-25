package  fr.insset.jeanluc.ete.sbvr;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;



public interface ParserWrapper {

    public GelExpression buildAbstractTree(String inExpression, EteModel inModel, TypedElement inContextElement);

}


