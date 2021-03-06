package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.xmi.io.impl.XmiModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import static org.junit.Assert.assertEquals;



/**
 *
 * @author jldeleage
 */
public class BankTransferTest {


//    public final String     MODEL_PATH = "../../../src/test/mda/models/full_MCQ.xml";
    public final String     MODEL_PATH = "../../../samples/web-ete-bank/src/main/mda/Bank.xml";


    public BankTransferTest() {
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
     * Test of EnableActionSemantics method, of class ActionSemanticsOperationBuilder.
     */
    @Test
    public void testAnalysePostConditions() throws EteException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {

        // 1- initialize framework
        // 1-a basic factories
        Factories.init();
        // 1-b custom factories

        // 2- prepare reader and its visitors
        XmiModelReader instance = new XmiModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        ConditionVisitor.enableActionSemantics(instance);

        // 3- read model. This will call the visitor
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel result = instance.readModel(MODEL_PATH);

        // 4- check results
        MofClass accountClass                 = (MofClass)result.getElementByName("Account");
        MofClass customerClass                = (MofClass)result.getElementByName("Customer");
        List<MofOperation> ownedOperation     = customerClass.getOwnedOperation();
        EnhancedMofOperationImpl        transferOperation = (EnhancedMofOperationImpl) ownedOperation.get(0);
        List<Statement> body = transferOperation.getBody();
        System.out.println(transferOperation);
        System.out.println(body);
    }       // testEnableActionSemantics method


}       // ActionSemanticsOperationBuilder class
