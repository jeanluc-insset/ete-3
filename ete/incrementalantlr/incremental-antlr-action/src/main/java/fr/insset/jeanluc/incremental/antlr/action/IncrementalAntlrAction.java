

package fr.insset.jeanluc.incremental.antlr.action;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;

/**
 * 
 *
 * @author jldeleage
 */
public class IncrementalAntlrAction extends ActionSupport {

    @Override
    public MofPackage postProcess(MofPackage inModel) throws EteException {
        String outputDir = (String) getParameter("outputDir", "target/tmp/");
        String definitionsFilePath = (String) getParameter("definitionsPath", "src/main/mda/Definitions.g");
        
        org.antlr.v4.Tool.main(new String[] {
            "-o",
            outputDir,
            definitionsFilePath
        });
        return super.postProcess(inModel); //To change body of generated methods, choose Tools | Templates.
    }



}
