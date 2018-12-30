package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import static fr.insset.jeanluc.ete.meta.model.constraint.Invariant.INVARIANT;
import static fr.insset.jeanluc.ete.meta.model.constraint.Postcondition.POSTCONDITION;
import static fr.insset.jeanluc.ete.meta.model.constraint.Precondition.PRECONDITION;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.util.factory.FactoryRegistry;


/**
 * An Ete Action to register factories for the following classes :<ul>
 * <li>EnhancedMofClassImpl for MofClass entry</li>
 * <li>EnhancedMofOperationImpl for MofOperation entry</li>
 * <li>EnhancedInvariantImpl for Invariant entry</li>
 * <li>EnhancedPrecondition for Precondition entry</li>
 * <li>EnhancedPostcondition for Postcondition entry</li>
 * </ul>
 *
 * @author jldeleage
 */
public class XLangAction extends ActionSupport {


    /**
     * Registers some classes in the local factory registry.
     * When registering the action, the class is loaded and this block is run.
     */
    static {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory(MOF_CLASS, EnhancedMofClassImpl.class);
        registry.registerFactory(MOF_OPERATION, EnhancedMofOperationImpl.class);
        registry.registerFactory(INVARIANT, EnhancedInvariantImpl.class);
        registry.registerFactory(POSTCONDITION, EnhancedPostconditionImpl.class);
        registry.registerFactory(PRECONDITION, EnhancedPreconditionImpl.class);
    }

    @Override
    public MofPackage preProcess(MofPackage inPackage) throws EteException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory(MOF_CLASS, EnhancedMofClassImpl.class);
        registry.registerFactory(MOF_OPERATION, EnhancedMofOperationImpl.class);
        return super.preProcess(inPackage); //To change body of generated methods, choose Tools | Templates.
    }


}
