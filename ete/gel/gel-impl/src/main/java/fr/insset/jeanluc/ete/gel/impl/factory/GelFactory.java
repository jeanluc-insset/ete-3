package fr.insset.jeanluc.ete.gel.impl.factory;



import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import static fr.insset.jeanluc.ete.meta.model.types.MofType.MOF_TYPE;
import fr.insset.jeanluc.ete.meta.model.types.impl.MofTypeImpl;
import fr.insset.jeanluc.ete.gel.impl.*;
import javax.annotation.Generated;
import fr.insset.jeanluc.util.factory.FactoryRegistry;



@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/from-spec/factory.vm")
public class GelFactory {

    public static void registerFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(MOF_TYPE, MofTypeImpl.class);

        registry.registerDefaultFactory("date", DateLiteralImpl.class);                
        registry.registerDefaultFactory("Double", FloatingPointLiteralImpl.class);                
        registry.registerDefaultFactory("xor",
                    fr.insset.jeanluc.ete.gel.impl.XorImpl.class);        
        registry.registerDefaultFactory("@",
                    fr.insset.jeanluc.ete.gel.impl.AtPreImpl.class);        
        registry.registerDefaultFactory("String", StringLiteralImpl.class);                
        registry.registerDefaultFactory("<>",
                    fr.insset.jeanluc.ete.gel.impl.DifferentImpl.class);        
        registry.registerDefaultFactory("+",
                    fr.insset.jeanluc.ete.gel.impl.AddImpl.class);        
        registry.registerDefaultFactory("or",
                    fr.insset.jeanluc.ete.gel.impl.OrImpl.class);        
        registry.registerDefaultFactory(">=",
                    fr.insset.jeanluc.ete.gel.impl.GreaterOrEqualImpl.class);        
        registry.registerDefaultFactory("|",
                    fr.insset.jeanluc.ete.gel.impl.LambdaImpl.class);        
        registry.registerDefaultFactory("opp",
                    fr.insset.jeanluc.ete.gel.impl.OppImpl.class);        
        registry.registerDefaultFactory(">",
                    fr.insset.jeanluc.ete.gel.impl.GreaterThanImpl.class);        
        registry.registerDefaultFactory("and",
                    fr.insset.jeanluc.ete.gel.impl.AndImpl.class);        
        registry.registerDefaultFactory("=",
                    fr.insset.jeanluc.ete.gel.impl.EqualImpl.class);        
        registry.registerDefaultFactory("<",
                    fr.insset.jeanluc.ete.gel.impl.LessThanImpl.class);        
        registry.registerDefaultFactory("not",
                    fr.insset.jeanluc.ete.gel.impl.NotImpl.class);        
        registry.registerDefaultFactory("/",
                    fr.insset.jeanluc.ete.gel.impl.DivImpl.class);        
        registry.registerDefaultFactory("Integer", IntegerLiteralImpl.class);                
        registry.registerDefaultFactory("<=",
                    fr.insset.jeanluc.ete.gel.impl.LessOrEqualImpl.class);        
        registry.registerDefaultFactory("Boolean", BooleanLiteralImpl.class);                
        registry.registerDefaultFactory("*",
                    fr.insset.jeanluc.ete.gel.impl.MultImpl.class);        
        registry.registerDefaultFactory("-",
                    fr.insset.jeanluc.ete.gel.impl.MinusImpl.class);        

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


