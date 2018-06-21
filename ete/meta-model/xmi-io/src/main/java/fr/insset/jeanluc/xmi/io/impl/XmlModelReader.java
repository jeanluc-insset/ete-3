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
import static fr.insset.jeanluc.ete.meta.model.types.PrimitiveType.PRIMITIVE_TYPE;
import fr.insset.jeanluc.util.visit.DynamicVisitor;
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
public class XmlModelReader implements ModelReader, XmlPaths {


    public XmlModelReader() throws InstantiationException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(READER_VISITOR, XmlModelReaderVisitor.class);
        registry.registerFactory(XLIST, XList.class);
    }

    @Override
    public EteModel readModel(Object inDocument, EteModel inParent) throws IllegalAccessException, InstantiationException, IOException {
        nextModelId++;
        return ModelReader.super.readModel(inDocument, inParent); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<NamedElement> readPrimitiveTypes(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, getPrimitiveTypePath(), PRIMITIVE_TYPE);
        return result;
    }

    @Override
    public Collection<NamedElement> readPackages(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, getPackagePath(), MOF_PACKAGE);
        return result;
    }


    @Override
    public Collection<NamedElement> readClasses(Object inDocument, EteModel inoutModel) throws IOException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        AbstractFactory factory = registry.getFactory(MOF_CLASS);
        Class builtClass = factory.getBuiltClass();
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, getClassPath(), MOF_CLASS);
        return result;
    }

    @Override
    public Collection<NamedElement> readEnumerations(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, getEnumPath(), MOF_ENUMERATION);
        return result;
    }

    @Override
    public Collection<NamedElement> readAssociations(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, getAssociationPath(), ASSOCIATION);

        return result;
    }


    @Override
    public Collection<NamedElement> readProperties(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, getPropertyPath(), MOF_PROPERTY);
        return result;
    }


    @Override
    public Collection<NamedElement> readOperations(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, getOperationPath(), MOF_OPERATION);
        return result;
    }

    @Override
    public void readGeneralizations(Object inDocument, EteModel inoutModel) throws IOException {
        try {
            NodeList elements = getElements("//generalization", (Document)inDocument);
            Logger  logger = Logger.getGlobal();
            for (int i=0 ; i<elements.getLength() ; i++) {
                Element next        = (Element) elements.item(i);
                String idSubClass   = getModelId() + ((Element)next.getParentNode()).getAttribute("name");
                String idSuperClass = getModelId() + next.getAttribute("general");
                logger.log(Level.FINER,"Ids : [" + idSubClass + "]   [" + idSuperClass + "]");
                try {
                    MofType subClass   = (MofType) inoutModel.getElementByName(idSubClass);
                    MofType superClass = (MofType) inoutModel.getElementById(idSuperClass);
                    logger.log(Level.FINER,"SubClass : " + subClass + " superClass : " + superClass);
                    if (subClass != null && superClass != null) {
                        Logger.getGlobal().log(Level.FINE, "Adding inheritance {0} -> {1}", new Object[]{subClass, superClass});
                        subClass.addSuperType(superClass);
                        subClass.addDependance(superClass);
                    }
                }
                catch (Exception ex) {
                    continue;
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
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, getInstancePath(), INSTANCE_SPECIFICATION);
        readSlots(inDocument, inoutModel);
        return result;        
    }

    public Collection<NamedElement> readSlots(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, getSlotPath(), SLOT);
//        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, SLOT_PATH, SLOT);
        return result;        
    }

    @Override
    public Collection<NamedElement> readInvariants(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, getInvariantPath(), INVARIANT);
        return result;
    }


    @Override
    public Collection<NamedElement> readSpecifications(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElementsByPath((Document) inDocument, inoutModel, getPreconditionPath(), PRECONDITION);
        Collection<NamedElement> others = readElementsByPath((Document) inDocument, inoutModel, getConstraintPath(), CONSTRAINT);
        result.addAll(others);
        Collection<NamedElement> post = readElementsByPath((Document) inDocument, inoutModel, getPostconditionPath(), POSTCONDITION);
        result.addAll(post);
        return result;
    }

    @Override
    public Collection<NamedElement> readProfiles(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, getProfilePath(), PROFILE);
        return result;
    }



    @Override
    public Collection<NamedElement> readStereotypes(Object inDocument, EteModel inoutModel) throws IOException {
        Collection<NamedElement> result = readElements((Document) inDocument, inoutModel, getStereotypePath(), STEREOTYPE);
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
                String id = domElement.getAttribute("xmi:id");
                newInstance.setId(getModelId() + id);
                inModel.addElement(newInstance);
                Node parentNode = domElement.getParentNode();
                String parentId = getModelId() + (parentNode instanceof Element ? ((Element)parentNode).getAttribute("xmi:id"):"");
                NamedElement parentNamedElement = inModel.getElementById(parentId);
//                String parentName = parentNode instanceof Element ? ((Element)parentNode).getAttribute("name"):"";
//                PackageableElement parentElement = inModel.getElementByName(parentName);
                visitors : for (DynamicVisitor visitor : getVisitors()) {
                    try {
                        visitor.genericVisit(newInstance, parentNamedElement, inModel, domElement);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(XmlModelReader.class.getName()).log(Level.FINE, null, ex);
                        Logger.getGlobal().log(Level.FINE, "Error when visiting {0} : {1}", new Object[]{newInstance.getName(), ex});
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
    @Override
    public Iterable<DynamicVisitor> getVisitors() {
        
        if (visitors.isEmpty()) {
            try {
                visitors.add((DynamicVisitorSupport) FactoryRegistry.newInstance(READER_VISITOR));
            } catch (IllegalAccessException ex) {
                Logger.getLogger(XmlModelReader.class.getName()).log(Level.FINE, null, ex);
                // OK, never mind, we'll get a "weak" model
            } catch (InstantiationException ex) {
                Logger.getLogger(XmlModelReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return visitors;
    }

 
    @Override
    public void addVisitors(DynamicVisitor... inVisitors) {
        Collections.addAll(visitors, inVisitors);
    }


    public void setVisitors(Collection<DynamicVisitorSupport> visitors) {
        visitors.clear();
        visitors.addAll(visitors);
    }



    public static   String  getModelId() {
        return "" ; // nextModelId + ":";
    }
    

    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//



    /**
     * 
     */
    private     List<DynamicVisitor>       visitors = new LinkedList<>();

    /**
     * We must avoid id collisions in a process which handles several models.
     * The nextModelId is used as a prefix.>
     */
    private static int        nextModelId = 0;


}

