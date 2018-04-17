package fr.insset.jeanluc.ete.gel.impl;


import fr.insset.jeanluc.ete.gel.AtPre;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.Collect;
import fr.insset.jeanluc.ete.gel.Equal;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.Sub;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofSequence;
import fr.insset.jeanluc.ete.meta.model.types.collections.impl.MofSequenceImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
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
public class TreeBuilderWithBankTest {


    public final String  url = "../../../samples/web-ete-bank/src/main/mda/Bank.xml";

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
        System.out.println("balance");
        String  expressionAsString = "balance";
        readModel();
        Step result = new NavHelper().startFrom(model, withdraw).navigateTo("balance").getNavigation();
        testAny(result, expressionAsString,model, accountClass);
    }


    @Test
    public void atPreTest() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("@pre");
        String  expressionAsString = "balance@pre";
        readModel();
        Step result = new NavHelper().startFrom(model, withdraw).navigateTo("balance").atPre().getNavigation();
        MofProperty balanceAttribute = accountClass.getOwnedAttribute("balance");
        result.setToFeature(accountClass.getOwnedAttribute("balance"));
        result.setType(balanceAttribute.getType());
        testAny(result, expressionAsString, model, accountClass);
    }


    @Test
    public void atPreOfParameterTest() throws InstantiationException, IOException, IllegalAccessException {
        String  expressionAsString = "fromAccount.balance@pre";
        System.out.println(expressionAsString);
        readModel();
        Step result = new NavHelper().startFrom(model, transfer)
                .navigateTo("fromAccount")
                .navigateTo("balance")
                .atPre().getNavigation();
        MofProperty balanceAttribute = accountClass.getOwnedAttribute("balance");
        result.setToFeature(accountClass.getOwnedAttribute("balance"));
        result.setType(balanceAttribute.getType());
        testAny(result, expressionAsString, model, accountClass);
    }


    @Test
    public void depositTest() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("deposit");
        String expressionAsString = "balance = balance@pre + inAmount";
        readModel();

        Step rightNavigation = new NavHelper().startFrom(model, withdraw).navigateTo("balance").atPre().getNavigation();
        MofProperty balanceAttribute = accountClass.getOwnedAttribute("balance");
        rightNavigation.setToFeature(accountClass.getOwnedAttribute("balance"));
        rightNavigation.setType(balanceAttribute.getType());
        Step    inAmount = new NavHelper().startFrom(model, deposit).navigateTo("inAmount").getNavigation();
        AddImpl rightMember = buildAdd(rightNavigation, inAmount);
        Step leftMember = new NavHelper().startFrom(model, deposit).navigateTo("balance").getNavigation();
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
    @Test
    public void testIncludes() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("includes");
        String expressionAsString = "accounts->includes(fromAccount)";
        readModel();

        Step    fromAccountNavigation = new NavHelper()
                            .startFrom(model, transfer)
                            .navigateTo("fromAccount")
                            .getNavigation();
        Step    includesNavigation = new NavHelper()
                            .startFrom(model, transfer)
                            .navigateTo("accounts")
                            .includes()
                            .addAnOperand(fromAccountNavigation)
                            .getNavigation();

        testAny(includesNavigation, expressionAsString, model, transfer);
    }



    @Test
    public void testNavFromParam() throws IOException, InstantiationException, IllegalAccessException {
        System.out.println("Navigation from parameter");
        String expressionAsString = "fromAccount.balance";
        readModel();
        // Navigation to the account
        Step    fromAccountNavigation = new NavHelper()
                            .startFrom(model, transfer)
                            .navigateTo("fromAccount")
                            .navigateTo("balance")
                            .getNavigation();

        testAny(fromAccountNavigation, expressionAsString, model, transfer);
    }
    

//========================================================================//


    protected void testAny(GelExpression expectedResult, String inExpression, EteModel inModel, TypedElement inContext) {
        GelExpression abstractGelExpression = GelParserWrapper.buildAbstractTree(inExpression, inModel, inContext);
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



    public AttributeNav  buildNav(Step inSource, String inToFeature) {
        AttributeNav    result   = new AttributeNavImpl();
        Feature         feature  = (Feature) model.getElementByName(inToFeature);
        if (inSource != null) {
            MofType type = inSource.getType();
            List<GelExpression>     operands = new LinkedList<>();
            result.setOperand(operands);
            operands.add(inSource);
        }
        else {
            result = new AttributeNavImpl();
        }
        return null;
    }


    public IntegerLiteralImpl   buildInt(String value) {
        IntegerLiteralImpl result = new IntegerLiteralImpl();
        result.setValueAsString(value);
        return result;
    }


    public AddImpl  buildAdd(GelExpression left, GelExpression right) {
        AddImpl     add = new AddImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(left);
        operands.add(right);
        add.setOperand(operands);
        return add;
    }


    public Sub  buildSub(GelExpression left, GelExpression right) {
        Sub     add = new SubImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(left);
        operands.add(right);
        add.setOperand(operands);
        return add;
    }



    public MultImpl buildMult(GelExpression left, GelExpression right) {
        MultImpl     mult = new MultImpl();
        List<GelExpression> operands = new LinkedList<>();
        operands.add(left);
        operands.add(right);
        mult.setOperand(operands);
        return mult;
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
        accountClass = (MofClass) model.getElementByName("Account");
        deposit = accountClass.getOwnedOperation("deposit");
        withdraw = accountClass.getOwnedOperation("withdraw");
        customerClass = (MofClass)model.getElementByName("Customer");
        transfer = customerClass.getOwnedOperation("transfer");
        accounts = customerClass.getOwnedAttribute("accounts");
        
    }



}       // TreeBuilderTest

