package fr.insset.jeanluc.ete.xlang.impl.factory;



import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import static fr.insset.jeanluc.ete.meta.model.types.MofType.MOF_TYPE;
import fr.insset.jeanluc.ete.meta.model.types.impl.MofTypeImpl;
import fr.insset.jeanluc.ete.xlang.impl.*;
import javax.annotation.Generated;
import fr.insset.jeanluc.util.factory.FactoryRegistry;



@Generated("ete - jean-luc@insset.fr  ete/src/main/mda/modules/from-spec/factory.vm")
public class XlangFactory {

    public static void registerFactories() {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerDefaultFactory(MOF_TYPE, MofTypeImpl.class);

        registry.registerDefaultFactory("assignment_statement",
                    fr.insset.jeanluc.ete.xlang.impl.AssignmentImpl.class);        
        registry.registerDefaultFactory("while_statement",
                    fr.insset.jeanluc.ete.xlang.impl.WhileDoLoopImpl.class);        
        registry.registerDefaultFactory("variable_declaration_statement",
                    fr.insset.jeanluc.ete.xlang.impl.VariableDeclarationImpl.class);        
        registry.registerDefaultFactory("allocation",
                    fr.insset.jeanluc.ete.xlang.impl.AllocationImpl.class);        
        registry.registerDefaultFactory("for_statement",
                    fr.insset.jeanluc.ete.xlang.impl.ForLoopImpl.class);        
        registry.registerDefaultFactory("do_while_statement",
                    fr.insset.jeanluc.ete.xlang.impl.DoWhileLoopImpl.class);        
        registry.registerDefaultFactory("if_statement",
                    fr.insset.jeanluc.ete.xlang.impl.ConditionalImpl.class);        
        registry.registerDefaultFactory("method_invocation_statement",
                    fr.insset.jeanluc.ete.xlang.impl.MethodInvocationImpl.class);        

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


