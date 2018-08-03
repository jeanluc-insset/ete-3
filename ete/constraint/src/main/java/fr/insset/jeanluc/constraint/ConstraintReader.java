package fr.insset.jeanluc.constraint;


import fr.insset.jeanluc.ete.gel.GelExpression;
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


    /**
     * 
     */
    public void readConstraints(String inFilePath, EteModel inoutModel, ParserWrapper inLanguageWrapper) throws FileNotFoundException {
        String  content = readFile(inFilePath);
        GelExpression abstractTree = inLanguageWrapper.buildAbstractTree(content, inoutModel, null);
    }


    //========================================================================//


    protected String readFile(String inFilePath) throws FileNotFoundException {
        String content = new Scanner(new File(inFilePath)).useDelimiter("\\Z").next();
        return content;
    }


    //========================================================================//




}
