package fr.insset.jeanluc.ete.nl.impl;

import fr.insset.jeanluc.ete.nl.NlContext;
import fr.insset.jeanluc.ete.nl.NlExpression;
import fr.insset.jeanluc.ete.nl.NlLexer;
import fr.insset.jeanluc.ete.nl.NlParser;
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
public class NlParserWrapper {
    
    public static NlParser newParser(String inExpression) {
        NlLexer lexer = null;
        ANTLRInputStream input = new ANTLRInputStream(inExpression);
        lexer = new NlLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        NlParser parser = new NlParser(commonTokenStream);
        return parser;
    }

    public static NlExpression buildAbstractTree(String inExpression, EteModel inModel, NamedElement inContextElement) {
        MofClass    contextualClass = null;
        if (inContextElement instanceof MofClass) {
            contextualClass = (MofClass)inContextElement;
        }
        else if (inContextElement != null) {
            contextualClass = (MofClass) ((MofOperation)inContextElement).getOwningMofClass();
        }
        NlContext context = new NlContextImpl(inModel, contextualClass, inContextElement);
        return buildAbstractTree(inExpression, context);
    }

    public static NlExpression buildAbstractTree(String inExpression, NlContext inContext) {
        NlParser parser = NlParserWrapper.newParser(inExpression);
        NlParser.NlExpressionContext concreteExpression = parser.nlExpression();
        TreeBuilder builder = new TreeBuilder(inContext);
        NlExpression abstractExpression = builder.visit(concreteExpression);
        return abstractExpression;
    }

    protected void addToContext(String inName, TypedElement inValue) {
    }

}


