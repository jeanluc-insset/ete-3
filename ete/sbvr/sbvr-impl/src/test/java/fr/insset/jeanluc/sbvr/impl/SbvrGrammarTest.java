
package fr.insset.jeanluc.sbvr.impl;

import fr.insset.jeanluc.ete.gel.GenericExpression;
import fr.insset.jeanluc.ete.sbvr.SbvrParserWrapper;
import fr.insset.jeanluc.gel.test.fmwk.NavHelper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * All these tests are run against the english sbvr grammar.
 *
 * @author jldeleage
 */
public class SbvrGrammarTest {

    public SbvrGrammarTest() {
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

    @Test
    public void simpleGelExpressionTest() {
        System.out.println("simple gel expression test");
        testAny(null, "5+3");
    }

    @Test
    public void navigationExpressionTest() {
        System.out.println("navigation expression test");
        testAny(null, "The model of the certificates of the captain of a flight");
    }

    @Test
    public void expressionWithNavigationExpressionTest() {
        System.out.println("expression with navigation test");
        testAny(null, "The model of the certificates of the captain of the flight contains the model of the plane of the flight");
    }

    @Test
    public void definitionTest() {
        System.out.println("definition test");
        testAny(null, "Definition : a Pilot is certified for a PlaneModel : 6 + 5");
    }


    public void testAny(Object expectedResult, String inExpression) {
        SbvrParserWrapper wrapper = new SbvrParserWrapper();
        GenericExpression abstractTree = wrapper.buildAbstractTree(inExpression, null, null);
        System.out.println(abstractTree);
    }


}