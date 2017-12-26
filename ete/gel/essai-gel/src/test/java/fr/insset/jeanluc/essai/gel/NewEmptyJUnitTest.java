
package fr.insset.jeanluc.essai.gel;

import static fr.insset.jeanluc.ete.api.Action.OUTPUT_BASE;
import fr.insset.jeanluc.ete.api.impl.ProcessorAction;
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
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void hello() throws InstantiationException, IllegalAccessException {
        System.out.println("run");

        ProcessorAction instance = new ProcessorAction("src/main/mda/ete-config.xml");
        instance.run();
    }

}