package fr.insset.jeanluc.meta.model.io;


import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author jldeleage
 */
public interface ModelWriter {
    

    public  void    writeModel(MofPackage inModel, OutputStream inOutput) throws IOException;


}
