package fr.insset.jeanluc.ete.gel.impl;



import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.GelParser;
import fr.insset.jeanluc.ete.gel.GelParserBaseVisitor;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.VariableReference;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofParameter;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.TypedElement;

// import static fr.insset.jeanluc.gel.api.Navigation.NAVIGATION;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.annotation.Generated;


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


                                                            

*/

    //========================================================================//




    //========================================================================//
    //                             N A V I G A T I O N                        //
    //========================================================================//


    /**
     *  Returns an instance of Self. The type of that instance is the
     *  provided context or the type of the owning class if the context is an
     *  operation.
     */
/*
    public GelExpression visitSelfExpression(GelParser.SelfExpressionContext ctx) {
        try {
            Self result = (Self)FactoryRegistry.newInstance("self");
            result.setType(contextClass.firstElement());
            navigable.push(result);
            return result;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public GelExpression visitComplexNavExpression(GelParser.ComplexNavExpressionContext ctx) {
        int     childCount = ctx.getChildCount();
        ParseTree   child = ctx.getChild(0);
        String      text = child.getText();
        Navigable   result = null;
        int         startToParseFrom = 2;

        if ("self".equals(text)) {
            result = (Navigable)child.accept(this);
            navigable.push(result);
        }
        else {
            VariableDefinition declaration = variables.get(text);
            if (declaration != null) {
                try {
                    VariableReference   reference = (VariableReference)FactoryRegistry.newInstance(VariableReference.class);
                    reference.setDeclaration(declaration);
                    reference.setType(declaration.getType());
                    result = reference;
                } catch (InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
                    throw new RuntimeException("Unable to instanciate variable");
                }
            }
            else {
                // Implicit start of navigation
                // Warning : it can be another context than the initial context
                // in case of sub expression
                // Warning : currently we use Self because variables are not
                // yet handled. Should be turned to VariableReference sooner or
                // later.
                try {
                    result = (Navigable)FactoryRegistry.newInstance("self");
                } catch (InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
                    throw new RuntimeException("Unable to instanciate self");
                }
    //            self.setName("self");
                result.setType(contextClass.peek());
                navigable.push(result);
                startToParseFrom = 0;
            }
        }
        for (int i=startToParseFrom ; i<childCount ; i+=2) {
            if (i>0) {
                this.currentNavOperator = ctx.getChild(i-1).getText();
            }
            else {
                this.currentNavOperator = ".";
            }
            // Actually the result is a Navigation
            result = (Navigable)ctx.getChild(i).accept(this);
        }
        return result;
    }
*/

   /**
     * <div>
     * This method does not flatten any collection of collections.<br>
     * E.g. if we have the associations :<br>
     * A ->*  B ->* C -> D<br>
     * when we parse a.b.c.d the result is a collection of collections of Ds
     * not a collection of Ds.<br>
     * TODO : check the specification of OCL 2.
     * </div>
     * 
     * <div>
     * Warning : this method works only for "dot" navigations.
     * </div>
     * 
     * @param ctx concrete tree
     * @return abstract tree
     */
/*
    @Override
    public GelExpression visitPropertyNavigationExpression(GelParser.PropertyNavigationExpressionContext ctx) {
        try {
            String      identifier         = ctx.getText();
            Navigable   currentNavigation  = navigable.peek();
            MofType     currentNavType     = currentNavigation.getType();
            MofType     currentType        = currentNavType;
            Classifier  mofClass           = null;
            while (currentType instanceof MofCollection) {
                MofCollection   collection = (MofCollection) currentType;
                currentType = collection.getBaseType();
            }
            mofClass = (Classifier)currentType;

            MofProperty attribute = mofClass.getOwnedAttribute(identifier);
            MofType propertyType = attribute.getType();
            Navigation  result = (Navigation)FactoryRegistry.newInstance("Navigation");
            result.setFrom(currentNavigation);
            result.setToFeature(attribute);
            if (currentNavType instanceof MofCollection) {
                // Let's create a new collection instance of the same type
                MofCollection newCollection = (MofCollection)FactoryRegistry.newInstance(currentNavType.getClass());
                newCollection.setBaseType(propertyType);
                result.setType(newCollection);
            }
            else {
                result.setType(attribute.getType());
            }
            navigable.push(result);
            return result;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Unable to instantiate a navigation");
        }
    }



    @Override
    public GelExpression visitOperationNavigationExpression(GelParser.OperationNavigationExpressionContext ctx) {
        if ("->".equals(currentNavOperator)) {
            try {
                return visitCollectionOperationExpression(ctx);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException(ex);
            }
        }
        try {
            String      identifier         = ctx.getText();
            Navigable   currentNavigation  = navigable.peek();
            MofType     currentNavType     = currentNavigation.getType();
            MofType     currentType        = currentNavType;
            Classifier  mofClass           = null;
            while (currentType instanceof MofCollection) {
                MofCollection   collection = (MofCollection) currentType;
                currentType = collection.getBaseType();
            }
            mofClass = (Classifier)currentType;

            fr.insset.jeanluc.ete.meta.model.emof.MofOperation operation
                    = (fr.insset.jeanluc.ete.meta.model.emof.MofOperation)mofClass.getOwnedOperation(identifier);
            MofType propertyType = operation.getType();
            Navigation  result = (Navigation)FactoryRegistry.newInstance("Navigation");
            result.setFrom(currentNavigation);
            result.setToFeature(operation);
            if (currentNavType instanceof MofCollection) {
                // Let's create a new collection instance of the same type
                MofCollection newCollection = (MofCollection)FactoryRegistry.newInstance(currentNavType.getClass());
                newCollection.setBaseType(propertyType);
                result.setType(newCollection);
            }
            else {
                result.setType(operation.getType());
            }
            navigable.push(result);
            return result;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Unable to instantiate a navigation");
        }
    }
*/


    /**
     * Such an operation is provided by the meta-model instead of the model
     * itself.<br>
     * Currently, they are handled as is, i.e. as a blanck object storing the
     * identifier and the parameters of the operation.
     */
/*
    private GelExpression visitCollectionOperationExpression(GelParser.OperationNavigationExpressionContext ctx) throws InstantiationException, IllegalAccessException {
        fr.insset.jeanluc.ete.meta.model.emof.MofOperation operation
                                    = null;
        String    identifier        = ctx.getChild(0).getText();
        Navigable currentNavigation = navigable.peek();
        CollectionOperationExpression  result;
        result = (CollectionOperationExpression) FactoryRegistry.newInstance(CollectionOperationExpression.class);
        MofType   currentNavType    = currentNavigation.getType();
        // We should look for an operation in that type but to achieve that
        // we must manage the meta-model in the program
        // Next subversion ?
        // operation = (MofOperation)currentNavType.getOwnedOperation(identifier);
        // The, we should get the result type from that operation
        // Same next subversion ?
        // result.setType(operation.getType());
        result.setToFeature(operation);
        result.setIdentifier(identifier);
        result.setFrom(currentNavigation);
        ParseTree parameterList = ctx.getChild(2);
        int      childCount = parameterList.getChildCount();
        for (int i=0 ; i<childCount ; i+=2) {
            result.addParameter(parameterList.getChild(i).accept(this));
        }
        currentNavigation = result;
        return result;
    }
*/


/*
    @Override
    public GelExpression visitNavExpression(GelParser.NavExpressionContext ctx) {
        int         childCount = ctx.getChildCount();
        GelExpression source = ctx.getChild(0).accept(this);
        for (int i=2 ; i<childCount ; i+=2) {
            ParseTree child = ctx.getChild(i);
            String    identifier = child.getText();
            String    operator   = ctx.getChild(i-1).getText();
            switch (operator) {
                case "." :
                    MofClass sourceType = (MofClass) source.getType();
                    sourceType.getOwnedAttribute(identifier);
                    break;
                case "->" :
                    break;
                default :
                    throw new RuntimeException("Unexpected operator : " + operator);
            }
            System.out.println("child : " + child + " -> " + identifier);
        }
        return source;
    }
*/

    //========================================================================//

/*
    protected GelExpression buildBinaryExpression(RuleNode ctx) {
        int         childCount = ctx.getChildCount();
        GelExpression   result = ctx.getChild(0).accept(this);
        // run through the operands
        for (int i=2 ; i<childCount ; i+=2) {
            GelExpression   child   = ctx.getChild(i).accept(this);
            String          operator = ctx.getChild(i-1).getText();
            Operation       exp;
            try {
                exp = (Operation)FactoryRegistry.newInstance(operator);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException(ex);
            }
            exp.addOperand(result);
            exp.addOperand(child);
            result = exp;
            // TODO : manage type
        }
        return result;
    }


    protected   Literal   buildLiteral(ParserRuleContext ctx, String inMofTypeName) {
        PackageableElement type = model.getElementByName(inMofTypeName);
        try {
            Object newInstance = FactoryRegistry.newInstance(inMofTypeName);
            Literal result = (Literal)newInstance;
            result.setValueAsString(ctx.getText());
            return result;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(TreeBuilder.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
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

