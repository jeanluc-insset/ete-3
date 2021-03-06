package ${package}.impl;

import fr.insset.jeanluc.ete.gel.GelContext;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.gel.impl.GelContextImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import ${package}.${artifactIdI2uc}Lexer;
import ${package}.${artifactIdI2uc}Parser;
import javax.annotation.Generated;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;


/**
 *
 * @author jldeleage
 */
@Generated("ete - jean-luc@insset.fr  modules/maven-project/gel-impl/java/parser-wrapper.vm")
public class ${artifactIdI2uc}ParserWrapper implements ParserWrapper {
    
    public ${artifactIdI2uc}Parser newParser(String inExpression) {
        ${artifactIdI2uc}Lexer lexer = null;
        ANTLRInputStream input = new ANTLRInputStream(inExpression);
        lexer = new ${artifactIdI2uc}Lexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ${artifactIdI2uc}Parser parser = new ${artifactIdI2uc}Parser(commonTokenStream);
        return parser;
    }

    @Override
    public GelExpression buildAbstractTree(String inExpression, EteModel inModel, TypedElement inContextElement) {
        MofClass    contextualClass = null;
        if (inContextElement instanceof MofClass) {
            contextualClass = (MofClass)inContextElement;
        }
        else if (inContextElement != null) {
            contextualClass = (MofClass) ((MofOperation)inContextElement).getOwningMofClass();
        }
        GelContext context = new GelContextImpl(inModel, contextualClass, inContextElement);
        ${artifactIdI2uc}Parser parser = newParser(inExpression);
        ${artifactIdI2uc}Parser.NlExpressionContext concreteExpression = parser.nlExpression();
        ${artifactIdI2uc}TreeBuilder builder = new ${artifactIdI2uc}TreeBuilder(inModel,inContextElement);
        GelExpression abstractExpression = builder.visit(concreteExpression);
        return abstractExpression;
    }

    protected void addToContext(String inName, TypedElement inValue) {
    }
}


