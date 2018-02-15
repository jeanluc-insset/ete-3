package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.gel.GelParserBaseVisitor;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import static fr.insset.jeanluc.ete.meta.model.emof.MofProperty.MOF_PROPERTY;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofOperationImpl;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofPropertyImpl;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;


/**
 * An Ete Action to register factories for the following classes :<ul>
 * <li>EnhancedMofClassImpl for MofClass entry</li>
 * <li>EnhancedMofOperationImpl for MofOperation entry</li>
 * </ul>
 *
 * @author jldeleage
 */
public class ActionSemanticsAction extends ActionSupport {


    /**
     * Registers some classes in the local factory registry.
     * When registering the action, the class is loaded and this block is run.
     */
    static {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory(MOF_CLASS, EnhancedMofClassImpl.class);
        registry.registerFactory(MOF_OPERATION, EnhancedMofOperationImpl.class);
//        registry.registerFactory(XmlModelReader.READER_VISITOR, ConditionVisitor.class);
    }

    @Override
    public MofPackage preProcess(MofPackage inPackage) throws EteException {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory(MOF_CLASS, EnhancedMofClassImpl.class);
        registry.registerFactory(MOF_OPERATION, EnhancedMofOperationImpl.class);
        return super.preProcess(inPackage); //To change body of generated methods, choose Tools | Templates.
    }


}
