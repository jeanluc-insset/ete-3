package fr.insset.jeanluc.ete.meta.model.emof;


/**
 *
 * @author jldeleage
 */
public interface Literal {
    
    public final    String      LITERAL = "literal";

    public Object   getValue();
    public void     setValue(Object inValue);

}
