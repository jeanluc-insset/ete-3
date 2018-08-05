

package fr.insset.jeanluc.constraints_io;

import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author jldeleage
 */
public class ConstraintReader {

    public void readConstraints(String inFilePath, MofPackage inoutModel) throws FileNotFoundException {
        if (wrapper == null) {
            
        }
        String  content = readFile(inFilePath);
    }

    //========================================================================//


    protected String readFile(String inFilePath) throws FileNotFoundException {
        return new Scanner(new File(inFilePath)).useDelimiter("\\Z").next();
    }


    //========================================================================//


    private     ParserWrapper   wrapper;

}
