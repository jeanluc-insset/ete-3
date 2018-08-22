

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.constraint_language.antlr4.AntlrRunner;
import fr.insset.jeanluc.el.dialect.Dialect;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

/**
 * This class :<ul>
 * <li>creates a lexer and a parser grammars from a model</li>
 * <li>runs antlr4 against these grammars</li>
 * <li>creates a lexer and a parser grammars from a constraint file</li>
 * <li>runs antlr4 against these grammars</li>
 * <li>parses the constraint file with these grammars</li>
 * </ul>
 *
 * @author jldeleage
 */
public class LanguageBuilder implements Dialect {


    /**
     * Generates the four grammars.
     * 
     * @param inName : name of the language
     * @param inModel : model providing the entities for the lexer
     * @param directoryName : directory where to put grammars into&nbsp; may be null
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException 
     */
    public void generateGrammars(String inName, MofPackage inModel, String directoryName, String inConstraintFile) throws FileNotFoundException, UnsupportedEncodingException {
        AntlrRunner     runner = new AntlrRunner();
        if (directoryName == null) {
            directoryName = "target/tmp";
        }
        File    directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        inName = i2uc(inName);

        // 1- Parses the model to create the model grammars
        File    modelLexer = new File(directory, inName + "ModelLexer.g4");
        generateModelLexer(inName, inModel, new PrintWriter(new OutputStreamWriter(new FileOutputStream(modelLexer))));
        File    modelParser = new File(directory, inName + "ModelParser.g4");
        generateModelParser(inName, inModel, new PrintWriter(new OutputStreamWriter(new FileOutputStream(modelParser))));

        // 2- Run antlr on the model grammars to generate the Java classes

        // 3- Compile the Java classes

        // 4- Parses the constraint file to build the actual grammars

        File    actualLexer = new File(directory, inName + "ActualLexer.g4");
        generateActualLexer(inName, inModel, inConstraintFile, new PrintWriter(new OutputStreamWriter(new FileOutputStream(actualLexer))));
        File    actualParser = new File(directory, inName + "ActualParser.g4");
        generateActualParser(inName, inModel, inConstraintFile, new PrintWriter(new OutputStreamWriter(new FileOutputStream(actualParser))));

        // 3- Create the actual grammars

    }


    //========================================================================//
    //                      M O D E L   G R A M M A R S                       //
    //========================================================================//
    // These grammars contain the base language grammar and keywords from the //
    // model                                                                  //
    //========================================================================//


    public void generateModelLexer(String inName, MofPackage inModel, PrintWriter writer) {

        inName = i2uc(inName);
        writer.print("lexer grammar ");
        writer.print(inName);
        writer.println("ModelLexer;");
        writer.println();

        // import ${inName}Lexer;
        writer.print("import ");
        writer.print(inName);
        writer.println("Lexer;");
        writer.println();

        writeTokens(inModel, writer);

        writer.flush();
        writer.close();
    }


    //========================================================================//


    public void generateModelParser(String inName, MofPackage inModel, PrintWriter writer) {
        inName = i2uc(inName);
        writer.print("parser grammar ");
        writer.print(inName);
        writer.println("ModelParser;");
        writer.println();

        // import ${inName}Lexer;
        writer.print("import ");
        writer.print(inName);
        writer.println("Parser;");
        writer.println();
        writer.println("options (");
        writer.print("    tokenVocab: ");
        writer.print(inName);
        writer.println("ModelLexer;");
        writer.println("}");
        writer.println();
        writer.print("modelKeyWords : ");
        boolean     notTheFirstOne = false;
        for (MofClass aClass : inModel.getAllClasses()) {
            if (aClass.hasStereotype("ignore")) {
                continue;
            }
            if (notTheFirstOne) {
                writer.print(" | ");
            }
            notTheFirstOne = true;
            writer.print(aClass.getName().toUpperCase());
        }
        writer.println(";");

        writer.println();
        writer.flush();
        writer.close();
    }



    //========================================================================//
    //                     A C T U A L   G R A M M A R S                      //
    //========================================================================//
    // These grammars contain the previous ones and add keywords and functions//
    // from the constraint file                                               //
    //========================================================================//


    public void generateActualLexer(String inName, MofPackage inModel, String inConstraintFilePath, PrintWriter writer) {
        inName = i2uc(inName);
        writer.print("parser grammar ");
        writer.print(inName);
        writer.println("ActualLexer;");
        writer.println();

        // import ${inName}Lexer;
        writer.print("import ");
        writer.print(inName);
        writer.println("ModelLexer;");
        writer.println();

        writer.println();
        writer.flush();
        writer.close();
    }


    public void generateActualParser(String inName, MofPackage inModel, String inConstraintFilePath, PrintWriter writer) {
        inName = i2uc(inName);
        writer.print("parser grammar ");
        writer.print(inName);
        writer.println("ActualParser;");
        writer.println();

        // import ${inName}Parser;
        writer.print("import ");
        writer.print(inName);
        writer.println("Parser;");
        writer.println();
        writer.println("options (");
        writer.print("    tokenVocab: ");
        writer.print(inName);
        writer.println("ModelLexer;");
        writer.println("}");
        writer.println();
        writer.println("dummyRule : ;");

        writer.println();
        writer.flush();
        writer.close();
    }



    //========================================================================//
    //                           U T I L I T I E S                            //
    //========================================================================//


    /**
     * Builds the tokens file, the Lexer and Parser classes of a grammar,
     * running Antlr.
     */
    protected void runAntlr(String inSourceDirectory, String inOutputDirectory, String inLibDirectory) {
        AntlrRunner antlr = new AntlrRunner();
        antlr.execute(inSourceDirectory, inOutputDirectory, inLibDirectory);
    }

    /**
     * Compiles the Lexer and Parser classes.
     */
    protected void compile(String inSourceDirectory, String inOutputDirectory) {
        
    }



    protected void writeTokens(MofPackage inModel, PrintWriter writer) {
        ModelGeneratorDialect       dialect = new ModelGeneratorDialect() {};

        for (MofClass aClass : inModel.getAllClasses()) {
            String  className = aClass.getName();
            writer.print(className.toUpperCase());
            writer.print(" : ");
            List<List<String>> translate = dialect.translate(className);
            boolean    notFirstList = false;
            for (List<String> aList : translate) {
                if (notFirstList) {
                    writer.print(" | ");
                }
                notFirstList = true;
                for (String aString : aList) {
                    writer.print("'");
                    writer.print(aString);
                    writer.print("'");
                }
            }
            writer.println(";");
        }
        writer.println();
    }






}           // LanguageBuilder
