
package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
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
public class BankTest {


    public final String     MODEL_PATH = "../../../samples/web-ete-bank/src/main/mda/Bank.xml";



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

    @Test
    public void testCompare() throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        // 1- initialize framework
        // 1-a basic factories
        Factories.init();
        // 1-b custom factories

        // 2- prepare reader and its visitors
        XmlModelReader instance = new XmlModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        ConditionVisitor.enableActionSemantics(instance);

        // 3- read model. This will call the condition visitor ; the condition
        // visitor is actually called for the conditions (preconditions and
        // postconditions) and the model. That last visit is supposer to build
        // the body of the operati ons
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel result = instance.readModel(MODEL_PATH);
        StatementDumper.dumpModel(result);

        // 4- let's build the statements of an operation of an operation
        // this should have been done by the visitor
        // 5- generate the resulting code

        // 6- check results

    }


}       // BankTest

