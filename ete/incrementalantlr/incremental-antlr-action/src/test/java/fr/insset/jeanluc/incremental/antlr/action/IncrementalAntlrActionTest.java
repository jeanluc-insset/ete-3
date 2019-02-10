package fr.insset.jeanluc.incremental.antlr.action;



import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.IOException;
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
public class IncrementalAntlrActionTest {


    public  String          modelUrl = "src/test/ete/models/model.xml";
    public  EteModel        model;


    public IncrementalAntlrActionTest() {
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
     * Test of preProcess method, of class IncrementalAntlrAction.
     */
    @Test
    public void testPreProcess() throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("preProcess : NOT TESTED YET");
        readModel();
    }


    protected void readModel() throws InstantiationException, IllegalAccessException, IOException {
        Factories.init();

        XmlModelReader xmlModelReader = new XmlModelReader();
        xmlModelReader.readModel(modelUrl);
    }


}