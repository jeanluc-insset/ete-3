
package fr.insset.jeanluc.action.semantics.builder;



import static fr.insset.jeanluc.el.dialect.Dialect.DIALECT;
import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.api.impl.VelocityAction;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.xlang.Allocation;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.builder.BodyBuilder;
import fr.insset.jeanluc.xmi.io.impl.XmiModelReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReaderVisitor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jldeleage
 */
public class FilterBuilderTest {


    public final String     MODEL_PATH    = "../../../samples/insset-airways/src/main/mda/Model.xml";
    public final String     SRC_DIR       = "target/";
//    public final String     TEMPLATES_DIR = "../../../src/main/mda/modules/c/";
    public final String     TEMPLATES_DIR = "src/test/mda/modules/c/";


    public FilterBuilderTest() {
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
    public void testFilterBuilder() throws InstantiationException, ClassNotFoundException, IllegalAccessException, IOException, EteException, IllegalArgumentException, InvocationTargetException {
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
        EnhancedMofClassImpl flightClass = (EnhancedMofClassImpl) result.getElementByName("Flight");
        Collection<Invariant> invariants = flightClass.getInvariants();
        MofProperty captain = flightClass.getOwnedAttribute("captain");
        EnhancedMofClassImpl pilotClass = (EnhancedMofClassImpl) result.getElementByName("Pilot");
        Map<MofProperty, EteQuery> support = pilotClass.getSupport();
        EteQuery captainQuery = support.get(captain);
        QueryToSql  translator = new QueryToSql();
        String sql = translator.getSql(captainQuery);
        // We should get something like :
        /*
        SELECT DISTINCT v0.* FROM PILOT AS v0
            INNER JOIN PILOT_CERTIFICATE AS v1 ON v0.ID = v1.PILOT_ID
            INNER JOIN CERTIFICATE AS v2 ON v1.CERTIFICATES_ID = v2.ID
            INNER JOIN PLANEMODEL AS v3 ON v2.PLANEMODEL_ID = v3.ID
        WHERE v0.ID <> 105
            AND v3.ID = 101
        */
        // Currently, we get :
        /*
SELECT DISTINCT v0.* FROM PILOT AS v0
     INNER JOIN PILOT_CERTIFICATE AS v1 ON v0.ID=v1.PILOT_ID
     INNER JOIN CERTIFICATE AS v2 ON v2.ID=v1.CERTIFICATES_ID
     INNER JOIN PLANEMODEL AS v3 ON v3.ID=v2.PLANEMODEL_ID
        WHERE v0.ID <> 105
            AND v3.ID = 101
        */
        // We can see the following defaults :
        // 1- the numbering is wrong
        // 2- the conditions are not OK at all
        System.out.println("SQL : [[[ " + sql + " ]]]");
    }




    protected void velocityAction(EteModel model, String template, String target) throws EteException {
        VelocityAction    action = new VelocityAction();
        System.out.println(new File(".").getAbsolutePath());
        action.setModel(model);
        action.addParameter(BASE_DIR, "src/test/mda/");
        action.addParameter(DIALECT, "fr.insset.jeanluc.xlang.to.c.CGenerator");
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

