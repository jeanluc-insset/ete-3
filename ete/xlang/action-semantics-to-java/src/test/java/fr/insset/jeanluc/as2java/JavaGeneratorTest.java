package fr.insset.jeanluc.as2java;


// import fr.insset.jeanluc.action.semantics.builder.ActionSemanticsUtil;
import fr.insset.jeanluc.action.semantics.builder.ConditionVisitor;
import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.api.impl.VelocityAction;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.xlang.util.ActionSemanticsUtil;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.tools.Diagnostic;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Currently, the only test reads a model and generate classes from that
 * model.<br>
 * Then it compiles the resulting classes, instantiate one of them and call
 * one 
 * So it is "easy" to test different features only modifying the model and
 * adding matching calls.<br>
 * But we do not perform incremental testing : the test runs or fails as a
 * whole.
 * 
 * TODO : test each statement with hard coded tests.
 *
 * @author jldeleage
 */
public class JavaGeneratorTest {
    

    public final static String      FOLDER  = "fr/insset/jeanluc/ete";
    public final static String      PACKAGE = FOLDER.replace("/", ".");
    public final static String      INDENT  = "    ";


    public final String     MODEL_PATH = "../../../src/test/mda/models/full_MCQ.xml";


    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }



    /**
     * Test of the full process on a "real" model.
     */
    @Test
    public void testJavaGeneration() throws InstantiationException, IllegalAccessException, IOException, EteException {
        System.out.println("Java generation");

        // 1- initialize frameworks
        // 1-a basic factories
        Factories.init();
        // 1-b xlang factories
        ActionSemanticsUtil.init();

        // 2- read a model
        // 2-a prepare a reader
        XmlModelReader instance = new XmlModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        ConditionVisitor.enableActionSemantics(instance);
        // 2-b actually read
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel model = instance.readModel(MODEL_PATH);

        // 3- generate classes
        VelocityAction    action = new VelocityAction();
        action.setModel(model);
        action.addParameter(BASE_DIR, "src/test/mda/");
        JavaGenerator generator;
        action.addParameter("dialect", "fr.insset.jeanluc.as2java.JavaGenerator");
//        action.addParameter("output_base", "target/test/generated-sources/ete/");
        action.addParameter("output_base", "target/generated-test-sources/ete/");
        action.addParameter("items", "${classes}");
        action.addParameter("target", "${current.owningPackage.getQualifiedName().replace('::', '/').replace('.', '/')}/${current.name}.java");
        action.addParameter("template", "templates/pojo-with-operations.vm");
        action.process(model);

        // 4- check the result
        // 4-1 compile generated files
//        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
//        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
//        List<String> optionList = new ArrayList<String>();
//        optionList.add("-classpath");
//        optionList.add(System.getProperty("java.class.path") + ":dist/InlineCompiler.jar");

//        Iterable<? extends JavaFileObject> compilationUnit
//                        = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(helloWorldJava));
//                JavaCompiler.CompilationTask task = compiler.getTask(
//                    null, 
//                    fileManager, 
//                    diagnostics, 
//                    optionList, 
//                    null, 
//                    compilationUnit);
//        // 5-2 instantiate some classes
//        // 5-3 run an operation
//        if (task.call()) {
//            // Load and execute
//            System.out.println("Yipe");
//            // Create a new custom class loader, pointing to the directory that contains the compiled
//            // classes, this should point to the top of the package structure!
//            URLClassLoader classLoader = new URLClassLoader(new URL[]{new File("./").toURI().toURL()});
//            // Load the class from the classloader by name....
//            Class<?> loadedClass = classLoader.loadClass("testcompile.HelloWorld");
//            // Create a new instance...
//            Object obj = loadedClass.newInstance();
//            // Santity check
//            if (obj instanceof DoStuff) {
//                // Cast to the DoStuff interface
//                DoStuff stuffToDo = (DoStuff)obj;
//                // Run it baby
//                stuffToDo.doStuff();
//            }
//            //************************************************************************************************* Load and execute ** /
//        } else {
//            for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
//                System.out.format("Error on line %d in %s%n",
//                        diagnostic.getLineNumber(),
//                        diagnostic.getSource().toUri());
//            }
//        }       // task.call() not OK

//        fileManager.close();
    }       // testJavaGeneration method


/*
    @Test 
    public void newTest() {
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();

    StringWriter writer = new StringWriter();
    PrintWriter out = new PrintWriter(writer);
    out.println("public class HelloWorld {");
    out.println("  public static void main(String args[]) {");
    out.println("    System.out.println(\"This is in another java file\");");    
    out.println("  }");
    out.println("}");
    out.close();
    JavaFileObject file = new JavaSourceFromString("HelloWorld", writer.toString());

    Iterable<? extends JavaFileObject> compilationUnits = Arrays.asList(file);
    CompilationTask task = compiler.getTask(null, null, diagnostics, null, null, compilationUnits);

    boolean success = task.call();
    for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
      System.out.println(diagnostic.getCode());
      System.out.println(diagnostic.getKind());
      System.out.println(diagnostic.getPosition());
      System.out.println(diagnostic.getStartPosition());
      System.out.println(diagnostic.getEndPosition());
      System.out.println(diagnostic.getSource());
      System.out.println(diagnostic.getMessage(null));

    }
    System.out.println("Success: " + success);

    if (success) {
      try {

          URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { new File("").toURI().toURL() });
          Class.forName("HelloWorld", true, classLoader).getDeclaredMethod("main", new Class[] { String[].class }).invoke(null, new Object[] { null });

      } catch (ClassNotFoundException e) {
        System.err.println("Class not found: " + e);
      } catch (NoSuchMethodException e) {
        System.err.println("No such method: " + e);
      } catch (IllegalAccessException e) {
        System.err.println("Illegal access: " + e);
      } catch (InvocationTargetException e) {
        System.err.println("Invocation target: " + e);
      }
    }
  }
}
*/

/*
class JavaSourceFromString extends SimpleJavaFileObject {
  final String code;

  JavaSourceFromString(String name, String code) {
    super(URI.create("string:///" + name.replace('.','/') + Kind.SOURCE.extension),Kind.SOURCE);
    this.code = code;
  }

  @Override
  public CharSequence getCharContent(boolean ignoreEncodingErrors) {
    return code;
  }
}

*/

}


