package fr.insset.jeanluc.ete.gel.impl;


import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.Collect;
import fr.insset.jeanluc.ete.gel.Equal;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.Result;
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
public class TreeBuilderTest {


    public final String  url = "../../../src/test/mda/models/mini_MCQ.xml";

    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public EteModel     model;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public MofClass     sessionClass;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public MofOperation computeMarkOperation;


    public TreeBuilderTest() {
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
    public void testStringLiteral() {
        System.out.println("string literal");
        String      helloWorld  = "\"hello world\"";
        StringLiteralImpl stringLiteralImpl = new StringLiteralImpl();
        
        stringLiteralImpl.setValueAsString(helloWorld);
        testAny(stringLiteralImpl,  helloWorld, null, null);
    }

    @Test
    public void testIntegerLiteral() {
        System.out.println("integer literal");
        String      douze  = "12";
        IntegerLiteralImpl integerLiteralImpl = new IntegerLiteralImpl();        
        integerLiteralImpl.setValueAsString(douze);
        testAny(integerLiteralImpl, douze, null, null);
    }

    @Test
    public void testFloatLiteral() {
        System.out.println("float literal");
        String      douze  = "12.0";
        FloatingPointLiteralImpl floatingPointLiteralImpl = new FloatingPointLiteralImpl();
        
        floatingPointLiteralImpl.setValueAsString(douze);
        testAny(floatingPointLiteralImpl, douze, null, null);
    }

    @Test
    public void testBooleanLiteral() {
        System.out.println("boolean literal");
        String      value  = "true";
        BooleanLiteralImpl booleanLiteralImpl = new BooleanLiteralImpl();
        booleanLiteralImpl.setValueAsString(value);
        testAny(booleanLiteralImpl, value, null, null);
    }


    //========================================================================//

    @Test
    public void testAddition() {
        System.out.println("addition");
        AddImpl add = buildAdd(buildInt("12"), buildInt("20"));
        testAny(add, "12 + 20", null, null);
    }

    @Test
    public void testAdditions() {
        System.out.println("additions");
        AddImpl add = buildAdd(buildAdd(buildInt("12"), buildInt("20")), buildInt("8"));
        testAny(add, "12 + 20 + 8", null, null);
    }

    @Test
    public void testAssociative() {
        System.out.println("complex 1");
        AddImpl    mult = buildAdd(buildSub(buildInt("12"), buildInt("20")), buildInt("7"));
        testAny(mult, "12 - 20 + 7", null, null);
    }

    @Test
    public void testComplexExpression1() {
        System.out.println("complex 1");
        MultImpl    mult = buildMult(buildInt("12"), buildAdd(buildInt("20"), buildInt("7")));
        testAny(mult, "12 * (20 + 7)", null, null);
    }

    @Test
    public void testComplexExpression2() {
        System.out.println("complex 2");
        AddImpl    add = buildAdd(buildInt("12"), buildMult(buildInt("20"), buildInt("7")));
        testAny(add, "12 + 20 * 7", null, null);
    }


    //========================================================================//

    @Test
    public void testSimpleAttribute() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("simple attribute");
        readModel();
        String specificationAsString = "startTime";
        Step expectedResult = new NavHelper().startFrom(model, "Session")
                .navigateTo("startTime")
                .getNavigation();
        expectedResult.setToFeature(sessionClass.getOwnedAttribute("startTime"));
        testAny(expectedResult, specificationAsString, model, sessionClass);
    }

    @Test
    public void testVerySimpleNavigation() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("very simple navigation");
        readModel();
        String specificationAsString = "answer";
        MofClass     proposedAnswerClass = (MofClass) model.getElementByName("ProposedAnswer");

        Step    toAnswer = new NavHelper().startFrom(model, "ProposedAnswer")
                    .navigateTo("answer")
                    .getNavigation();

        testAny(toAnswer, specificationAsString, model, proposedAnswerClass);
    }

    @Test
    public void testSimpleNavigation() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("simple navigation");
        readModel();
        String specificationAsString = "answer.value";
        MofClass     proposedAnswerClass = (MofClass) model.getElementByName("ProposedAnswer");

        Step    toValue = new NavHelper()
                .startFrom(model, "ProposedAnswer")
                .navigateTo("answer")
                .navigateTo("value")
                .getNavigation();

        testAny(toValue, specificationAsString, model, proposedAnswerClass);
    }


    @Test
    public void testNotSoSimpleNavigation() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("not so simple navigation");
        readModel();
        String specificationAsString = "askedQuestions.checkedAnswers";

        Step    toCheckedAnswers = new NavHelper().startFrom(model, computeMarkOperation)
                            .navigateTo("askedQuestions")
                            .navigateTo("checkedAnswers")
                            .getNavigation();

        testAny(toCheckedAnswers, specificationAsString, model, computeMarkOperation);
    }


    // The expected result is not built yet so the test is not available
//    @Test
    public void testNavigationWithCollectionOperation() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("navigation with collection operation");
        readModel();
        List<Postcondition> allPostconditions = computeMarkOperation.getPostconditions();
        Postcondition postCondition = allPostconditions.get(0);
        String specificationAsString = postCondition.getSpecificationAsString();
        System.out.println(specificationAsString);

        Step    sum = new NavHelper().startFrom(model, "Session")
                        .navigateTo("askedQuestions")
                        .navigateTo("checkedAnswers")
                        .flatten()
                        .navigateTo("answer")
                        .navigateTo("value")
                        .sum()
                        .getNavigation();
        Equal   equal = new EqualImpl();
        Result  variable = new ResultImpl();
        List    operands = new LinkedList();
        operands.add(variable);
        operands.add(sum);
        equal.setOperand(operands);

        testAny(equal, specificationAsString, model, computeMarkOperation);
    }


    //========================================================================//


    protected void testAny(GelExpression expectedResult, String inExpression, EteModel inModel, TypedElement inContext) {
        GelExpression abstractGelExpression = GelParserWrapper.buildAbstractTree(inExpression, inModel, inContext);
        compare(expectedResult, abstractGelExpression);
    }


    private void compare(GelExpression expectedResult, GelExpression abstractGelExpression) {
        Class   expectedClass = expectedResult.getClass();
        Class   gottenClass   = abstractGelExpression.getClass();
        compareClasses(expectedClass, gottenClass);
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


    public void compareClasses(Class expectedClass, Class gottenClass) {
        if (expectedClass.isInterface()) {
            
        }
        Class currentClass = gottenClass;
        while (currentClass != null) {
            if (expectedClass.equals(currentClass)) {
                return;
            }
            currentClass = currentClass.getSuperclass();
        }
        fail("Class " + gottenClass.getName() + " does not conform to " + expectedClass.getName());
    }



    //========================================================================//
    //                    S E T   U P   U T I L I T I E S                     //
    //========================================================================//


//    public AttributeNav  buildNav(Step inSource, String inToFeature) {
//        AttributeNav    result   = new AttributeNavImpl();
//        Feature         feature  = (Feature) model.getElementByName(inToFeature);
//        if (inSource != null) {
//            MofType type = inSource.getType();
//            List<GelExpression>     operands = new LinkedList<>();
//            result.setOperand(operands);
//            operands.add(inSource);
//        }
//        else {
//            result = new AttributeNavImpl();
//        }
//        return null;
//    }


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

        // 2- get the data
        XmlModelReader instance = new XmlModelReader();
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        model = instance.readModel(url, parent);
        sessionClass = (MofClass) model.getElementByName("Session");
        computeMarkOperation = sessionClass.getOwnedOperation("computeMark");
    }



}       // TreeBuilderTest

