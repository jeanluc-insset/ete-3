
package fr.insset.jeanluc.ete.sbvr.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.impl.GelParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.sbvr.SbvrExpression;
import fr.insset.jeanluc.ete.sbvr.SbvrParser;
import fr.insset.jeanluc.gel.test.fmwk.NavHelper;
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

    /**
     * Test of visitSbvrExpression method, of class TreeBuilder.
     */
//    @Test
    public void testVisitSbvrExpression() {
        System.out.println("visitSbvrExpression");
        SbvrParser.SbvrExpressionContext ctx = null;
        TreeBuilder instance = null;
        SbvrExpression expResult = null;
        SbvrExpression result = instance.visitSbvrExpression(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitFloatingPointLiteral method, of class TreeBuilder.
     */
//    @Test
    public void testVisitFloatingPointLiteral() {
        System.out.println("visitFloatingPointLiteral");
        SbvrParser.FloatingPointLiteralContext ctx = null;
        TreeBuilder instance = null;
        SbvrExpression expResult = null;
        SbvrExpression result = instance.visitFloatingPointLiteral(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitIntegerLiteral method, of class TreeBuilder.
     */
//    @Test
    public void testVisitIntegerLiteral() {
        System.out.println("visitIntegerLiteral");
        SbvrParser.IntegerLiteralContext ctx = null;
        TreeBuilder instance = null;
        SbvrExpression expResult = null;
        SbvrExpression result = instance.visitIntegerLiteral(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitStringLiteral method, of class TreeBuilder.
     */
//    @Test
    public void testVisitStringLiteral() {
        System.out.println("visitStringLiteral");
        SbvrParser.StringLiteralContext ctx = null;
        TreeBuilder instance = null;
        SbvrExpression expResult = null;
        SbvrExpression result = instance.visitStringLiteral(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitDateLiteral method, of class TreeBuilder.
     */
//    @Test
    public void testVisitDateLiteral() {
        System.out.println("visitDateLiteral");
        SbvrParser.DateLiteralContext ctx = null;
        TreeBuilder instance = null;
        SbvrExpression expResult = null;
        SbvrExpression result = instance.visitDateLiteral(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    /**
     * Test of visitBooleanLiteral method, of class TreeBuilder.
     */
//    @Test
    public void testVisitBooleanLiteral() {
        System.out.println("visitBooleanLiteral");
        SbvrParser.BooleanLiteralContext ctx = null;
        TreeBuilder instance = null;
        SbvrExpression expResult = null;
        SbvrExpression result = instance.visitBooleanLiteral(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    //========================================================================//


    @Test
    public void testLiteral() throws InstantiationException, IllegalAccessException {
        NavHelper   helper = new NavHelper();

        testAny(null, "5", null, null);
    }



    @Test
    public void testAdd() throws InstantiationException, IllegalAccessException {
        NavHelper   helper = new NavHelper();
        
        testAny(null, "5+3", null, null);
    }


    //========================================================================//


    protected void testAny(GelExpression expectedResult, String inExpression, EteModel inModel, TypedElement inContext) {
        GelExpression abstractGelExpression = GelParserWrapper.buildAbstractTree(inExpression, inModel, inContext);
        compare(expectedResult, abstractGelExpression);
    }



    private void compare(GelExpression expectedResult, GelExpression abstractGelExpression) {
        Class   expectedClass = expectedResult.getClass();
        Class   gottenClass   = abstractGelExpression.getClass();
        compareClasses(expectedClass, gottenClass);
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
        if (expectedResult instanceof fr.insset.jeanluc.ete.gel.impl.LiteralImpl) {
            assertTrue(abstractGelExpression instanceof fr.insset.jeanluc.ete.gel.impl.LiteralImpl);
            fr.insset.jeanluc.ete.gel.impl.LiteralImpl expectedLiteral = (fr.insset.jeanluc.ete.gel.impl.LiteralImpl) expectedResult;
            fr.insset.jeanluc.ete.gel.impl.LiteralImpl gottenLiteral   = (fr.insset.jeanluc.ete.gel.impl.LiteralImpl) abstractGelExpression;
            assertEquals(expectedLiteral.getValueAsString(), gottenLiteral.getValueAsString());
        } else if (expectedResult instanceof Step) {
            assertTrue(abstractGelExpression instanceof Step);
        }
    }


    public void compareClasses(Class expectedClass, Class gottenClass) {
        if (expectedClass.isInterface()) {
            
        }
        Class currentClass = gottenClass;
        while (currentClass != null) {
            if (expectedClass.equals(currentClass)) {
                return;
            }
            currentClass = currentClass.getSuperclass();
        }
        fail("Class " + gottenClass.getName() + " does not conform to " + expectedClass.getName());
    }


}