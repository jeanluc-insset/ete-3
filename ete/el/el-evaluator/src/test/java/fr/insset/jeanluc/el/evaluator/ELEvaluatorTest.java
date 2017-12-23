package fr.insset.jeanluc.el.evaluator;



import fr.insset.jeanluc.el.dialect.BasicJavaDialect;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofClassImpl;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.MofPackageImpl;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author jldeleage
 */
public class ELEvaluatorTest {
    

    private     MofPackage          model;
    private     JSR341Evaluator         instance;
    private     MofPackage          sub1;           // in model
    private     MofPackage          sub2;           // in sub1
    private     MofPackage          sub3;           // in sub1
    private     MofClass            qcm;            // in model
    private     MofClass            question;       // in sub1
    private     MofClass            reponse;        // in sub1
    private     MofClass            choix;          // in sub2
    private     MofClass            etudiant;       // in sub3
    private     Map<String, Object> parameters;



    public ELEvaluatorTest() {
    }


    @BeforeClass
    public static void setUpClass() {
        Factories.init();
    }


    @AfterClass
    public static void tearDownClass() {
    }


    @Before
    public void setUp() throws EteException, InstantiationException, IllegalAccessException {
        try {
            model = (MofPackage) FactoryRegistry.newInstance(MODEL);
        } catch (InstantiationException ex) {
            Logger.getLogger(ELEvaluatorTest.class.getName()).log(Level.SEVERE, null, ex);
            throw new EteException(ex);
        }

        model.setName("model");
        sub1     = addPackage("sub1", model);
        sub2     = addPackage("sub2", sub1);
        sub3     = addPackage("sub3", sub1);
        qcm      = addClass("QCM", model);
        question = addClass("Question", sub1);
        reponse  = addClass("Reponse", sub1);
        choix    = addClass("Choix", sub2);
        etudiant = addClass("Etudiant", sub3);

        parameters = new HashMap<>();
        parameters.put("qcmClass", qcm);
        parameters.put("questionClass", question);
        parameters.put("choix", choix);

        instance = new JSR341Evaluator(model, parameters);
    }
    

    protected MofClass addClass(String inName, MofPackage inoutPackage) throws EteException, InstantiationException {
        MofClass    aClass = new MofClassImpl();
        aClass.setName(inName);
        inoutPackage.addPackagedElement(aClass);
        aClass.setOwningPackage(inoutPackage);
        return aClass;
    }


    protected MofPackage addPackage(String inName, MofPackage inoutPackage) throws EteException, InstantiationException {
        MofPackage    subPackage = new MofPackageImpl();
        subPackage.setName(inName);
        inoutPackage.addPackagedElement(subPackage);
        subPackage.setOwningPackage(inoutPackage);
        return subPackage;
    }



    @After
    public void tearDown() {
    }


    //========================================================================//


    /**
     * Test of evaluateBoolean method, of class ELEvaluator.
     */
    @Test
    public void testEvaluateBoolean() {
        System.out.println("evaluateBoolean");
        String inExpression = "${ true }";
        Boolean expResult = true;
        Object result = instance.evaluate(inExpression);
        assertEquals(expResult, result);
    }


    /**
     * Test of evaluateInt method, of class ELEvaluator.
     */
    @Test
    public void testEvaluateInt() {
        System.out.println("evaluate");
        Object expResult = 12L;
        Object result = instance.evaluate("${12}");
        assertEquals(expResult, result);
    }


    /**
     * Test of evaluateDouble method, of class ELEvaluator.
     */
    @Test
    public void testEvaluateDouble() {
        System.out.println("evaluateDouble");
        String inExpression = "${ 12.3 }";
        Double expResult = 12.3;
        Object result = instance.evaluate(inExpression);
        assertEquals(expResult, result);
    }


    /**
     * Test of evaluateString method, of class ELEvaluator.
     */
    @Test
    public void testEvaluateString() {
        System.out.println("evaluateString");
        String inExpression = "Hello world";
        String expResult = "Hello world";
        Object result = instance.evaluate(inExpression);
        assertEquals(expResult, result);
    }


    //------------------------------------------------------------------------//

    /**
     * Test of evaluate method, of class ELEvaluator, with a simple variable
     * access
     */
    @Test
    public void testEvaluateVariable() {
        System.out.println("evaluateVariable");
        String inExpression = "${qcmClass}";
        Object result = instance.evaluate(inExpression);
        assertEquals(qcm, result);
    }

    @Test
    public void testEvaluateContext() {
        System.out.println("evaluateContext");
        String inExpression = "${classes}";
        Object result = instance.evaluate(inExpression);
        
    }


    /**
     * Test of evaluate method, of class ELEvaluator, with a simple navigation
     */
    @Test
    public void testEvaluateNavigation() {
        System.out.println("evaluateNavigation");
        String inExpression = "${qcmClass.name}";
        Object result = instance.evaluate(inExpression);
        assertEquals("QCM", result);
    }


    @Test
    public void testEvaluationFunction() {
        System.out.println("evaluationFunction");
        String inExpression = "${questionClass.name.toUpperCase()}";
        Object result = instance.evaluate(inExpression);
        assertEquals("QUESTION", result);
    }


    @Test
    public void testEvaluationFunction2() throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("evaluationFunction2");
        String inExpression = "${questionClass.name.replace('u', 'w')}";
        Object result = instance.evaluate(inExpression);
        assertEquals("Qwestion", result);
    }

    //------------------------------------------------------------------------//


    @Test
    public void testDialect() {
        System.out.println("dialect");
        Object      dialect = new BasicJavaDialect();
        instance.addParameter("dialect", dialect);
        Object result = instance.evaluate("${dialect}");
        assertEquals(dialect, result);
    }


    @Test
    public void testQualifiedName() {
        System.out.println("dialect");
        Object      dialect = new BasicJavaDialect();
        instance.addParameter("dialect", dialect);
        Object result = instance.evaluate("${choix.getQualifiedName()}");
        assertEquals("model::sub1::sub2::Choix", result);        
    }

    @Test
    public void testDialectQualifiedName() {
        System.out.println("dialect");
        Object      dialect = new BasicJavaDialect();
        instance.addParameter("dialect", dialect);
        Object result = instance.evaluate("${dialect.getQualifiedName(choix)}");
        assertEquals("model.sub1.sub2.Choix", result);        
    }


}
