package fr.insset.jeanluc.ete.nl.impl.factory;



import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import static fr.insset.jeanluc.ete.meta.model.types.MofType.MOF_TYPE;
import fr.insset.jeanluc.ete.meta.model.types.impl.MofTypeImpl;
import fr.insset.jeanluc.ete.nl.impl.*;
import javax.annotation.Generated;
import fr.insset.jeanluc.util.factory.FactoryRegistry;



@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/from-spec/factory.vm")
public class NlFactory {

    public static void registerFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(MOF_TYPE, MofTypeImpl.class);

        registry.registerDefaultFactory("isnew",
                    fr.insset.jeanluc.ete.nl.impl.IsNewImpl.class);        
        registry.registerDefaultFactory(">",
                    fr.insset.jeanluc.ete.nl.impl.GreaterThanImpl.class);        
        registry.registerDefaultFactory("date", DateLiteralImpl.class);                
        registry.registerDefaultFactory("self",
                    fr.insset.jeanluc.ete.nl.impl.SelfImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.CollectImpl.class);        
        registry.registerDefaultFactory("result",
                    fr.insset.jeanluc.ete.nl.impl.ResultImpl.class);        
        registry.registerDefaultFactory("not",
                    fr.insset.jeanluc.ete.nl.impl.NotImpl.class);        
        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);                
        registry.registerDefaultFactory("<>",
                    fr.insset.jeanluc.ete.nl.impl.DifferentImpl.class);        
        registry.registerDefaultFactory(".meth",
                    fr.insset.jeanluc.ete.nl.impl.MethodNavImpl.class);        
        registry.registerDefaultFactory(">=",
                    fr.insset.jeanluc.ete.nl.impl.GreaterOrEqualImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.AverageImpl.class);        
        registry.registerDefaultFactory("String", StringLiteralImpl.class);                
        registry.registerDefaultFactory("var",
                    fr.insset.jeanluc.ete.nl.impl.VariableReferenceImpl.class);        
        registry.registerDefaultFactory("@pre",
                    fr.insset.jeanluc.ete.nl.impl.AtPreImpl.class);        
        registry.registerDefaultFactory("xor",
                    fr.insset.jeanluc.ete.nl.impl.XorImpl.class);        
        registry.registerDefaultFactory("let",
                    fr.insset.jeanluc.ete.nl.impl.VariableDefinitionImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.SelectImpl.class);        
        registry.registerDefaultFactory("|",
                    fr.insset.jeanluc.ete.nl.impl.LambdaImpl.class);        
        registry.registerDefaultFactory("or",
                    fr.insset.jeanluc.ete.nl.impl.OrImpl.class);        
        registry.registerDefaultFactory("<",
                    fr.insset.jeanluc.ete.nl.impl.LessThanImpl.class);        
        registry.registerDefaultFactory("-",
                    fr.insset.jeanluc.ete.nl.impl.SubImpl.class);        
        registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);                
        registry.registerDefaultFactory("and",
                    fr.insset.jeanluc.ete.nl.impl.AndImpl.class);        
        registry.registerDefaultFactory("<=",
                    fr.insset.jeanluc.ete.nl.impl.LessOrEqualImpl.class);        
        registry.registerDefaultFactory("%",
                    fr.insset.jeanluc.ete.nl.impl.ModImpl.class);        
        registry.registerDefaultFactory("=",
                    fr.insset.jeanluc.ete.nl.impl.EqualImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.FlattenImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.ExcludesImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.CollectionMethodNavImpl.class);        
        registry.registerDefaultFactory("opp",
                    fr.insset.jeanluc.ete.nl.impl.OppImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.IncludesImpl.class);        
        registry.registerDefaultFactory(".att",
                    fr.insset.jeanluc.ete.nl.impl.AttributeNavImpl.class);        
        registry.registerDefaultFactory("/",
                    fr.insset.jeanluc.ete.nl.impl.DivImpl.class);        
        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);                
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.FlatCollectImpl.class);        
        registry.registerDefaultFactory("+",
                    fr.insset.jeanluc.ete.nl.impl.AddImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.nl.impl.SumImpl.class);        
        registry.registerDefaultFactory("*",
                    fr.insset.jeanluc.ete.nl.impl.MultImpl.class);        

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


