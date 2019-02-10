package fr.insset.jeanluc.ete.sbvr;


import fr.insset.jeanluc.ete.gel.GelContext;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GenericExpression;
import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.gel.impl.GelContextImpl;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.sbvr.SbvrLexer;
import fr.insset.jeanluc.ete.sbvr.SbvrParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author jldeleage
 */
public class SbvrParserWrapper implements ParserWrapper {


    public SbvrParser newParser(String inExpression) {
        SbvrLexer lexer = null;
        ANTLRInputStream input = new ANTLRInputStream(inExpression);
        lexer = new SbvrLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SbvrParser parser = new SbvrParser(commonTokenStream);
        return parser;
    }



    @Override
    public void readExpressions(String inExpressions, EteModel inoutModel) {
    }


    @Override
    public GenericExpression buildAbstractTree(String inExpression, EteModel inModel, NamedElement inContextElement) {
        MofClass    contextualClass = null;
        if (inContextElement instanceof MofClass) {
            contextualClass = (MofClass)inContextElement;
        }
        else if (inContextElement != null) {
            contextualClass = (MofClass) ((MofOperation)inContextElement).getOwningMofClass();
        }
        GelContext context = new GelContextImpl(inModel, contextualClass, inContextElement);
        return buildAbstractTree(inExpression, context);
    }


    public GenericExpression buildAbstractTree(String inExpression, GelContext inContext) {
        SbvrParser parser = newParser(inExpression);
        SbvrParser.GelExpressionContext concreteExpression = parser.gelExpression();
        SbvrTreeBuilder builder = new SbvrTreeBuilder(inContext);
        GenericExpression abstractExpression = builder.visit(concreteExpression);
        return abstractExpression;
    }


}
