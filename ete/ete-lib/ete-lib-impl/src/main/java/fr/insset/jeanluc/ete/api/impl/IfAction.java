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
        
        Object test = getParameter("test");
        System.out.println("Parametre test de if : " + test);
        if (test instanceof Boolean) {
            System.out.println("Le parametre est un booléen");
            return (Boolean)test;
        }
        boolean result;
        try {
            System.out.println("Le paramètre n'est pas un booléen...");
            test = evaluator.evaluate((String)test);
            System.out.println("Le résultat de test est " + test);
            return Boolean.parseBoolean(test.toString());
        }
        catch (Exception e) {
            System.out.println("Exception dans if : " + e);
            return false;
        }
    }       // process

}       // If

