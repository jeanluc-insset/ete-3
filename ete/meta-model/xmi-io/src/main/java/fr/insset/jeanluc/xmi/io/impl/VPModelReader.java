/*
 * xmi-io project
 * This project is a module of the ete module of the global ete-toolchain project
 */
package fr.insset.jeanluc.xmi.io.impl;

import static fr.insset.jeanluc.ete.meta.model.constraint.Constraint.CONSTRAINT;
import static fr.insset.jeanluc.ete.meta.model.constraint.Invariant.INVARIANT;
import static fr.insset.jeanluc.ete.meta.model.constraint.Postcondition.POSTCONDITION;
import static fr.insset.jeanluc.ete.meta.model.constraint.Precondition.PRECONDITION;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import static fr.insset.jeanluc.ete.meta.model.emof.Association.ASSOCIATION;
import static fr.insset.jeanluc.ete.meta.model.emof.Enumeration.MOF_ENUMERATION;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import static fr.insset.jeanluc.ete.meta.model.emof.MofProperty.MOF_PROPERTY;
import static fr.insset.jeanluc.ete.meta.model.emof.Stereotype.STEREOTYPE;
import static fr.insset.jeanluc.ete.meta.model.emof.instance.InstanceSpecification.INSTANCE_SPECIFICATION;
import static fr.insset.jeanluc.ete.meta.model.emof.instance.Slot.SLOT;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage.MOF_PACKAGE;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import static fr.insset.jeanluc.ete.meta.model.types.PrimitiveType.PRIMITIVE_TYPE;
import fr.insset.jeanluc.ete.util.XList;
import fr.insset.jeanluc.meta.model.io.ModelReader;
import fr.insset.jeanluc.util.factory.AbstractFactory;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import static fr.insset.jeanluc.xmi.io.impl.XmiPaths.PROFILE;
import static fr.insset.jeanluc.xmi.io.impl.XmiPaths.READER_VISITOR;
import static fr.insset.jeanluc.xmi.io.impl.XmiPaths.XLIST;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author jldeleage
 */
public class VPModelReader extends XmlModelReader implements XmiPaths {

   public VPModelReader() throws InstantiationException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(READER_VISITOR, XmlModelReaderVisitor.class);
        registry.registerFactory(XLIST, XList.class);
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
                        subClass.addDependency(superClass);
                    }
                }
                catch (Exception ex) {
                    continue;
                }
            }
        } catch (XPathExpressionException ex) {
            Logger.getLogger(VPModelReader.class.getName()).log(Level.FINE, null, ex);
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


    private     static      int     nextModel;
}
