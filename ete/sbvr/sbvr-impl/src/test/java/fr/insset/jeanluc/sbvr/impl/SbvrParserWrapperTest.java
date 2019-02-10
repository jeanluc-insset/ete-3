
package fr.insset.jeanluc.sbvr.impl;

import fr.insset.jeanluc.ete.gel.GenericExpression;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.sbvr.SbvrParserWrapper;
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
public class SbvrParserWrapperTest {

    public SbvrParserWrapperTest() {
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
     * Test of buildAbstractTree method, of class SbvrParserWrapper.
     */
    @Test
    public void testBuildAbstractTree() {
        System.out.println("buildAbstractTree");
        String inExpression = "";
        EteModel inModel = null;
        TypedElement inContextElement = null;
        SbvrParserWrapper instance = new SbvrParserWrapper();
        GenericExpression expResult = null;
        GenericExpression result = instance.buildAbstractTree(inExpression, inModel, inContextElement);
        assertEquals(expResult, result);
    }

    /**
     * Test of readExpressions method, of class SbvrParserWrapper.
     */
    @Test
    public void testReadExpressions() {
        System.out.println("readExpressions");
        String inExpressions = "";
        EteModel inoutModel = null;
        SbvrParserWrapper instance = new SbvrParserWrapper();
        instance.readExpressions(inExpressions, inoutModel);
    }

}