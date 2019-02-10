

package fr.insset.jeanluc.ete.api.impl;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.meta.model.io.ModelWriter;
import java.io.File;

/**
 *
 * @author jldeleage
 */
public class OutputAction extends ActionSupport {

    @Override
    public MofPackage postProcess(MofPackage inPackage) throws EteException {
        Object parameter = this.getParameter("target");
        if (parameter == null) {
            return super.postProcess(inPackage);
        }
        File    file = new File(parameter.toString());
//        ModelWriter writer = new ModelWriter();
//        writer.writeModel(inPackage, file);
        return super.postProcess(inPackage); //To change body of generated methods, choose Tools | Templates.
    }

}
