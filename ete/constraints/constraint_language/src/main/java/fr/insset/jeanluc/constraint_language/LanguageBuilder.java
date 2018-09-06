package fr.insset.jeanluc.constraint_language;



import fr.insset.jeanluc.constraint_language.antlr4.AntlrRunner;
import fr.insset.jeanluc.el.dialect.Dialect;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.gel.GenericExpression;
import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
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
    public void generateGrammars(String inName,
                                MofPackage inModel,
                                String directoryName,
                                String inConstraintFile,
                                String inImportsDirectoryName) throws FileNotFoundException, UnsupportedEncodingException, IOException, EteException, MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        // 1- Prepare the temp directory and its sub directories
        if (directoryName == null) {
            directoryName = "target/tmp";
        }
        File    directory = getDirectory(new File("."), directoryName);
        directory = getDirectory(directory, "antlr4");

        // 2- Parse the model to create the model grammars
        //    This method generate the grammars, runs Antlr to generate the
        //    java classes and compile these classes. Finally, the method moves
        //    the generated grammars to the antlr4 lib directory
        GrammarWrapper compile = generateModelGrammars(inName, directory, inModel, directoryName, inImportsDirectoryName);
//        File    modelDirectory = getDirectory(directory, "model");
//        File    modelLexer = new File(modelDirectory, inName + "ModelLexer.g4");
//        generateModelLexer(inName, inModel, new PrintWriter(new OutputStreamWriter(new FileOutputStream(modelLexer))));
//        File    modelParser = new File(modelDirectory, inName + "ModelParser.g4");
//        generateModelParser(inName, inModel, new PrintWriter(new OutputStreamWriter(new FileOutputStream(modelParser))));
//
//        // 3- Run antlr on the model grammars to generate the Java classes
//        AntlrRunner     runner = new AntlrRunner();
//        runner.execute(directoryName + "/antlr4", "target/generated-sources/ete/", inImportsDirectoryName);
//
//        // 4- Compile the Java classes
//        GrammarWrapper compile = compile(inName + "Model", "target/generated-sources/ete/",
//                "target/classes/", "model");

        // 5- Generate the actual grammars
        // 5-a parse the constraint file to build the actual grammars
        parseModelGrammars(inConstraintFile, compile);

        // 5-b- Create the actual grammars
        generateActualGrammars(directory, inName, inModel, directoryName, inConstraintFile, inImportsDirectoryName);

        // 6 - run Antlr on the actual grammars

        // 7- compile the actual grammars and load the actual parser

        // 8- parse again the constraint file
    }


    //========================================================================//
    //                      M O D E L   G R A M M A R S                       //
    //========================================================================//
    // These grammars contain the base language grammar and keywords from the //
    // model                                                                  //
    // They are intented to parse the constraint file, recognizing DSL terms  //
    // as such.                                                               //
    //========================================================================//


    public GrammarWrapper generateModelGrammars(String inName, File directory, MofPackage inModel, String directoryName, String inImportsDirectoryName) throws FileNotFoundException, EteException, MalformedURLException, InstantiationException, ClassNotFoundException, IllegalAccessException, IOException {
        File    modelDirectory = getDirectory(directory, "model");
        File    modelLexer = new File(modelDirectory, "ModelLexer.g4");
        generateModelLexer(inName, inModel, new PrintWriter(new OutputStreamWriter(new FileOutputStream(modelLexer))));
        File    modelParser = new File(modelDirectory, "ModelParser.g4");
        generateModelParser(inName, inModel, new PrintWriter(new OutputStreamWriter(new FileOutputStream(modelParser))));

        // 3- Run antlr on the model grammars to generate the Java classes
        AntlrRunner     runner = new AntlrRunner();
        runner.execute(directoryName + "/antlr4", "target/generated-sources/ete/", inImportsDirectoryName);

        // 4- Compile the Java classes
        GrammarWrapper compile = compile("Model", "target/generated-sources/ete/",
                "target/classes/", "model");
        move(modelLexer, inImportsDirectoryName, "ModelLexer.g4");
        move(modelParser, inImportsDirectoryName, "ModelParser.g4");

        return compile;
    }


    public void generateModelLexer(String inName, MofPackage inModel, PrintWriter writer) {
        writer.print("lexer grammar ");
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
        writer.println("ModelParser;");
        writer.println();

        // import ${inName}Lexer;
        writer.print("import ");
        writer.print(inName);
        writer.println("Parser;");
        writer.println();
        writer.println("options {");
        writer.print("    tokenVocab = ");
        writer.println("ModelLexer;");
        writer.println("}");
        writer.println();
        writer.print("modelTerm : ");
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

        writer.println("definitionSignature: (modelTermGroup | keyword | navOperator | word)+;");
        writer.println("definitionBody : (modelTermGroup | keyword | navOperator | collectionOperator | word)+;");
        // Should we allow any operator in the expression as well ?
        writer.println("ruleBody : (modelTermGroup | keyword | navOperator | collectionOperator | word)+;");
        writer.println("initTerm : modelTermGroup;");

        writer.flush();
        writer.close();
    }


    protected void parseModelGrammars(String inConstraintFile, GrammarWrapper compile) throws FileNotFoundException, InstantiationException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ParserWrapper parserWrapper = new ParserWrapper() {
            @Override
            public GenericExpression buildAbstractTree(String inExpression, EteModel inModel, NamedElement inContextElement) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void readExpressions(String inExpressions, EteModel inoutModel) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };          // new ParserWrapper
        Parser parser = parserWrapper.getParser(inConstraintFile, compile.lexerClass, compile.parserClass);
        Method fileMethod = parser.getClass().getMethod("file", new Class[0]);
        ParserRuleContext file = (ParserRuleContext) fileMethod.invoke(parser);
        DefinitionVisitor definitionVisitor = new DefinitionVisitor();
        // Register the definitions and the new keywords they use
        // the 4th parameter is used to number variables
        definitionVisitor.genericVisit(file, keywords, signatures, 1);
        System.out.println("DEFINITION KEYWORDS :");
        for (String aString : keywords) {
            System.out.println("    - " + aString);
        }
        System.out.println("DEFINITIONS :");
        for (fr.insset.jeanluc.constraint_language.Definition aDefinition : definitionVisitor.getDefinitions()) {
            List<SignatureElement> signature = aDefinition.getSignature();
            System.out.print("   - ");
            for (SignatureElement anElement : signature) {
                System.out.print(anElement.getValue());
                System.out.print(" ");
            }
            System.out.println();
        }
    }



    //========================================================================//
    //                     A C T U A L   G R A M M A R S                      //
    //========================================================================//
    // These grammars contain the previous ones and add keywords and functions//
    // from the constraint file                                               //
    //========================================================================//


    public GrammarWrapper generateActualGrammars(File directory, String inName, MofPackage inModel, String directoryName, String inConstraintFileName, String inImportsDirectoryName) throws FileNotFoundException, EteException, MalformedURLException, InstantiationException, ClassNotFoundException, IllegalAccessException, IOException {
        File    actualDirectory = getDirectory(directory, "actual");
        File    actualLexer = new File(actualDirectory, "ActualLexer.g4");
        generateActualLexer(inName, inModel, inConstraintFileName, new PrintWriter(new OutputStreamWriter(new FileOutputStream(actualLexer))));
        File    actualParser = new File(actualDirectory, "ActualParser.g4");
        generateActualParser(inName, inModel, inConstraintFileName, new PrintWriter(new OutputStreamWriter(new FileOutputStream(actualParser))));

        // 3- Run antlr on the actual grammars to generate the Java classes
        AntlrRunner     runner = new AntlrRunner();
        runner.execute(directoryName + "/antlr4", "target/generated-sources/ete/", inImportsDirectoryName);

        // 4- Compile the Java classes
        GrammarWrapper compile = compile("Actual", "target/generated-sources/ete/",
                "target/classes/", "actual");
//        move(actualLexer, inImportsDirectoryName, inName + "ActualLexer.g4");
//        move(actualParser, inImportsDirectoryName, inName + "ActualParser.g4");

        return compile;
    }


    public void generateActualLexer(String inName, MofPackage inModel, String inConstraintFilePath, PrintWriter writer) {
        inName = i2uc(inName);
        writer.print("lexer grammar ActualLexer;");
        writer.println();

        // import ${inName}Lexer;
        writer.print("import ModelLexer;");
        writer.println();

        for (String aString : keywords) {
            writer.print(aString.toUpperCase());
            writer.print(" : ");
            writer.print(i2lc(aString));
            writer.println(";");
        }

        writer.println();
        writer.flush();
        writer.close();
    }


    public void generateActualParser(String inName, MofPackage inModel, String inConstraintFilePath, PrintWriter writer) {
        inName = i2uc(inName);
        writer.print("parser grammar ActualParser;");
        writer.println();

        // import ${inName}Parser;
        writer.print("import ModelParser;");
        writer.println();
        writer.println("options {");
        writer.print("    tokenVocab = ");
        writer.println("ActualLexer;");
        writer.println("}");
        writer.println();
        if (keywords.size() > 0) {
            writer.print("definitionKeywords : ");
            boolean  alreadyOne = false;
            for (String aString : keywords) {
                if (alreadyOne) {
                    writer.print(" | ");
                }
                writer.print(aString.toUpperCase());
            }
            writer.println(";");
        }

        writer.println();
        writer.flush();
        writer.close();
    }



    //========================================================================//
    //                           U T I L I T I E S                            //
    //========================================================================//


    protected File getDirectory(File inDirectory, String inName) {
        File result = new File(inDirectory, inName);
        if (!result.exists()) {
            result.mkdir();
        }
        return result;
    }


    /**
     * <div>
     * Moves a File to a directory.<br>
     * Creates the directory if it does not exist.
     * </div>
     * 
     * @param destination
     * @param inName
     * @param inKind : Lexer or Parser
     */
    protected void move(File inFileToMove, String destination, String inName) throws IOException {
        File   destinationDir = new File(destination);
        if (!destinationDir.exists()) {
            destinationDir.mkdir();
        }
        destinationDir        = new File(destinationDir, inName);
        Files.move(inFileToMove.toPath(), destinationDir.toPath(), REPLACE_EXISTING);
    }


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
    protected GrammarWrapper compile(String inName, String inSourceDirectory, String inOutputDirectory, String inPackageDirectory) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        inName = i2uc(inName);
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        List<String> optionList = new ArrayList<String>();
        optionList.add("-classpath");
        optionList.add(System.getProperty("java.class.path")
                + ":" + ""
                + ":" + "target/tmp/"
                + ":" + "../../gel/gel-impl/target/gel-impl-3.1.jar");

        File        sourceDirectory  = new File(inSourceDirectory);
        File        packageDirectory = new File(sourceDirectory, inPackageDirectory);
        File        lexerJava = new File(packageDirectory, inName + "Lexer.java");
        File        parserJava = new File(packageDirectory,inName + "Parser.java");
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
            String      packageName = inPackageDirectory.replace("/", ".");
            Class lexerClass = classLoader.loadClass(packageName + "." + inName + "Lexer");
            Class parserClass = classLoader.loadClass(packageName + "." + inName + "Parser");
            // Create and return a fresh instance
            return new GrammarWrapper(lexerClass, parserClass);
        }
        return null;
    }



    protected void writeTokens(MofPackage inModel, PrintWriter writer) {
        ModelGeneratorDialect       dialect = new ModelGeneratorDialect() {};

        for (MofClass aClass : inModel.getAllClasses()) {
            String  className = aClass.getName();
            String  ucClassName = className.toUpperCase();
            modelElts.put(ucClassName, aClass);
            writer.print(ucClassName);
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


    //========================================================================//


    protected String readFile(String inFilePath) throws FileNotFoundException {
        String content = new Scanner(new File(inFilePath)).useDelimiter("\\Z").next();
        return content;
    }


    //========================================================================//


    /**
     * Model keywords are registered to facilitate the actual parsing.
     */
    private     Map<String, MofClass>   modelElts   = new HashMap<>();

    /**
     * The words in a definition which are not language keyword nor model
     * keyword are added as "definition" keywords in the actual grammar.
     */
    private     Set<String>             keywords    = new HashSet<>();

    /**
     * Each definition is registered as a signature.<br>
     * The key of a signature is the name of the function. It is build from the
     * keywords of the definition.<br>
     * There is not overloading (the name strips the language and model keywords
     * off, keeping only anonymous placeholders).
     */
    private     Map<String, Definition>  signatures = new HashMap<>();


    //========================================================================//


    /**
     * A simple way to handle a lexer and a parser grammars at the same time.
     */
    private class GrammarWrapper {

        public GrammarWrapper(Class lexerClass, Class parserClass) {
            this.lexerClass = lexerClass;
            this.parserClass = parserClass;
        }

        public Class<? extends Lexer>   lexerClass;
        public Class<? extends Parser>  parserClass;
    }       // GrammarWrapper


    /*
     * Registers the signature and adds keywords to the list.
     */
/*
    private class DefinitionVisitor extends FrenchModelParserBaseVisitor {

        @Override
        public Object visitBusinessRule(FrenchModelParser.BusinessRuleContext ctx) {
            return null;
        }



        @Override
        public Object visitDefinitionSignature(FrenchModelParser.DefinitionSignatureContext ctx) {
            name = new StringBuilder();
            String      name = ctx.getText();
            return super.visitDefinitionSignature(ctx);
        }

        @Override
        public Object visitModelTerm(FrenchModelParser.ModelTermContext ctx) {
            return super.visitModelTerm(ctx);
        }

        @Override
        public Object visitKeyword(FrenchModelParser.KeywordContext ctx) {
            return super.visitKeyword(ctx);
        }

        @Override
        public Object visitWord(FrenchModelParser.WordContext ctx) {
            if (inSignature) {
                keywords.add(ctx.getText());
            }
            return super.visitWord(ctx);
        }



        protected void addElement(SignatureElement inElement) {
            
        }

        private boolean                 inSignature;
        private StringBuilder           name;
        private List<SignatureElement>  elements;

    }       // DefinitionVisitor
*/



    public static class Definition {
        private  ParserRuleContext  src;
        private  ParserRuleContext  body;
        private  List<ParseTree>    elements;

        public Definition(ParserRuleContext inSrc, ParserRuleContext inBody) {
            src = inSrc;
            body = inBody;
        }

    }       // Definition class

}           // LanguageBuilder class
