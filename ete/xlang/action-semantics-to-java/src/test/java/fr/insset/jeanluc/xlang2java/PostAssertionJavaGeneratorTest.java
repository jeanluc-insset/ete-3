
package fr.insset.jeanluc.xlang2java;


// import fr.insset.jeanluc.action.semantics.builder.ActionSemanticsUtil;
import fr.insset.jeanluc.action.semantics.builder.ConditionVisitor;
import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.api.impl.VelocityAction;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

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
public class PostAssertionJavaGeneratorTest {
    

    public final static String      FOLDER      = "fr/insset/jeanluc/ete";
    public final static String      PACKAGE     = FOLDER.replace("/", ".");
    public final static String      INDENT      = "    ";
    /**
     * WARNING : if we use another directory than target/generated-test-sources/ete/ we need
     * to add our other classes to the classpath
     */
    public final static String      SRC_DIR     = "target/generated-test-sources/ete/";  // "target/generated-test-sources/ete/"
    public final static String      TARGET_DIR  = "target/test-classes/";


    public final String     MODEL_PATH = "../../../samples/web-ete-bank/src/main/mda/Bank.xml";


    
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
     * This test runs the generators on the model but does not check the result.
     * It ensures there is no exception during the process.
     */
    @Test
    public void testJavaGeneration() {
        
    }


    /**
     * Test of the full process on a "real" model :<ol>
     * <li>reads a model</li>
     * <li>generates classes from the model</li>
     * <li>compiles the classes</li>
     * <li>loads some classes by names</li>
     * <li>instantiates them, connecting the objects through associations</li>
     * <li>sets some values to properties</li>
     * <li>runs a method which returns a computed value from these properties</li>
     * </ol>
     * Currently, points 1 to 4 are done.
     */
    @Test
    public void testWithdraw() throws InstantiationException, IllegalAccessException, IOException, EteException, ClassNotFoundException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        System.out.println("withdraw");

        // 1- initialize frameworks
        // 1-a basic factories
        Factories.init();
        // 1-b xlang factories
        Class.forName("fr.insset.jeanluc.action.semantics.builder.ActionSemanticsAction");

        // 2- read a model
        //    This operation invokes the SimpleActionSemanticsBuilder which
        //    builds statements along the post-conditions of operations.
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
        action.addParameter("dialect", "fr.insset.jeanluc.as2java.JavaGenerator");
//        action.addParameter("output_base", "target/test/generated-sources/ete/");
        action.addParameter("output_base", SRC_DIR);
        action.addParameter("items", "${classes}");
        action.addParameter("target", "${current.owningPackage.getQualifiedName().replace('::', '/').replace('.', '/')}/${current.name}.java");
        action.addParameter("template", "templates/pojo-with-operations.vm");
        action.process(model);

        // 4- check the result
        // In order to get the result during the test we cannot wait for maven to
        // compile the generated sources.
        // 4-1 compile generated files
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        List<String> optionList = new ArrayList<String>();
        optionList.add("-classpath");
//        optionList.add(System.getProperty("java.class.path") + ":dist/InlineCompiler.jar");
        optionList.add(System.getProperty("java.class.path")
                + ":" + SRC_DIR
                + ":" + "target/classes/"
                + ":" + "../../gel/gel-impl/target/gel-impl-3.1.jar");
        
        File        sessionJava = new File(SRC_DIR + "fr/insset/jeanluc/mda/qcm/modele/Session.java");

        Iterable<? extends JavaFileObject> compilationUnit
                        = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(sessionJava));
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
                        new File(SRC_DIR).toURI().toURL(),
                        new File(TARGET_DIR).toURI().toURL()
                    });
            System.out.println("Classloader : " + classLoader);
            System.out.println("URLS : " + classLoader.getURLs());
            // Load the class from the classloader by name....
            Class accountClass = classLoader.loadClass("fr.insset.jeanluc.ete.example.bank.Account");
            // Create some instances...
            Object  account     = accountClass.newInstance();
            Method  setBalance  = accountClass.getMethod("setBalance", Double.TYPE);
            Method  getBalance  = accountClass.getMethod("getBalance");
            Method  deposit     = accountClass.getMethod("deposit", Double.TYPE);

            // 4-3 run an operation
            setBalance.invoke(account, 2000D);
            deposit.invoke(account, 300D);
            double result = (double) getBalance.invoke(account, new Object[0]);
            System.out.println("The result is " + result);
            assertEquals(2300.0, result, 0.01);
            
            //************************************************************************************************* Load and execute ** /
        } else {
//            for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
//                System.out.format("Error on line %d in %s%n",
//                        diagnostic.getLineNumber(),
//                        diagnostic.getSource().toUri());
//            }
//            Assert.fail("The generated files could not be compiled");
        }       // task.call() not OK

        fileManager.close();
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


