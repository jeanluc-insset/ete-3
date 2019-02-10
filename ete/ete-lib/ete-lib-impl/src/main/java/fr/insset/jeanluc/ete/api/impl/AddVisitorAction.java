

package fr.insset.jeanluc.ete.api.impl;

import fr.insset.jeanluc.ete.api.Action;
import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import static fr.insset.jeanluc.ete.api.impl.ModelAction.ADD_VISITOR;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This action should be moved to ete-lib-impl project
 *
 * @author jldeleage
 */
public class AddVisitorAction extends ActionSupport {




    @Override
    public MofPackage preProcess(MofPackage inModel) {
        try {
            ModelAction parent             = (ModelAction) getParent();
            Class<?> visitorClass          = Class.forName((String) getParameter("class"));
            DynamicVisitorSupport  visitor = (DynamicVisitorSupport) visitorClass.newInstance();
            parent.addVisitor(visitor);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddVisitorAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AddVisitorAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AddVisitorAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inModel;
    }


}
