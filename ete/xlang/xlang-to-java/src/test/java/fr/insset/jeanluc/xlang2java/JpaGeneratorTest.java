
package fr.insset.jeanluc.xlang2java;



import fr.insset.jeanluc.action.semantics.builder.ConditionVisitor;
import fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl;
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
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
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
        XmlModelReader instance = new XmlModelReader();
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
        Map<MofProperty, List<EteQuery>> support = pilotClass.getSupport();
        List<EteQuery> queries = support.get(captain);
        EteQuery    aQuery = queries.get(0);
        List<VariableDeclaration> variables = aQuery.getVariables();
        JPAGenerator    generator = new JPAGenerator();
        String jpa = generator.getPredicate(aQuery);
        System.out.println("Predicate : [" + jpa + "]");
        String checking = generator.addChecking((Step) variables.get(0).getInitValue());
        System.out.println("CHECKING : " + checking);
    }

    @Test
    public void testPredicateBuilder() throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException, EteException, IllegalArgumentException, InvocationTargetException {
        System.out.println("predicate builder");

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

        // 4- build a predicate
        EnhancedMofClassImpl pilotClass = (EnhancedMofClassImpl) result.getElementByName("Pilot");
        EnhancedMofClassImpl flightClass = (EnhancedMofClassImpl) result.getElementByName("Flight");        
        MofProperty          captain = flightClass.getOwnedAttribute("captain");
        Map<MofProperty, List<EteQuery>> support = pilotClass.getSupport();
        List<EteQuery> queries = support.get(captain);
        EteQuery    aQuery = queries.get(0);
        List<VariableDeclaration> variables = aQuery.getVariables();
        JPAGenerator    generator = new JPAGenerator();
        String predicate = generator.getPredicate(aQuery);

        // 5- check result
        System.out.println("Predicate : " + predicate);
//        assertEquals("\n                cb.notEqual(root, copilotInCrew1)", predicate);
    }



}       // EnhancedPostConditionTest

