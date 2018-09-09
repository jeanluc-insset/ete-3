
package fr.insset.jeanluc.constraint_language;

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
public class ModelGeneratorDialectTest {

    public ModelGeneratorDialectTest() {
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
     public void hello() {
        ModelGeneratorDialect dialect = new ModelGeneratorDialect() {};
        List<List<String>> translate = dialect.translate("aSmartPlaneModel");
        assertEquals("aSmartPlaneModel", translate.get(0).get(0));
        assertEquals("ASmartPlaneModel", translate.get(1).get(0));
        assertEquals("a", translate.get(2).get(0));
        assertEquals("smart", translate.get(2).get(1));
        assertEquals("plane", translate.get(2).get(2));
        assertEquals("model", translate.get(2).get(3));
     }

}