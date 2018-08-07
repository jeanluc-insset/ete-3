

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The action needs the following ete parameters :
 * <ul>
 * <li>String name : name of the language</li>
 * <li>String class : name of the ParserWrapper</li>
 * </ul>
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
                    addParameter("languages", languages);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LanguageAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
        }
        return inPackage;
    }



}
