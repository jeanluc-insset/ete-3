package fr.insset.jeanluc.ete.sbvr.impl.factory;



import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import static fr.insset.jeanluc.ete.meta.model.types.MofType.MOF_TYPE;
import fr.insset.jeanluc.ete.meta.model.types.impl.MofTypeImpl;
import fr.insset.jeanluc.ete.sbvr.impl.*;
import javax.annotation.Generated;
import fr.insset.jeanluc.util.factory.FactoryRegistry;



@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/from-spec/factory.vm")
public class SbvrFactory {

    public static void registerFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(MOF_TYPE, MofTypeImpl.class);

        registry.registerDefaultFactory("*",
                    fr.insset.jeanluc.ete.sbvr.impl.MultImpl.class);        
        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);                
        registry.registerDefaultFactory(".att",
                    fr.insset.jeanluc.ete.sbvr.impl.AttributeNavImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.ExcludesImpl.class);        
        registry.registerDefaultFactory("<",
                    fr.insset.jeanluc.ete.sbvr.impl.LessThanImpl.class);        
        registry.registerDefaultFactory("let",
                    fr.insset.jeanluc.ete.sbvr.impl.VariableDefinitionImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.SelectImpl.class);        
        registry.registerDefaultFactory("var",
                    fr.insset.jeanluc.ete.sbvr.impl.VariableReferenceImpl.class);        
        registry.registerDefaultFactory("=",
                    fr.insset.jeanluc.ete.sbvr.impl.EqualImpl.class);        
        registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);                
        registry.registerDefaultFactory("-",
                    fr.insset.jeanluc.ete.sbvr.impl.SubImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.CollectImpl.class);        
        registry.registerDefaultFactory("not",
                    fr.insset.jeanluc.ete.sbvr.impl.NotImpl.class);        
        registry.registerDefaultFactory(">",
                    fr.insset.jeanluc.ete.sbvr.impl.GreaterThanImpl.class);        
        registry.registerDefaultFactory("isnew",
                    fr.insset.jeanluc.ete.sbvr.impl.IsNewImpl.class);        
        registry.registerDefaultFactory("<>",
                    fr.insset.jeanluc.ete.sbvr.impl.DifferentImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.CollectionMethodNavImpl.class);        
        registry.registerDefaultFactory("opp",
                    fr.insset.jeanluc.ete.sbvr.impl.OppImpl.class);        
        registry.registerDefaultFactory("<=",
                    fr.insset.jeanluc.ete.sbvr.impl.LessOrEqualImpl.class);        
        registry.registerDefaultFactory(">=",
                    fr.insset.jeanluc.ete.sbvr.impl.GreaterOrEqualImpl.class);        
        registry.registerDefaultFactory("String", StringLiteralImpl.class);                
        registry.registerDefaultFactory("xor",
                    fr.insset.jeanluc.ete.sbvr.impl.XorImpl.class);        
        registry.registerDefaultFactory("/",
                    fr.insset.jeanluc.ete.sbvr.impl.DivImpl.class);        
        registry.registerDefaultFactory("and",
                    fr.insset.jeanluc.ete.sbvr.impl.AndImpl.class);        
        registry.registerDefaultFactory("+",
                    fr.insset.jeanluc.ete.sbvr.impl.AddImpl.class);        
        registry.registerDefaultFactory("%",
                    fr.insset.jeanluc.ete.sbvr.impl.ModImpl.class);        
        registry.registerDefaultFactory("result",
                    fr.insset.jeanluc.ete.sbvr.impl.ResultImpl.class);        
        registry.registerDefaultFactory("self",
                    fr.insset.jeanluc.ete.sbvr.impl.SelfImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.AverageImpl.class);        
        registry.registerDefaultFactory("date", DateLiteralImpl.class);                
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.SumImpl.class);        
        registry.registerDefaultFactory("@pre",
                    fr.insset.jeanluc.ete.sbvr.impl.AtPreImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.IncludesImpl.class);        
        registry.registerDefaultFactory("|",
                    fr.insset.jeanluc.ete.sbvr.impl.LambdaImpl.class);        
        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);                
        registry.registerDefaultFactory("or",
                    fr.insset.jeanluc.ete.sbvr.impl.OrImpl.class);        
        registry.registerDefaultFactory(".meth",
                    fr.insset.jeanluc.ete.sbvr.impl.MethodNavImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.FlattenImpl.class);        
        registry.registerDefaultFactory("->",
                    fr.insset.jeanluc.ete.sbvr.impl.FlatCollectImpl.class);        

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


