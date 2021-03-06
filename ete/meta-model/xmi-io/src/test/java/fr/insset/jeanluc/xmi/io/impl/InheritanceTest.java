package fr.insset.jeanluc.xmi.io.impl;



import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.FLOAT_TYPE;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.TYPE_SUFFIX;
import fr.insset.jeanluc.ete.meta.model.emof.Association;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static fr.insset.jeanluc.ete.meta.model.types.collections.MofSequence.MOF_SEQUENCE;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.util.XList;



/**
 *
 * @author jldeleage
 */
public class InheritanceTest {

    
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
    public void testReadComplexModel() throws Exception {
        System.out.println("readComplexModel");
        // 1- Initialize framework
        Factories.init();

        // 2- call the operation
        XmiModelReader instance = new XmiModelReader();
        instance.addVisitors(new XmlModelReaderVisitor());
        String  url = "../../../samples/modeleur/src/main/mda/modeleur.xml";
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        EteModel result = instance.readModel(url, parent);

        // 3- Check result

        // 3-a check the number of classes and some meta-properties
//        Collection<MofClass> classes = result.getClasses();
//        assertEquals(10, classes.size());
////        MofClass    createurQuestionClass = (MofClass)result.getElementByName("CreateurQuestion");
////        assertTrue(createurQuestionClass.isAbstract());
//
//        // 3-b check the number of properties of each class
//        Map<String, Integer>    properties = new HashMap<>();
//        properties.put("User", 2);
//        properties.put("MCQ", 2);
//        properties.put("Question", 5);
//        properties.put("User", 5);
//        properties.put("Test", 4);
//        properties.put("Session", 5);
//        properties.put("Answer", 2);
//        properties.put("EffectiveQuestion", 3);
//        properties.put("ProposedAnswer", 2);
//        for (MofClass aClass : classes) {
//            Integer get = properties.get(aClass.getName());
//            if (get != null) {
//                System.out.println("   " + aClass.getName());
//                assertEquals((long)get, (long)aClass.getOwnedAttribute().size());
//            }
//        }
//
//        // 3-c check some associations
//        // 3-c-1 check the relation passage -> questionsPosees
//        MofClass passageClass = (MofClass) result.getElementByName("Session");
//        MofClass questionPoseeClass = (MofClass) result.getElementByName("EffectiveQuestion");
//        MofCollection  sequenceQuestionsPoseesClass = (MofCollection) FactoryRegistry.newInstance(MOF_SEQUENCE);
//        sequenceQuestionsPoseesClass.setBaseType(questionPoseeClass);
//        MofProperty questionsPosees = passageClass.getOwnedAttribute("askedQuestions");
//        MofType typeQuestionsPosees = questionsPosees.getType();
//        assertEquals(sequenceQuestionsPoseesClass, typeQuestionsPosees);
//        Collection<Invariant> invariants = questionPoseeClass.getInvariants();
//        assertEquals(1, invariants.size());
//
//        // 3-d check some operations
//        List<MofOperation> ownedOperations = passageClass.getOwnedOperation();
//        assertEquals(1, ownedOperations.size());
//        MofOperation calculeNote = ownedOperations.get(0);
//        MofType calculeNoteType = calculeNote.getType();
//        PackageableElement floatType = result.getElementByName(FLOAT_TYPE + TYPE_SUFFIX);
//        assertNotNull(floatType);
//        assertEquals(floatType, calculeNoteType);
//        Collection<? extends Postcondition> postconditions = calculeNote.getPostconditions();
//        assertEquals(1, postconditions.size());
//
//        // 3-e check some stereotypes
//        assertEquals(Boolean.TRUE, passageClass.hasStereotype("Entity"));
//
//        // 3-f check some tag values
////        Object valueOf = reponseClass.getValueOf("dataSource");
////        System.out.println("ValueOf datasource = " + valueOf);
////        assertEquals("jdbc:sample", valueOf);

    }       // testReadComplexModel


    //========================================================================//




}       // XmlModelReaderTest
