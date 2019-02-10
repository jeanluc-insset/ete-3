package fr.insset.jeanluc.ete.sbvr.impl;



import fr.insset.jeanluc.ete.gel.GelContext;
import static fr.insset.jeanluc.ete.gel.GelContext.CURRENT;
import static fr.insset.jeanluc.ete.gel.GelContext.ROOT;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.ete.sbvr.SbvrParser;
import fr.insset.jeanluc.ete.sbvr.SbvrParserBaseVisitor;
import fr.insset.jeanluc.ete.sbvr.*;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import fr.insset.jeanluc.ete.util.XList;



/**
 * An instance of this class is a visitor for SbvrExpressions. It takes a
 * SbvrExpression concrete tree and returns the matching abstract tree.
 *
 * Usage : <code><pre>
SbvrParser            parser             = SbvrParserFactory.newParser(aString);
SbvrExpressionContext ctx                = parser.sbvrExpression();
TreeBuilder          treeBuilder        = new TreeBuilder(inContext);
SbvrExpression        abstractExpression = treeBuilder.visitSbvrExpression(ctx);
</pre></code>
 *
 */
@Generated("ete - jean-luc@insset.fr  src/main/mda/tree-builder.vm")
public class TreeBuilder extends SbvrParserBaseVisitor<SbvrExpression> {


    public TreeBuilder(GelContext inContext) {
        context = inContext;
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);
        registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);
        registry.registerDefaultFactory("String", StringLiteralImpl.class);
        registry.registerDefaultFactory("date", DateLiteralImpl.class);
        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);
        registry.registerDefaultFactory("*", MultImpl.class);
        registry.registerDefaultFactory(".att", AttributeNavImpl.class);
        registry.registerDefaultFactory("<", LessThanImpl.class);
        registry.registerDefaultFactory("let", VariableDefinitionImpl.class);
        registry.registerDefaultFactory("var", VariableReferenceImpl.class);
        registry.registerDefaultFactory("=", EqualImpl.class);
        registry.registerDefaultFactory("-", SubImpl.class);
        registry.registerDefaultFactory("not", NotImpl.class);
        registry.registerDefaultFactory(">", GreaterThanImpl.class);
        registry.registerDefaultFactory("isnew", IsNewImpl.class);
        registry.registerDefaultFactory("<>", DifferentImpl.class);
        registry.registerDefaultFactory("->", CollectionMethodNavImpl.class);
        registry.registerDefaultFactory("opp", OppImpl.class);
        registry.registerDefaultFactory("<=", LessOrEqualImpl.class);
        registry.registerDefaultFactory(">=", GreaterOrEqualImpl.class);
        registry.registerDefaultFactory("xor", XorImpl.class);
        registry.registerDefaultFactory("/", DivImpl.class);
        registry.registerDefaultFactory("and", AndImpl.class);
        registry.registerDefaultFactory("+", AddImpl.class);
        registry.registerDefaultFactory("%", ModImpl.class);
        registry.registerDefaultFactory("result", ResultImpl.class);
        registry.registerDefaultFactory("self", SelfImpl.class);
        registry.registerDefaultFactory("@pre", AtPreImpl.class);
        registry.registerDefaultFactory("|", LambdaImpl.class);
        registry.registerDefaultFactory("or", OrImpl.class);
        registry.registerDefaultFactory(".meth", MethodNavImpl.class);
        registry.registerDefaultFactory("->", FlatCollectImpl.class);
        registry.registerDefaultFactory("excludes", ExcludesImpl.class);
        registry.registerDefaultFactory("select", SelectImpl.class);
        registry.registerDefaultFactory("collect", CollectImpl.class);
        registry.registerDefaultFactory("average", AverageImpl.class);
        registry.registerDefaultFactory("sum", SumImpl.class);
        registry.registerDefaultFactory("includes", IncludesImpl.class);
        registry.registerDefaultFactory("flatten", FlattenImpl.class);
        registry.registerDefaultFactory("flatCollect", FlatCollectImpl.class);
        registry.registerDefaultFactory(".",    AttributeNavImpl.class);
        registry.registerDefaultFactory(".att", AttributeNavImpl.class);
        registry.registerDefaultFactory(".op",  MethodNavImpl.class);
        registry.registerDefaultFactory("symbol",  SymbolImpl.class);
    }


    @Override
    public SbvrExpression visitSbvrExpression(SbvrParser.SbvrExpressionContext ctx) {
        // Create a fresh stack frame for local variables
//        context.push();
        return super.visitSbvrExpression(ctx);
    }


//============================================================================//
//                      G E N E R A T E D   M E T H O D S                     //
//============================================================================//


    // LITERAL TYPE : Double
    @Override
    public SbvrExpression visitFloatingPointLiteral(SbvrParser.FloatingPointLiteralContext ctx) {
        try {
            String text = ctx.getText();
            FloatingPointLiteral newInstance = (FloatingPointLiteral)FactoryRegistry.newInstance("Double");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : Integer
    @Override
    public SbvrExpression visitIntegerLiteral(SbvrParser.IntegerLiteralContext ctx) {
        try {
            String text = ctx.getText();
            IntegerLiteral newInstance = (IntegerLiteral)FactoryRegistry.newInstance("Integer");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : String
    @Override
    public SbvrExpression visitStringLiteral(SbvrParser.StringLiteralContext ctx) {
        try {
            String text = ctx.getText();
            StringLiteral newInstance = (StringLiteral)FactoryRegistry.newInstance("String");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : date
    @Override
    public SbvrExpression visitDateLiteral(SbvrParser.DateLiteralContext ctx) {
        try {
            String text = ctx.getText();
            DateLiteral newInstance = (DateLiteral)FactoryRegistry.newInstance("date");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : Boolean
    @Override
    public SbvrExpression visitBooleanLiteral(SbvrParser.BooleanLiteralContext ctx) {
        try {
            String text = ctx.getText();
            BooleanLiteral newInstance = (BooleanLiteral)FactoryRegistry.newInstance("Boolean");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }


//============================================================================//

/*
    @Override
    public SbvrExpression visit${aClass.name}Expression(SbvrParser.${aClass.name}ExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            SbvrExpression result = children.get(0).accept(this);
            context.remove(CURRENT);
            return result;
        }
        try {

        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
*/





    //========================================================================//
    //                  H A R D   C O D E D   M E T H O D S                   //
    //========================================================================//


    //------------------------------------------------------------------------//
    // Rules for files                                                        //
    // A file defines explicit context for rules. This means that we must     //
    // reset this context several times during parsing                        //
    //------------------------------------------------------------------------//



    //------------------------------------------------------------------------//
    //                       M A I N   D I S P A T C H                        //
    //------------------------------------------------------------------------//


    



    //------------------------------------------------------------------------//
    //                  S T A N D A R D   O P E R A T O R S                   //
    //------------------------------------------------------------------------//



    //------------------------------------------------------------------------//
    //                          N A V I G A T I O N                           //
    //------------------------------------------------------------------------//


    //------------------------------------------------------------------------//
    //         S T R U C T U R E D   N A T U R A L   L A N G U A G E          //
    //------------------------------------------------------------------------//




    //========================================================================//


    GelContext<SbvrExpression>   context;


}

