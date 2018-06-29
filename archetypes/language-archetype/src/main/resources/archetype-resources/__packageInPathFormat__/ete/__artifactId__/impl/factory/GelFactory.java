#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ete.${artifactId}.impl.factory;



import ${package}.ete.meta.model.core.PrimitiveDataTypes;
import ${package}.ete.meta.model.mofpackage.EteModel;
import static ${package}.ete.meta.model.mofpackage.EteModel.MODEL;
import ${package}.ete.meta.model.mofpackage.impl.EteModelImpl;
import static ${package}.ete.meta.model.types.MofType.MOF_TYPE;
import ${package}.ete.meta.model.types.impl.MofTypeImpl;
import ${package}.${artifactId}.impl.*;
import javax.annotation.Generated;
import ${package}.util.factory.FactoryRegistry;



@Generated("ete - jean-luc@insset.fr  modules/maven-project/${artifactId}-impl/java/${artifactId}-factory.vm")
public class GelFactory {

    public static void registerFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(MOF_TYPE, MofTypeImpl.class);
/*
                            registry.registerDefaultFactory("not", ${package}.${artifactId}.impl.NotImpl.class);        
                                    registry.registerDefaultFactory("*", ${package}.${artifactId}.impl.MultImpl.class);        
                                registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);                
                                registry.registerDefaultFactory("or", ${package}.${artifactId}.impl.OrImpl.class);        
                    registry.registerDefaultFactory("+", ${package}.${artifactId}.impl.AddImpl.class);        
                    registry.registerDefaultFactory("<>", ${package}.${artifactId}.impl.DifferentImpl.class);        
                            registry.registerDefaultFactory("xor", ${package}.${artifactId}.impl.XorImpl.class);        
                                                registry.registerDefaultFactory("date", DateLiteralImpl.class);                
                registry.registerDefaultFactory("/", ${package}.${artifactId}.impl.DivImpl.class);        
                        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);                
                registry.registerDefaultFactory("<", ${package}.${artifactId}.impl.LessThanImpl.class);        
                                                    registry.registerDefaultFactory(">", ${package}.${artifactId}.impl.GreaterThanImpl.class);        
                    registry.registerDefaultFactory("and", ${package}.${artifactId}.impl.AndImpl.class);        
                    registry.registerDefaultFactory("-", ${package}.${artifactId}.impl.MinusImpl.class);        
                            registry.registerDefaultFactory("<=", ${package}.${artifactId}.impl.LessOrEqualImpl.class);        
                        registry.registerDefaultFactory("String", StringLiteralImpl.class);                
                registry.registerDefaultFactory("=", ${package}.${artifactId}.impl.EqualImpl.class);        
                    registry.registerDefaultFactory(">=", ${package}.${artifactId}.impl.GreaterOrEqualImpl.class);        
                            registry.registerDefaultFactory("opp", ${package}.${artifactId}.impl.OppImpl.class);        
                            registry.registerDefaultFactory("|", ${package}.${artifactId}.impl.LambdaImpl.class);        
                        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);                
                registry.registerDefaultFactory("@", ${package}.${artifactId}.impl.AtPreImpl.class);        
        */
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


