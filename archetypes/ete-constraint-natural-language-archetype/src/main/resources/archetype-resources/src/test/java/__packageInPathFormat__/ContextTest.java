
package ${package};

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.impl.AddImpl;
import fr.insset.jeanluc.ete.gel.impl.AndImpl;
import fr.insset.jeanluc.ete.gel.impl.AtPreImpl;
import fr.insset.jeanluc.ete.gel.impl.AttributeNavImpl;
import fr.insset.jeanluc.ete.gel.impl.AverageImpl;
import fr.insset.jeanluc.ete.gel.impl.BooleanLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.CollectImpl;
import fr.insset.jeanluc.ete.gel.impl.CollectionMethodNavImpl;
import fr.insset.jeanluc.ete.gel.impl.DateLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.DifferentImpl;
import fr.insset.jeanluc.ete.gel.impl.DivImpl;
import fr.insset.jeanluc.ete.gel.impl.EqualImpl;
import fr.insset.jeanluc.ete.gel.impl.ExcludesImpl;
import fr.insset.jeanluc.ete.gel.impl.FlatCollectImpl;
import fr.insset.jeanluc.ete.gel.impl.FlattenImpl;
import fr.insset.jeanluc.ete.gel.impl.FloatingPointLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.GreaterOrEqualImpl;
import fr.insset.jeanluc.ete.gel.impl.GreaterThanImpl;
import fr.insset.jeanluc.ete.gel.impl.IncludesImpl;
import fr.insset.jeanluc.ete.gel.impl.IntegerLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.IsNewImpl;
import fr.insset.jeanluc.ete.gel.impl.LambdaImpl;
import fr.insset.jeanluc.ete.gel.impl.LessOrEqualImpl;
import fr.insset.jeanluc.ete.gel.impl.LessThanImpl;
import fr.insset.jeanluc.ete.gel.impl.MethodNavImpl;
import fr.insset.jeanluc.ete.gel.impl.ModImpl;
import fr.insset.jeanluc.ete.gel.impl.MultImpl;
import fr.insset.jeanluc.ete.gel.impl.NotImpl;
import fr.insset.jeanluc.ete.gel.impl.OppImpl;
import fr.insset.jeanluc.ete.gel.impl.OrImpl;
import fr.insset.jeanluc.ete.gel.impl.ResultImpl;
import fr.insset.jeanluc.ete.gel.impl.SelectImpl;
import fr.insset.jeanluc.ete.gel.impl.SelfImpl;
import fr.insset.jeanluc.ete.gel.impl.StringLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.SubImpl;
import fr.insset.jeanluc.ete.gel.impl.SumImpl;
import fr.insset.jeanluc.ete.gel.impl.VariableDefinitionImpl;
import fr.insset.jeanluc.ete.gel.impl.VariableReferenceImpl;
import fr.insset.jeanluc.ete.gel.impl.XorImpl;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofSequenceImpl;
import fr.insset.jeanluc.gel.test.fmwk.NavHelper;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ${package}.impl.${artifactIdI2uc}ParserWrapper;
import ${package}.impl.MofContext;

/**
 *
 * @author jldeleage
 */
public class ContextTest {

    public static final String  url = "src/test/mda/Compagnie_aerienne.xml";

    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public static EteModel     model;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    private static MofClass     accountClass;
    private static MofClass     customerClass;
    private static MofClass     flightClass;
    private static MofClass     pilotClass;
    private static MofClass     certificateClass;
    private static MofClass     planeClass;
    private static MofClass     planeModelClass;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    private static MofOperation withdraw;
    private static MofOperation deposit;
    private static MofOperation transfer;

    private static MofProperty  accounts;


    public ContextTest() {
    }

    @BeforeClass
    public static void setUpClass() throws InstantiationException, IOException, IllegalAccessException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory("self", SelfImpl.class);
        registry.registerFactory("collect", CollectImpl.class);
        registry.registerFactory("sequence", MofSequenceImpl.class);
        registry.registerFactory("attribute_nav", fr.insset.jeanluc.ete.gel.impl.AttributeNavImpl.class);
        registry.registerFactory("@pre", AtPreImpl.class);
        registry.registerFactory("flatten", FlattenImpl.class);
        registry.registerFactory("variable_reference", VariableReferenceImpl.class);
        readModel();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        init();
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testSelf() throws InstantiationException, IllegalAccessException {
        System.out.println("context : resolution of self");
        NavHelper navHelper = new NavHelper();
        Step navigation = navHelper.startFrom(model, deposit).getNavigation();
        testAny(navigation, "self", deposit, model);
    }


    /**
     * The ContextTest class can only test simple navigations.<br>
     * A complex navigation is handled by the TreeBuilder itself.
     * 
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    @Test
    public void testSimpleNavigation() throws InstantiationException, IllegalAccessException {
        System.out.println("context : resolution of simple navigation");
        NavHelper navHelper = new NavHelper();
        Step navigation = navHelper.startFrom(model, deposit).navigateTo("solde").getNavigation();
        testAny(navigation, "solde", deposit, model);
    }


    @Test
    public void testParameter() throws InstantiationException, IllegalAccessException {
        System.out.println("context : resolution of parameter - NOT TESTED");
//        NavHelper navHelper = new NavHelper();
//        Step navigation = navHelper.startFrom(model, deposit).navigateTo("montant").getNavigation();
//        testAny(navigation, "montant", deposit, model);
    }


    @Test
    public void testOperation() {
        System.out.println("context : operation - NOT TESTED");
    }


    //========================================================================//


    protected void testAny(GelExpression expectedResult, String inExpression, TypedElement inContext, EteModel inModel) {
        MofContext  context = new MofContext(inContext, inModel);
        try {
            GelExpression resolve = context.resolve(inExpression);
            compare(expectedResult, resolve);
        } catch (InstantiationException ex) {
            fail(ex.getMessage());
        } catch (IllegalAccessException ex) {
            fail(ex.getMessage());
        }
    }



    protected void compare(GelExpression exp1, GelExpression exp2) {
        if (exp1 == null) {
            assertEquals(exp2, null);
        } else {
            assertNotEquals(exp2, null);
            assertEquals(exp1.getClass(), exp2.getClass());
            List<GelExpression> operand1 = exp1.getOperand();
            List<GelExpression> operand2 = exp2.getOperand();
            if (operand1 == null) {
                assertEquals(operand2, null);
                return;
            }
            if (operand1.size() == 0 || operand2.size() == 0) {
                return;
            }
            assertEquals(operand1.size(), operand2.size());
            for (int i=0 ; i<operand1.size() ; i++) {
                compare(operand1.get(i), operand2.get(i));
            }
        }
    }

    //========================================================================//

    /**
     * Sets the factories for gel expressions.
     */
    protected void init() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory("Boolean", BooleanLiteralImpl.class);
        registry.registerFactory("Integer", IntegerLiteralImpl.class);
        registry.registerFactory("date", DateLiteralImpl.class);
        registry.registerFactory("Double", FloatingPointLiteralImpl.class);
        registry.registerFactory("String", StringLiteralImpl.class);
        registry.registerFactory("not", NotImpl.class);
        registry.registerFactory(">", GreaterThanImpl.class);
        registry.registerFactory("<=", LessOrEqualImpl.class);
        registry.registerFactory(">=", GreaterOrEqualImpl.class);
        registry.registerFactory("<", LessThanImpl.class);
        registry.registerFactory("or", OrImpl.class);
        registry.registerFactory("self", SelfImpl.class);
        registry.registerFactory("isnew", IsNewImpl.class);
        registry.registerFactory("*", MultImpl.class);
        registry.registerFactory("let", VariableDefinitionImpl.class);
        registry.registerFactory("/", DivImpl.class);
        registry.registerFactory("%", ModImpl.class);
        registry.registerFactory("<>", DifferentImpl.class);
        registry.registerFactory("=", EqualImpl.class);
        registry.registerFactory("->", FlatCollectImpl.class);
        registry.registerFactory(".meth", MethodNavImpl.class);
        registry.registerFactory("and", AndImpl.class);
        registry.registerFactory("-", SubImpl.class);
        registry.registerFactory("+", AddImpl.class);
        registry.registerFactory("|", LambdaImpl.class);
        registry.registerFactory("@pre", AtPreImpl.class);
        registry.registerFactory("xor", XorImpl.class);
        registry.registerFactory("result", ResultImpl.class);
        registry.registerFactory(".att", AttributeNavImpl.class);
        registry.registerFactory("->", CollectionMethodNavImpl.class);
        registry.registerFactory("var", VariableReferenceImpl.class);
        registry.registerFactory("opp", OppImpl.class);
        registry.registerFactory("excludes", ExcludesImpl.class);
        registry.registerFactory("sum", SumImpl.class);
        registry.registerFactory("collect", CollectImpl.class);
        registry.registerFactory("flatCollect", FlatCollectImpl.class);
        registry.registerFactory("includes", IncludesImpl.class);
        registry.registerFactory("flatten", FlattenImpl.class);
        registry.registerFactory("average", AverageImpl.class);
        registry.registerFactory("select", SelectImpl.class);        
    }

    /**
     * Reads the standard test model
     */
    protected static void  readModel() throws InstantiationException, IOException, IllegalAccessException {
        // 1- Initialize framework
        Factories.init();

        // 2- read the model
        XmlModelReader instance = new XmlModelReader();
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        model = instance.readModel(url, parent);

        // 3- set the data
        accountClass = (MofClass) model.getElementByName("Compte");
        deposit = accountClass.getOwnedOperation("déposer");
        withdraw = accountClass.getOwnedOperation("retirer");
        customerClass = (MofClass)model.getElementByName("Client");
        transfer = customerClass.getOwnedOperation("transférer");
        accounts = customerClass.getOwnedAttribute("comptes");

        flightClass = (MofClass) model.getElementByName("Vol");
        pilotClass = (MofClass) model.getElementByName("Pilote");
        planeClass = (MofClass) model.getElementByName("Avion");
        planeModelClass = (MofClass) model.getElementByName("Modèle");
        certificateClass = (MofClass) model.getElementByName("Brevet");
    }

}