package fr.insset.jeanluc.ete.gel.impl;



import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.ete.gel.GelParser;
import fr.insset.jeanluc.ete.gel.GelParserBaseVisitor;
import fr.insset.jeanluc.ete.gel.*;
import static fr.insset.jeanluc.ete.gel.GelContext.CURRENT;
import static fr.insset.jeanluc.ete.gel.GelContext.ROOT;
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
 * Generates an abstract tree builder.
 * An instance of this class is a visitor for GelExpressions. It takes a
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
@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/language/tree-builder.vm")
public class TreeBuilder extends GelParserBaseVisitor<GelExpression> {


    public TreeBuilder(GelContext inContext) {
        context = inContext;
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory("String", StringLiteralImpl.class);
        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);
        registry.registerDefaultFactory("date", DateLiteralImpl.class);
        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);
        registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);
        registry.registerDefaultFactory("<=", LessOrEqualImpl.class);
        registry.registerDefaultFactory("or", OrImpl.class);
        registry.registerDefaultFactory("@pre", AtPreImpl.class);
        registry.registerDefaultFactory(".att", AttributeNavImpl.class);
        registry.registerDefaultFactory("<>", DifferentImpl.class);
        registry.registerDefaultFactory("|", LambdaImpl.class);
        registry.registerDefaultFactory("var", VariableReferenceImpl.class);
        registry.registerDefaultFactory(">", GreaterThanImpl.class);
        registry.registerDefaultFactory("=", EqualImpl.class);
        registry.registerDefaultFactory("result", ResultImpl.class);
        registry.registerDefaultFactory("-", SubImpl.class);
        registry.registerDefaultFactory(".meth", MethodNavImpl.class);
        registry.registerDefaultFactory("->", FlatCollectImpl.class);
        registry.registerDefaultFactory("xor", XorImpl.class);
        registry.registerDefaultFactory("and", AndImpl.class);
        registry.registerDefaultFactory("isnew", IsNewImpl.class);
        registry.registerDefaultFactory("+", AddImpl.class);
        registry.registerDefaultFactory("/", DivImpl.class);
        registry.registerDefaultFactory("->", CollectionMethodNavImpl.class);
        registry.registerDefaultFactory("let", VariableDefinitionImpl.class);
        registry.registerDefaultFactory("<", LessThanImpl.class);
        registry.registerDefaultFactory("self", SelfImpl.class);
        registry.registerDefaultFactory("%", ModImpl.class);
        registry.registerDefaultFactory("opp", OppImpl.class);
        registry.registerDefaultFactory("not", NotImpl.class);
        registry.registerDefaultFactory("*", MultImpl.class);
        registry.registerDefaultFactory(">=", GreaterOrEqualImpl.class);
        registry.registerDefaultFactory("collect", CollectImpl.class);
        registry.registerDefaultFactory("flatten", FlattenImpl.class);
        registry.registerDefaultFactory("excludes", ExcludesImpl.class);
        registry.registerDefaultFactory("includes", IncludesImpl.class);
        registry.registerDefaultFactory("sum", SumImpl.class);
        registry.registerDefaultFactory("flatCollect", FlatCollectImpl.class);
        registry.registerDefaultFactory("average", AverageImpl.class);
        registry.registerDefaultFactory("select", SelectImpl.class);
        registry.registerDefaultFactory(".",    AttributeNavImpl.class);
        registry.registerDefaultFactory(".att", AttributeNavImpl.class);
        registry.registerDefaultFactory(".op",  MethodNavImpl.class);
    }


    @Override
    public GelExpression visitGelExpression(GelParser.GelExpressionContext ctx) {
        // Create a fresh stack frame for local variables
//        context.push();
        return super.visitGelExpression(ctx);
    }


//============================================================================//
//                      G E N E R A T E D   M E T H O D S                     //
//============================================================================//


    // LITERAL TYPE : String
    @Override
    public GelExpression visitStringLiteral(GelParser.StringLiteralContext ctx) {
        try {
            String text = ctx.getText();
            StringLiteral newInstance = (StringLiteral)FactoryRegistry.newInstance("String");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : Boolean
    @Override
    public GelExpression visitBooleanLiteral(GelParser.BooleanLiteralContext ctx) {
        try {
            String text = ctx.getText();
            BooleanLiteral newInstance = (BooleanLiteral)FactoryRegistry.newInstance("Boolean");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    // LITERAL TYPE : date
    @Override
    public GelExpression visitDateLiteral(GelParser.DateLiteralContext ctx) {
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
    public GelExpression visitFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx) {
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
    public GelExpression visitIntegerLiteral(GelParser.IntegerLiteralContext ctx) {
        try {
            String text = ctx.getText();
            IntegerLiteral newInstance = (IntegerLiteral)FactoryRegistry.newInstance("Integer");
            newInstance.setValueAsString(text);
            return newInstance;
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }


//============================================================================//

    @Override
    public GelExpression visitLessOrEqualExpression(GelParser.LessOrEqualExpressionContext ctx) {
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
    public GelExpression visitOrExpression(GelParser.OrExpressionContext ctx) {
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
    public GelExpression visitDifferentExpression(GelParser.DifferentExpressionContext ctx) {
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
    public GelExpression visitGreaterThanExpression(GelParser.GreaterThanExpressionContext ctx) {
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
    public GelExpression visitEqualExpression(GelParser.EqualExpressionContext ctx) {
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
    public GelExpression visitSubExpression(GelParser.SubExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            Sub result = (Sub)FactoryRegistry.getRegistry().getFactory("-").newInstance();
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
    public GelExpression visitNavExpression(GelParser.NavExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            context.remove(CURRENT);
            return result;
        }
        try {
            GelExpression result = children.get(0).accept(this);
            for (int i=1 ; i<children.size() ; i++) {
                GelExpression next = children.get(i).accept(this);
                List<GelExpression> operands = next.getOperand();
//              FactoryMethods.newList(GelExpression.class);
//                next.setOperand(operands);
                operands.add(0, result);
                result = next;
            }
            context.remove(CURRENT);
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitXorExpression(GelParser.XorExpressionContext ctx) {
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
    public GelExpression visitAndExpression(GelParser.AndExpressionContext ctx) {
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
    public GelExpression visitAddExpression(GelParser.AddExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
            Add result = (Add)FactoryRegistry.getRegistry().getFactory("+").newInstance();
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
    public GelExpression visitDivExpression(GelParser.DivExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
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
    public GelExpression visitAddOrSubExpression(GelParser.AddOrSubExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
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
    public GelExpression visitLessThanExpression(GelParser.LessThanExpressionContext ctx) {
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
    public GelExpression visitModExpression(GelParser.ModExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
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
    public GelExpression visitOppExpression(GelParser.OppExpressionContext ctx) {
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

    @Override
    public GelExpression visitMultOrDivExpression(GelParser.MultOrDivExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
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
    public GelExpression visitNotExpression(GelParser.NotExpressionContext ctx) {
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
    public GelExpression visitMultExpression(GelParser.MultExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            GelExpression result = children.get(0).accept(this);
            return result;
        }
        try {
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
    public GelExpression visitGreaterOrEqualExpression(GelParser.GreaterOrEqualExpressionContext ctx) {
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




    //========================================================================//
    //                  H A R D   C O D E D   M E T H O D S                   //
    //========================================================================//


    @Override
    public GelExpression visitSelfExpression(GelParser.SelfExpressionContext ctx) {
        try {
            Self    result = (Self) FactoryRegistry.newInstance("self");
            result.setType(context.getContextType());
            context.set(CURRENT, result);
            return result;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.visitSelfExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public GelExpression visitAtPreExpression(GelParser.AtPreExpressionContext ctx) {
        try {
            AtPre   result = (AtPre) FactoryRegistry.newInstance("@pre");
            List<GelExpression> operands = new XList<>();
//            operands.add(accept);
            result.setOperand(operands);
            return result;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Exception visiting atPreExpression", ex);
        }
    }

    @Override
    public GelExpression visitVariableOrMemberAtPre(GelParser.VariableOrMemberAtPreContext ctx) {
        try {
            AtPre   result = (AtPre) FactoryRegistry.newInstance("@pre");
            Step accept = (Step)ctx.children.get(0).accept(this);
            List<GelExpression> operands = new XList<>();
            operands.add(accept);
            result.setOperand(operands);
            Feature feature = accept.getToFeature();
            result.setToFeature(feature);
            result.setType(feature.getType());
            return result;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Exception visiting atPreExpression", ex);
        }
    }




    @Override
    public GelExpression visitIdentifier(GelParser.IdentifierContext ctx) {
        try {
            String text = ctx.getText();
            Object resolve = context.resolve(text);
            return (GelExpression)resolve;
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public GelExpression visitParenthesisExpression(GelParser.ParenthesisExpressionContext ctx) {
        return ctx.children.get(1).accept(this);
    }


    @Override
    public GelExpression visitVariableOrMember(GelParser.VariableOrMemberContext ctx) {
        try {
            return (GelExpression)context.resolve(ctx.getText());
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    }


    @Override
    public GelExpression visitAttributeNavExpression(GelParser.AttributeNavExpressionContext ctx) {
        try {
            List<ParseTree> children = ctx.children;
            GelParser.IdentifierContext functionCall = (GelParser.IdentifierContext)children.get(1);
            String identifier = functionCall.getText();
            GelExpression result = context.resolve(identifier);
            List<GelExpression>  operands = result.getOperand();
            // Parse the parameters of the call 
            // Warning : there are commas between parameters
            List<ParseTree>     functionChildren = functionCall.children;
            if (functionChildren.size() > 2) {
                GelParser.ParameterListContext parameterList = (GelParser.ParameterListContext) functionChildren.get(2);
                List<ParseTree> parameters = parameterList.children;
                for (int i=0 ; i<parameters.size() ; i += 2) {
                    GelExpression aParameter = parameters.get(i).accept(this);
                    operands.add(aParameter);
                }
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }


    @Override
    public GelExpression visitMethodNavExpression(GelParser.MethodNavExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            return children.get(0).accept(this);
        }
        try {
            GelParser.FunctionCallContext functionCall = (GelParser.FunctionCallContext)children.get(1);
            String functionIdentifier = functionCall.children.get(0).getText();
            MofType   current = (MofType)context.resolveVariable(CURRENT);
            GelExpression result = context.resolveOperation(functionIdentifier, current);
            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
            result.setOperand(operands);
            // Todo : parse the parameters of the call
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }



    @Override
    public GelExpression visitCollectionMethodNavExpression(GelParser.CollectionMethodNavExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            // With the current version of the grammar this should never
            // happend
            return children.get(0).accept(this);
        }
        try {
            Collect  current = (Collect) context.get(CURRENT);
            Feature toFeature = current.getToFeature();
            context.set(ROOT, toFeature);
            GelParser.FunctionCallContext functionCall = (GelParser.FunctionCallContext)children.get(1);
            String functionIdentifier = functionCall.children.get(0).getText();
            GelExpression result = context.resolveCollOp(functionIdentifier);
            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
            result.setOperand(operands);
            // Parse the parameters of the call
            List<ParseTree>     functionChildren = functionCall.children;
            if (functionChildren.size() > 2) {
                // In the current grammar a function call has always 4 children
                // The third one is the parameter list
                GelParser.ParameterListContext parameterList = (GelParser.ParameterListContext) functionChildren.get(2);
                List<ParseTree> parameters = parameterList.children;
                if (parameters != null) {
                    context.push();
                    context.set(CURRENT, context.get(CURRENT));
                    for (int i=0 ; i<parameters.size() ; i += 2) {
                        GelExpression aParameter = parameters.get(i).accept(this);
                        operands.add(aParameter);
                    }
                    context.pop();
                }
            }
            return result;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }




    @Override
    public GelExpression visitOclIsNew(GelParser.OclIsNewContext ctx) {
        return context.resolveIsNew();
    }






    //========================================================================//


    GelContext<GelExpression>   context;


}

