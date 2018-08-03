package fr.insset.jeanluc.incremental.antlr.action;



import fr.insset.jeanluc.constraint.ConstraintReader;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.nl.impl.FrenchParserWrapper;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.FileNotFoundException;
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


    public  String          modelUrl        = "src/test/ete/models/model.xml";
    public  String          grammar         = "src/test/ete/GrammarParser.g4";
    public  String          constraintsUrl  = "src/test/ete/constraints.txt";
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
    public void testReadConstraints() throws FileNotFoundException {
        System.out.println("Read constraints");
        ConstraintReader instance = new ConstraintReader();
        instance.readConstraints(constraintsUrl, model, new FrenchParserWrapper());
    }


    //========================================================================//


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

