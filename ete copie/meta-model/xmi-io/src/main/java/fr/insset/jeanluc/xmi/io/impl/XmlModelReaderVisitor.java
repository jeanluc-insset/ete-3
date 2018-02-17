package fr.insset.jeanluc.xmi.io.impl;



import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.constraint.Constraint;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import static fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes.TYPE_SUFFIX;
import fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural;
import static fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural.UNBOUND;
import static fr.insset.jeanluc.ete.meta.model.datatype.UnlimitedNatural.UNLIMITED_NATURAL;
import fr.insset.jeanluc.ete.meta.model.emof.AggregationKind;
import fr.insset.jeanluc.ete.meta.model.emof.Association;
import fr.insset.jeanluc.ete.meta.model.emof.Enumeration;
import fr.insset.jeanluc.ete.meta.model.emof.Literal;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MultiplicityElement;
import fr.insset.jeanluc.ete.meta.model.emof.Stereotype;
import fr.insset.jeanluc.ete.meta.model.emof.TagValueDeclaration;
import static fr.insset.jeanluc.ete.meta.model.emof.TagValueDeclaration.TAG_VALUE_DECLARATION;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.types.Generalization;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import static fr.insset.jeanluc.ete.meta.model.types.collections.MofSequence.MOF_SEQUENCE;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import static fr.insset.jeanluc.ete.meta.model.emof.MofParameter.MOF_PARAMETER;
import fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification;
import fr.insset.jeanluc.ete.meta.model.emof.instance.Slot;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.util.XList;
import static fr.insset.jeanluc.xmi.io.impl.XmlUtilities.getElements;
import static fr.insset.jeanluc.xmi.io.impl.XmlUtilities.getStringValue;
import javax.lang.model.element.PackageElement;



/**
 * <div>
 * The read process reads elements of any kind. But each element must be
 * handled differently.<br>
 * Furthermore, the process may be customized.<br>
 * So we use a visitor to provide that double polymorphism.
 * </div>
 * 
 * <div>
 * In order to achieve its goal, the visitor requires for some of its methods
 * <ul>
 * <li>of course, obj, the object it is visiting</li>
 * <li>the object that should contain obj</li>
 * <li>the model which should own obj</li>
 * <li>and the XML element defining obj</li>
 * </ul>
 * </div>
 * 
 * <div>
 * TODO : there are two responsibilities in this class<ul>
 * <li>to complete the read process</li>
 * <li>to deal with XML specifics</li>
 * </ul>
 * The first task must be achieved whatever the format is.<br>
 * The second one is the way to get information.<br>
 * So this class should be split&nbsp;:<ul>
 * <li>a generic visitor to complete the process</li>
 * <li>a helper class to read specific XML</li>
 * </ul>
 * </div>
 *
 * @author jldeleage
 */
public class XmlModelReaderVisitor extends DynamicVisitorSupport {


    public XmlModelReaderVisitor() {
//        this.register("visit",
//                    "fr.insset.jeanluc.ete.meta.model.emof",
//                    "fr.insset.jeanluc.ete.meta.model.mofpackage",
//                    "fr.insset.jeanluc.ete.meta.model.constraint");
        this.register(Package.class, "visitPackage");
        this.register(PackageableElement.class, "visitPackageableElement");
        this.register(MofClass.class, "visitMofClass");
        this.register(Enumeration.class, "visitEnumeration");
        this.register(MofProperty.class, "visitProperty");
        this.register(Association.class, "visitAssociation");
        this.register(MofOperation.class, "visitOperation");
        this.register(Invariant.class, "visitInvariant");
        this.register(Postcondition.class, "visitPostcondition");
        this.register(Constraint.class, "visitConstraint");
        this.register(Precondition.class, "visitPrecondition");
        this.register(Stereotype.class, "visitStereotype");
        this.register(InstanceSpecification.class, "visitInstanceSpecification");
        this.register(Slot.class, "visitSlot");
//        this.register(TagValueDefinition.class, "visitTagValueDefinition");
//        this.register(TagValue.class, "visitTagValue");
    }




    //========================================================================//


    public Object   visitPackageableElement(PackageableElement inElement, Object... inParam) {
        PackageableElement packageable = (PackageableElement) inElement;
        NamedElement       parentElement = (NamedElement) inParam[0];
        if (parentElement instanceof MofPackage) {
            MofPackage parentPackage = (MofPackage) parentElement;
            parentPackage.addPackagedElement(packageable);
            packageable.setOwningPackage(parentPackage);
        }
        EteModel            inModel = (EteModel) inParam[1];
        inModel.addPackagedElement(packageable);
        return inElement;
    }


    //------------------------------------------------------------------------//


    public Object   visitMofClass(MofClass inElement, Object... inParam) {
        PackageableElement packageable = (PackageableElement) inElement;
        NamedElement       parentElement = (NamedElement) inParam[0];
        Logger             logger = Logger.getGlobal();
        if (parentElement instanceof MofPackage) {
            MofPackage parentPackage = (MofPackage) parentElement;
            parentPackage.addPackagedElement(packageable);
            packageable.setOwningPackage(parentPackage);
            logger.log(Level.FINER, "the item {0} is put into package {1}", new Object[]{packageable, parentPackage});
        }
        else {
            logger.log(Level.WARNING, "the item " + packageable + " is not put into any package");
        }
        EteModel    inoutModel = (EteModel) inParam[1];
        inoutModel.addPackagedElement(packageable);

        Element elt = (Element) inParam[2];
        String isAbstract = elt.getAttribute("isAbstract");
        if ("true".equals(isAbstract)) {
            logger.log(Level.FINER, "The class " + inElement.getName() + " is abstract");
            inElement.setAbstract(true);
        }

        return inElement;
    }

    
    public Object visitEnumeration(Enumeration inElement, Object... inParam) throws InstantiationException, IllegalAccessException {
        PackageableElement packageable = (PackageableElement) inElement;
        NamedElement       parentElement = (NamedElement) inParam[0];
        Logger             logger = Logger.getGlobal();
        if (parentElement instanceof MofPackage) {
            MofPackage parentPackage = (MofPackage) parentElement;
            parentPackage.addPackagedElement(packageable);
            packageable.setOwningPackage(parentPackage);
            logger.log(Level.FINER, "the item {0} is put in package {1}", new Object[]{packageable, parentPackage});
        }
        else {
            logger.log(Level.WARNING, "the item " + packageable + " is not put in any package");
        }
        EteModel    inoutModel = (EteModel) inParam[1];
        inoutModel.addPackagedElement(packageable);

        Element     element = (Element) inParam[2];
        NodeList childNodes = element.getChildNodes();
        // Read the literals
        // We could have readen them in a dedicated couple of methods
        // (read, visit) but we read the literals directly.
        for (int i=0 ; i<childNodes.getLength() ; i++) {
            Node aChildNode = childNodes.item(i);
            if (! (aChildNode instanceof Element)) {
                continue;
            }
            Element aChildElement = (Element) aChildNode;
            if ("ownedLiteral".equals(aChildElement.getNodeName())) {
                String  value = aChildElement.getAttribute("name");
                Literal  newLiteral = (Literal) FactoryRegistry.newInstance("literal");
                inElement.addLiteral(newLiteral);
            }
        }

        return inElement;
    }

    //------------------------------------------------------------------------//


    /**
     * 
     * @param inProperty
     * @param inParam
     * @return
     * @throws XPathExpressionException 
     */
    public Object   visitProperty(MofProperty inProperty, Object... inParam) throws EteException, XPathExpressionException, IllegalAccessException {
        Logger  logger = Logger.getLogger(getClass().getName());
        logger.log(Level.FINE, "visiting " + inProperty.getName() + " property");
        Element elt = (Element) inParam[2];
        String attribute = elt.getAttribute("readOnly");
        inProperty.setReadOnly("true".equals(attribute));
        attribute = elt.getAttribute("static");
        inProperty.setStatic("true".equals(attribute));
        attribute = elt.getAttribute("aggregation");
        if ("composite".equals(attribute)) {
            inProperty.setAggregationKind(AggregationKind.COMPOSITION);
        } else if (attribute.equals("aggregation")) {
            inProperty.setAggregationKind(AggregationKind.AGGREGATION);
        }
        attribute = elt.getAttribute("isOrdered");
        if ("true".equals(attribute)) {
            inProperty.setOrdered(true);
        }
        MofClass    parentClass = (MofClass) inParam[0];
        if (parentClass != null) {
            parentClass.addOwnedAttribute((MofProperty) inProperty);
            logger.log(Level.FINEST, inProperty.getName() + " added to " + parentClass.getName());
        }
        if (inProperty.getType() == null) {
            inProperty.setType(readType((Element)inParam[2], (EteModel)inParam[1]));
        }
        logger.log(Level.FINER, "Type of " + inProperty.getName() + " is " + inProperty.getType());

        String stringValue = getStringValue("defaultValue/@value", elt);
        if (stringValue != null && ! "".equals(stringValue)) {
            logger.log(Level.FINE, "Setting " + inProperty.getName() + " to " + stringValue);
            inProperty.setDefaultValue(stringValue);
        }
        NodeList elements = XmlUtilities.getElements("qualifier", elt);
        if (elements.getLength()>0) {
            Element qualifierElement = (Element)elements.item(0);
            MofType qualifierType = readType(qualifierElement, (EteModel)inParam[1]);
            inProperty.setQualifierType(qualifierType);
            inProperty.setQualifierName(qualifierElement.getAttribute("name"));
            logger.log(Level.FINE, "QUALIFICATION - {0} : {1}", new Object[]{qualifierElement.getAttribute("name"), qualifierType});
        }
        
//        readMultiplicity(inProperty, (Element)inParam[2], (EteModel)inParam[1]);
        return inProperty;
    }


    //------------------------------------------------------------------------//


    public Object   visitOperation(MofOperation inOperation, Object... inParam) throws EteException, IllegalAccessException {
        Logger  global  = Logger.getGlobal();
        MofClass    parentClass = (MofClass) inParam[0];
        if (parentClass != null) {
            parentClass.addOwnedOperation(inOperation);
        }
        EteModel    model = (EteModel)inParam[1];
        Element     element = (Element)inParam[2];
        NodeList    paramElements = element.getElementsByTagName("ownedParameter");
        global.info("Visiting operation " + inOperation.getName() + " with " + paramElements + " parameter(s)");
        for (int i=0 ; i<paramElements.getLength() ; i++) {
            Element aParamElement = (Element)paramElements.item(i);
            String  direction = aParamElement.getAttribute("direction");
            if ("return".equals(direction)) {
                MofType type = readType(aParamElement, model);
                inOperation.setType(type);
            }
            else {
                try {
                    global.finer("    \"true\" parameter");
                    MofParameter   parameter = (MofParameter)FactoryRegistry.newInstance(MOF_PARAMETER);
                    String      parameterName = aParamElement.getAttribute("name");
                    global.info("    name : " + parameterName);
//                    parameter.setName(parameterName);
                    MofType     type = readType(aParamElement, model);
                    parameter.setType(type);
                    inOperation.addOwnedParameter(parameter);
                } catch (InstantiationException ex) {
                    Logger.getLogger(XmlModelReaderVisitor.class.getName()).log(Level.SEVERE, null, ex);
                    throw new EteException(ex);
                }
            }
        }
        return inOperation;
    }


    //------------------------------------------------------------------------//


    /**
     * 
     * @param inAssociation
     * @param inParam
     * @return 
     */
    public Object   visitAssociation(Association inAssociation, Object... inParam) {
        Collection<NamedElement> memberEnds = getNamedElements("memberEnd", "xmi:idref", (Element) inParam[2], (EteModel) inParam[1]);

        MofProperty[]  properties  = new MofProperty[2];
        int         index       = 0;
        for (NamedElement aNamedElement : memberEnds) {
            MofProperty prop = (MofProperty) aNamedElement;
            properties[index++] = prop;
            inAssociation.addMemberEnd(prop);
            prop.setAssociation(inAssociation);
        }
        properties[0].setOpposite(properties[1]);
        properties[1].setOpposite(properties[0]);
        Classifier firstClass = properties[0].getOwningMofClass();
        Classifier secondClass = properties[1].getOwningMofClass();
        if (null != secondClass.getName() && ! "void".equals(secondClass.getName()))
            firstClass.addDependance(secondClass);
        if (null != firstClass.getName() && ! "void".equals(firstClass.getName()))
            secondClass.addDependance(firstClass);

        memberEnds = getNamedElements("ownedEnd", "xmi:id", (Element)inParam[2], (EteModel) inParam[1]);
        for (NamedElement aNamedElement : memberEnds) {
            inAssociation.addOwnedEnd((MofProperty) aNamedElement);
        }
        return inAssociation;
    }


    //------------------------------------------------------------------------//


    public InstanceSpecification visitInstanceSpecification(InstanceSpecification inInstance, Object... inParam) throws XPathExpressionException {
        // read classifier -> type
        Element element = (Element)inParam[2];
        String classifierId = getStringValue("classifier/@*", element);
        EteModel model = (EteModel)inParam[1];
        MofType classifier = (MofType) model.getElementById(classifierId);
        if (classifier != null) {
            Logger logger = Logger.getGlobal();
            logger.log(Level.FINE, "Setting instance type to " + classifier.getName());
            inInstance.setType(classifier);
            classifier.addInstance(inInstance);
        }
        return inInstance;
    }

    public Slot visitSlot(Slot inSlot, Object... inParam) throws XPathExpressionException {
        // add the slot to its containing instance
        InstanceSpecification   owningInstance = (InstanceSpecification) inParam[0];
        owningInstance.addSlot(inSlot);
        Element     slotElement = (Element) inParam[2];
        EteModel    model   = (EteModel) inParam[1];
        NodeList list = getElements("value", slotElement);
        if (list.getLength() > 0) {
            String  definedFeatureId = slotElement.getAttribute("definingFeature");
            MofProperty     definedFeature = (MofProperty) model.getElementById(definedFeatureId);
            inSlot.setMofProperty(definedFeature);
            inSlot.setName(definedFeature.getName());
            Element valueElement = (Element)list.item(0);
            // is it an instance reference ?
            String  instanceReference = getStringValue("@instance", valueElement);
            if (instanceReference != null) {
                NamedElement instance = model.getElementById(instanceReference);
                if (instance != null) {
                    inSlot.setValue(instance);
                    return inSlot;
                }
            }
            String  value = getStringValue("@value", valueElement);
            if (value != null) {
                inSlot.setValue(value);
                return inSlot;
            }
        }        
        return inSlot;
    }

    //------------------------------------------------------------------------//


    public Invariant visitInvariant(Invariant inInvariant, Object... inParam) throws XPathExpressionException {
        inInvariant = (Invariant)doVisitConstraint(inInvariant, inParam);
        ((MofClass)inParam[0]).addInvariant(inInvariant);
        return inInvariant;
    }


    //------------------------------------------------------------------------//


    public Precondition visitPrecondition(Precondition inPrecondition, Object... inParam) throws XPathExpressionException {
        inPrecondition = (Precondition) doVisitConstraint(inPrecondition, inParam);
        ((MofOperation)inParam[0]).addPrecondition(inPrecondition);
        return inPrecondition;
    }



    public Postcondition visitPostcondition(Postcondition inPostcondition, Object... inParam) throws XPathExpressionException {
        inPostcondition = (Postcondition) doVisitConstraint(inPostcondition, inParam);
        ((MofOperation)inParam[0]).addPostcondition(inPostcondition);
        return inPostcondition;
    }

    public Constraint visitConstraint(Constraint inConstraint, Object... inParam) throws XPathExpressionException {
        doVisitConstraint(inConstraint, inParam);
        Logger logger = Logger.getLogger(getClass().getCanonicalName());
        logger.log(Level.FINE, "VISITING CONSTRAINT {0}", inConstraint.getSpecificationAsString());
        return inConstraint;
    }

    protected Constraint doVisitConstraint(Constraint inConstraint, Object... inParam) throws XPathExpressionException {
        inConstraint.setContext((NamedElement)inParam[0]);
        String body = xPath.evaluate("specification/body/text()", (Element)inParam[2]);
        inConstraint.setSpecificationAsString(body);
        NamedElement constrainedElement = (NamedElement)inParam[0];
        constrainedElement.addConstraint(inConstraint);
        return inConstraint;
    }


    //========================================================================//


    protected Collection<NamedElement> getNamedElements(String inName, String inAttributeName, Element inElement, EteModel inModel) {
        Collection<NamedElement> result = new XList<>();
        NodeList childNodes = inElement.getChildNodes();
        for (int i=0 ; i<childNodes.getLength() ; i++) {
            Node n = childNodes.item(i);
            if (! inName.equals(n.getNodeName())) {
                continue;
            }
            Element elt = (Element) n;
            String attribute = elt.getAttribute(inAttributeName);
            NamedElement elementById = inModel.getElementById(attribute);
            result.add(elementById);
        }
        return result;
    }


    //------------------------------------------------------------------------//


    /**
     * WARNING : actually, stereotypes are used in a three steps way&nbsp;:<ol>
     * <li>define the stereotype and the stereotyped item</li>
     * <li>define a name to stereotype tags</li>
     * <li>apply a link between stereotypes and items using the previously
     * defined tag</li>
     * </ol>
     * Unfortunately, the links do not refer the stereotype by Id but by name
     * of the locally defined tag.
     * 
     * @param inStereotype
     * @param inParam
     * @return the visited object, actually the first parameter
     * @throws XPathExpressionException 
     */
    public Object visitStereotype(Stereotype inStereotype, Object... inParam) throws EteException, IllegalAccessException {
        try {
            Element     element = (Element)inParam[2];
            if (inParam[0] == null || !(inParam[0] instanceof MofPackage)) {
                return inStereotype;
            }
            
            Logger globalLogger = Logger.getGlobal();
            globalLogger.log(Level.FINE, "Visiting stereotype " + inStereotype.getName());
            // add the sterotype to the profile
            MofPackage  profile = (MofPackage)inParam[0];
            profile.addPackagedElement(inStereotype);
            
            // 2- Read the TagValue declarations
            String      path = "ownedAttribute";
            NodeList    evaluate = (NodeList) xPath.evaluate(path, element, XPathConstants.NODESET);
            for (int i=0 ; i<evaluate.getLength() ; i++) {
                Element tagValueDomElement = (Element) evaluate.item(i);
                TagValueDeclaration declaration = (TagValueDeclaration) FactoryRegistry.newInstance(TAG_VALUE_DECLARATION);
                String tagValueName = tagValueDomElement.getAttribute("name");
                declaration.setName(tagValueName);
                try {
                    MofType readType = readType(tagValueDomElement, (EteModel) inParam[1]);
                    declaration.setValueType(readType);
                    inStereotype.addTagValueDeclaration(declaration);
                }
                catch (Exception ex) {
                    // The exception is not harmful : the property is not
                    // a tag value description
                    Logger.getGlobal().log(Level.INFO, "Unable to read " + tagValueName);
                }
            }
            
            // 3- Look for usages ?
            // TODO : maybe this should be done in another method so we could
            // create the profile in on basic model and then use it in another
            // model
            
            // 3-a : create the local name of the tag
            String  parentName = profile.getName();
            String  stereotypeName = inStereotype.getName();
            String tagName = parentName + ":" + stereotypeName;
            
            // 3-b : get all the tags with that name
            globalLogger.log(Level.FINER, "Looking for " + tagName);
            EteModel    model       = (EteModel) inParam[1];
            Element     domElement  = (Element) inParam[2];
            path        = "//*[name()='" + tagName + "']";
            globalLogger.log(Level.FINE, "path : " +  path);
            evaluate = (NodeList) xPath.evaluate(path, domElement.getOwnerDocument(), XPathConstants.NODESET);
            globalLogger.log(Level.FINE, tagName  + " -> " + evaluate + " " + evaluate.getLength() + " elements");
            
            // 3-c : link the stereotype and the element
            extern : for (int i=0 ; i<evaluate.getLength() ; i++) {
                // 3-c-1 : find the setereotyped element
                NamedElement stereotypedElement = null;
                Element next = (Element)evaluate.item(i);
                globalLogger.log(Level.FINE, "examining " + next);
                NamedNodeMap attributes = next.getAttributes();
                for (int j=0 ; j<attributes.getLength() ; j++) {
                    Node item = attributes.item(j);
                    String  attributeName = item.getNodeName();
                    globalLogger.log(Level.FINER, "looking at attribute " + attributeName);
                    String nodeValue = item.getNodeValue();
                    if (attributeName.startsWith("base_")) {
                        globalLogger.log(Level.FINE, "looking for element with id " + nodeValue);
                        stereotypedElement = model.getElementById(nodeValue);
                        if (stereotypedElement == null) {
                            continue extern;
                        }
                        globalLogger.log(Level.FINE, "found " + nodeValue);
                        stereotypedElement.addStereotype(inStereotype);
                        globalLogger.log(Level.FINE,
                                "Element st\u00e9r\u00e9otyp\u00e9 : {0} -> {1}", new Object[]{inStereotype, stereotypedElement});
                        break;
                    }
                }
                // 3-c-2 : apply tag values
                for (int j=0 ; j<attributes.getLength() ; j++) {
                    Node attributeNode = attributes.item(j);
                    String  attributeName = attributeNode.getNodeName();
                    if (attributeName.startsWith("base_")) {
                        continue;
                    }
                    else if (! attributeName.equals("xmi:id")) {
                        // read the "tag value" (actually, they are provided as
                        // attributes of the tag)
                        String attributeValue = attributeNode.getNodeValue();
                        TagValueDeclaration tagValueDeclaration = inStereotype.getTagValueDeclaration(attributeName);
                        // TODO : manage type conversion
                        stereotypedElement.addTagValue(tagValueDeclaration, attributeValue);
                        globalLogger.log(Level.FINER, "Tag value on " + stereotypedElement + " : " + tagValueDeclaration + "=" + attributeValue);
                    }
                }       //
            }       // loop on the XMI tags of sterotypes
            
            return inStereotype;
        } catch (XPathExpressionException | InstantiationException ex) {
            Logger.getLogger(XmlModelReaderVisitor.class.getName()).log(Level.SEVERE, null, ex);
            throw new EteException(ex);
        }
    }

    //+=======================================================================//


    protected MofType  readType(Element inElement, EteModel inModel) throws EteException, IllegalAccessException {
        MofType     result = null;
        String      attribute = inElement.getAttribute("type");
        Logger logger = Logger.getGlobal();
        logger.info("Reading type");
        if (attribute != null && ! "".equals(attribute)) {
            result = (MofType)inModel.getElementById(attribute);
            logger.log(Level.INFO, "In readType, attribute = " + result);
        }
        else {
            try {
                String typeAsString = xPath.evaluate(TYPE_PATH, inElement);
                int index = typeAsString.lastIndexOf("::");
                typeAsString = typeAsString.substring(index+2);
                result = (MofType)inModel.getElementByName(typeAsString + TYPE_SUFFIX);
                logger.log(Level.INFO, "In readType, typeAsString = " + typeAsString + " -> " + result);
            } catch (java.lang.StringIndexOutOfBoundsException ex) {
                logger.log(Level.WARNING, "StringIndexOutOfBoundsException while extracting type from " + attribute);
            } catch (XPathExpressionException ex) {
                Logger.getLogger(XmlModelReaderVisitor.class.getName()).log(Level.SEVERE, null, ex);
                throw new EteException(ex);
            }
        }
        NodeList upperValues = inElement.getElementsByTagName("upperValue");
        if (upperValues.getLength() > 0) {
            String upperValue = ((Element)upperValues.item(0)).getAttribute("value");
            if (! "1".equals(upperValue)) {
                try {
                    // TODO : check properties of the association to derive the
                    // true nature of the collection
                    logger.log(Level.INFO, "The type is a collection of " + result + "s");
                    MofCollection sequence = (MofCollection) FactoryRegistry.newInstance(MOF_SEQUENCE);
                    sequence.setBaseType(result);
                    logger.log(Level.INFO, "After wrapping : " + sequence.getName() + " (" + sequence.getClass() + ")");
                    result = sequence;
                } catch (InstantiationException ex) {
                    throw new EteException(ex);
                }
            }
        }
        return result;
    }



    protected void   readMultiplicity(MultiplicityElement inoutElement, Element inXmlElement, EteModel inModel) throws EteException, XPathExpressionException, IllegalAccessException {
        String upperAsString = xPath.evaluate(UPPER_PATH, inXmlElement);
        Logger logger = Logger.getGlobal();
        if (UNBOUND.equals(upperAsString)) {
            try {
                // TODO
                UnlimitedNatural unbound = (UnlimitedNatural) FactoryRegistry.newInstance(UNLIMITED_NATURAL);
                unbound.setValue(UNBOUND);
                inoutElement.setUpper(unbound);
                logger.log(Level.FINER, "Unlimited upper bound");
            } catch (InstantiationException ex) {
                Logger.getLogger(XmlModelReaderVisitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            try {
                inoutElement.setUpper(Integer.parseInt(upperAsString));
            }
            catch (NumberFormatException e) {
                // our friend tried to give us a fake
                inoutElement.setUpper(1);
            }
        }       // upper != *
        String lowerAsString = xPath.evaluate(LOWER_PATH, inXmlElement);
        try {
            inoutElement.setLower(Integer.parseInt(lowerAsString));
        }
        catch (NumberFormatException e) {
            // There is no lower value for multiplicity. Let's take 1 instead
            inoutElement.setLower(
                UNBOUND.equals(inoutElement.getUpper()) ?0:1
            );
        }
    }   // readMultiplicity


    private final        XPathFactory    factory     = XPathFactory.newInstance();
    private final        XPath           xPath       = factory.newXPath();
    private final static String          TYPE_PATH   = "type/*/*/@referentPath";
    private final static String          LOWER_PATH  = ".//lowerValue/@value";
    private final static String          UPPER_PATH  = ".//upperValue/@value";


}

