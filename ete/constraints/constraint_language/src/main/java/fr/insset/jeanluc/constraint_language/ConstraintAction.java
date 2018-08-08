

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
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
            // 1- Build the lexer grammar from the model
            MofPackage  result = clonePackage(inPackage);
            String  language = (String) getParameter("language");
            LexerBuilder lexerBuilder = new LexerBuilder();
            language = language.substring(0, 1).toUpperCase() + language.substring(1);
            lexerBuilder.generateLexerGrammar(language, result, "target/tmp/" + language + "Lexer.g4");

            // Build the parser from that lexer and a standard parser
            return result;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConstraintAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ConstraintAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ConstraintAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConstraintAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.postProcess(inPackage); //To change body of generated methods, choose Tools | Templates.
    }




}
