package fr.insset.jeanluc.xmi.io.impl;



import fr.insset.jeanluc.ete.util.XList;
import static fr.insset.jeanluc.ete.meta.model.constraint.Constraint.CONSTRAINT;
import static fr.insset.jeanluc.ete.meta.model.constraint.Invariant.INVARIANT;
import static fr.insset.jeanluc.ete.meta.model.constraint.Precondition.PRECONDITION;
import static fr.insset.jeanluc.ete.meta.model.constraint.Postcondition.POSTCONDITION;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import static fr.insset.jeanluc.ete.meta.model.emof.Association.ASSOCIATION;
import static fr.insset.jeanluc.ete.meta.model.emof.Enumeration.MOF_ENUMERATION;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import static fr.insset.jeanluc.ete.meta.model.emof.Stereotype.STEREOTYPE;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.meta.model.io.ModelReader;
import fr.insset.jeanluc.util.factory.AbstractFactory;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage.MOF_PACKAGE;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import static fr.insset.jeanluc.ete.meta.model.emof.MofProperty.MOF_PROPERTY;
import static fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification.INSTANCE_SPECIFICATION;
import static fr.insset.jeanluc.ete.meta.model.emof.instance.Slot.SLOT;
import static fr.insset.jeanluc.xmi.io.impl.XmlUtilities.getElements;
import static fr.insset.jeanluc.xmi.io.impl.XmlUtilities.getElementsByType;
import java.io.IOException;






/**
 * This is an XML reader : it uses XPath to select definitions of
 * objects and then uses an element reader to read the actual content of the
 * item.
 *
 * @author jldeleage
 */
public class XmlModelReader implements ModelReader {


    public final static String     PACKAGE_PATH            = "uml:Package";
    public final static String     CLASS_PATH              = "//*[@*='uml:Package']/*[@*='uml:Class']";
    public final static String     ENUM_PATH               = "//*[@*='uml:Package']/*[@*='uml:Enumeration']";
    public final static String     ASSOCIATION_PATH        = "uml:Association";
    public final static String     PROPERTY_PATH           = "uml:Property";
    public final static String     OPERATION_PATH          = "uml:Operation";
    public final static String     INSTANCE_PATH           = "uml:InstanceSpecification";
    public final static String     SLOT_PATH               = "//slot";
    public final static String     INVARIANT_PATH          = ".//packagedElement/ownedRule";
    public final static String     PRECONDITION_PATH       = ".//ownedOperation/ownedRule[@*=../precondition/@*]";
    public final static String     POSTCONDITION_PATH      = ".//ownedOperation/ownedRule[@*=../postcondition/@*]";
    public final static String     CONSTRAINT_PATH         = ".//ownedOperation/ownedRule";
    public final static String     PROFILE_PATH            = "uml:Profile";
    public final static String     PROFILE                 = MOF_PACKAGE;
    public final static String     STEREOTYPE_PATH         = "uml:Stereotype";
    public final static String     APPLIED_STEREOTYPE_PATH = ".//*[@base_Class]";
    public final static String     READER_VISITOR          = "reader_visitor";
    public final static String     XLIST                   = "xlist";




    public XmlModelReader() throws InstantiationException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(READER_VISITOR, XmlModelReaderVisitor.class);
        registry.registerFactory(XLIST, XList.class);
    }


    @Override
    public Collection<NamedElement> readPackages(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, PACKAGE_PATH, MOF_PACKAGE);
        return result;
    }


    @Override
    public Collection<NamedElement> readClasses(Object inDocument, EteModel inoutModel) throws IOException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        AbstractFactory factory = registry.getFactory(MOF_CLASS);
        Class builtClass = factory.getBuiltClass();
        System.out.println("The implementation class for MofClass is " + builtClass);
        System.out.println("The registry is : " + registry);
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, CLASS_PATH, MOF_CLASS);
        return result;
    }

    @Override
    public Collection<NamedElement> readEnumerations(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, ENUM_PATH, MOF_ENUMERATION);
        return result;
    }

    @Override
    public Collection<NamedElement> readAssociations(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, ASSOCIATION_PATH, ASSOCIATION);

        return result;
    }


    @Override
    public Collection<NamedElement> readProperties(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, PROPERTY_PATH, MOF_PROPERTY);
        return result;
    }


    @Override
    public Collection<NamedElement> readOperations(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, OPERATION_PATH, MOF_OPERATION);
        return result;
    }

    @Override
    public void readGeneralizations(Object inDocument, EteModel inoutModel) throws IOException {
        try {
            NodeList elements = getElements("//generalization", (Document)inDocument);
            Logger  logger = Logger.getGlobal();
            for (int i=0 ; i<elements.getLength() ; i++) {
                Element next        = (Element) elements.item(i);
                String idSubClass   = ((Element)next.getParentNode()).getAttribute("name");
                String idSuperClass = next.getAttribute("general");
                logger.log(Level.FINER,"Ids : [" + idSubClass + "]   [" + idSuperClass + "]");
                MofType subClass   = (MofType) inoutModel.getElementByName(idSubClass);
                MofType superClass = (MofType) inoutModel.getElementById(idSuperClass);
                logger.log(Level.FINER,"SubClass : " + subClass + " superClass : " + superClass);
                if (subClass != null && superClass != null) {
                    Logger.getGlobal().log(Level.FINE, "Adding inheritance {0} -> {1}", new Object[]{subClass, superClass});
                    subClass.addSuperType(superClass);
                }
            }
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XmlModelReader.class.getName()).log(Level.FINE, null, ex);
            throw new IOException(ex);
        }
    }

    public Collection<NamedElement>  readInstances(Object inDocument, EteModel inoutModel) throws IOException {
        Logger  logger = Logger.getGlobal();
        logger.log(Level.FINER, "Reading instances");
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, INSTANCE_PATH, INSTANCE_SPECIFICATION);
        readSlots(inDocument, inoutModel);
        return result;        
    }

    public Collection<NamedElement> readSlots(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, SLOT_PATH, SLOT);
//        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, SLOT_PATH, SLOT);
        return result;        
    }

    @Override
    public Collection<NamedElement> readInvariants(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, INVARIANT_PATH, INVARIANT);
        return result;
    }


    @Override
    public Collection<NamedElement> readSpecifications(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, PRECONDITION_PATH, PRECONDITION);
        Collection<NamedElement> others = readElementsByPath((Document) inDocument, inoutModel, CONSTRAINT_PATH, CONSTRAINT);
        result.addAll(others);
        Collection<NamedElement> post = readElementsByPath((Document) inDocument, inoutModel, POSTCONDITION_PATH, POSTCONDITION);
        result.addAll(post);
        return result;
    }

    @Override
    public Collection<NamedElement> readProfiles(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, PROFILE_PATH, PROFILE);
        return result;
    }



    @Override
    public Collection<NamedElement> readStereotypes(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, STEREOTYPE_PATH, STEREOTYPE);
        return result;
    }


    @Override
    public void applyStereotypes(Object inDocument, EteModel inoutModel) throws IOException {
    }


  

    //========================================================================//


    /**
     * Reads all elements described by inPath, using inNode as context.<br>
     * Each DOM element is converted into a NamedElement by the factory
     * associated to inType.<br>
     * Every element is added to its own parent in the model.
     * 
     * @param inNode
     * @param inModel
     * @param inPath
     * @param inType
     * @return
     * @throws IOException 
     */
    protected List<NamedElement> readElements(Node inNode, EteModel inModel,
                    String inPath, String inType) throws IOException {
        Logger      logger = Logger.getGlobal();
        try {
            NodeList elementsByType = getElementsByType(inPath, inNode);
            logger.log(Level.FINE, "Reading elements with " + inPath + " of type " + inType + " found " + elementsByType.getLength() + " elements");
            return _doReadElements(elementsByType, inNode, inModel, inPath, inType);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XmlModelReader.class.getName()).log(Level.INFO, null, ex);
            throw new IOException(ex);
        }
    }

    /**
     * Reads all elements matching the path, using inNode as context.<br>
     * Each DOM element is converted into a NamedElement by the factory
     * associated to inType.<br>
     * Every element is added to its own parent in the model.
     * 
     * @param inNode
     * @param inModel
     * @param inPath
     * @param inType
     * @return
     * @throws IOException 
     */
    protected List<NamedElement> readElementsByPath(Node inNode, EteModel inModel,
            String inPath, String inType) throws IOException {
        try {
            NodeList elementsByType = getElements(inPath, inNode);
            return _doReadElements(elementsByType, inNode, inModel, inPath, inType);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(XmlModelReader.class.getName()).log(Level.FINE, null, ex);
            throw new IOException(ex);
        }
    }

    /**
     * Reads the elements in the node list. For each element, creates an
     * according named element and sets its name.<br>
     * The new named element is added to its parent.<br>
     * Then visitors are invoked for the new named element.
     * 
     * @param elements
     * @param inNode
     * @param inModel
     * @param inPath
     * @param inType
     * @return
     * @throws IOException 
     */
    protected List<NamedElement> _doReadElements(NodeList elements, Node inNode, EteModel inModel,
            String inPath, String inType) throws IOException {
        try {
            List<NamedElement> result = (List<NamedElement>) FactoryRegistry.getRegistry().getFactory(XLIST).newInstance();
            AbstractFactory factory = FactoryRegistry.getRegistry().getFactory(inType);
            elements : for (int i=0 ; i<elements.getLength() ; i++) {
                Element domElement = (Element)elements.item(i);
                NamedElement newInstance = (NamedElement)factory.newInstance();
                String name = domElement.getAttribute("name");
                // TODO : we should read objects with empty name or no name.
                // Such objects can be associations
                if (null != name && !"".equals(name)) {
                    newInstance.setName(name);
                }
                System.out.println("ELEMENT LU : " + newInstance + " (" + newInstance.getClass() + ")");
                String id = domElement.getAttribute("xmi:id");
                newInstance.setId(id);
                System.out.println("Id ajoute : " + id);
                inModel.addElement(newInstance);
                System.out.println("Element ajoute au modele");
                Node parentNode = domElement.getParentNode();
                String parentId   = parentNode instanceof Element ? ((Element)parentNode).getAttribute("xmi:id"):"";
                System.out.println("ParentId : [" + parentId + "]");
                NamedElement parentNamedElement = inModel.getElementById(parentId);
//                String parentName = parentNode instanceof Element ? ((Element)parentNode).getAttribute("name"):"";
//                PackageableElement parentElement = inModel.getElementByName(parentName);
                System.out.println("DEBUT DES VISITES");
                visitors : for (DynamicVisitorSupport visitor : getVisitors()) {
                    try {
                        System.out.println("   VISITEUR : " + visitor);
                        visitor.genericVisit(newInstance, parentNamedElement, inModel, domElement);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(XmlModelReader.class.getName()).log(Level.FINE, null, ex);
                        Logger.getGlobal().log(Level.WARNING, "Error when visiting {0} : {1}", new Object[]{newInstance.getName(), ex});
                        continue elements;
                    }
                }
                result.add(newInstance);
            }
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(XmlModelReader.class.getName()).log(Level.FINE, null, ex);
            throw new IOException(ex);
        }
    }





    //========================================================================//
    //                            A C C E S S O R S                           //
    //========================================================================//


    /**
     * Returns the visitors.<br>
     * If there is no visitors, adds a default one.
     * 
     * @return 
     */
    public Collection<DynamicVisitorSupport> getVisitors() throws InstantiationException {
        if (visitors.isEmpty()) {
            try {
                visitors.add((DynamicVisitorSupport) FactoryRegistry.newInstance(READER_VISITOR));
            } catch (IllegalAccessException ex) {
                Logger.getLogger(XmlModelReader.class.getName()).log(Level.FINE, null, ex);
                // OK, never mind, we'll get a "weak" model
            }
        }
        return visitors;
    }

 
    @Override
    public void addVisitors(DynamicVisitorSupport... inVisitors) {
        Collections.addAll(visitors, inVisitors);
    }


    public void setVisitors(Collection<DynamicVisitorSupport> visitors) {
        this.visitors = visitors;
    }



    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//



    /**
     * 
     */
    private     Collection<DynamicVisitorSupport>       visitors = new LinkedList<>();



}

