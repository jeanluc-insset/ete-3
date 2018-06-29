#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${parentArtifactId}.impl.factory;



import ${package}.ete.meta.model.core.PrimitiveDataTypes;
import ${package}.ete.meta.model.mofpackage.EteModel;
import static ${package}.ete.meta.model.mofpackage.EteModel.MODEL;
import ${package}.ete.meta.model.mofpackage.impl.EteModelImpl;
import static ${package}.ete.meta.model.types.MofType.MOF_TYPE;
import ${package}.ete.meta.model.types.impl.MofTypeImpl;
import ${package}.ete.${parentArtifactId}.impl.*;
import javax.annotation.Generated;
import ${package}.util.factory.FactoryRegistry;



@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/from-spec/factory.vm")
public class GelFactory {

    public static void registerFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(MOF_TYPE, MofTypeImpl.class);

        registry.registerDefaultFactory("date", DateLiteralImpl.class);                
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.FlatCollectImpl.class);        
        registry.registerDefaultFactory("<",
                    ${package}.ete.${parentArtifactId}.impl.LessThanImpl.class);        
        registry.registerDefaultFactory("-",
                    ${package}.ete.${parentArtifactId}.impl.SubImpl.class);        
        registry.registerDefaultFactory("result",
                    ${package}.ete.${parentArtifactId}.impl.ResultImpl.class);        
        registry.registerDefaultFactory("=",
                    ${package}.ete.${parentArtifactId}.impl.EqualImpl.class);        
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.CollectImpl.class);        
        registry.registerDefaultFactory("not",
                    ${package}.ete.${parentArtifactId}.impl.NotImpl.class);        
        registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);                
        registry.registerDefaultFactory("<=",
                    ${package}.ete.${parentArtifactId}.impl.LessOrEqualImpl.class);        
        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);                
        registry.registerDefaultFactory("var",
                    ${package}.ete.${parentArtifactId}.impl.VariableReferenceImpl.class);        
        registry.registerDefaultFactory("|",
                    ${package}.ete.${parentArtifactId}.impl.LambdaImpl.class);        
        registry.registerDefaultFactory("isnew",
                    ${package}.ete.${parentArtifactId}.impl.IsNewImpl.class);        
        registry.registerDefaultFactory(">",
                    ${package}.ete.${parentArtifactId}.impl.GreaterThanImpl.class);        
        registry.registerDefaultFactory("or",
                    ${package}.ete.${parentArtifactId}.impl.OrImpl.class);        
        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);                
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.AverageImpl.class);        
        registry.registerDefaultFactory(".meth",
                    ${package}.ete.${parentArtifactId}.impl.MethodNavImpl.class);        
        registry.registerDefaultFactory("and",
                    ${package}.ete.${parentArtifactId}.impl.AndImpl.class);        
        registry.registerDefaultFactory("/",
                    ${package}.ete.${parentArtifactId}.impl.DivImpl.class);        
        registry.registerDefaultFactory("let",
                    ${package}.ete.${parentArtifactId}.impl.VariableDefinitionImpl.class);        
        registry.registerDefaultFactory("String", StringLiteralImpl.class);                
        registry.registerDefaultFactory("@pre",
                    ${package}.ete.${parentArtifactId}.impl.AtPreImpl.class);        
        registry.registerDefaultFactory("*",
                    ${package}.ete.${parentArtifactId}.impl.MultImpl.class);        
        registry.registerDefaultFactory("xor",
                    ${package}.ete.${parentArtifactId}.impl.XorImpl.class);        
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.FlattenImpl.class);        
        registry.registerDefaultFactory(">=",
                    ${package}.ete.${parentArtifactId}.impl.GreaterOrEqualImpl.class);        
        registry.registerDefaultFactory(".att",
                    ${package}.ete.${parentArtifactId}.impl.AttributeNavImpl.class);        
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.CollectionMethodNavImpl.class);        
        registry.registerDefaultFactory("self",
                    ${package}.ete.${parentArtifactId}.impl.SelfImpl.class);        
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.ExcludesImpl.class);        
        registry.registerDefaultFactory("+",
                    ${package}.ete.${parentArtifactId}.impl.AddImpl.class);        
        registry.registerDefaultFactory("%",
                    ${package}.ete.${parentArtifactId}.impl.ModImpl.class);        
        registry.registerDefaultFactory("<>",
                    ${package}.ete.${parentArtifactId}.impl.DifferentImpl.class);        
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.SumImpl.class);        
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.SelectImpl.class);        
        registry.registerDefaultFactory("opp",
                    ${package}.ete.${parentArtifactId}.impl.OppImpl.class);        
        registry.registerDefaultFactory("->",
                    ${package}.ete.${parentArtifactId}.impl.IncludesImpl.class);        

    }

    public static EteModel      newModel() throws InstantiationException, IllegalAccessException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(MOF_TYPE, MofTypeImpl.class);
        registry.registerDefaultFactory(MODEL, EteModelImpl.class);
        EteModel result = (EteModel) FactoryRegistry.newInstance(MODEL);
        PrimitiveDataTypes.init(result);
        return result;
    }

}


