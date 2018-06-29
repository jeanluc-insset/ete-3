#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${artifactId}.impl;

import ${package}.${artifactId}.GelLexer;
import ${package}.${artifactId}.GelParser;
import javax.annotation.Generated;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author jldeleage
 */
@Generated("ete - jean-luc@insset.fr  modules/maven-project/${artifactId}-impl/java/parser-wrapper.vm")
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


