package fr.insset.jeanluc.ete.api.impl;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.meta.model.io.ModelWriter;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class DumpAction extends ActionSupport {


    public final static String      DUMP_ACTION = "dump-action";


    @Override
    public MofPackage postProcess(MofPackage inPackage) throws EteException {
        String filePath = (String) getParameter("file");
        int index = filePath.lastIndexOf('/');
        if (index > 0) {
            File dir = new File(filePath.substring(0, index));
            dir.mkdirs();
        }
        String format = (String) getParameter("format");
        if (format == null) {
            format = "text";
        }
        try (OutputStream output = new FileOutputStream(filePath)) {
            ModelWriter newInstance = (ModelWriter) FactoryRegistry.newInstance(format + "-writer");
            newInstance.writeModel(inPackage, output);
            return inPackage;
        } catch (IOException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DumpAction.class.getName()).log(Level.SEVERE, null, ex);
            throw new EteException(ex);
        }
    }       // postProcess


}
