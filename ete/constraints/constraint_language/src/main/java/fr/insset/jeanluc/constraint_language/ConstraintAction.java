

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
            // 1- Create a fresh model to return
            MofPackage  result = clonePackage(inPackage);

            // 2- Generate the lexer grammar from the model and a first parser
            String  language = (String) getParameter("language");
            LexerBuilder lexerBuilder = new LexerBuilder();
            language = language.substring(0, 1).toUpperCase() + language.substring(1);
            lexerBuilder.generateGrammars(language, result, "target/tmp/" + language + "Lexer.g4");

            // 3- 
            

            // 4- Generate the parser from a first parsing of the constraint file
            //    (the grammar will contain a rule for every definition in the constraint file)
            

            // 5- Run antlr4 on the final grammar.
            //    This will generate the parser class.
            AntlrRunner     parserBuilder = new AntlrRunner();

            // 5- Compile the generated classes

            // 6- Parse the constraint file using the final grammar

            // 7- We're through it
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
