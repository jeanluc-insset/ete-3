package fr.insset.jeanluc.ete.api.impl;



import fr.insset.jeanluc.ete.api.Action;
import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.meta.model.io.ModelReader;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * Reads an XMI model.<br>
 * Every pipeline in the configuration file should start with such an
 * action.
 *
 * @author jldeleage
 */
public class ModelAction extends ActionSupport {


    public final static String  ADD_VISITOR      = "add-visitor";


    /**
     * Name of factory. This value must be used as a key with the
     * getFactory(String inFactoryName) method
     */
    public final static String  MODEL_ACTION     = "model-action";
    public final static String  MODEL_READER     = "model-reader";

    /**
     * Adds the content model specified by the "model" attribute to the
     * received model.
     * 
     * @param inModel
     * @return the result of the preprocessing (maybe inModel)
     */
    @Override
    public MofPackage postProcess(MofPackage inModel) throws EteException {
        MofPackage    result = inModel;
        String parameter = (String) getParameter("url");
        Logger.getGlobal().log(Level.INFO, "Reading model... {0}", parameter);
        InputStream resource = getResource(parameter);
            // obtenir le "reader" par une fabrique abstraite
        ModelReader   reader;
        try {
            reader = (ModelReader) FactoryRegistry.newInstance(MODEL_READER);
            for (DynamicVisitorSupport aVisitor : visitors) {
                reader.addVisitors(aVisitor);
            }
            result = reader.readModel(resource, (EteModel) inModel);
        } catch (InstantiationException ex) {
            Logger.getLogger(ModelAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ModelAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ModelAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        getParent().addParameter(MODEL, result);
        Logger.getGlobal().log(Level.FINE, "Lecture -> {0}", inModel);
        return result;
    }


    public String   getUrl() {
        return (String) getParameter("url");
    }

    @Override
    public void addParameter(String inName, Object inValue) {
        if (inName.equals(ADD_VISITOR)) {
            visitors.add((DynamicVisitorSupport) inValue);
        }
        else {
            super.addParameter(inName, inValue);
        }
    }

    List<DynamicVisitorSupport>        visitors = new LinkedList<>();

}
