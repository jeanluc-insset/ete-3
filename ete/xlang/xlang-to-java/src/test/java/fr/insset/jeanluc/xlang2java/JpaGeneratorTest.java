
package fr.insset.jeanluc.xlang2java;



import fr.insset.jeanluc.action.semantics.builder.ConditionVisitor;
import fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl;
import fr.insset.jeanluc.action.semantics.builder.EteFilter;
import fr.insset.jeanluc.action.semantics.builder.EteQuery;
import fr.insset.jeanluc.as2java.JPAGenerator;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.builder.BodyBuilder;
import fr.insset.jeanluc.xlang.to.sql.SqlGenerator;
import fr.insset.jeanluc.xmi.io.impl.XmiModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author jldeleage
 */
public class JpaGeneratorTest {


    public final String     MODEL_PATH    = "../../../samples/insset-airways/src/main/mda/Model.xml";
    public final String     SRC_DIR       = "target/";
//    public final String     TEMPLATES_DIR = "../../../src/main/mda/modules/c/";
    public final String     TEMPLATES_DIR = "src/test/mda/modules/c/";


    public JpaGeneratorTest() {
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
    public void testParameterBuilder() throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException, EteException, IllegalArgumentException, InvocationTargetException {
        System.out.println("parameter builder");

        // 1- initialize framework
        // 1-a basic factories
        Factories.init();
        // 1-b custom factories

        // 2- prepare reader and its visitors
        XmiModelReader instance = new XmiModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        ConditionVisitor.enableActionSemantics(instance);

        // 3- read model. This will call the condition visitor
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel result = instance.readModel(MODEL_PATH);

        // 4- check result
        EnhancedMofClassImpl pilotClass = (EnhancedMofClassImpl) result.getElementByName("Pilot");
        EnhancedMofClassImpl flightClass = (EnhancedMofClassImpl) result.getElementByName("Flight");        
        MofProperty          captain = flightClass.getOwnedAttribute("captain");
        Map<MofProperty, EteQuery> support = pilotClass.getSupport();
        EteQuery eteQuery = support.get(captain);
        List<EteFilter> filters = eteQuery.getFilters();
        JPAGenerator    generator = new JPAGenerator();
        SqlGenerator      sql = new SqlGenerator();
    }

    @Test
    public void testPredicateBuilder() throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException, EteException, IllegalArgumentException, InvocationTargetException {
        System.out.println("predicate builder");

        // 1- initialize framework
        // 1-a basic factories
        Factories.init();
        // 1-b custom factories

        // 2- prepare reader and its visitors
        XmiModelReader instance = new XmiModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        ConditionVisitor.enableActionSemantics(instance);

        // 3- read model. This will call the condition visitor
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel result = instance.readModel(MODEL_PATH);

        // 4- build a predicate
        JPAGenerator    jpaGenerator = new JPAGenerator();
        SqlGenerator      sqlGenerator = new SqlGenerator();
        EnhancedMofClassImpl pilotClass = (EnhancedMofClassImpl) result.getElementByName("Pilot");
        EnhancedMofClassImpl flightClass = (EnhancedMofClassImpl) result.getElementByName("Flight");        
        MofProperty          captain = flightClass.getOwnedAttribute("captain");
        Map<MofProperty, EteQuery> support = pilotClass.getSupport();
        EteQuery aQuery = support.get(captain);
        EteFilter    aFilter = aQuery.getFilters().get(0);
        System.out.println(sqlGenerator.getSelect(aQuery));
        System.out.println(sqlGenerator.getJoin(aFilter));
        System.out.println(sqlGenerator.getWhere(aFilter, aQuery));
//        List<VariableDeclaration> variables = aQuery.getVariables();
        JPAGenerator    generator = new JPAGenerator();

        // 5- check result
    }



}       // EnhancedPostConditionTest

