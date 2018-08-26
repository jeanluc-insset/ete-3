

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class ConstraintAction extends ActionSupport {

    /**
     * WARNING : this action SHOULD NOT perform any board effect on the
     * model it receives. It MUST clone that model, modify the clone and
     * return the modified clone.<br>
     * But currently the clonePackage method does not clone anything&nbsp;!
     */
    @Override
    public MofPackage postProcess(MofPackage inPackage) throws EteException {
        try {
            // 1- Create a fresh model to return
            MofPackage  result = clonePackage(inPackage);

            // 2- Generate the lexer grammar from the model and a first parser
            //    Parses them with antlr4, compile the classes, run the parser
            //    on the constraint file to create new lexer and parser
            //    Run again antlr4 on these fresh grammars
            String  language        = (String) getParameter("language", "OCL");
            String  constraintFile  = (String) getParameter("constraints");
            String  name            = (String)getParameter("name", "constraints");
            LanguageBuilder builder = new LanguageBuilder();
            language = language.substring(0, 1).toUpperCase() + language.substring(1);
            builder.generateGrammars(name, inPackage, name, constraintFile);

            // 3- Parse the constraint file using the final grammar
            //    This should add the constraints to the model.
            return result;
        } catch (InstantiationException | IllegalAccessException
                | IOException | ClassNotFoundException
                | IllegalArgumentException | NoSuchMethodException
                | InvocationTargetException ex) {
            Logger.getLogger(ConstraintAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.postProcess(inPackage);
    }




}
