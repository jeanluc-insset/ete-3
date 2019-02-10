
package fr.insset.jeanluc.xlang2c;


import fr.insset.jeanluc.action.semantics.builder.ConditionVisitor;
import static fr.insset.jeanluc.el.dialect.Dialect.DIALECT;
import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.api.impl.VelocityAction;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.xlang.to.c.CGenerator;
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
public class IsNewTest {


    public final String     MODEL_PATH    = "../../../samples/linked_list/src/main/mda/FormalLinkedList.xml";
    public final String     SRC_DIR       = "target/";
    public final String     TEMPLATES_DIR = "src/test/mda/c/";


    public IsNewTest() {
    }

    @BeforeClass
    public static void setUpClass() throws InstantiationException {
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
    @Test
    public void testIsNew() throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException, EteException {
        // 1- initialize framework
        // 1-a basic factories
        Factories.init();
        // 1-b custom factories

        // 2- prepare reader and its visitors
        XmlModelReader instance = new XmlModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        ConditionVisitor.enableActionSemantics(instance);

        // 3- read model. This will call the condition visitor
        // The condition visitor parses the postconditions and generates the
        // ALF statements
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel result = instance.readModel(MODEL_PATH);

        // 4- sort the conditions of an operation
        // TODO

        // 5- generate the resulting code.
        velocityAction(result, "header.vm", "${current.name}.h");
        velocityAction(result, "implementation.vm", "${current.name}.c");

        // 6- check results

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
    protected void velocityAction(EteModel model, String template, String target) throws EteException, ClassNotFoundException, InstantiationException {
        VelocityAction    action = new VelocityAction();
        new CGenerator();
        action.setModel(model);
        action.addParameter(BASE_DIR, "src/test/mda/c/");
        action.addParameter(DIALECT, "fr.insset.jeanluc.xlang.to.c.CGenerator");
//        action.addParameter("output_base", "target/test/generated-sources/ete/");
        action.addParameter("output_base", SRC_DIR);
        action.addParameter("items", "${classes}");
        action.addParameter("target", target);
        String absolutePath = new File(".").getAbsolutePath();
        System.out.println(absolutePath);
        action.addParameter("template", template);
        action.process(model);
    }

}       // EnhancedPostConditionTest

