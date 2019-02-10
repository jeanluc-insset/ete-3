package fr.insset.jeanluc.incremental.antlr.action;



import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * <div>
 * The purpose of this class is to read constraints in external file.
 * These constraints can be expressed in OCL or in a custom language.
 * </div>
 * 
 * <div>
 * The work of an instance of IncrementalAntlr is in three steps :
 * - first of all, it reads the grammar defining the custom language
 * - then it reads a definition file
 * - finally it reads a constraint file
 * </div>
 *
 * @author jldeleage
 */
public class IncrementalAntlr {


    public void run() {

    }




    /**
     * 
     * @param inDefinitionsFilePath
     * @param inModel 
     */
    public void readDefinitions(String inDefinitionsFilePath, MofPackage inModel) {
        
    }


    /**
     * 
     * 
     * @param inConstraintsFilePath
     * @param inoutModel 
     */
    public void readConstraints(String inConstraintsFilePath, MofPackage inoutModel) {
        
    }


    //========================================================================//


    public String getConstraintsFilePath() {
        return constraintsFilePath;
    }

    public void setConstraintsFilePath(String constraintsFilePath) {
        this.constraintsFilePath = constraintsFilePath;
    }

    public String getDefinitionsFilePath() {
        return definitionsFilePath;
    }

    public void setDefinitionsFilePath(String definitionsFilePath) {
        this.definitionsFilePath = definitionsFilePath;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public MofPackage getModel() {
        return model;
    }

    public void setModel(MofPackage model) {
        this.model = model;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }


    //========================================================================//


    protected String readFile(String inFilePath) throws FileNotFoundException {
        String content = new Scanner(new File("filename")).useDelimiter("\\Z").next();
        return content;
    }



    //========================================================================//


    private String      constraintsFilePath = "src/main/mda/models/constraints.xml";
    private String      definitionsFilePath = constraintsFilePath;
    private String      language  = "OCL";
    private String      outputDir = "target/tmp/";
    private MofPackage  model;

}


