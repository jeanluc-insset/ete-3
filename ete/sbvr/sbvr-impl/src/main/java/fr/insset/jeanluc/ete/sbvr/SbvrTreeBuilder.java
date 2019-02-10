package fr.insset.jeanluc.ete.sbvr;



import fr.insset.jeanluc.ete.gel.*;
import fr.insset.jeanluc.ete.gel.impl.*;
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
 * An instance of this class is a visitor for GenericExpressions. It takes a
 * GenericExpression concrete tree and returns the matching abstract tree.
 *
 * Usage : <code><pre>
SbvrParser            parser             = SbvrParserFactory.newParser(aString);
GenericExpressionContext ctx                = parser.sbvrExpression();
TreeBuilder          treeBuilder        = new TreeBuilder(inContext);
GenericExpression        abstractExpression = treeBuilder.visitGenericExpression(ctx);
</pre></code>
 *
 */
@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/language/tree-builder.vm")
public class SbvrTreeBuilder extends SbvrParserBaseVisitor<GenericExpression> {


    public SbvrTreeBuilder(GelContext inContext) {
        context = inContext;
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(".",    AttributeNavImpl.class);
        registry.registerDefaultFactory(".att", AttributeNavImpl.class);
        registry.registerDefaultFactory(".op",  MethodNavImpl.class);
        registry.registerDefaultFactory("symbol",  SymbolImpl.class);
    }


    @Override
    public GenericExpression visitGenericExpression(SbvrParser.GenericExpressionContext ctx) {
        // Create a fresh stack frame for local variables
//        context.push();
        return super.visitGenericExpression(ctx);
    }


//============================================================================//
//                      G E N E R A T E D   M E T H O D S                     //
//============================================================================//



//============================================================================//




    //========================================================================//
    //                  H A R D   C O D E D   M E T H O D S                   //
    //========================================================================//


    //------------------------------------------------------------------------//
    // Rules for files                                                        //
    // A file defines contextual rules. This means that we must reset this    //
    // context several times during parsing                                   //
    //------------------------------------------------------------------------//


    //------------------------------------------------------------------------//
    //------------------------------------------------------------------------//

    @Override
    public GenericExpression visitSelfExpression(SbvrParser.SelfExpressionContext ctx) {
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
    public GenericExpression visitAtPreExpression(SbvrParser.AtPreExpressionContext ctx) {
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
    public GenericExpression visitVariableOrMemberAtPre(SbvrParser.VariableOrMemberAtPreContext ctx) {
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
    public GenericExpression visitIdentifier(SbvrParser.IdentifierContext ctx) {
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
    public GenericExpression visitParenthesisExpression(SbvrParser.ParenthesisExpressionContext ctx) {
        return ctx.children.get(1).accept(this);
    }


    @Override
    public GenericExpression visitVariableOrMember(SbvrParser.VariableOrMemberContext ctx) {
        try {
            return (GelExpression)context.resolve(ctx.getText());
        } catch (InstantiationException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    @Override
    public GenericExpression visitAttributeNavExpression(SbvrParser.AttributeNavExpressionContext ctx) {
        try {
            List<ParseTree> children = ctx.children;
            SbvrParser.IdentifierContext functionCall = (SbvrParser.IdentifierContext)children.get(1);
            String identifier = functionCall.getText();
            GelExpression result = context.resolve(identifier);
            List<GelExpression>  operands = result.getOperand();
            // Parse the parameters of the call 
            // Warning : there are commas between parameters
            List<ParseTree>     functionChildren = functionCall.children;
            if (functionChildren.size() > 2) {
                SbvrParser.ParameterListContext parameterList = (SbvrParser.ParameterListContext) functionChildren.get(2);
                List<ParseTree> parameters = parameterList.children;
                for (int i=0 ; i<parameters.size() ; i += 2) {
                    GelExpression aParameter = (GelExpression)parameters.get(i).accept(this);
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
    public GenericExpression visitMethodNavExpression(SbvrParser.MethodNavExpressionContext ctx) {
        List<ParseTree> children = ctx.children;
        if (children.size() == 1) {
            return children.get(0).accept(this);
        }
        try {
            SbvrParser.FunctionCallContext functionCall = (SbvrParser.FunctionCallContext)children.get(1);
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
    public GenericExpression visitCollectionMethodNavExpression(SbvrParser.CollectionMethodNavExpressionContext ctx) {
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
            SbvrParser.FunctionCallContext functionCall = (SbvrParser.FunctionCallContext)children.get(1);
            String functionIdentifier = functionCall.children.get(0).getText();
            GelExpression result = context.resolveCollOp(functionIdentifier);
            List<GelExpression>  operands = FactoryMethods.newList(GelExpression.class);
            result.setOperand(operands);
            // Parse the parameters of the call
            List<ParseTree>     functionChildren = functionCall.children;
            if (functionChildren.size() > 2) {
                // In the current grammar a function call has always 4 children
                // The third one is the parameter list
                SbvrParser.ParameterListContext parameterList = (SbvrParser.ParameterListContext) functionChildren.get(2);
                List<ParseTree> parameters = parameterList.children;
                if (parameters != null) {
                    context.push();
                    context.set(CURRENT, context.get(CURRENT));
                    for (int i=0 ; i<parameters.size() ; i += 2) {
                        GelExpression aParameter = (GelExpression)parameters.get(i).accept(this);
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
    public GenericExpression visitOclIsNew(SbvrParser.OclIsNewContext ctx) {
        return context.resolveIsNew();
    }


    //========================================================================//


    GelContext<GelExpression>   context;


}

