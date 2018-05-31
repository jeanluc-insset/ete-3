package fr.insset.jeanluc.meta.model.io;



import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.util.XList;
import fr.insset.jeanluc.util.factory.AbstractFactory;
import static fr.insset.jeanluc.util.factory.FactoryMethods.LIST;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitor;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;




/**
 *
 * @author jldeleage
 */
public interface ModelReader {

    public default EteModel readModel(String inUrl) throws IOException, InstantiationException, IllegalAccessException {
        EteModel model = (EteModel) FactoryRegistry.newInstance(MODEL);
        PrimitiveDataTypes.init(model);
        FactoryRegistry.getRegistry().registerFactory(LIST, XList.class);
        return readModel(inUrl, model);
    }


    public default EteModel readModel(String inUrl, EteModel inParent) throws IOException, IllegalAccessException, InstantiationException {
            if (! inUrl.contains(":/")) {
                inUrl = "file://" + new File(inUrl).getAbsolutePath();
            }
            URL url = new URL(inUrl);
            InputStream openStream = url.openStream();
            return readModel(openStream, inParent);
    }



    public default EteModel readModel(InputStream inStream, EteModel inParent) throws IOException, IllegalAccessException, InstantiationException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inStream);
            return readModel(document, inParent);
        } catch (ParserConfigurationException | SAXException ex) {
            Logger.getLogger(ModelReader.class.getName()).log(Level.SEVERE, null, ex);
            throw new IOException(ex);
        }

    }



    public default EteModel readModel(Object inDocument, EteModel inParent) throws IllegalAccessException, InstantiationException, IOException {
        if (inParent == null) {
            inParent  = (EteModel) FactoryRegistry.newInstance(MODEL);
            PrimitiveDataTypes.init(inParent);
        }
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        AbstractFactory factory = registry.getFactory(MODEL);
        EteModel result = (EteModel) factory.newInstance();
        result.setParent(inParent);

        doReadModel(inDocument, result);

        return result;
    }


    /**
     * Reads information in a document (a plain text file, an XMI file...)
     * and adds them to the model.<br>
     * For example an instance reads a meta-model, a second one reads the
     * model and a third one reads constraints.
     * 
     * @param inDocument can be anything. The only provided implementation of
     *      ModelReader is XMLModelReader which accepts an XML document
     * @param inoutModel the model which will be populated.
     * @throws IOException 
     */
    public default void doReadModel(Object inDocument, EteModel inoutModel) throws IOException  {
        beforeReading(inDocument, inoutModel);
        readPackages(inDocument, inoutModel);
        readPrimitiveTypes(inDocument, inoutModel);
        readClasses(inDocument, inoutModel);
        readEnumerations(inDocument, inoutModel);
        readProperties(inDocument, inoutModel);
        readAssociations(inDocument, inoutModel);
        readOperations(inDocument, inoutModel);
        readGeneralizations(inDocument, inoutModel);
        readInstances(inDocument, inoutModel);
        readInvariants(inDocument, inoutModel);
        readSpecifications(inDocument, inoutModel);
        readProfiles(inDocument, inoutModel);
        readStereotypes(inDocument, inoutModel);
        applyStereotypes(inDocument, inoutModel);
        readTagValuesDefinitions(inDocument, inoutModel);
        readTagValues(inDocument, inoutModel);
        afterReading(inDocument, inoutModel);
    }


    public default void beforeReading(Object inDocument, EteModel inoutModel) throws IOException {
    }

    public  default Collection<NamedElement> readPrimitiveTypes(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }

    public  default Collection<NamedElement> readPackages(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readClasses(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readEnumerations(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readAssociations(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readProperties(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readOperations(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default void                     readGeneralizations(Object inDocument, EteModel inoutModel) throws IOException {
    }
    public  default Collection<NamedElement> readInstances(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readInvariants(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readSpecifications(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readProfiles(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default Collection<NamedElement> readStereotypes(Object inDocument, EteModel inoutModel) throws IOException {
        return null;
    }
    public  default void                     applyStereotypes(Object inDocument, EteModel inoutModel) throws IOException {
    }
    public  default Collection<NamedElement> readTagValuesDefinitions(Object inDocument, EteModel inoutModel) {
        return null;
    }
    public  default void                     readTagValues(Object inDocument, EteModel inoutModel) {
    }

    public default void afterReading(Object inDocument, EteModel inoutModel) throws IOException {
        for (DynamicVisitor aVisitor : getVisitors()) {
            try {
                aVisitor.genericVisit(inoutModel);
            } catch (IllegalAccessException  | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(ModelReader.class.getName()).log(Level.SEVERE, null, ex);
                throw new IOException(ex);
            }
        }
    }

    /**
     *
     * @param inVisitors
     */
    public default void addVisitors(DynamicVisitor... inVisitors) {
        
    }

    public Iterable<DynamicVisitor> getVisitors(); 




}
