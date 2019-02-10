

package fr.insset.jeanluc.actual.xlang_builder;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import static fr.insset.jeanluc.ete.meta.model.constraint.Invariant.INVARIANT;
import static fr.insset.jeanluc.ete.meta.model.constraint.Postcondition.POSTCONDITION;
import static fr.insset.jeanluc.ete.meta.model.constraint.Precondition.PRECONDITION;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.xlang.builder.impl.EnhancedOperationImpl;
import fr.insset.jeanluc.ete.xlang.builder.impl.EnhancedPostconditionImpl;
import fr.insset.jeanluc.ete.xlang.builder.impl.EnhancedPreconditionImpl;
import fr.insset.jeanluc.util.factory.FactoryRegistry;

/**
 *
 * @author jldeleage
 */
public class XLangBuilderInjectionAction extends ActionSupport {



    /**
     * Registers some classes in the local factory registry.
     * When registering the action, the class is loaded and this block is run.
     */
    static {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory(MOF_CLASS, EnhancedMofClassImpl.class);
        registry.registerFactory(MOF_OPERATION, ActualEnhancedOperationImpl.class);
        registry.registerFactory(INVARIANT, EnhancedInvariantImpl.class);
        registry.registerFactory(POSTCONDITION, EnhancedPostconditionImpl.class);
        registry.registerFactory(PRECONDITION, EnhancedPreconditionImpl.class);
//        registry.registerFactory(XmlModelReader.READER_VISITOR, ConditionVisitor.class);
    }

    @Override
    public MofPackage preProcess(MofPackage inPackage) throws EteException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        FactoryRegistry parent = registry.getParent();
        // The factories must be registered to the parent
        // but in some test cases there might not be any parent
        registry = parent == null ? registry : parent;
        registry.registerFactory(MOF_CLASS, EnhancedMofClassImpl.class);
        registry.registerFactory(MOF_OPERATION, ActualEnhancedOperationImpl.class);
        registry.registerFactory(MOF_CLASS, EnhancedMofClassImpl.class);
        registry.registerFactory(MOF_OPERATION, ActualEnhancedOperationImpl.class);
        registry.registerFactory(INVARIANT, EnhancedInvariantImpl.class);
        registry.registerFactory(POSTCONDITION, EnhancedPostconditionImpl.class);
        registry.registerFactory(PRECONDITION, EnhancedPreconditionImpl.class);
        return super.preProcess(inPackage); //To change body of generated methods, choose Tools | Templates.
    }




}
