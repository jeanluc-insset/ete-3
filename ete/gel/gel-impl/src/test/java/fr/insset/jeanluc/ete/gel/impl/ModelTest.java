
package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofSequence;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
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

    public final static String  url = "../gel-spec/src/main/mda/models/Gel.xml";


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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testRead() throws InstantiationException, IOException, IllegalAccessException {
        System.out.println("Test of model");
        // 1- Initialize framework
        Factories.init();

        // 2- call the operation
        XmlModelReader instance = new XmlModelReader();
        EteModel parent = new EteModelImpl();
        EteModel model = instance.readModel(url, parent);
        MofClass gelExpressionClass = (MofClass) model.getElementByName("GelExpression");
        MofProperty operandAttribute = gelExpressionClass.getOwnedAttribute("operand");
        MofCollection type = (MofCollection) operandAttribute.getType();
        System.out.println(type.getName() + " " + type.isOrdered());
        
        System.out.println("End");
    }

}