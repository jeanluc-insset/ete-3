package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.gel.GelLexer;
import fr.insset.jeanluc.gel.GelParser;
import javax.annotation.Generated;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author jldeleage
 */
@Generated("ete - jean-luc@insset.fr  modules/maven-project/gel-impl/java/parser-wrapper.vm")
public class GelParserFactory {
    
    public static GelParser newParser(String inExpression) {
        GelLexer lexer = null;
        ANTLRInputStream input = new ANTLRInputStream(inExpression);
        lexer = new GelLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        GelParser parser = new GelParser(commonTokenStream);
        return parser;
    }

}


