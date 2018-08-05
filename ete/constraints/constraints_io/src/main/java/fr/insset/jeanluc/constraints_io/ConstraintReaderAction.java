

package fr.insset.jeanluc.constraints_io;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;

/**
 *
 * @author jldeleage
 */
public class ConstraintReaderAction extends ActionSupport {

    @Override
    public MofPackage postProcess(MofPackage inPackage) throws EteException {
        return super.postProcess(inPackage);
    }



}
