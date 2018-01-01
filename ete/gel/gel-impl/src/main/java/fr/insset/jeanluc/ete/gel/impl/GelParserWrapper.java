package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GelLexer;
import fr.insset.jeanluc.ete.gel.GelParser;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import javax.annotation.Generated;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;


/**
 *
 * @author jldeleage
 */
@Generated("ete - jean-luc@insset.fr  modules/maven-project/gel-impl/java/parser-wrapper.vm")
public class GelParserWrapper {
    
    public static GelParser newParser(String inExpression) {
        GelLexer lexer = null;
        ANTLRInputStream input = new ANTLRInputStream(inExpression);
        lexer = new GelLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        GelParser parser = new GelParser(commonTokenStream);
        return parser;
    }

    public static GelExpression buildAbstractTree(String inExpression, MofPackage inModel, TypedElement inContext) {
        GelParser parser = GelParserWrapper.newParser(inExpression);
        GelParser.GelExpressionContext concreteExpression = parser.gelExpression();
        TreeBuilder builder = new TreeBuilder(inModel, inContext);
        GelExpression abstractExpression = builder.visit(concreteExpression);
        return abstractExpression;
    }


}


