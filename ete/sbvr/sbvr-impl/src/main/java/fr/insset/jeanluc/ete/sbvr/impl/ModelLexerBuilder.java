package fr.insset.jeanluc.ete.sbvr.impl;


import fr.insset.jeanluc.el.dialect.Dialect;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


/**
 * <div>
 * Creates an ANTLR4 lexer grammar from a model.<br>
 * The grammar defines a token for every identifier in the model.<br>
 * The creation is appended to an already open PrintWriter.
 * </div>
 * 
 *
 * @author jldeleage
 */
public class ModelLexerBuilder implements Dialect {


    public void buildLexer(MofPackage inModel, String inName, String inDirectory) throws IOException, InstantiationException {
        File directory = new File(inDirectory);
        if (! directory.exists()) {
            directory.mkdirs();
        }
        File file = new File(directory, inName + "Lexer.g4");
        PrintWriter pw = new PrintWriter(new FileWriter(file)); 
        pw.print("lexer grammar ");
        pw.print(inName);
        pw.println("Lexer;");
        pw.println();
        pw.println("import SbvrLexerGrammar.g4;");
        pw.println();
        addTokens(inModel, pw);
        pw.flush();
        pw.close();

        file = new File(directory, inName + "Parser.g4");
        pw = new PrintWriter(new FileWriter(file));
        pw.print("parser grammar ");
        pw.print(inName);
        pw.println("Parser;");
        pw.println();
        pw.println("import SbvrParserGrammar.g4;");
        pw.println();
        pw.flush();
        pw.close();
    }


    public void addTokens(MofPackage inModel, PrintWriter inoutTarget) throws InstantiationException {
        Collection<MofClass> allClasses = inModel.getAllClasses();
        Set<String>     identifiers = new HashSet<>();
        for (MofClass aClass : allClasses) {
            String      name = aClass.getName();
            identifiers.add(i2lc(name));
            for (MofProperty aProperty : aClass.getAllAttributes()) {
                name = aProperty.getName();
                identifiers.add(i2lc(name));
            }
        }
        for (String name : identifiers) {
            inoutTarget.print(name.toUpperCase());
            inoutTarget.print(" : '");
            inoutTarget.print(i2uc(name));
            inoutTarget.print("' | '");
            inoutTarget.print(i2lc(name));
            inoutTarget.print("';\n");            
        }
    }


    public void addRules(MofPackage inModel, PrintWriter inoutTarget) throws InstantiationException {
        
    }

}
