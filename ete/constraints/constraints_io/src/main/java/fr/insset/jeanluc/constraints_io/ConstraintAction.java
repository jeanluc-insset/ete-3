

package fr.insset.jeanluc.constraints_io;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class ConstraintAction extends ActionSupport {

    @Override
    public MofPackage postProcess(MofPackage inPackage) throws EteException {
        try {
            String languageName = (String) getParameter("language");
            ParserWrapper language = (ParserWrapper) getParameter(languageName);
            ConstraintReader reader = new ConstraintReader();
            reader.readConstraints(BASE_DIR, (EteModel)inPackage, language);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConstraintAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.postProcess(inPackage);
    }

    


}
