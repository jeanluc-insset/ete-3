package fr.insset.jeanluc.constraint_language;



import fr.insset.jeanluc.constraint_language.antlr4.AntlrRunner;
import fr.insset.jeanluc.constraint_language.tmp.FrenchModelParser;
import fr.insset.jeanluc.constraint_language.tmp.FrenchModelParserBaseVisitor;
import fr.insset.jeanluc.el.dialect.Dialect;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



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

    public void generateGrammars(String inName, MofPackage inModel,
                                String directoryName,
                                String inConstraintFile) throws FileNotFoundException, UnsupportedEncodingException, IOException, EteException, MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, NoSuchMethodException, InvocationTargetException {
        generateGrammars(inName, inModel, directoryName, inConstraintFile, "src/main/antlr4/imports");
    }

    /**
     * Generates the four grammars.
     * 
     * @param inName : name of the language
     * @param inModel : model providing the entities for the lexer
     * @param directoryName : directory where to put grammars into&nbsp; may be null
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException 
     */
    public void generateGrammars(String inName, MofPackage inModel,
                                String directoryName,
                                String inConstraintFile,
                                String inImportsDirectoryName) throws FileNotFoundException, UnsupportedEncodingException, IOException, EteException, MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        if (directoryName == null) {
            directoryName = "target/tmp";
        }
        File    directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        directory = new File(directory, "antlr4");
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
        AntlrRunner     runner = new AntlrRunner();
        runner.execute(directoryName + "/antlr4", "target/generated-sources/ete/", inImportsDirectoryName);

        // 3- Compile the Java classes
        GrammarWrapper compile = compile(inName + "Model", "target/tmp/",
                "target/tmp/classes/");

        // 4- Generate the actual grammars
        // 4-a move the model grammars to the lib directory in order to be
        //     imported
        File   modelLexerInImport = new File(inImportsDirectoryName);
        modelLexerInImport        = new File(modelLexerInImport, inName + "ModelLexer.g4");
        Files.move(modelLexer.toPath(), modelLexerInImport.toPath(), REPLACE_EXISTING);
        File   modelParserInImport = new File(inImportsDirectoryName);
        modelParserInImport        = new File(modelParserInImport, inName + "ModelParser.g4");
        Files.move(modelParser.toPath(), modelParserInImport.toPath(), REPLACE_EXISTING);

        // 4-b parses the constraint file to build the actual grammars
        Lexer lexer = null;
        String readFile = readFile(inConstraintFile);
        ANTLRInputStream input = new ANTLRInputStream(readFile);
        Constructor<? extends Lexer> lexerConstructor = compile.lexerClass.getConstructor(CharStream.class);
        lexer =  lexerConstructor.newInstance(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        Constructor<? extends Parser> parserConstructor = compile.parserClass.getConstructor(TokenStream.class);
        Parser parser = parserConstructor.newInstance(commonTokenStream);
        

        // 4-c- Create the actual grammars
        File    actualLexer = new File(directory, inName + "ActualLexer.g4");
        generateActualLexer(inName, inModel, inConstraintFile, new PrintWriter(new OutputStreamWriter(new FileOutputStream(actualLexer))));
        File    actualParser = new File(directory, inName + "ActualParser.g4");
        generateActualParser(inName, inModel, inConstraintFile, new PrintWriter(new OutputStreamWriter(new FileOutputStream(actualParser))));

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
        writer.println("options {");
        writer.print("    tokenVocab = ");
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
        writer.print("lexer grammar ");
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
        writer.println("options {");
        writer.print("    tokenVocab = ");
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
    protected void runAntlr(String inSourceDirectory, String inOutputDirectory, String inLibDirectory) throws EteException {
        AntlrRunner antlr = new AntlrRunner();
        antlr.execute(inSourceDirectory, inOutputDirectory, inLibDirectory);
    }


    /**
     * Compiles a Lexer and a Parser classes.<br>
     * 
     * @param inName : the name of the grammars to compile. Warning, the name
     * is  XxxModel or XxxActual where Xxx is the language name.
     * @param inSourceDirectory where the java files are.
     * @param inOutputDirectory where to put the classes files.
     * @return the Parser class
     * @throws java.net.MalformedURLException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    protected GrammarWrapper compile(String inName, String inSourceDirectory, String inOutputDirectory) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        inName = i2uc(inName);
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        List<String> optionList = new ArrayList<String>();
        optionList.add("-classpath");
        optionList.add(System.getProperty("java.class.path")
                + ":" + ""
                + ":" + "target/tmp/"
                + ":" + "../../gel/gel-impl/target/gel-impl-3.1.jar");

        File        lexerJava = new File(inSourceDirectory + inName + "Lexer.java");
        File        parserJava = new File(inSourceDirectory + inName + "Parser.java");
        Iterable<? extends JavaFileObject> compilationUnit
                        = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(lexerJava, parserJava));
        JavaCompiler.CompilationTask task = compiler.getTask(
                    null, 
                    fileManager, 
                    null, // diagnostics, 
                    optionList, 
                    null, 
                    compilationUnit);
        if (task.call()) {
            // 4-2 instantiate some classes
            // Load and execute
            System.out.println("Loading and compiling the files");
            // Create a new custom class loader, pointing to the directory that contains the compiled
            // classes, this should point to the top of the package structure!
            URLClassLoader classLoader = new URLClassLoader(
                    new URL[]{
                        new File(inSourceDirectory).toURI().toURL(),
                        new File(inOutputDirectory).toURI().toURL()
                    });
            // Load the classes from the classloader by name....
            Class lexerClass = classLoader.loadClass(inName + "Lexer");
            Class parserClass = classLoader.loadClass(inName + "Parser");
            // Create and return a fresh instance
            return new GrammarWrapper(lexerClass, parserClass);
        }
        return null;
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


    protected String readFile(String inFilePath) throws FileNotFoundException {
        String content = new Scanner(new File(inFilePath)).useDelimiter("\\Z").next();
        return content;
    }


    private         List<String>        keywords;
    private         List<List<String>>  signatures;


    //========================================================================//


    private class GrammarWrapper {

        public GrammarWrapper(Class lexerClass, Class parserClass) {
            this.lexerClass = lexerClass;
            this.parserClass = parserClass;
        }

        public Class<? extends Lexer>   lexerClass;
        public Class<? extends Parser>  parserClass;
    }       // GrammarWrapper


    /**
     * Creates functions in the model and adds keywords to the list.
     */
    private class DefinitionVisitor extends FrenchModelParserBaseVisitor {

        @Override
        public Object visitDefinitionSignature(FrenchModelParser.DefinitionSignatureContext ctx) {
            List<ParseTree> children = ctx.children;
            return super.visitDefinitionSignature(ctx); //To change body of generated methods, choose Tools | Templates.
        }

    }       // DefinitionVisitor


}           // LanguageBuilder
