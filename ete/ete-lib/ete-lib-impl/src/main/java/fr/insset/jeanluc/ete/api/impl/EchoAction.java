package fr.insset.jeanluc.ete.api.impl;



import fr.insset.jeanluc.el.evaluator.JSR341Evaluator;
import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author jldeleage
 */
public class EchoAction extends ActionSupport {


    public final static String  ECHO_ACTION     = "echo-action";


    @Override
    public MofPackage doProcess(MofPackage inPackage) throws EteException {
        Element definition = (Element) this.getDefinition();
        Node    content = definition.getFirstChild();
        if (content != null) {
            String expression = content.getNodeValue();
            Object expressionValue = getValue(inPackage, expression);
            System.out.println(expressionValue);
        }
        return inPackage;
    }

    private Object getValue(MofPackage inPackage, Object inValue) {
        if (inValue == null) {
            return null;
        }
        if (inValue instanceof String) {
            JSR341Evaluator evaluator = new JSR341Evaluator(inPackage, getAllParameters());
            inValue = evaluator.evaluate((String)inValue);
        }
        return inValue;
    }

}
