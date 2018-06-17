
package fr.insset.jeanluc.ete.meta.model.emof.impl;

import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import java.util.Collection;
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
public class AssociationImplTest {

    public AssociationImplTest() {
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
     * Test of getMemberEnd method, of class AssociationImpl.
     */
    @Test
    public void testGetMemberEnd() throws InstantiationException {
        System.out.println("getMemberEnd");
        AssociationImpl instance = new AssociationImpl();
        Collection<MofProperty> result = instance.getMemberEnd();
        assertEquals(0, result.size());
    }

    /**
     * Test of addMemberEnd method, of class AssociationImpl.
     */
    @Test
    public void testAddMemberEnd() throws InstantiationException {
        System.out.println("addMemberEnd");
        MofProperty aProperty = new MofPropertyImpl();
        AssociationImpl instance = new AssociationImpl();
        instance.addMemberEnd(aProperty);
        assertEquals(1, instance.getMemberEnd().size());
    }

    /**
     * Test of removeMemberEnd method, of class AssociationImpl.
     */
    @Test
    public void testRemoveMemberEnd() throws InstantiationException {
        System.out.println("removeMemberEnd");
        MofProperty aProperty = new MofPropertyImpl();
        AssociationImpl instance = new AssociationImpl();
        instance.addMemberEnd(aProperty);
        instance.removeMemberEnd(aProperty);
        assertEquals(0, instance.getMemberEnd().size());
    }

    /**
     * Test of getOwnedEnd method, of class AssociationImpl.
     */
    @Test
    public void testGetOwnedEnd() throws InstantiationException {
        System.out.println("getOwnedEnd");
        AssociationImpl instance = new AssociationImpl();
        Collection<MofProperty> expResult = null;
        Collection<MofProperty> result = instance.getOwnedEnd();
        assertEquals(0, result.size());
    }

    /**
     * Test of addOwnedEnd method, of class AssociationImpl.
     */
    @Test
    public void testAddOwnedEnd() throws InstantiationException {
        System.out.println("addOwnedEnd");
        MofProperty aProperty = null;
        AssociationImpl instance = new AssociationImpl();
        instance.addOwnedEnd(aProperty);
        assertEquals(1, instance.getOwnedEnd().size());
    }

    /**
     * Test of removeOwnedEnd method, of class AssociationImpl.
     */
    @Test
    public void testRemoveOwnedEnd() throws InstantiationException {
        System.out.println("removeOwnedEnd");
        MofProperty aProperty = null;
        AssociationImpl instance = new AssociationImpl();
        instance.addOwnedEnd(aProperty);
        instance.removeOwnedEnd(aProperty);
        assertEquals(0, instance.getOwnedEnd().size());
   }

}