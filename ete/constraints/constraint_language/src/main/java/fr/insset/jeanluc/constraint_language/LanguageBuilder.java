

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * This class has two main purposes :<ul>
 * <li>it creates a lexer grammar from a model</li>
 * <li>it creates a parser grammar from a model and a constraint file</li>
 * </ul>
 * 
 * 
 *
 * @author jldeleage
 */
public class LanguageBuilder {

    public void buildLexerGrammar(String language, MofPackage inModel) throws FileNotFoundException, UnsupportedEncodingException {
        LexerBuilder lexerBuilder = new LexerBuilder();
        language = language.substring(0, 1).toUpperCase() + language.substring(1);
        lexerBuilder.generateGrammars(language, inModel, "target/tmp/" + language + "Lexer.g4");
    }

    /**
     * A language is defined by a grammar. 
     * 
     * @param language
     * @param inModel 
     */
    public void builParserGrammar(String language, MofPackage inModel) {
        
    }

}
