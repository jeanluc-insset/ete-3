package fr.insset.jeanluc.gel.evaluation;

import fr.insset.jeanluc.ete.gel.*;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.FLOAT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.STRING_TYPE;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import static fr.insset.jeanluc.ete.meta.model.emof.MofProperty.MOF_PROPERTY;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage.MOF_PACKAGE;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jldeleage
 */
public class EvaluatorTest {
    

    private     static EteModel                    model;
    private     static MofClass                    contextualClass;
    private     static NamedElement                contextualElement;
    private     static Map<String, Object>         context;
    private     static Value                       firstAccount;
    private     static Value                       secondAccount;
    private     static MofProperty                 credit;
    private     static MofProperty                 number;
    private     static MofOperation                withdraw;
    
    private     static String                      creditPropertyName = "creditPropertyName";
    private     static String                      numberPropertyName = "number";



    public EvaluatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws InstantiationException, IllegalAccessException {
        Factories.init();
        // Registers default actions
//        InitStandardActions.init();
        // 1- The model
        model = (EteModel) FactoryRegistry.newInstance(MODEL);
        PrimitiveDataTypes.init(model);
        contextualClass = (MofClass) FactoryRegistry.newInstance(MOF_CLASS);
        MofPackage aPackage = (MofPackage) FactoryRegistry.newInstance(MOF_PACKAGE);
        aPackage.setName("mypackage");
        aPackage.addPackagedElement(contextualClass);
        contextualClass.setOwningPackage(aPackage);
        contextualClass.setName("Account");
        model.addElement(contextualClass);
        contextualElement = contextualClass;
        credit = (MofProperty) FactoryRegistry.newInstance(MOF_PROPERTY);
        credit.setName(creditPropertyName);
        MofType         floatType = (MofType) model.getElementByName(FLOAT_TYPE);
        credit.setType(floatType);
        contextualClass.addOwnedAttribute(credit);
        number = (MofProperty) FactoryRegistry.newInstance(MOF_PROPERTY);
        number.setName(numberPropertyName);
        MofType         stringType = (MofType) model.getElementByName(STRING_TYPE);
        number.setType(stringType);
        contextualClass.addOwnedAttribute(number);
        // Some tests can run with an operation as context
        withdraw = (MofOperation) FactoryRegistry.newInstance(MOF_OPERATION);
        withdraw.setName("withdraw");
        contextualClass.addOwnedOperation(withdraw);

        // 2- Some values
        context = new HashMap<>();
        firstAccount = new Value();
        firstAccount.setType(contextualClass);
        Double   creditValue = 325D;
        firstAccount.setValue(credit, creditValue);
        firstAccount.setValue(number, "0001");
        secondAccount = new Value();
        secondAccount.setType(contextualClass);
        creditValue = -192D;
        secondAccount.setValue(credit, creditValue);
        secondAccount.setValue(number, "002");
        context.put("first", firstAccount);
        context.put("second", secondAccount);
    }

    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws InstantiationException, IllegalAccessException {

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of evaluateAdd method, of class Evaluator.
     */
    @Test
    public void testEvaluateAdd() throws Exception {
        System.out.println("evaluate add");
        Add inAdd = null;
        GelEvaluator instance = new GelEvaluator();
        Object expResult = null;
        Object result = instance.eval(inAdd, null);
        assertEquals(expResult, result);
    }

    /**
     * Test of evaluateAnd method, of class Evaluator.
     */
//    @Test
//    public void testEvaluateAnd() throws Exception {
//        System.out.println("evaluateAnd");
//        And inAnd = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.eval(inAnd, null);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of evaluateArrow method, of class Evaluator.
     */
//    @Test
//    public void testEvaluateArrow() {
//        System.out.println("evaluateArrow");
//        Arrow inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateArrow(inExp, inParameters);
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of evaluateAtPre method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateAtPre() {
//        System.out.println("evaluateAtPre");
//        AtPre inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateAtPre(inExp, inParameters);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of evaluateBooleanLiteral method, of class Evaluator.
     */
//    @Test
//    public void testEvaluateBooleanLiteral() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        System.out.println("evaluateBooleanLiteral");
//        BooleanLiteral inExp = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.eval(inExp, null);
//        assertEquals(expResult, result);
//    }


//    /**
//     * Test of evaluateDateLiteral method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateDateLiteral() {
//        System.out.println("evaluateDateLiteral");
//        DateLiteral inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateDateLiteral(inExp, inParameters);
//        assertEquals(expResult, result);
//    }

//    /**
//     * Test of evaluateDifferent method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateDifferent() {
//        System.out.println("evaluateDifferent");
//        Different inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateDifferent(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateDiv method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateDiv() {
//        System.out.println("evaluateDiv");
//        Div inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateDiv(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateDot method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateDot() {
//        System.out.println("evaluateDot");
//        Dot inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateDot(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateEqual method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateEqual() {
//        System.out.println("evaluateEqual");
//        Equal inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateEqual(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateFloatingPointLiteral method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateFloatingPointLiteral() {
//        System.out.println("evaluateFloatingPointLiteral");
//        FloatingPointLiteral inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateFloatingPointLiteral(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateGreaterOrEqual method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateGreaterOrEqual() {
//        System.out.println("evaluateGreaterOrEqual");
//        GreaterOrEqual inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateGreaterOrEqual(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateGreaterThan method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateGreaterThan() {
//        System.out.println("evaluateGreaterThan");
//        GreaterThan inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateGreaterThan(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateIntegerLiteral method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateIntegerLiteral() {
//        System.out.println("evaluateIntegerLiteral");
//        IntegerLiteral inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateIntegerLiteral(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateLambda method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateLambda() {
//        System.out.println("evaluateLambda");
//        Lambda inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateLambda(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateLessOrEqual method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateLessOrEqual() {
//        System.out.println("evaluateLessOrEqual");
//        LessOrEqual inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateLessOrEqual(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateLessThan method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateLessThan() {
//        System.out.println("evaluateLessThan");
//        LessThan inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateLessThan(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateMinus method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateMinus() {
//        System.out.println("evaluateMinus");
//        Minus inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateMinus(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateMult method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateMult() {
//        System.out.println("evaluateMult");
//        Mult inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateMult(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateOpp method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateOpp() {
//        System.out.println("evaluateOpp");
//        Opp inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateOpp(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateOr method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateOr() {
//        System.out.println("evaluateOr");
//        Or inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateOr(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateSelf method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateSelf() {
//        System.out.println("evaluateSelf");
//        Self inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateSelf(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateStringLiteral method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateStringLiteral() {
//        System.out.println("evaluateStringLiteral");
//        StringLiteral inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateStringLiteral(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateVariableDefinition method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateVariableDefinition() {
//        System.out.println("evaluateVariableDefinition");
//        VariableDefinition inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateVariableDefinition(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of evaluateVariableReference method, of class Evaluator.
//     */
////    @Test
//    public void testEvaluateVariableReference() {
//        System.out.println("evaluateVariableReference");
//        VariableReference inExp = null;
//        Object[] inParameters = null;
//        GelEvaluator instance = new GelEvaluator();
//        Object expResult = null;
//        Object result = instance.evaluateVariableReference(inExp, inParameters);
//        assertEquals(expResult, result);
//    }
    

    //==========================================================================//



}
