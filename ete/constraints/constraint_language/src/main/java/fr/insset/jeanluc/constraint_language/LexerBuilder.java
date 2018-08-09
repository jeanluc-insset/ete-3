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
 * Generates an Antlr4 lexer grammar based on the model.
 *
 * @author jldeleage
 */
public class LexerBuilder {


    public void generateLexerGrammar(String inName, MofPackage inModel, String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        int indexLastSlash = fileName.lastIndexOf(File.separator);
        if (indexLastSlash > 0) {
            String directoryPath = fileName.substring(0, indexLastSlash);
            File file = new File(directoryPath);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        generateLexerGrammar(inName, inModel, new FileOutputStream(fileName));
    }


    public void generateLexerGrammar(String inName, MofPackage inModel, OutputStream outputStream) throws UnsupportedEncodingException {
        generateLexerGrammar(inName, inModel, new OutputStreamWriter(outputStream, "UTF-8"));
    }


    public void generateLexerGrammar(String inName, MofPackage inModel, Writer writer) {
        generateLexerGrammar(inName, inModel, new PrintWriter(writer));
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


    public void generateParserGrammar(String inName, MofPackage inModel, String fileName) throws FileNotFoundException {
        int indexLastSlash = fileName.lastIndexOf(File.separator);
        if (indexLastSlash > 0) {
            String directoryPath = fileName.substring(0, indexLastSlash);
            File file = new File(directoryPath);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        generateParserGrammar(inName, inModel, new FileOutputStream(inName));
    }

    public void generateParserGrammar(String inName, MofPackage inModel, OutputStream file) {
        generateParserGrammar(inName, inModel, new OutputStreamWriter(file));
    }

    public void generateParserGrammar(String inName, MofPackage inModel, Writer inWriter) {
        generateParserGrammar(inName, inModel, new PrintWriter(inWriter));
    }

    public void generateParserGrammar(String inName, MofPackage inModel, PrintWriter writer) {
    }



    //========================================================================//


    public String toUpperCaseInitial(String inString) {
            return inString.substring(0,1).toUpperCase() + inString.substring(1);
    }

    public String toLowerCaseInitial(String inString) {
            return inString.substring(0,1).toLowerCase() + inString.substring(1);
    }

}
