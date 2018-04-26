package fr.insset.jeanluc.ete.xlang.sample;



import fr.insset.jeanluc.action.semantics.builder.ConditionVisitor;
import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import static fr.insset.jeanluc.ete.api.Action.OUTPUT_BASE;
import static fr.insset.jeanluc.ete.api.ActionSupport.ACTION_READER;
import fr.insset.jeanluc.ete.api.EteException;
import static fr.insset.jeanluc.ete.api.impl.ModelAction.MODEL_READER;
import fr.insset.jeanluc.ete.api.impl.ProcessorAction;
import fr.insset.jeanluc.ete.api.impl.VelocityAction;
import fr.insset.jeanluc.ete.api.impl.io.XmlActionReader;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jldeleage
 */
public class BankTest {


    public final String     MODEL_PATH    = "src/main/mda/Bank.xml";
    public final String     SRC_DIR       = "target/test";


    public BankTest() {
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
     * Tests the malloc generation.
     */
//    @Test
    public void testBuilder() throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException, EteException {
        // 1-a initialize framework
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory(MODEL, EteModelImpl.class);
        registry.registerFactory(ACTION_READER, XmlActionReader.class);
        registry.registerFactory(MODEL_READER, XmlModelReader.class);

        // 1-b basic factories
        Factories.init();
        // 1-c custom factories

        // 2- run the processor
        ProcessorAction instance = new ProcessorAction("src/main/mda/ete-config.xml");
        instance.addParameter(OUTPUT_BASE, "target");
        instance.run();

        // 3- check results

    }

    /**
     * Sets a few environment parameters then calls the template.<br>
     * 
     * 
     * @param model
     * @param template
     * @param target
     * @throws EteException 
     */
//    protected void velocityAction(EteModel model, String template, String target) throws EteException {
//        VelocityAction    action = new VelocityAction();
//        action.setModel(model);
//        action.addParameter(BASE_DIR, "src/test/mda/c/");
//        action.addParameter("dialect", "fr.insset.jeanluc.xlang.to.c.CGenerator");
////        action.addParameter("output_base", "target/test/generated-sources/ete/");
//        action.addParameter("output_base", SRC_DIR);
//        action.addParameter("items", "${classes}");
//        action.addParameter("target", target);
//        String absolutePath = new File(".").getAbsolutePath();
//        System.out.println(absolutePath);
//        action.addParameter("template", template);
//        action.process(model);
//    }

}       // EnhancedPostConditionTest

