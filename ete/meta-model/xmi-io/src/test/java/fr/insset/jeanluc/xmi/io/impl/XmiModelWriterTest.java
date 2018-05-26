
package fr.insset.jeanluc.xmi.io.impl;

import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.Association;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.util.XList;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
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
public class XmiModelWriterTest {

    public final static String  PATH = "output_model.xml";

    public XmiModelWriterTest() {
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
    public void testSomeMethod() throws InstantiationException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("readSimpleModel");
        // 1- Initialize framework and read a model
        Factories.init();

        XmlModelReader  reader = new XmlModelReader();
        String  url = "../../../src/test/mda/models/MCQ.xml";
        EteModel parent = new EteModelImpl();
        EteModel result = reader.readModel(url, parent);

        // 2- call the operation
        ModelWriter instance = new ModelWriter();
        instance.writeModel(result, new File(PATH));

        // 3- check result
        // Actually, we read the previous output and check whether some
        // properties have been saved
        parent = new EteModelImpl();
        result = reader.readModel(PATH, parent);
        Map<String, Integer>    properties = new HashMap<>();
        properties.put("Question", 4);
        properties.put("MCQ", 3);
        Collection<MofClass> allClasses = result.getAllClasses();
        assertEquals(2, allClasses.size());
        Collection<MofClass> classes = result.getClasses();
        assertEquals(2, classes.size());
        Collection<Association> associations = new XList<>();
        for (MofClass aClass : classes) {
            Logger.getGlobal().fine("Scanning : " + aClass);
            List<MofProperty> ownedAttribute = aClass.getOwnedAttribute();
            assertEquals((long)properties.get(aClass.getName()), (long)ownedAttribute.size());
            for (MofProperty aProperty : ownedAttribute) {
                Association association = aProperty.getAssociation();
                if (null != association) {
                    associations.add(association);
                    Collection<MofProperty> memberEnd = association.getMemberEnd();
                    assertTrue(memberEnd.contains(aProperty));
                    Collection<MofProperty> ownedEnd = association.getOwnedEnd();
                    System.out.println("ownedEnd : " + ownedEnd.size());
                }
            }       // loop over properties
        }       // loop over classes
        assertEquals(2, associations.size());
        Collection enumerations = result.getEnumerations();
        assertEquals(1, enumerations.size());        
    }

}