package fr.insset.jeanluc.ete.api.impl;



import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * Allow dynamic registration of action.<br>
 * A dynamically registered action can override another action already
 * registered.<br>
 * In turn, it can be overridden by a further registration.
 *
 * @author jldeleage
 */
public class RegisterAction extends ActionSupport {


    public final static String      REGISTER_ACTION = "register-action";


    public static void  register(String inActionName, String inClassName) {
        try {
            FactoryRegistry registry = FactoryRegistry.getRegistry();
            FactoryRegistry parent = registry.getParent();
            if (parent == null) {
                parent = registry;
            }
            parent.registerFactory(inActionName, Class.forName(inClassName));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterAction.class.getName())
                    .log(Level.SEVERE, "Unable to find the class " + inClassName, ex);
        }
    }


    @Override
    public MofPackage doProcess(MofPackage inModel) {
        String actionName = (String) getParameter("name");
        String className = (String) getParameter("action");
        register(actionName, className);
        return inModel;
    }


}

