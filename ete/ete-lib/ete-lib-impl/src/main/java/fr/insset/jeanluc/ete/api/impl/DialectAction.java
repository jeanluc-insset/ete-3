

package fr.insset.jeanluc.ete.api.impl;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This action should be a subaction of a template action (currently a velocity
 * action)
 *
 * @author jldeleage
 */
public class DialectAction extends ActionSupport {


    public static final String  DIALECT_ACTION = "dialect-action";


    /**
     * Reads the class and name parameters then tries to give the parameter to
     * the parent action which should be a template action.
     * 
     * @param inModel
     * @return 
     */
    @Override
    public MofPackage preProcess(MofPackage inModel) {
        String  dialectName = null;
        String  dialectClassName = null;
        try {
            GenericTemplate template = (GenericTemplate) getParent();
            dialectClassName =(String) getParameter("class");
            dialectName = (String) getParameter("name");
            Class<?> forName = Class.forName(dialectClassName);
            Object dialectInstance = forName.newInstance();
            template.addParameter(dialectName, dialectInstance);
            Logger.getLogger(DialectAction.class.getName())
                    .log(Level.SEVERE, "The dialect {0} has been loaded", dialectClassName);
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException ex) {
            Logger.getLogger(DialectAction.class.getName())
                    .log(Level.SEVERE, "Unable to load the dialect " + dialectClassName, ex);
            throw new RuntimeException(ex);
        }
        return inModel;
    }


}
