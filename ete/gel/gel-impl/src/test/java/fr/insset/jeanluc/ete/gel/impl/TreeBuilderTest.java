
package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
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
        String      helloWorld  = "\"hello world\"";
        StringLiteralImpl stringLiteralImpl = new StringLiteralImpl();
        
        stringLiteralImpl.setValueAsString(helloWorld);
        testAny(stringLiteralImpl,  helloWorld, null, null);
    }

    @Test
    public void testIntegerLiteral() {
        String      douze  = "12";
        IntegerLiteralImpl integerLiteralImpl = new IntegerLiteralImpl();
        
        integerLiteralImpl.setValueAsString(douze);
        testAny(integerLiteralImpl, douze, null, null);
    }

    @Test
    public void testFloatLiteral() {
        String      douze  = "12.0";
        FloatingPointLiteralImpl floatingPointLiteralImpl = new FloatingPointLiteralImpl();
        
        floatingPointLiteralImpl.setValueAsString(douze);
        testAny(floatingPointLiteralImpl, douze, null, null);
    }

    @Test
    public void testBooleanLiteral() {
        String      value  = "true";
        BooleanLiteralImpl booleanLiteralImpl = new BooleanLiteralImpl();
        booleanLiteralImpl.setValueAsString(value);
        testAny(booleanLiteralImpl, value, null, null);
    }


    //========================================================================//

    @Test
    public void testAddition() {
        
    }


    @Test
    public void testComplexExpression() {
        
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


}