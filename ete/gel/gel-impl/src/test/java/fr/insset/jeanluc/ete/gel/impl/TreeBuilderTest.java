
package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.GelContext;
import fr.insset.jeanluc.ete.gel.GelExpression;
import static fr.insset.jeanluc.ete.gel.GelParser.IntegerLiteral;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.meta.model.io.ModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
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
public class TreeBuilderTest {


    public final String  url = "../../../src/test/mda/models/full_MCQ.xml";

    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public EteModel     model;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public MofClass     sessionClass;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public MofOperation computeMarkOperation;


    public TreeBuilderTest() {
    }

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

    //========================================================================//

    @Test
    public void testStringLiteral() {
        System.out.println("string literal");
        String      helloWorld  = "\"hello world\"";
        StringLiteralImpl stringLiteralImpl = new StringLiteralImpl();
        
        stringLiteralImpl.setValueAsString(helloWorld);
        testAny(stringLiteralImpl,  helloWorld, null, null);
    }

    @Test
    public void testIntegerLiteral() {
        System.out.println("integer literal");
        String      douze  = "12";
        IntegerLiteralImpl integerLiteralImpl = new IntegerLiteralImpl();        
        integerLiteralImpl.setValueAsString(douze);
        testAny(integerLiteralImpl, douze, null, null);
    }

    @Test
    public void testFloatLiteral() {
        System.out.println("float literal");
        String      douze  = "12.0";
        FloatingPointLiteralImpl floatingPointLiteralImpl = new FloatingPointLiteralImpl();
        
        floatingPointLiteralImpl.setValueAsString(douze);
        testAny(floatingPointLiteralImpl, douze, null, null);
    }

    @Test
    public void testBooleanLiteral() {
        System.out.println("boolean literal");
        String      value  = "true";
        BooleanLiteralImpl booleanLiteralImpl = new BooleanLiteralImpl();
        booleanLiteralImpl.setValueAsString(value);
        testAny(booleanLiteralImpl, value, null, null);
    }


    //========================================================================//

    @Test
    public void testAddition() {
        System.out.println("addition");
        AddImpl add = buildAdd(buildInt("12"), buildInt("20"));
        testAny(add, "12 + 20", null, null);
    }

    @Test
    public void testAdditions() {
        System.out.println("additions");
        AddImpl add = buildAdd(buildAdd(buildInt("12"), buildInt("20")), buildInt("8"));
        testAny(add, "12 + 20 + 8", null, null);
    }


    @Test
    public void testComplexExpression1() {
        System.out.println("complex 1");
        MultImpl    mult = buildMult(buildInt("12"), buildAdd(buildInt("20"), buildInt("7")));
        testAny(mult, "12 * (20 + 7)", null, null);
    }

    @Test
    public void testComplexExpression2() {
        System.out.println("complex 2");
        AddImpl    add = buildAdd(buildInt("12"), buildMult(buildInt("20"), buildInt("7")));
        testAny(add, "12 + 20 * 7", null, null);
    }


    //========================================================================//

    @Test
    public void testSimpleNavigation() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("simple navigation");
        readModel();
        List<Postcondition> allPostconditions = computeMarkOperation.getPostconditions();
        Postcondition postCondition = allPostconditions.get(0);
        String specificationAsString = postCondition.getSpecificationAsString();
        testAny(null, specificationAsString, model, computeMarkOperation);
    }




    //========================================================================//


    protected void testAny(GelExpression expectedResult, String inExpression, EteModel inModel, TypedElement inContext) {
        GelExpression abstractGelExpression = GelParserWrapper.buildAbstractTree(inExpression, inModel, inContext);
        compare(expectedResult, abstractGelExpression);
    }

    private void compare(GelExpression expectedResult, GelExpression abstractGelExpression) {
        Class   expectedClass = expectedResult.getClass();
        Class   gottenClass   = abstractGelExpression.getClass();
        assertEquals(expectedClass, gottenClass);
        List<GelExpression> expectedOperand = expectedResult.getOperand();
        List<GelExpression> gottenOperand = abstractGelExpression.getOperand();
        if (expectedOperand == null) {
            assertEquals(null, gottenOperand);
        }
        else {
            assertNotEquals(null, gottenOperand);
            assertEquals(expectedOperand.size(), gottenOperand.size());
            for (int i=0 ; i<expectedOperand.size() ; i++) {
                compare(expectedOperand.get(i), gottenOperand.get(i));
            }
        }
        if (expectedResult instanceof LiteralImpl) {
            assertTrue(abstractGelExpression instanceof LiteralImpl);
            LiteralImpl expectedLiteral = (LiteralImpl) expectedResult;
            LiteralImpl gottenLiteral   = (LiteralImpl) abstractGelExpression;
            assertEquals(expectedLiteral.getValueAsString(), gottenLiteral.getValueAsString());
        }
    }


    //========================================================================//


    public IntegerLiteralImpl   buildInt(String value) {
        IntegerLiteralImpl result = new IntegerLiteralImpl();
        result.setValueAsString(value);
        return result;
    }


    public AddImpl  buildAdd(GelExpression left, GelExpression right) {
        AddImpl     add = new AddImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(left);
        operands.add(right);
        add.setOperand(operands);
        return add;
    }


    public MultImpl buildMult(GelExpression left, GelExpression right) {
        MultImpl     mult = new MultImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(left);
        operands.add(right);
        mult.setOperand(operands);
        return mult;
    }

    //========================================================================//


    /**
     * Reads the standard test model
     */
    protected void  readModel() throws InstantiationException, IOException, IllegalAccessException {
        // 1- Initialize framework
        Factories.init();

        // 2- get the data
        XmlModelReader instance = new XmlModelReader();
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        model = instance.readModel(url, parent);
        sessionClass = (MofClass) model.getElementByName("Session");
        computeMarkOperation = sessionClass.getOwnedOperation("computeMark");
    }
    
    /**
     * Creates a simple context and adds variables "self" and "model".
     * 
     * @param inModel
     * @return 
     */
    protected GelContext    createContext(EteModel inModel) {
        GelContext  result = new GelContextImpl();
        
        MofClass    selfClass = (MofClass) inModel.getElementByName("MCQ");
        VariableDefinition  self = new VariableDefinitionImpl();
        self.setIdentifier("self");
        self.setValue(selfClass);
        result.set("self", self);

        VariableDefinition  model = new VariableDefinitionImpl();
        model.setIdentifier("model");
        result.set("model", model);

        return result;
    }

    protected void addVariable(GelContext inoutContext, String inName, Object inValue) {
        VariableDefinition  variable = new VariableDefinitionImpl();
        variable.setIdentifier(inName);
        variable.setValue(inValue);
        inoutContext.set(inName, variable);        
    }


}

