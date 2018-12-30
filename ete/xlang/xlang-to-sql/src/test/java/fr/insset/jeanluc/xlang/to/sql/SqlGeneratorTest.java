package fr.insset.jeanluc.xlang.to.sql;



import fr.insset.jeanluc.action.semantics.builder.ConditionVisitor;
import fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl;
import fr.insset.jeanluc.action.semantics.builder.EteFilter;
import fr.insset.jeanluc.action.semantics.builder.EteFilter;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.xmi.io.impl.XmiModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
import java.util.List;
import java.util.Map;
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
public class SqlGeneratorTest {
    
    public final String     MODEL_PATH    = "../../../samples/insset-airways/src/main/mda/Model.xml";
    public final String     SRC_DIR       = "target/";
//    public final String     TEMPLATES_DIR = "../../../src/main/mda/modules/c/";
    public final String     TEMPLATES_DIR = "src/test/mda/modules/c/";

    public SqlGeneratorTest() {
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
     * Test of getSql and getFilters methods, of class SqlGenerator.
     */
    @Test
    public void testGetSql() throws Exception {
        System.out.println("getSql");

        // 1- initialize framework
        // 1-a basic factories
        Factories.init();
        // 1-b custom factories

        // 2- prepare reader and its visitors
        XmiModelReader instance = new XmiModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        ConditionVisitor.enableActionSemantics(instance);

        // 3- read model. This call the condition visitor which builds
        // queries and filters in turn.
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel model = instance.readModel(MODEL_PATH);

        // 4- extract a query and its filters
        MofClass                flightClass = (MofClass)model.getElementByName("Flight");
        MofProperty             captainProp = flightClass.getOwnedAttribute("captain");
        EnhancedMofClassImpl    pilotClass  = (EnhancedMofClassImpl) model.getElementByName("Pilot");
        Map<MofProperty, List<EteFilter>> support = pilotClass.getSupport();
        List<EteFilter> queries = support.get(captainProp);
        EteFilter inQuery = queries.get(1);

        // 5- build SQL query and filters
        SqlGenerator sqlGenerator = new SqlGenerator();
        StringBuffer expResult = null;
        StringBuffer result = sqlGenerator.getSql(inQuery);
        System.out.println(result.toString());
//        assertEquals(expResult, result);
    }


    /**
     * Test of getFilter method, of class SqlGenerator.
     */
    @Test
    public void testGetFilter() {
        System.out.println("getFilter");
        EteFilter inFilter = null;
        boolean inFirstOne = false;
        SqlGenerator instance = new SqlGenerator();
        String expResult = "";
        String result = instance.getFilter(inFilter, inFirstOne);
        assertEquals(expResult, result);
    }


}
