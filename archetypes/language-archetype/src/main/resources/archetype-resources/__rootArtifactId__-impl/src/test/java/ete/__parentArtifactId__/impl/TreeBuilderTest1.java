#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId}.impl;


import ${package}.ete.${parentArtifactId}.AttributeNav;
import ${package}.ete.${parentArtifactId}.Collect;
import ${package}.ete.${parentArtifactId}.Equal;
import ${package}.ete.${parentArtifactId}.GelExpression;
import ${package}.ete.${parentArtifactId}.Nav;
import ${package}.ete.${parentArtifactId}.Result;
import ${package}.ete.${parentArtifactId}.Step;
import ${package}.ete.${parentArtifactId}.Sub;
import ${package}.ete.${parentArtifactId}.VariableDefinition;
import ${package}.ete.meta.model.constraint.Invariant;
import ${package}.ete.meta.model.constraint.Postcondition;
import ${package}.ete.meta.model.core.PrimitiveDataTypes;
import ${package}.ete.meta.model.core.impl.Factories;
import ${package}.ete.meta.model.emof.Feature;
import ${package}.ete.meta.model.emof.MofClass;
import ${package}.ete.meta.model.emof.MofOperation;
import ${package}.ete.meta.model.emof.MofProperty;
import ${package}.ete.meta.model.mofpackage.EteModel;
import ${package}.ete.meta.model.mofpackage.PackageableElement;
import ${package}.ete.meta.model.mofpackage.impl.EteModelImpl;
import ${package}.ete.meta.model.types.MofType;
import ${package}.ete.meta.model.types.TypedElement;
import ${package}.ete.meta.model.types.collections.MofSequence;
import ${package}.ete.meta.model.types.collections.impl.MofSequenceImpl;
import ${package}.util.factory.FactoryMethods;
import ${package}.xmi.io.impl.XmlModelReader;
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
public class TreeBuilderTest1 {

    // .        ${parentArtifactId}-impl
    // ..       ${parentArtifactId}
    // ../..    ete
    // ../../.. ete-toolchain
    // 
    public final String  url = "../../../samples/insset-airways/src/main/mda/Model.xml";

    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public EteModel     model;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public MofClass     flightClass;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public MofOperation computeMarkOperation;


    public TreeBuilderTest1() {
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


    // The expected result is not built yet so the test is not available
    @Test
    public void testNavigationWithCollectionOperation() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("invariant with collection operation");
        readModel();
        List<Invariant> allInvariants = (List<Invariant>) flightClass.getInvariants();
        Invariant anInvariant = allInvariants.get(1);
        String specificationAsString = anInvariant.getSpecificationAsString();
        System.out.println(specificationAsString);

        NavHelper navHelper = new NavHelper();
        Step    planeModel = navHelper.startFrom(model, "Flight")
                        .navigateTo("plane")
                        .navigateTo("planeModel")
                        .getNavigation();
        Step    invariant = navHelper.startFrom(model, "Flight")
                        .navigateTo("captain")
                        .navigateTo("certificates")
                        .navigateTo("planeModel")
                        .includes(planeModel)
                        .getNavigation();

        testAny(invariant, specificationAsString, model, flightClass);
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
        flightClass = (MofClass) model.getElementByName("Flight");
    }



}       // TreeBuilderTest

