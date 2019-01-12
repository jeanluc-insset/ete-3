
package fr.insset.jeanluc.action.semantics.builder;



import static fr.insset.jeanluc.el.dialect.Dialect.DIALECT;
import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.api.impl.VelocityAction;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jldeleage
 */
public class FilterBuilderTest {


    public final String     MODEL_PATH    = "../../../samples/insset-airways/src/main/mda/Model.xml";
    public final String     TARGET_DIR    = "target/";
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
        // 4-a  "invariant support" : the (target properties) of the navigations
        // in the expression
        EnhancedMofClassImpl flightClass = (EnhancedMofClassImpl) result.getElementByName("Flight");
        List<Invariant> invariants = (List<Invariant>) flightClass.getInvariants();
        EnhancedInvariantImpl captainIsCertified = (EnhancedInvariantImpl) invariants.get(1);
        Collection<Step> invariantSupport = captainIsCertified.getSupport();
        for (Step aStep : invariantSupport) {
            MofProperty aProperty = (MofProperty) aStep.getToFeature();
            Step    root = aStep;
            do {
                List<GelExpression> operand = root.getOperand();
                if (operand == null) break;
                if (operand.size() == 0) break;
                GelExpression first = operand.get(0);
                if (first instanceof Self) break;
                root = (Step) first;
            } while (true);
            System.out.println("    "
                    + aProperty.getName() + ":" + aProperty.getType().getRecBaseType().getName()
                    + " in " + aProperty.getOwningMofClass().getName()
                    + " starting with " + root.getToFeature().getName());
        }

        // 4-b
        MofProperty captain = flightClass.getOwnedAttribute("captain");
        EnhancedMofClassImpl pilotClass = (EnhancedMofClassImpl) result.getElementByName("Pilot");
        Map<MofProperty, EteQuery> support = pilotClass.getSupport();
        EteQuery captainQuery = support.get(captain);
        QueryToSql  translator = new QueryToSql();
        StringBuilder builder = new StringBuilder();
        translator.addSelect(captainQuery, builder);
        for (EteFilter aFilter : captainQuery.getFilters()) {
            for (Join aJoin : aFilter.getJoins()) {
                translator.addJoin(aJoin, builder);
            }
        }
        boolean     firstOne = true;
        for (EteFilter aFilter : captainQuery.getFilters()) {
            translator.addWhere(aFilter, builder, firstOne, captainQuery);
            firstOne = false;
        }

        System.out.println("SQL : [[[\n" + builder.toString() + "\n]]]");
    }




    protected void velocityAction(EteModel model, String template, String target) throws EteException {
        VelocityAction    action = new VelocityAction();
        System.out.println(new File(".").getAbsolutePath());
        action.setModel(model);
        action.addParameter(BASE_DIR, "src/test/mda/");
        action.addParameter(DIALECT, "fr.insset.jeanluc.xlang.to.c.CGenerator");
//        action.addParameter("output_base", "target/test/generated-sources/ete/");
        action.addParameter("output_base", TARGET_DIR);
        action.addParameter("items", "${classes}");
        action.addParameter("target", target);
        String absolutePath = new File(".").getAbsolutePath();
        System.out.println(absolutePath);
        action.addParameter("template", TEMPLATES_DIR + template);
        action.process(model);
    }

}       // EnhancedPostConditionTest

