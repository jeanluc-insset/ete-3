
package fr.insset.jeanluc.action.semantics.builder;

import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.api.impl.VelocityAction;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.builder.BodyBuilder;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
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
//    public final String     TEMPLATES_DIR = "../../../src/main/mda/modules/c/";
    public final String     TEMPLATES_DIR = "src/test/mda/modules/c/";


    public IsNewTest() {
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
     * Tests whether an "isNew" OCL operation triggers the generation of the
     * matching "Allocation" statement.<br>
     * TODO
     * 
     * @throws InstantiationException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws IOException
     * @throws EteException 
     */
    @Test
    public void testIsNew() throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException, EteException, IllegalArgumentException, InvocationTargetException {
        // 1- initialize framework
        // 1-a basic factories
        Factories.init();
        // 1-b custom factories

        // 2- prepare reader and its visitors
        XmlModelReader instance = new XmlModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        ConditionVisitor.enableActionSemantics(instance);

        // 3- read model. This will call the condition visitor
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel result = instance.readModel(MODEL_PATH);

        // 4- check result
        MofClass formalLinkedListClass = (MofClass)result.getElementByName("FormalLinkedList");
        EnhancedMofOperationImpl addOperation = (EnhancedMofOperationImpl) formalLinkedListClass.getOwnedOperation("add");
        List<Statement> body = addOperation.buildBody();

        int     i=0;
        for (Statement aStatement : body) {
            if (i<10) System.out.print(" ");
            System.out.print(i++);
            System.out.print(" ");
            System.out.println(aStatement.getClass().getName());
        }
    }

    protected void velocityAction(EteModel model, String template, String target) throws EteException {
        VelocityAction    action = new VelocityAction();
        System.out.println(new File(".").getAbsolutePath());
        action.setModel(model);
        action.addParameter(BASE_DIR, "src/test/mda/");
        action.addParameter("dialect", "fr.insset.jeanluc.xlang.to.c.CGenerator");
//        action.addParameter("output_base", "target/test/generated-sources/ete/");
        action.addParameter("output_base", SRC_DIR);
        action.addParameter("items", "${classes}");
        action.addParameter("target", target);
        String absolutePath = new File(".").getAbsolutePath();
        System.out.println(absolutePath);
        action.addParameter("template", TEMPLATES_DIR + template);
        action.process(model);
    }

}       // EnhancedPostConditionTest

