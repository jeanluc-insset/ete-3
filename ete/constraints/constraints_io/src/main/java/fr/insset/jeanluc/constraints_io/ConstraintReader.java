package fr.insset.jeanluc.constraints_io;


import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author jldeleage
 */
public class ConstraintReader {

    public void readConstraints(String inFilePath, EteModel inoutModel, ParserWrapper inLanguage) throws FileNotFoundException {
        if (wrapper == null) {
            
        }
        String  content = readFile(inFilePath);
        inLanguage.readExpressions(content, inoutModel);
    }

    //========================================================================//


    protected String readFile(String inFilePath) throws FileNotFoundException {
        return new Scanner(new File(inFilePath)).useDelimiter("\\Z").next();
    }


    //========================================================================//


    private     ParserWrapper   wrapper;

}
