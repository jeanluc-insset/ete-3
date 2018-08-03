package fr.insset.jeanluc.incremental.antlr.action;



import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
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
public class IncrementalAntlrTest {


    public  String          modelUrl    = "src/test/ete/models/model.xml";
    public  String          grammar     = "src/test/ete/GrammarParser.g4";
    public  EteModel        model;


    public IncrementalAntlrTest() {
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
     * Test of run method, of class IncrementalAntlr.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        IncrementalAntlr instance = new IncrementalAntlr();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of readCustomGrammar method, of class IncrementalAntlr.
     */
    @Test
    public void testReadCustomGrammar() throws IOException, InterruptedException {
        System.out.println("readCustomGrammar");
        IncrementalAntlr instance = new IncrementalAntlr();
//        instance.readGrammar(grammar);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }


    /**
     * Test of readDefinitions method, of class IncrementalAntlr.
     */
    @Test
    public void testReadDefinitions() throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("readDefinitions");
        readModel();
        String inDefinitionsFilePath = "";
        IncrementalAntlr instance = new IncrementalAntlr();
        instance.readDefinitions(inDefinitionsFilePath, model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of readConstraints method, of class IncrementalAntlr.
     */
    @Test
    public void testReadConstraints() {
        System.out.println("readConstraints");
        String inConstraintsFilePath = "";
        IncrementalAntlr instance = new IncrementalAntlr();
        instance.readConstraints(inConstraintsFilePath, model);
    }


    protected void readModel() throws InstantiationException, IllegalAccessException, IOException {
        // 1- Initialize framework
        Factories.init();

        // 2- read the model
        XmlModelReader instance = new XmlModelReader();
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        model = instance.readModel(modelUrl, parent);
    }


}

