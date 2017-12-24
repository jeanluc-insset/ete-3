package fr.insset.jeanluc.ete.api.impl;


import fr.insset.jeanluc.el.evaluator.JSR341Evaluator;
import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;


/**
 *
 * @author jldeleage
 */
public class IfAction extends ActionSupport {


    public final static String  IF_ACTION = "if-action";


    @Override
    public boolean shouldIProcess(MofPackage inModel) {
        JSR341Evaluator evaluator = new JSR341Evaluator(inModel, getAllParameters());
        String test = (String) getParameter("test");
        boolean result;
        try {
            result = (Boolean)evaluator.evaluate(test);
            return result;
        }
        catch (Exception e) {
            return false;
        }
    }       // process

}       // If

