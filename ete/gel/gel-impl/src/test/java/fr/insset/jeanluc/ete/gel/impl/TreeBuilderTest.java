
package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import static fr.insset.jeanluc.ete.gel.GelParser.IntegerLiteral;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
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


}

