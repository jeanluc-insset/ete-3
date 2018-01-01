
package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GelParser;
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
        String      helloWorld  = "hello world";
        StringLiteralImpl stringLiteralImpl = new StringLiteralImpl();
        stringLiteralImpl.setValue(helloWorld);
//        testAny(stringLiteralImpl, helloWorld);
    }

    @Test
    public void testIntegerLiteral() {
        
    }

    @Test
    public void testFloatLiteral() {
        
    }

    @Test
    public void testBooleanLiteral() {
    }


    //========================================================================//


    protected void testAny(GelExpression expectedResult, String inExpression) {
        GelParser parser = GelParserWrapper.newParser(inExpression);
        GelParser.GelExpressionContext concreteGelExpression = parser.gelExpression();
        TreeBuilder builder = new TreeBuilder(null, null);
        GelExpression abstractGelExpression = builder.visit(concreteGelExpression);
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
    }


}