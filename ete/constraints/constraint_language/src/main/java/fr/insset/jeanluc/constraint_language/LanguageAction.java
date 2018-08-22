

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <div>
 * The action needs the following ete parameters :
 * <ul>
 * <li>String name : name of the language</li>
 * <li>(optional) Map&lt;String, ParserWrapper> languages</li>
 * </ul>
 * It the languages parameter is not present, it is added to the parent of the
 * action.
 * </div>
 * <div>
 * The action builds a lexer and a parser from the model. Then it runs antlr
 * on the parser, generates a ParserWrapper class and compiles all Java classes.
 * An instance of the ParserWrapper is stored in the
 * &lt;quote&gt;languages&lt;/quote&gt; parameter.
 * </div>
 * 
 *
 * @author jldeleage
 */
public class LanguageAction extends ActionSupport {

    /**
     * 
     */
    @Override
    public MofPackage postProcess(MofPackage inPackage) throws EteException {
        try {
            Map<String, ParserWrapper>     languages = (Map<String, ParserWrapper>) this.getLocalParameter("languages");
            if (languages == null) {
                try {
                    languages = FactoryMethods.newMap(String.class, ParserWrapper.class);
                    getParent().addParameter("languages", languages);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LanguageAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            String      name = (String) getParameter("name");
            String      constraintFile = (String) getParameter("constraints");
            LanguageBuilder    builder = new LanguageBuilder();
            // Actually, this builds a parser grammar as well, which uses the
            // tokens of the generated lexer.
            builder.generateGrammars(name, inPackage, name, constraintFile);
            String languageClassName = (String) this.getParameter("class");
            Class<?> languageClass = Class.forName(languageClassName);
            ParserWrapper language = (ParserWrapper) languageClass.newInstance();
            String languageName = (String) this.getParameter("name");
            languages.put(languageName, language);
            return super.postProcess(inPackage); //To change body of generated methods, choose Tools | Templates.
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LanguageAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LanguageAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LanguageAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LanguageAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(LanguageAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inPackage;
    }



}
