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
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.util.Collection;
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
import org.w3c.dom.NamedNodeMap;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import static fr.insset.jeanluc.ete.meta.model.emof.MofParameter.MOF_PARAMETER;
import fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification;
import fr.insset.jeanluc.ete.meta.model.emof.instance.Slot;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.PrimitiveType;
import fr.insset.jeanluc.ete.util.XList;
import static fr.insset.jeanluc.xmi.io.impl.XmlUtilities.getElements;
import static fr.insset.jeanluc.xmi.io.impl.XmlUtilities.getStringValue;



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
 * Todo : there are two responsibilities in this class<ul>
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


    /* This code has been removed from the constructor
        registering "visit" with "fr.insset.jeanluc.ete.meta.model.emof",
                    "fr.insset.jeanluc.ete.meta.model.mofpackage",
                    "fr.insset.jeanluc.ete.meta.model.constraint"
        registering TagValueDefinition.class with "visitTagValueDefinition"
        registering TagValue.class with "visitTagValue"
    */
    public XmlModelReaderVisitor() {
        this.register(MofPackage.class, "visitMofPackage");
        this.register(PackageableElement.class, "visitPackageableElement");
        this.register(MofClass.class, "visitMofClass");
        this.register(PrimitiveType.class, "visitPrimitiveType");
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
    }




    //========================================================================//


    public Object visitMofPackage(MofPackage inElement, Object... inParam) {
        // A previous version translated the name of the package to lowercase
        // to match the java notations.
        // THIS WAS NOT CORRECT
        // We must leave the name of the package "as is" and set it to
        // lowercase only on need.
        return inElement;
    }



    public Object   visitPackageableElement(PackageableElement inElement, Object... inParam) {
        // This method can be called for a whole model. In such a case, there
        // is no parameters.
        if (inParam.length < 2) {
            return inElement;
        }
        NamedElement       parentElement = (NamedElement) inParam[0];
        Logger             logger = Logger.getGlobal();
        if (parentElement instanceof MofPackage) {
            MofPackage parentPackage = (MofPackage) parentElement;
            parentPackage.addPackagedElement(inElement);
            inElement.setOwningPackage(parentPackage);
        }
        else {
            logger.log(Level.WARNING, "the item {0} is not put into any package", inElement);
            if (null == parentElement) {
                logger.log(Level.INFO, "because there is no parent element");
            }
            else if (null == parentElement.getName()) {
                logger.log(Level.INFO, "because the parent element has no name");
            }
            else {
                logger.log(Level.INFO, "because the parent element is not a package : {0}", parentElement.getClass().getName());
            }
        }
        EteModel            inModel = (EteModel) inParam[1];
        inModel.addPackagedElement(inElement);
        return inElement;
    }


    //------------------------------------------------------------------------//


    public Object   visitMofClass(MofClass inElement, Object... inParam) {
        inElement = (MofClass) visitPackageableElement(inElement, inParam);

        Element elt = (Element) inParam[2];
        String isAbstract = elt.getAttribute("isAbstract");
        if ("true".equals(isAbstract)) {
            Logger             logger = Logger.getGlobal();
            logger.log(Level.FINER, "The class {0} is abstract", inElement.getName());
            inElement.setAbstract(true);
        }

        return inElement;
    }


    public Object   visitPrimitiveType(PrimitiveType inElement, Object... inParam) {
        return visitPackageableElement(inElement, inParam);
    }


    public Object visitEnumeration(Enumeration inElement, Object... inParam) throws InstantiationException, IllegalAccessException {
        inElement = (Enumeration) visitPackageableElement(inElement, inParam);

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
     * @throws fr.insset.jeanluc.ete.api.EteException
     * @throws XPathExpressionException 
     * @throws java.lang.IllegalAccessException 
     */
    public Object   visitProperty(MofProperty inProperty, Object... inParam) throws EteException, XPathExpressionException, IllegalAccessException {
        Logger  logger = Logger.getLogger(getClass().getName());
        logger.log(Level.FINE, "visiting {0} property", inProperty.getName());
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
            logger.log(Level.FINEST, "{0} added to {1}", new Object[]{inProperty.getName(), parentClass.getName()});
        }
        if (inProperty.getType() == null) {
            inProperty.setType(readType((Element)inParam[2], (EteModel)inParam[1]));
        }
        logger.log(Level.FINER, "Type of {0} is {1}", new Object[]{inProperty.getName(), inProperty.getType()});

        String stringValue = getStringValue("defaultValue/@value", elt);
        if (stringValue != null && ! "".equals(stringValue)) {
            logger.log(Level.FINE, "Setting {0} to {1}", new Object[]{inProperty.getName(), stringValue});
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
        
//        We should read multiplicity
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
        global.log(Level.FINE, "Visiting operation {0} with {1} parameter(s)", new Object[]{inOperation.getName(), paramElements});
        for (int i=0 ; i<paramElements.getLength() ; i++) {
            Element aParamElement = (Element)paramElements.item(i);
            String  direction = aParamElement.getAttribute("direction");
            if ("return".equals(direction)) {
                MofType type = readType(aParamElement, model);
                inOperation.setType(type);
                if (type instanceof MofClass) {
                    inOperation.getOwningMofClass().addDependance(type);
                }
            }
            else {
                try {
                    global.finest("    \"true\" parameter");
                    MofParameter   parameter = (MofParameter)FactoryRegistry.newInstance(MOF_PARAMETER);
                    global.log(Level.FINER, "    Instanciated : {0} ({1})", new Object[]{parameter, parameter.getClass()});
                    String      parameterName = aParamElement.getAttribute("name");
                        parameter.setName(parameterName);
                        global.log(Level.FINER, "Parameter : {0}", parameterName);
                        MofType     type = readType(aParamElement, model);
                        parameter.setType(type);
                        if (type instanceof MofClass) {
                            inOperation.getOwningMofClass().addDependance(type);
                        }
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
            logger.log(Level.FINE, "Setting instance type to {0}", classifier.getName());
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
     * @throws fr.insset.jeanluc.ete.api.EteException 
     * @throws java.lang.IllegalAccessException 
     */
    public Object visitStereotype(Stereotype inStereotype, Object... inParam) throws EteException, IllegalAccessException {
        try {
            // 1- read the standard information
            Element     element = (Element)inParam[2];
            if (inParam[0] == null || !(inParam[0] instanceof MofPackage)) {
                return inStereotype;
            }
            
            Logger globalLogger = Logger.getGlobal();
            globalLogger.log(Level.FINE, "Visiting stereotype {0}", inStereotype.getName());
            // add the sterotype to the profile
            MofPackage  profile = (MofPackage)inParam[0];
            profile.addPackagedElement(inStereotype);
            
            // 2- Read the TagValue declarations
            EteModel model = (EteModel) inParam[1];
            readTags(inStereotype, element, (EteModel)model);
            
            // 3- Look for usages ?
            // TODO : maybe this should be done in another method so we could
            // create the profile in a basic model and then use it in another
            // model
            
            // 3-a : create the local name of the tag
            String  parentName = profile.getName();
            String  stereotypeName = inStereotype.getName();
            String tagName = parentName + ":" + stereotypeName;
            
            // 3-b : get all the tags with that name
            globalLogger.log(Level.FINER, "Looking for {0}", tagName);
            String path        = "//*[name()='" + tagName + "']";
            globalLogger.log(Level.FINE, "path : {0}", path);
            NodeList evaluate = (NodeList) xPath.evaluate(path, element.getOwnerDocument(), XPathConstants.NODESET);
            globalLogger.log(Level.FINE, "{0} -> {1} {2} elements", new Object[]{tagName, evaluate, evaluate.getLength()});

            // 3-c : link the stereotype and elements
            for (int i=0 ; i<evaluate.getLength() ; i++) {
                // 3-c-1 : find the setereotyped element
                Element next = (Element)evaluate.item(i);
                globalLogger.log(Level.FINE, "examining {0}", next);
                NamedNodeMap attributes = next.getAttributes();
                linkStereotype(inStereotype, attributes, model);
            }      
            return inStereotype;
        } catch (XPathExpressionException | InstantiationException ex) {
            Logger.getLogger(XmlModelReaderVisitor.class.getName()).log(Level.SEVERE, null, ex);
            throw new EteException(ex);
        }
    }


    protected void readTags(Stereotype inStereotype, Element element, EteModel inModel) throws InstantiationException, IllegalAccessException, XPathExpressionException {
            String      path = "ownedAttribute";
        NodeList    evaluate = (NodeList) xPath.evaluate(path, element, XPathConstants.NODESET);
        for (int i=0 ; i<evaluate.getLength() ; i++) {
            Element tagValueDomElement = (Element) evaluate.item(i);
            TagValueDeclaration declaration = (TagValueDeclaration) FactoryRegistry.newInstance(TAG_VALUE_DECLARATION);
            String tagValueName = tagValueDomElement.getAttribute("name");
            declaration.setName(tagValueName);
            try {
                MofType readType = readType(tagValueDomElement, inModel);
                declaration.setValueType(readType);
                inStereotype.addTagValueDeclaration(declaration);
            }
            catch (EteException | IllegalAccessException ex) {
                // The exception is not harmful : the property is not
                // a tag value description
                Logger.getGlobal().log(Level.INFO, "Unable to read {0}", tagValueName);
            }
        }
    }       // readTags


    /**
     * Look for items in the model corresponding to the elements in the node
     * list
     * 
     * @param inStereotype : stereotype to add to items
     * @param attributes : attributes of the element defining the stereotype
     * @param model : model the elements belong to
     */
    protected void linkStereotype(Stereotype inStereotype, NamedNodeMap attributes, EteModel model) {
        NamedElement stereotypedElement = null;
        Logger globalLogger = Logger.getGlobal();
        for (int j = 0; j < attributes.getLength(); j++) {
            Node item = attributes.item(j);
            String attributeName = item.getNodeName();
            globalLogger.log(Level.FINER, "looking at attribute {0}", attributeName);
            String nodeValue = item.getNodeValue();
            if (attributeName.startsWith("base_")) {
                globalLogger.log(Level.FINE, "looking for element with id {0}", nodeValue);
                stereotypedElement = model.getElementById(nodeValue);
                if (stereotypedElement == null) {
                    return;
                }
                globalLogger.log(Level.FINE, "found {0}", nodeValue);
                stereotypedElement.addStereotype(inStereotype);
                globalLogger.log(Level.FINE,
                        "Element st\u00e9r\u00e9otyp\u00e9 : {0} -> {1}", new Object[]{inStereotype, stereotypedElement});
                break;
            }
        }
        // 3-c-2 : apply tag values
        for (int j = 0; j < attributes.getLength(); j++) {
            Node attributeNode = attributes.item(j);
            String attributeName = attributeNode.getNodeName();
            if (! attributeName.startsWith("base_") && !attributeName.equals("xmi:id")) {
                // read the "tag value" (actually, they are provided as
                // attributes of the tag)
                String attributeValue = attributeNode.getNodeValue();
                TagValueDeclaration tagValueDeclaration = inStereotype.getTagValueDeclaration(attributeName);
                // TODO : manage type conversion
                if (stereotypedElement != null) {
                    stereotypedElement.addTagValue(tagValueDeclaration, attributeValue);
                }
                globalLogger.log(Level.FINER, "Tag value on {0} : {1}={2}", new Object[]{stereotypedElement, tagValueDeclaration, attributeValue});
            }
        }

    }


    //+=======================================================================//


    protected MofType  readType(Element inElement, EteModel inModel) throws EteException, IllegalAccessException {
        MofType     result = null;
        String      attribute = inElement.getAttribute("type");
        Logger logger = Logger.getGlobal();
        logger.finer("Reading type");
        if (attribute != null && ! "".equals(attribute)) {
            result = (MofType)inModel.getElementById(attribute);
            logger.log(Level.FINER, "In readType, attribute = {0}", result);
        }
        else {
            try {
                String typeAsString = xPath.evaluate(TYPE_PATH, inElement);
                int index = typeAsString.lastIndexOf("::");
                typeAsString = typeAsString.substring(index+2);
                result = (MofType)inModel.getElementByName(typeAsString + TYPE_SUFFIX);
                logger.log(Level.FINER, "In readType, typeAsString = {0} -> {1}", new Object[]{typeAsString, result});
            } catch (java.lang.StringIndexOutOfBoundsException ex) {
                logger.log(Level.WARNING, "StringIndexOutOfBoundsException while extracting type from {0}", attribute);
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
                    logger.log(Level.FINE, "The type is a collection of {0}s", result);
                    MofCollection sequence = (MofCollection) FactoryRegistry.newInstance(MOF_SEQUENCE);
                    sequence.setBaseType(result);
                    logger.log(Level.FINER, "After wrapping : {0} ({1})", new Object[]{sequence.getName(), sequence.getClass()});
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
            inoutElement.setLower(1);
        }
    }   // readMultiplicity


    private final        XPathFactory    factory     = XPathFactory.newInstance();
    private final        XPath           xPath       = factory.newXPath();
    private final static String          TYPE_PATH   = "type/*/*/@referentPath";
    private final static String          LOWER_PATH  = ".//lowerValue/@value";
    private final static String          UPPER_PATH  = ".//upperValue/@value";


}

