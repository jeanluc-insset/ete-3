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
import fr.insset.jeanluc.gel.GelParser;
import fr.insset.jeanluc.gel.GelParserBaseVisitor;
import fr.insset.jeanluc.gel.CollectionOperationExpression;
import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.gel.Literal;
import fr.insset.jeanluc.gel.Navigable;
import fr.insset.jeanluc.gel.Navigation;
// import static fr.insset.jeanluc.gel.api.Navigation.NAVIGATION;
import fr.insset.jeanluc.gel.Operation;
import fr.insset.jeanluc.gel.Self;
import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.VariableReference;
import fr.insset.jeanluc.gel.impl.*;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;


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
@Generated("ete - jean-luc@insset.fr  modules/maven-project/gel-impl/java/tree-builder.vm")
public class TreeBuilder extends GelParserBaseVisitor<GelExpression> {



    public TreeBuilder(MofPackage inModel, TypedElement inContext) {
        this(inModel, inContext, new HashMap<>());
    }
    
    public TreeBuilder(MofPackage inModel, TypedElement inContext, Map<String, VariableDefinition> inVariables) {
        variables = inVariables;
        model = inModel;
        context = inContext;
        if (context instanceof fr.insset.jeanluc.ete.meta.model.emof.MofOperation) {
            fr.insset.jeanluc.ete.meta.model.emof.MofOperation operation
                    = (fr.insset.jeanluc.ete.meta.model.emof.MofOperation)context;
            contextClass.push(operation.getOwningMofClass());
            for (MofParameter aParameter : operation.getOwnedParameter()) {
                // TODO : use a factory
                VariableDefinition  parameterDefinition = new VariableDefinitionImpl();
                parameterDefinition.setIdentifier(aParameter.getName());
                parameterDefinition.setType(aParameter.getType());
                variables.put(aParameter.getName(), parameterDefinition);
            }
        }
        else {
            contextClass.push((MofClass)context);
        }

        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory("not", NotImpl.class);
        registry.registerDefaultFactory("*", MultImpl.class);
        registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);
        registry.registerDefaultFactory("or", OrImpl.class);
        registry.registerDefaultFactory("+", AddImpl.class);
        registry.registerDefaultFactory("<>", DifferentImpl.class);
        registry.registerDefaultFactory("xor", XorImpl.class);
        registry.registerDefaultFactory("date", DateLiteralImpl.class);
        registry.registerDefaultFactory("/", DivImpl.class);
        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);
        registry.registerDefaultFactory("<", LessThanImpl.class);
        registry.registerDefaultFactory(">", GreaterThanImpl.class);
        registry.registerDefaultFactory("and", AndImpl.class);
        registry.registerDefaultFactory("-", MinusImpl.class);
        registry.registerDefaultFactory("<=", LessOrEqualImpl.class);
        registry.registerDefaultFactory("String", StringLiteralImpl.class);
        registry.registerDefaultFactory("=", EqualImpl.class);
        registry.registerDefaultFactory(">=", GreaterOrEqualImpl.class);
        registry.registerDefaultFactory("opp", OppImpl.class);
        registry.registerDefaultFactory("|", LambdaImpl.class);
        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);
        registry.registerDefaultFactory("@", AtPreImpl.class);
        registry.registerDefaultFactory("self", SelfImpl.class);
        registry.registerDefaultFactory("Navigation", NavigationImpl.class);
        registry.registerDefaultFactory(CollectionOperationExpression.class, CollectionOperationExpressionImpl.class);
        registry.registerDefaultFactory(VariableReference.class, VariableReferenceImpl.class);
    }


    @Override
    public GelExpression visitGelExpression(GelParser.GelExpressionContext ctx) {
        navigable = new Stack<>();
        return super.visitGelExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

/*
    //========================================================================//


    @Override
    public GelExpression visitChildren(RuleNode node) {
        return buildBinaryExpression(node);
    }



    //========================================================================//


                                    @Override
    public GelExpression visitIntegerLiteral(GelParser.IntegerLiteralContext ctx) {
        Literal result =  buildLiteral(ctx, "Integer");
        result.setValue(Integer.parseInt(result.getValueAsString()));
        return result;
    }
                                                    @Override
    public GelExpression visitDateLiteral(GelParser.DateLiteralContext ctx) {
        Literal result =  buildLiteral(ctx, "date");
        String  valueAsString = result.getValueAsString();
        valueAsString = valueAsString.substring(1, valueAsString.length()-1);
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        final LocalDate dt = LocalDate.parse(valueAsString, dtf);
        result.setValueAsString(valueAsString);
        result.setValue(dt);
        return result;
    }
                @Override
    public GelExpression visitBooleanLiteral(GelParser.BooleanLiteralContext ctx) {
        Literal result =  buildLiteral(ctx, "Boolean");
        result.setValue(Boolean.parseBoolean(result.getValueAsString()));
        return result;
    }
                                                    @Override
    public GelExpression visitStringLiteral(GelParser.StringLiteralContext ctx) {
        Literal result =  buildLiteral(ctx, "String");
        String  valueAsString = result.getValueAsString();
        valueAsString = valueAsString.substring(1, valueAsString.length()-1);
        result.setValue(valueAsString);
        return result;
    }
                                    @Override
    public GelExpression visitFloatingPointLiteral(GelParser.FloatingPointLiteralContext ctx) {
        Literal result =  buildLiteral(ctx, "Double");
        result.setValue(Double.parseDouble(result.getValueAsString()));
        return result;
    }
        

*/



    //========================================================================//

    private     MofPackage                              model;

    /**
     *  Should be an instance of MofClass or (Mof)Operation.
     */
    private     TypedElement                            context;

    /**
     * An expression can contains sub-expressions. For example<br>
     * <code>pilot[</code>
     * The first item of the stack is defined by :<br><code>
     * context instanceof MofClass ==&gt; context == contextClass<br>
     * context instanceof Operation ==&gt; context.getOwningMofClass() == contextClass</code>
     */
    private     Stack<Classifier>                       contextClass = new Stack<>();

    private     Stack<Navigable>                        navigable;

    private     Map<String, VariableDefinition>         variables = new HashMap<>();

    private     String                                  currentNavOperator;

}

