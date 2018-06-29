#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.ete.${parentArtifactId}.impl;

import ${package}.ete.meta.model.core.impl.Factories;
import ${package}.ete.meta.model.emof.MofClass;
import ${package}.ete.meta.model.emof.MofProperty;
import ${package}.ete.meta.model.mofpackage.EteModel;
import ${package}.ete.meta.model.mofpackage.PackageableElement;
import ${package}.ete.meta.model.mofpackage.impl.EteModelImpl;
import ${package}.ete.meta.model.types.MofType;
import ${package}.ete.meta.model.types.collections.MofCollection;
import ${package}.ete.meta.model.types.collections.MofSequence;
import ${package}.xmi.io.impl.XmlModelReader;
import java.io.IOException;
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
public class ModelTest {

    public final static String  url = "../${parentArtifactId}-spec/src/main/mda/models/Gel.xml";


    public ModelTest() {
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

    @Test
    public void testRead() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("Test of model");
        // 1- Initialize framework
        Factories.init();

        // 2- call the operation
        XmlModelReader instance = new XmlModelReader();
        EteModel parent = new EteModelImpl();
        EteModel model = instance.readModel(url, parent);
        MofClass ${parentArtifactId}ExpressionClass = (MofClass) model.getElementByName("GelExpression");
        MofProperty operandAttribute = ${parentArtifactId}ExpressionClass.getOwnedAttribute("operand");
        MofCollection type = (MofCollection) operandAttribute.getType();
        System.out.println(type.getName() + " " + type.isOrdered());
        
        System.out.println("End");
    }

}