package fr.insset.jeanluc.ete.meta.model.mofpackage;


import static fr.insset.jeanluc.ete.defs.Constants.NOT_IMPLEMENTED_YET;
import fr.insset.jeanluc.ete.meta.model.constraint.Constraint;
import fr.insset.jeanluc.ete.meta.model.core.MofElement;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.Stereotype;
import fr.insset.jeanluc.ete.meta.model.emof.TagValueDeclaration;
import fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
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
public class PackageableElementTest {
    
    public PackageableElementTest() {
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
     * Test of getQualifiedName method, of class PackageableElement.
     */
    @Test
    public void testGetQualifiedName() {
        System.out.println("getQualifiedName");
        PackageableElement instance = new PackageableElementImpl();

        // TODO review the generated test code and remove the default call to fail.
    }



    public class PackageableElementImpl implements PackageableElement {

        public void setOwningPackage(MofPackage inPackage) {
        }

        public MofPackage getOwningPackage() {
            return null;
        }

        @Override
        public MofType getType() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setType(MofType inType) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void setName(String inName) {
            name = inName;
        }

        @Override
        public Collection<NamedElement> getDependances() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setDependances(Collection<NamedElement> inDependances) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addDependency(NamedElement inDependance) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Collection<Stereotype> getStereotypes() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setStereotypes(Collection<Stereotype> inStereotypes) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Map<TagValueDeclaration, Object> getTagValues() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setTagValues(Map<TagValueDeclaration, Object> inTagValues) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addTagValue(TagValueDeclaration inDeclaration, Object inValue) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getId() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setId(String inId) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Collection<Constraint> getConstraints() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setConstraints(Collection<Constraint> inConstraints) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addConstraint(Constraint inConstraint) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        private     String      name;

        @Override
        public Collection<InstanceSpecification> getInstances() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setInstances(Collection<InstanceSpecification> inInstances) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addInstance(InstanceSpecification inInstance) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeInstance(InstanceSpecification inInstance) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Collection<NamedElement> getOwnedElements() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setOwnedElements(Collection<NamedElement> inSubElements) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getXmiType() {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addDependance(MofElement inDependance) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeDependance(MofElement inDependance) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Set<MofElement> getDependance() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }           // PackageableElementImpl
    
}       // PackageableElementTest
