package fr.insset.jeanluc.ete.xlang_builder.impl.factory;



import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import static fr.insset.jeanluc.ete.meta.model.types.MofType.MOF_TYPE;
import fr.insset.jeanluc.ete.meta.model.types.impl.MofTypeImpl;
import fr.insset.jeanluc.ete.xlang_builder.impl.*;
import javax.annotation.Generated;
import fr.insset.jeanluc.util.factory.FactoryRegistry;



@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/from-spec/factory.vm")
public class Xlang_builderFactory {

    public static void registerFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(MOF_TYPE, MofTypeImpl.class);


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


