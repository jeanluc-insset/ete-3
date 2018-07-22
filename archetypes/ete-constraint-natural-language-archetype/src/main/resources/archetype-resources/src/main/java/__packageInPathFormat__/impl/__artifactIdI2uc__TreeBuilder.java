package ${package}.impl;





import fr.insset.jeanluc.ete.gel.DateLiteral;
import fr.insset.jeanluc.ete.gel.IntegerLiteral;
import fr.insset.jeanluc.ete.gel.StringLiteral;
import fr.insset.jeanluc.ete.gel.FloatingPointLiteral;
import fr.insset.jeanluc.ete.gel.BooleanLiteral;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.gel.*;
import static fr.insset.jeanluc.ete.gel.GelContext.CURRENT;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.VariableReference;
import fr.insset.jeanluc.ete.gel.impl.AddImpl;
import fr.insset.jeanluc.ete.gel.impl.AndImpl;
import fr.insset.jeanluc.ete.gel.impl.AtPreImpl;
import fr.insset.jeanluc.ete.gel.impl.AttributeNavImpl;
import fr.insset.jeanluc.ete.gel.impl.AverageImpl;
import fr.insset.jeanluc.ete.gel.impl.BooleanLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.CollectImpl;
import fr.insset.jeanluc.ete.gel.impl.CollectionMethodNavImpl;
import fr.insset.jeanluc.ete.gel.impl.DateLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.DifferentImpl;
import fr.insset.jeanluc.ete.gel.impl.DivImpl;
import fr.insset.jeanluc.ete.gel.impl.EqualImpl;
import fr.insset.jeanluc.ete.gel.impl.ExcludesImpl;
import fr.insset.jeanluc.ete.gel.impl.FlatCollectImpl;
import fr.insset.jeanluc.ete.gel.impl.FlattenImpl;
import fr.insset.jeanluc.ete.gel.impl.FloatingPointLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.GreaterOrEqualImpl;
import fr.insset.jeanluc.ete.gel.impl.GreaterThanImpl;
import fr.insset.jeanluc.ete.gel.impl.IncludesImpl;
import fr.insset.jeanluc.ete.gel.impl.IntegerLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.IsNewImpl;
import fr.insset.jeanluc.ete.gel.impl.LambdaImpl;
import fr.insset.jeanluc.ete.gel.impl.LessOrEqualImpl;
import fr.insset.jeanluc.ete.gel.impl.LessThanImpl;
import fr.insset.jeanluc.ete.gel.impl.MethodNavImpl;
import fr.insset.jeanluc.ete.gel.impl.ModImpl;
import fr.insset.jeanluc.ete.gel.impl.MultImpl;
import fr.insset.jeanluc.ete.gel.impl.NotImpl;
import fr.insset.jeanluc.ete.gel.impl.OppImpl;
import fr.insset.jeanluc.ete.gel.impl.OrImpl;
import fr.insset.jeanluc.ete.gel.impl.ResultImpl;
import fr.insset.jeanluc.ete.gel.impl.SelectImpl;
import fr.insset.jeanluc.ete.gel.impl.SelfImpl;
import fr.insset.jeanluc.ete.gel.impl.StringLiteralImpl;
import fr.insset.jeanluc.ete.gel.impl.SubImpl;
import fr.insset.jeanluc.ete.gel.impl.SumImpl;
import fr.insset.jeanluc.ete.gel.impl.VariableDefinitionImpl;
import fr.insset.jeanluc.ete.gel.impl.VariableReferenceImpl;
import fr.insset.jeanluc.ete.gel.impl.XorImpl;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;
import org.antlr.v4.runtime.tree.ParseTree;
import ${package}.${artifactIdI2uc}Parser;



/**
 * Generates an abstract tree builder.
 * An instance of this class is a visitor for GelExpressions. It takes any
 * GelExpression concrete tree and returns the matching abstract tree.
 *
 * Usage : <code><pre>
GelParser            parser             = GelParserFactory.newParser(aString);
GelExpressionContext ctx                = parser.gelExpression();
TreeBuilder          treeBuilder        = new TreeBuilder(inContext);
GelExpression        abstractExpression = treeBuilder.visitGelExpression(ctx);
</pre></code>
 *
 */

@Generated("ete - jean-luc@insset.fr  modules/java/tree-builder.vm")
public class ${artifactIdI2uc}TreeBuilder extends ${package}.${artifactIdI2uc}ParserBaseVisitor<GelExpression> {



    public ${artifactIdI2uc}TreeBuilder(MofPackage inModel, TypedElement inContext) {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);
        registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);
        registry.registerDefaultFactory("date", DateLiteralImpl.class);
        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);
        registry.registerDefaultFactory("String", StringLiteralImpl.class);
        registry.registerDefaultFactory("not", NotImpl.class);
        registry.registerDefaultFactory(">", GreaterThanImpl.class);
        registry.registerDefaultFactory("<=", LessOrEqualImpl.class);
        registry.registerDefaultFactory(">=", GreaterOrEqualImpl.class);
        registry.registerDefaultFactory("<", LessThanImpl.class);
        registry.registerDefaultFactory("or", OrImpl.class);
        registry.registerDefaultFactory("self", SelfImpl.class);
        registry.registerDefaultFactory("isnew", IsNewImpl.class);
        registry.registerDefaultFactory("*", MultImpl.class);
        registry.registerDefaultFactory("let", VariableDefinitionImpl.class);
        registry.registerDefaultFactory("/", DivImpl.class);
        registry.registerDefaultFactory("%", ModImpl.class);
        registry.registerDefaultFactory("<>", DifferentImpl.class);
        registry.registerDefaultFactory("=", EqualImpl.class);
        registry.registerDefaultFactory("->", FlatCollectImpl.class);
        registry.registerDefaultFactory(".meth", MethodNavImpl.class);
        registry.registerDefaultFactory("and", AndImpl.class);
        registry.registerDefaultFactory("-", SubImpl.class);
        registry.registerDefaultFactory("+", AddImpl.class);
        registry.registerDefaultFactory("|", LambdaImpl.class);
        registry.registerDefaultFactory("@pre", AtPreImpl.class);
        registry.registerDefaultFactory("xor", XorImpl.class);
        registry.registerDefaultFactory("result", ResultImpl.class);
        registry.registerDefaultFactory(".att", AttributeNavImpl.class);
        registry.registerDefaultFactory("->", CollectionMethodNavImpl.class);
        registry.registerDefaultFactory("var", VariableReferenceImpl.class);
        registry.registerDefaultFactory("opp", OppImpl.class);
        registry.registerDefaultFactory("excludes", ExcludesImpl.class);
        registry.registerDefaultFactory("sum", SumImpl.class);
        registry.registerDefaultFactory("collect", CollectImpl.class);
        registry.registerDefaultFactory("flatCollect", FlatCollectImpl.class);
        registry.registerDefaultFactory("includes", IncludesImpl.class);
        registry.registerDefaultFactory("flatten", FlattenImpl.class);
        registry.registerDefaultFactory("average", AverageImpl.class);
        registry.registerDefaultFactory("select", SelectImpl.class);
        context = new MofContext(inContext, (EteModel)inModel);
    }


//============================================================================//
//                      G E N E R A T E D   M E T H O D S                     //
//============================================================================//


    // LITERAL TYPE : Boolean
    @Override
    public GelExpression visitBooleanLiteral(${artifactIdI2uc}Parser.BooleanLiteralContext ctx) {
        try {
            String text = ctx.getText();
            BooleanLiteral newInstance = (BooleanLiteral)FactoryRegistry.newInstance("Boolean");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : Integer
    @Override
    public GelExpression visitIntegerLiteral(${artifactIdI2uc}Parser.IntegerLiteralContext ctx) {
        try {
            String text = ctx.getText();
            IntegerLiteral newInstance = (IntegerLiteral)FactoryRegistry.newInstance("Integer");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : date
    @Override
    public GelExpression visitDateLiteral(${artifactIdI2uc}Parser.DateLiteralContext ctx) {
        try {
            String text = ctx.getText();
            DateLiteral newInstance = (DateLiteral)FactoryRegistry.newInstance("date");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : Double
    @Override
    public GelExpression visitFloatingPointLiteral(${artifactIdI2uc}Parser.FloatingPointLiteralContext ctx) {
        try {
            String text = ctx.getText();
            FloatingPointLiteral newInstance = (FloatingPointLiteral)FactoryRegistry.newInstance("Double");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : String
    @Override
    public GelExpression visitStringLiteral(${artifactIdI2uc}Parser.StringLiteralContext ctx) {
        try {
            String text = ctx.getText();
            StringLiteral newInstance = (StringLiteral)FactoryRegistry.newInstance("String");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }


//============================================================================//

    @Override
    public GelExpression visitMultOrDivExpression(${artifactIdI2uc}Parser.MultOrDivExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            // left part
            GelExpression result = children.get(0).accept(this);
            for (int i=1 ; i<children.size() ; i++) {
                GelExpression next = children.get(i).accept(this);
                List<GelExpression> operands = next.getOperand();
                operands.add(0, result);
                result = next;
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitNotExpression(${artifactIdI2uc}Parser.NotExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression left = children.get(1).accept(this);
            Not result = (Not)FactoryRegistry.getRegistry().getFactory("not").newInstance();
            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
            operands.add(left);
            result.setOperand(operands);
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitGreaterThanExpression(${artifactIdI2uc}Parser.GreaterThanExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitLessOrEqualExpression(${artifactIdI2uc}Parser.LessOrEqualExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitGreaterOrEqualExpression(${artifactIdI2uc}Parser.GreaterOrEqualExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitLessThanExpression(${artifactIdI2uc}Parser.LessThanExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitOrExpression(${artifactIdI2uc}Parser.OrExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitMultExpression(${artifactIdI2uc}Parser.MultExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            // right part of infix
            Mult result = (Mult)FactoryRegistry.getRegistry().getFactory("*").newInstance();
            GelExpression right = children.get(1).accept(this);
            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
            operands.add(right);
            result.setOperand(operands);
            return result;

        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitDivExpression(${artifactIdI2uc}Parser.DivExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            // right part of infix
            Div result = (Div)FactoryRegistry.getRegistry().getFactory("/").newInstance();
            GelExpression right = children.get(1).accept(this);
            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
            operands.add(right);
            result.setOperand(operands);
            return result;

        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitModExpression(${artifactIdI2uc}Parser.ModExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            // right part of infix
            Mod result = (Mod)FactoryRegistry.getRegistry().getFactory("%").newInstance();
            GelExpression right = children.get(1).accept(this);
            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
            operands.add(right);
            result.setOperand(operands);
            return result;

        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitDifferentExpression(${artifactIdI2uc}Parser.DifferentExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitEqualExpression(${artifactIdI2uc}Parser.EqualExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitAndExpression(${artifactIdI2uc}Parser.AndExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

//    @Override
//    public GelExpression visitSubExpression(${artifactIdI2uc}Parser.SubExpressionContext ctx) {
//        List<ParseTree> children = ctx.children;
//        if (children.size() == 1) {
//            GelExpression result = children.get(0).accept(this);
//            return result;
//        }
//        try {
//            // right part of infix
//            Sub result = (Sub)FactoryRegistry.getRegistry().getFactory("-").newInstance();
//            GelExpression right = children.get(1).accept(this);
//            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
//            operands.add(right);
//            result.setOperand(operands);
//            return result;
//
//        }
//        catch (Exception ex) {
//            throw new RuntimeException(ex);
//        }
//    }

//    @Override
//    public GelExpression visitAddExpression(${artifactIdI2uc}Parser.AddExpressionContext ctx) {
//        List<ParseTree> children = ctx.children;
//        if (children.size() == 1) {
//            GelExpression result = children.get(0).accept(this);
//            return result;
//        }
//        try {
//            // right part of infix
//            Add result = (Add)FactoryRegistry.getRegistry().getFactory("+").newInstance();
//            GelExpression right = children.get(1).accept(this);
//            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
//            operands.add(right);
//            result.setOperand(operands);
//            return result;
//
//        }
//        catch (Exception ex) {
//            throw new RuntimeException(ex);
//        }
//    }

    @Override
    public GelExpression visitXorExpression(${artifactIdI2uc}Parser.XorExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression   result = children.get(0).accept(this);
            int     index = 1;
            while (index < children.size()) {
                List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                result = (GelExpression) FactoryRegistry.getRegistry().getFactory(children.get(index++).getText()).newInstance();
                GelExpression right = children.get(index++).accept(this);
                operands.add(right);
                result.setOperand(operands);
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


    /**
     * <pre><code>
     * a + b - c - d
     * -
     *   -
     *     +
     *       a
     *       b
     *     c
     *   d
     * </code></pre>
     * 
     * 
     * @param ctx
     * @return 
     */
    @Override
    public GelExpression visitAddOrSubExpression(${artifactIdI2uc}Parser.AddOrSubExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            // left part
            GelExpression result = children.get(0).accept(this);
            for (int i=1 ; i<children.size() ; i++) {
                String symbol = children.get(i++).getText();
                GelExpression operator = (GelExpression) FactoryRegistry.newInstance(symbol);
                List<GelExpression> operands = FactoryMethods.newList(GelExpression.class);
                operands.add(result);
                GelExpression next = children.get(i).accept(this);
                operands.add(next);
                operator.setOperand(operands);
                result = operator;
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }       // visitAddOrSubExpression



    @Override
    public GelExpression visitOppExpression(${artifactIdI2uc}Parser.OppExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            GelExpression left = children.get(1).accept(this);
            Opp result = (Opp)FactoryRegistry.getRegistry().getFactory("opp").newInstance();
            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
            operands.add(left);
            result.setOperand(operands);
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }




    //========================================================================//
    //                  H A R D   C O D E D   M E T H O D S                   //
    //========================================================================//

    


    @Override
    public GelExpression visitNavExpression(${artifactIdI2uc}Parser.NavExpressionContext ctx) {
        context.push();
        GelExpression result = super.visitNavExpression(ctx);
        context.pop();
        return result;
    }

    @Override
    public GelExpression visitNavExpressionLeftToRight(${artifactIdI2uc}Parser.NavExpressionLeftToRightContext ctx) {
        List<ParseTree> children   = ctx.children;
        int             nbChildren = children.size();
        GelExpression   result = children.get(nbChildren-1).accept(this);
        for (int i=1 ; i<nbChildren ; i+=2) {
            GelExpression next = children.get(i).accept(this);
            List<GelExpression> operand = next.getOperand();
            operand.add(0, result);
            result = next;
        }
        return result;
    }

    @Override
    public GelExpression visitNavExpressionRightToLeft(${artifactIdI2uc}Parser.NavExpressionRightToLeftContext ctx) {
        List<ParseTree> children   = ctx.children;
        int             nbChildren = children.size();
        GelExpression   result = children.get(nbChildren-1).accept(this);
        if (nbChildren == 1) {
            return result;
        }
        for (int i=nbChildren-3 ; i>=0 ; i-=2) {
            GelExpression next = children.get(i).accept(this);
//            List<GelExpression> operand = next.getOperand();
//            operand.add(0, result);
            result = next;
        }
        return result;
    }




    @Override
    public GelExpression visitIdentifier(${artifactIdI2uc}Parser.IdentifierContext ctx) {
        try {
            GelExpression result = context.resolve(ctx.getText());
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(${artifactIdI2uc}TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(${artifactIdI2uc}TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }




    @Override
    public GelExpression visitPostfixedAtPreExpression(${artifactIdI2uc}Parser.PostfixedAtPreExpressionContext ctx) {
        GelExpression result = null;
        try {
            result = (GelExpression) FactoryRegistry.newInstance("@pre");
            List<ParseTree>     children = ctx.children;
            int                 nbChildren = children.size();
            ParseTree           child = children.get(nbChildren-2);
            GelExpression navigation = child.accept(this);
            List<GelExpression> operands = FactoryMethods.newList(GelExpression.class);
            operands.add(navigation);
            result.setOperand(operands);
            result.setType(navigation.getType());
            return result;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }



    @Override
    public GelExpression visitPrefixedAtPreExpression(${artifactIdI2uc}Parser.PrefixedAtPreExpressionContext ctx) {
        return super.visitPrefixedAtPreExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }






    private GelContext<GelExpression>   context;


}

