package fr.insset.jeanluc.ete.sbvr.impl;

import fr.insset.jeanluc.ete.sbvr.SbvrContext;
import fr.insset.jeanluc.ete.sbvr.SbvrExpression;
import fr.insset.jeanluc.ete.sbvr.SbvrLexer;
import fr.insset.jeanluc.ete.sbvr.SbvrParser;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import javax.annotation.Generated;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;


/**
 *
 * @author jldeleage
 */
@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/language/parser-wrapper.vm")
public class SbvrParserWrapper {
    
    public static SbvrParser newParser(String inExpression) {
        SbvrLexer lexer = null;
        ANTLRInputStream input = new ANTLRInputStream(inExpression);
        lexer = new SbvrLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SbvrParser parser = new SbvrParser(commonTokenStream);
        return parser;
    }

    public static SbvrExpression buildAbstractTree(String inExpression, EteModel inModel, NamedElement inContextElement) {
        MofClass    contextualClass = null;
        if (inContextElement instanceof MofClass) {
            contextualClass = (MofClass)inContextElement;
        }
        else if (inContextElement != null) {
            contextualClass = (MofClass) ((MofOperation)inContextElement).getOwningMofClass();
        }
        SbvrContext context = new SbvrContextImpl(inModel, contextualClass, inContextElement);
        return buildAbstractTree(inExpression, context);
    }

    public static SbvrExpression buildAbstractTree(String inExpression, SbvrContext inContext) {
        SbvrParser parser = SbvrParserWrapper.newParser(inExpression);
        SbvrParser.SbvrExpressionContext concreteExpression = parser.sbvrExpression();
        TreeBuilder builder = new TreeBuilder(inContext);
        SbvrExpression abstractExpression = builder.visit(concreteExpression);
        return abstractExpression;
    }

    protected void addToContext(String inName, TypedElement inValue) {
    }

}


