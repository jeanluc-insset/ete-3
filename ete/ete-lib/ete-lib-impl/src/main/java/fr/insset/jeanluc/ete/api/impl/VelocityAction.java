package fr.insset.jeanluc.ete.api.impl;



import static fr.insset.jeanluc.el.dialect.Dialect.DIALECT;
import fr.insset.jeanluc.el.evaluator.JSR341Evaluator;
import static fr.insset.jeanluc.ete.api.impl.GenericTemplate.TEMPLATE;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.File;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.runtime.RuntimeConstants;
import static fr.insset.jeanluc.ete.api.impl.DialectAction.DIALECT_ACTION;
import java.io.IOException;



/**
 * A velocity template is applied to a single item or to each item in a
 * collection.<br>
 * The life cycle is :<pre>
 * initLoop
 *      (
 *      initIteration
 *      applyTemplate
 *      )*
 * endLoop</pre>
 *
 * @author jldeleage
 */
public class VelocityAction extends GenericTemplate {


    public static final String      VELOCITY_ACTION     = "velocity-action";

    public static final Level       LEVEL               = Level.FINE;

    @Override
    protected void initLoop() {
        Logger  logger = Logger.getGlobal();
        logger.log(LEVEL, "Initializing Velocity");
        MofPackage    model = getModel();
        ve = new VelocityEngine();
        ve.setProperty("runtime.log", "target/velocity.log");
        ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, getBaseUrl());
        Logger.getGlobal().log(Level.FINE, "Velocity template root : " + getBaseUrl() + " [" + getParameter("template") + "]");
        try {
            ve.init();
        } catch (Exception ex) {
            Logger.getLogger(VelocityAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        context = new VelocityContext();
        context.put("model", model);
        context.put("classes",model.getClasses());
        context.put("packages", model.getPackages());
        String dialectName = (String)getParameter(DIALECT);

        for (Map.Entry<String,Object> entry : getAllParameters().entrySet()) {
            logger.log(LEVEL, "Passing parameter " + entry.getKey() + " = " + entry.getValue());
            context.put(entry.getKey(), entry.getValue());
        }
        if (dialectName == null) {
            dialectName = "fr.insset.jeanluc.el.dialect.BasicJavaDialect";
        }
        try {
            Class dialectClass = loadClass(dialectName);
            Object dialect = dialectClass.newInstance();
            context.put("_d", dialect);
            context.put(DIALECT, dialect);
            Logger.getGlobal().log(Level.FINE, "Added dialect " + context.get(DIALECT));
        } catch (Exception ex) {
            Logger.getLogger(VelocityAction.class.getName()).log(Level.SEVERE, "Unable to instanciate dialect " + dialectName, ex);
        }

    }


    protected   Class   loadClass(String inName) throws ClassNotFoundException, MalformedURLException {
        String[] parameter = (String[]) getParameter("extraPaths");
        if (parameter != null && parameter.length > 0) {
            URL[]       urls = new URL[parameter.length];
            int         index = 0;
            for (String aParam : parameter) {
                URI toURI = new File(aParam).toURI();
                urls[index++] = toURI.toURL();
            }
            try (URLClassLoader classLoader = new URLClassLoader(urls)) {
                return classLoader.loadClass(inName);
            } catch (IOException ex) {
                throw new ClassNotFoundException(inName + " (IOException)");
            }
        }
        else {
            ClassLoader classLoader;
            classLoader = getClass().getClassLoader();
            return classLoader.loadClass(inName);
        }
    }




    /**
     * Evaluates the "template" parameter which can be an expression. The
     * evaluation can use any parameter of the action.<br>
     * The overridden method injects getBaseUrl() at the beginning of the
     * url. In some cases this does not work with Velocity since the
     * FileResourceLoader must load its templates in a subtree with
     * TEMPLATE_ROOT as root.
     * 
     * @return the result of the evaluation of the "template" parameter
     */
    @Override
    protected   String  getTemplateUrl() {
        String  result = (String) getParameter(TEMPLATE);
        JSR341Evaluator elEvaluator = new JSR341Evaluator(getModel(), getAllParameters());
        return (String) elEvaluator.evaluate(result);
    }


    @Override
    protected void applyTemplate(String inTemplateUrl, String inTemplateEncoding, Writer inoutOutput) {
        try {
            Object[] keys = context.getKeys();
            Logger global = Logger.getGlobal();
            global.log(LEVEL, "----------------------------------------");
            for (Object aKey : keys) {
                global.log(LEVEL, "{0} -> {1}", new Object[]{aKey, context.get(aKey.toString())});
            }
            global.log(LEVEL, "----------------------------------------");
            ve.mergeTemplate(inTemplateUrl, context, inoutOutput);
            global.log(LEVEL, "FIN DE VELOCITY [{0}]", inTemplateUrl);
        } catch (Exception ex) {
            Logger.getLogger(VelocityAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void initIteration(NamedElement inElement) {
        Object varName = getParameter("var");
        context.put((String)varName, inElement);
    }


    @Override
    protected void copyAParameter(String inKey, Object inValue) {
        context.put(inKey, inValue);
    }       // copyParameters


    private VelocityEngine ve;
    private VelocityContext context;


}
