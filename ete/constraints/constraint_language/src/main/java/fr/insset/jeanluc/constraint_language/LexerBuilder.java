package fr.insset.jeanluc.constraint_language;


import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;



/**
 * Generates a lexer and a parser based on the model.<br>
 * A token is created for each entity.<br>
 * Generates a parser as well. The parser
 *
 * @author jldeleage
 */
public class LexerBuilder {




    /**
     * Generates 
     * 
     * @param inName : name of the language
     * @param inModel : model providing the entities for the lexer
     * @param directoryName : directory where to put grammars into&nbsp; may be null
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException 
     */
    public void generateGrammars(String inName, MofPackage inModel, String directoryName) throws FileNotFoundException, UnsupportedEncodingException {
        if (directoryName == null) {
            directoryName = "target/tmp";
        }
        File    directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        inName = toUpperCaseInitial(inName);
        File    lexerFile = new File(directory, inName + "ModelLexer.g4");
        generateLexerGrammar(inName, inModel, new PrintWriter(new OutputStreamWriter(new FileOutputStream(lexerFile))));
        File    parserFile = new File(directory, inName + "ModelParser.g4");
        generateLexerGrammar(inName, inModel, new PrintWriter(new OutputStreamWriter(new FileOutputStream(parserFile))));
    }


    public void generateLexerGrammar(String inName, MofPackage inModel, PrintWriter writer) {
        // lexer grammar ${inName}ModelLexer;
        inName = toUpperCaseInitial(inName);
        writer.print("lexer grammar ");
        writer.print(inName);
        writer.println("ModelLexer;");
        writer.println();

        // import ${inName}Lexer;
        writer.print("import ");
        writer.print(inName);
        writer.println("Lexer;");
        writer.println();

        for (MofClass aClass : inModel.getAllClasses()) {
            // ${aClass.name} : '${aClass.name}' | '${aClass.name}';
            String  className = aClass.getName();
            String  withUpperCaseInitial = toUpperCaseInitial(className);
            String  withLowerCaseInitial = toLowerCaseInitial(className);
            writer.print(withUpperCaseInitial);
            writer.print(" : '");
            writer.print(withUpperCaseInitial);
            if (!withLowerCaseInitial.equals(withUpperCaseInitial)) {
                writer.print("' | '");
                writer.print(withLowerCaseInitial);
            }
            writer.println("';");
        }
        writer.println();
        writer.flush();
        writer.close();
    }


    //========================================================================//


    public void generateParserGrammar(String inName, MofPackage inModel, PrintWriter writer) {
        inName = toUpperCaseInitial(inName);
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
        writer.println("dummyRule : ;");

        writer.println();
        writer.flush();
        writer.close();
    }



    //========================================================================//


    public String toUpperCaseInitial(String inString) {
            return inString.substring(0,1).toUpperCase() + inString.substring(1);
    }

    public String toLowerCaseInitial(String inString) {
            return inString.substring(0,1).toLowerCase() + inString.substring(1);
    }

}
