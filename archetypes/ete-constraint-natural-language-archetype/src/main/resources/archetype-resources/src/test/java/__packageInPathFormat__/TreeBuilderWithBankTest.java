package ${package};



import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.Equal;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.Sub;
import fr.insset.jeanluc.ete.gel.impl.AddImpl;
import fr.insset.jeanluc.ete.gel.impl.AtPreImpl;
import fr.insset.jeanluc.ete.gel.impl.AttributeNavImpl;
import fr.insset.jeanluc.ete.gel.impl.CollectImpl;
import fr.insset.jeanluc.ete.gel.impl.EqualImpl;
import fr.insset.jeanluc.ete.gel.impl.FlattenImpl;
import fr.insset.jeanluc.ete.gel.impl.GelParserWrapper;
import fr.insset.jeanluc.ete.gel.impl.LiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.MultImpl;
import fr.insset.jeanluc.ete.gel.impl.SelfImpl;
import fr.insset.jeanluc.ete.gel.impl.SubImpl;
import fr.insset.jeanluc.ete.gel.impl.VariableReferenceImpl;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofSequenceImpl;
import fr.insset.jeanluc.gel.test.fmwk.IntegerLiteralImpl;
import fr.insset.jeanluc.gel.test.fmwk.NavHelper;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.IOException;
import java.util.LinkedList;
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



/**
 *
 * @author jldeleage
 */
public class TreeBuilderWithBankTest {


    public final String  url = "src/test/mda/Compagnie_aerienne.xml";

    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public EteModel     model;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    private MofClass     accountClass;
    private MofClass     customerClass;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    private MofOperation withdraw;
    private MofOperation deposit;
    private MofOperation transfer;

    private MofProperty  accounts;


    public TreeBuilderWithBankTest() {
    }


    @BeforeClass
    public static void setUpClass() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory("self", SelfImpl.class);
        registry.registerFactory("collect", CollectImpl.class);
        registry.registerFactory("sequence", MofSequenceImpl.class);
        registry.registerFactory(".att", fr.insset.jeanluc.ete.gel.impl.AttributeNavImpl.class);
        registry.registerFactory("@pre", AtPreImpl.class);
        registry.registerFactory("flatten", FlattenImpl.class);
        registry.registerFactory("variable_reference", VariableReferenceImpl.class);
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



    //========================================================================//


    @Test
    public void balanceTest() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("Le solde");
        String  expressionAsString = "Le solde";
        readModel();
        Step result = new NavHelper().startFrom(model, withdraw).navigateTo("solde").getNavigation();
        testAny(result, expressionAsString,model, accountClass);
    }


    @Test
    public void simpleAtPreTest() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("@pre");
        String  expressionAsString = "solde initial";
        readModel();
        Step result = new NavHelper().startFrom(model, withdraw).navigateTo("solde").atPre().getNavigation();
        MofProperty balanceAttribute = accountClass.getOwnedAttribute("solde");
        result.setToFeature(accountClass.getOwnedAttribute("solde"));
        result.setType(balanceAttribute.getType());
        testAny(result, expressionAsString, model, accountClass);
    }


    @Test
    public void atPreTest() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("@pre with article");
        String  expressionAsString = "Le solde initial";
        readModel();
        Step result = new NavHelper().startFrom(model, withdraw).navigateTo("solde").atPre().getNavigation();
        MofProperty balanceAttribute = accountClass.getOwnedAttribute("solde");
        result.setToFeature(accountClass.getOwnedAttribute("solde"));
        result.setType(balanceAttribute.getType());
        testAny(result, expressionAsString, model, accountClass);
    }


    @Test
    public void atPreOfParameterTest() throws InstantiationException, IOException, IllegalAccessException {
        String  expressionAsString = "Le solde initial de départ";
        System.out.println(expressionAsString);
        readModel();
        Step result = new NavHelper().startFrom(model, transfer)
                .navigateTo("départ")
                .navigateTo("solde")
                .atPre()
                .getNavigation();
        MofProperty balanceAttribute = accountClass.getOwnedAttribute("solde");
        result.setToFeature(accountClass.getOwnedAttribute("solde"));
        result.setType(balanceAttribute.getType());
        testAny(result, expressionAsString, model, transfer);
    }


    @Test
    public void depositTest() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("deposit");
        String expressionAsString = "solde = solde initial + montant";
        readModel();

        Step rightNavigation = new NavHelper().startFrom(model, withdraw).navigateTo("solde").atPre().getNavigation();
        Step    inAmount = new NavHelper().startFrom(model, deposit).navigateTo("montant").getNavigation();
        AddImpl rightMember = buildAdd(rightNavigation, inAmount);
        Step leftMember = new NavHelper().startFrom(model, deposit).navigateTo("solde").getNavigation();
        Equal   result = new EqualImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(leftMember);
        operands.add(rightMember);
        result.setOperand(operands);
        
        testAny(result, expressionAsString, model, deposit);
    }


    @Test
    public void depositTest2() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("deposit");
        String expressionAsString = "Le solde = le solde initial + le montant";
        readModel();

        Step rightNavigation = new NavHelper().startFrom(model, withdraw).navigateTo("solde").atPre().getNavigation();
        Step    inAmount = new NavHelper().startFrom(model, deposit).navigateTo("montant").getNavigation();
        AddImpl rightMember = buildAdd(rightNavigation, inAmount);
        Step leftMember = new NavHelper().startFrom(model, deposit).navigateTo("solde").getNavigation();
        Equal   result = new EqualImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(leftMember);
        operands.add(rightMember);
        result.setOperand(operands);
        
        testAny(result, expressionAsString, model, deposit);
    }


//    @Test
    public void depositTest3() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("deposit");
        String expressionAsString = "Le solde est égal au solde initial plus le montant";
        readModel();

        Step rightNavigation = new NavHelper().startFrom(model, withdraw).navigateTo("solde").atPre().getNavigation();
        Step    inAmount = new NavHelper().startFrom(model, deposit).navigateTo("montant").getNavigation();
        AddImpl rightMember = buildAdd(rightNavigation, inAmount);
        Step leftMember = new NavHelper().startFrom(model, deposit).navigateTo("solde").getNavigation();
        Equal   result = new EqualImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(leftMember);
        operands.add(rightMember);
        result.setOperand(operands);
        
        testAny(result, expressionAsString, model, deposit);
    }



//    @Test
    public void depositTest4() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("deposit");
        String expressionAsString = "Le solde est augmenté du montant";
        readModel();

        Step rightNavigation = new NavHelper().startFrom(model, withdraw).navigateTo("solde").atPre().getNavigation();
        Step    inAmount = new NavHelper().startFrom(model, deposit).navigateTo("montant").getNavigation();
        AddImpl rightMember = buildAdd(rightNavigation, inAmount);
        Step leftMember = new NavHelper().startFrom(model, deposit).navigateTo("solde").getNavigation();
        Equal   result = new EqualImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(leftMember);
        operands.add(rightMember);
        result.setOperand(operands);
        
        testAny(result, expressionAsString, model, deposit);
    }

    /**
     * This test checks the parameter fromAccount of the transfer method and
     * the accounts field of the Customer class.<br>
     * It tests the "includes" operator as well.
     * 
     * @throws InstantiationException
     * @throws IOException
     * @throws IllegalAccessException 
     */
//    @Test
    public void testIncludes() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("includes");
        String expressionAsString = "Les comptes contiennent départ";
        readModel();

        Step    fromAccountNavigation = new NavHelper()
                            .startFrom(model, transfer)
                            .navigateTo("fromAccount")
                            .getNavigation();
        Step    includesNavigation = new NavHelper()
                            .startFrom(model, transfer)
                            .navigateTo("accounts")
                            .includes(fromAccountNavigation)
                            .getNavigation();

        testAny(includesNavigation, expressionAsString, model, transfer);
    }

    @Test
    public void testParam() throws IOException, InstantiationException, IllegalAccessException {
        System.out.println("Simple parameter");
        String expressionAsString = "Le montant";
        readModel();
        // Navigation to the account
        Step    fromAccountNavigation = new NavHelper()
                            .startFrom(model, transfer)
                            .navigateTo("montant")
                            .getNavigation();

        testAny(fromAccountNavigation, expressionAsString, model, transfer);
    }

    @Test
    public void testParam2() throws IOException, InstantiationException, IllegalAccessException {
        System.out.println("Simple parameter");
        String expressionAsString = "départ";
        readModel();
        // Navigation to the account
        Step    fromAccountNavigation = new NavHelper()
                            .startFrom(model, transfer)
                            .navigateTo("départ")
                            .getNavigation();

        testAny(fromAccountNavigation, expressionAsString, model, transfer);
    }

    @Test
    public void testNavFromParam() throws IOException, InstantiationException, IllegalAccessException {
        System.out.println("Navigation from parameter");
        String expressionAsString = "Le solde de départ";
        readModel();
        // Navigation to the account
        Step    fromAccountNavigation = new NavHelper()
                            .startFrom(model, transfer)
                            .navigateTo("départ")
                            .navigateTo("solde")
                            .getNavigation();

        testAny(fromAccountNavigation, expressionAsString, model, transfer);
    }
    

//========================================================================//


    protected void testAny(GelExpression expectedResult, String inExpression, EteModel inModel, TypedElement inContext) {
        System.out.println("input expression : " + inExpression);
        GelExpression abstractGelExpression = ${artifactIdI2uc}ParserWrapper.buildAbstractTree(inExpression, inModel, inContext);
        compare(expectedResult, abstractGelExpression);
    }


    private void compare(GelExpression expectedResult, GelExpression abstractGelExpression) {
        Class   expectedClass = expectedResult.getClass();
        Class   gottenClass   = abstractGelExpression.getClass();
        assertEquals(expectedClass, gottenClass);
        List<GelExpression> expectedOperand = expectedResult.getOperand();
        List<GelExpression> gottenOperand = abstractGelExpression.getOperand();
        if (expectedOperand == null) {
            assertEquals(null, gottenOperand);
        }
        else {
            assertNotEquals(null, gottenOperand);
            assertEquals(expectedOperand.size(), gottenOperand.size());
            for (int i=0 ; i<expectedOperand.size() ; i++) {
                compare(expectedOperand.get(i), gottenOperand.get(i));
            }
        }
        if (expectedResult instanceof LiteralImpl) {
            assertTrue(abstractGelExpression instanceof LiteralImpl);
            LiteralImpl expectedLiteral = (LiteralImpl) expectedResult;
            LiteralImpl gottenLiteral   = (LiteralImpl) abstractGelExpression;
            assertEquals(expectedLiteral.getValueAsString(), gottenLiteral.getValueAsString());
        } else if (expectedResult instanceof Step) {
            assertTrue(abstractGelExpression instanceof Step);
        }
    }


    //========================================================================//
    //                    S E T   U P   U T I L I T I E S                     //
    //========================================================================//



    /**
     * TODO : use a NavHelper method.
     */
    public static AddImpl  buildAdd(GelExpression left, GelExpression right) {
        AddImpl     add = new AddImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(left);
        operands.add(right);
        add.setOperand(operands);
        return add;
    }




    //========================================================================//


    /**
     * Reads the standard test model
     */
    protected void  readModel() throws InstantiationException, IOException, IllegalAccessException {
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
        transfer = accountClass.getOwnedOperation("transférer");
        accounts = customerClass.getOwnedAttribute("comptes");
        
    }



}       // TreeBuilderTest

