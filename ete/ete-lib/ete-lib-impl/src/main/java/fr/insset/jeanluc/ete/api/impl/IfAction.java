package fr.insset.jeanluc.ete.api.impl;


import fr.insset.jeanluc.el.evaluator.JSR341Evaluator;
import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.util.logging.Logger;


/**
 *
 * @author jldeleage
 */
public class IfAction extends ActionSupport {


    public final static String  IF_ACTION = "if-action";


    @Override
    public boolean shouldIProcess(MofPackage inModel) {
        JSR341Evaluator evaluator = new JSR341Evaluator(inModel, getAllParameters());
        
        Object test = getParameter("test");
        Logger logger = Logger.getGlobal();
        logger.fine("Test parameter of if : " + test);
        if (test instanceof Boolean) {
            logger.fine("The parameter is a boolean");
            return (Boolean)test;
        }
        boolean result;
        try {
            logger.fine("The parameter is not a boolean...");
            test = evaluator.evaluate((String)test);
            logger.fine("The result of the test is " + test);
            return Boolean.parseBoolean(test.toString());
        }
        catch (Exception e) {
            logger.fine("Exception dans if : " + e);
            return false;
        }
    }       // process

}       // If

