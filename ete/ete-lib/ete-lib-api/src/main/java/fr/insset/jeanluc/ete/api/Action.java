package fr.insset.jeanluc.ete.api;


import fr.insset.jeanluc.el.dialect.BasicJavaDialect;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import static fr.insset.jeanluc.util.factory.FactoryRegistry.FACTORY_REGISTRY;
import fr.insset.jeanluc.util.hierarchy.Hierarchy;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * An action transforms a model into another model or a package into another
 * package.<br>
 * The process uses an action tree : each node in the tree is an action. The
 * process runs through the tree (depth-first) and executes each action
 * in turn.<br>
 * An action has parameters. A parameter has a name (String) and a value
 * (Object). The parameters are equivalent to local variable in a block view :
 * each action can see its ancestors parameters and a local parameter "hides"
 * ancestor parameters with the same name.<br>
 * Every action must use its own FactoryRegistry instance. When initialized
 * the action sets the thread local FactoryRegistry.registry to a fresh
 * instance. That new instance has the previous value of the thread local as
 * parent. Thus, the registries form a chain. This way, if a component looks
 * for a factory not locally defined, it can find it rnning through the chain
 * of registries.<br>
 * When closed, the action must pop the factory.
 *
 * @author jldeleage
 */
public interface Action {

    public final static String  PROJECT_NAME     = "project_name";

    /**
     * Name of parameter. This value must be used as a key with the
     * {@link getParameter(String) getParameter(String inParameterName)
     * method}
     */
    public final static String  OUTPUT_BASE      = "output_base";
    /**
     * Name of parameter. This value must be used as a key with the
     * {@link getParameter(String) getParameter(String inParameterName)
     * method}
     */
    public final static String  BASE_DIR         = "base_dir";



    //========================================================================//
    //                           P R O C E S S I N G                          //
    //========================================================================//


    /**
     * This method should not be overridden. Unfortunately, it is not possible
     * to declare final a method in an interface.
     * 
     * @param inPackage
     * @return
     * @throws EteException 
     */
    public default MofPackage  process(MofPackage inPackage) throws EteException {
        MofPackage  result;
        init(inPackage);
        if (shouldIProcess(inPackage)) {
            result = doProcess(inPackage);
        }
        else {
            result = inPackage;
        }
        close();
        return result;
    }


    public  default MofPackage doProcess(MofPackage inPackage) throws EteException {
        try {
            inPackage = preProcess(inPackage);
            inPackage = processChildren(inPackage);
            inPackage = postProcess(inPackage);
            return inPackage;
        }
        catch (Exception ex) {
            Logger.getGlobal().severe("The action " + this.getClass().getName() + " encountered a problem while running : " + ex
                    + "\n" + ex.getStackTrace()[0]);
            throw new EteException(ex);
        }
    }


    /**
     * This method should not be overridden.
     * 
     * @param inPackage
     * @throws EteException 
     */
    public default void init(MofPackage inPackage) throws EteException {
        FactoryRegistry.pushNewRegistry();
        loadDialect();
        readAttributes();
    }


    public default boolean shouldIProcess(MofPackage inPackage) throws EteException {
        return true;
    }


    public default MofPackage preProcess(MofPackage inPackage) throws EteException {
        return inPackage;
    }


    public default MofPackage processChildren(MofPackage inPackage) throws EteException {
        for (Action action : getChildren()) {
            inPackage = action.process(inPackage);
        }
        return inPackage;
    }


    public default MofPackage postProcess(MofPackage inPackage) throws EteException {
        return inPackage;
    }


    /**
     * This method should not be overridden.
     * 
     * @param inPackage
     * @return
     * @throws EteException 
     */
    public default void close() {
        FactoryRegistry.popRegistry();
    }


    //========================================================================//
    //                           P A R A M E T E R S                          //
    //========================================================================//
    // Every action has parameters

    /**
     * The dialect should be set first since some attributes may have expressions
     * as values and these expressions are allowed to use the dialect
     * 
     * @throws EteException 
     */
    public default void loadDialect() throws EteException {
        String      dialectName = (String) readAttribute("dialect");
        if (dialectName == null) {
            dialectName = "fr.insset.jeanluc.el.dialect.BasicJavaDialect";
        }
        Object dialect;
        try {
            Class<?> dialectClass = Class.forName(dialectName);
            dialect = dialectClass.newInstance();
        } catch (Exception ex) {
            dialect = new BasicJavaDialect();
        }
        addParameter("dialect", dialect);
    }

    public void    readAttributes() throws EteException;
    public Object  readAttribute(String inAttributeName) throws EteException;

    public void    addParameter(String inName, Object inValue);

    /**
     * Sets the parameter if it is not already set.<br>
     * Returns the value actually set.
     * 
     * @param inName name of the parameter
     * @param inValue value of the parameter
     * @return 
     */
    public default Object     addDefaultParameter(String inName, Object inValue) {
        Object  value = getParameter(inName);
        if (value != null) {
            return value;
        }
        addParameter(inName, inValue);
        return inValue;
    }


    public default void     addParameters(Map<String, Object> inParameters) {
        for (Map.Entry<String, Object> entry : inParameters.entrySet()) {
            addParameter(entry.getKey(), entry.getValue());
        }
    };


    public default Map<String, Object> getAllParameters() {
        Map<String, Object> result = new HashMap<>();
        Action parentAction = getParent();
        if (parentAction != null) {
            result = parentAction.getAllParameters();
        }
        result.putAll(getParameters());
        return result;
    }

    public Map<String, Object>  getParameters();


    public default Object  getParameter(String inName) {
        Object localParameter = getLocalParameter(inName);
        if (localParameter != null) {
            return localParameter;
        }
        Action  parent = getParent();
        if (parent != null) {
            return parent.getParameter(inName);
        }
        return null;
    }

    public default Object getParameter(String inName, Object inDefaultValue) {
        Object result = getParameter(inName);
        if (result != null) {
            return result;
        }
        return inDefaultValue;
    }

    public default String getConcatenatedParameter(String inName) {
        Action  parent = getParent();
        String result = parent == null ? "" : parent.getConcatenatedParameter(inName);
        Object localParameter = getLocalParameter(inName);
        if (localParameter != null) {
            result += localParameter;
        }
        return result;
    }

    public default String getConcatenatedParameter(String inName, String inSeparator) {
        Action  parent = getParent();
        String result = parent == null ? "" : parent.getConcatenatedParameter(inName, inSeparator);
        String localParameter = (String)getLocalParameter(inName);
        if (localParameter != null) {
            if (result.length()>0 && !result.endsWith(inSeparator) && !localParameter.startsWith(inSeparator))
                result += "/";
            result += localParameter;
        }
        return result;
    }

    public Object           getLocalParameter(String inName);


    //========================================================================//
    //           U S U A L    P A R A M E T E R S   S H O R T C U T S         //
    //========================================================================//


    /**
     * Some actions may need to fetch resources based on an url.<br>
     * These actions may have a "base-url" : the URL where to start the search
     * from.<br>
     * 
     * @return 
     */
    public  default String  getBaseUrl() {
        String  result = (String) getParameter(BASE_DIR);
        return result != null? result : "./";
    }


    /**
     * 
     * @param inUrl : may be a "partial" URL
     * @return
     * @throws EteException 
     */
    public default String getFullUrl(String inUrl) {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.log(Level.FINE, "Recherche de la ressource " + inUrl);
        if (!inUrl.contains(":/")) {
            // Actually we must get a file must we not ?
            if (!inUrl.startsWith("/")) {
                String baseUrl = getBaseUrl();
                Logger.getGlobal().log(Level.FINE, "baseUrl : " + baseUrl);
                if (! "".equals(baseUrl)) {
                    if (!baseUrl.endsWith("/")) {
                        baseUrl += "/";
                    }
                    inUrl = baseUrl + inUrl;
                }
            }
            if (!inUrl.startsWith("/")) {
                String workingDirPath = new File(".").getAbsolutePath();
                workingDirPath = workingDirPath.substring(0, workingDirPath.length()-1);
                inUrl = workingDirPath + '/' + inUrl;
             }
            File file = new File(inUrl);
            logger.log(Level.FINER, "Looking for the module : " + file.getAbsolutePath());
            if (file.isDirectory()) {
                logger.log(Level.FINER, "It is a directory");
                if (!inUrl.endsWith("/")) {
                    logger.log(Level.FINER, "Adding /");
                    inUrl += "/";
                }
                logger.log(Level.FINER, "Adding ete-config.xml");
                inUrl += "ete-config.xml";
            }
            inUrl = "file://" + (inUrl.startsWith("/") ? "" : "/") + inUrl;
        }
        logger.log(Level.FINER, "The url is " + inUrl);
        return inUrl;
    }

    public default InputStream getResource(String inUrl) throws EteException {
        try {
            String fullUrl = getFullUrl(inUrl);
            URL url;
            url = new URL(fullUrl);
            return url.openStream();        
        } catch (IOException ex) {
            throw new EteException(ex);
        }
    }


    //========================================================================//
    //                            H I E R A R C H Y                           //
    //========================================================================//


    public Action           getParent();
    public void             setParent(Action inParent);

    public Iterable<Action> getChildren() throws EteException;
    public void             addChild(Action inAction);


}


