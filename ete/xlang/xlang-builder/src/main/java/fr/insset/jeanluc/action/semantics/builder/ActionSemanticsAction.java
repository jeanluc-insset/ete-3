package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import static fr.insset.jeanluc.ete.meta.model.emof.MofOperation.MOF_OPERATION;
import static fr.insset.jeanluc.ete.meta.model.emof.MofProperty.MOF_PROPERTY;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofOperationImpl;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofPropertyImpl;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;


/**
 *
 * @author jldeleage
 */
public class ActionSemanticsAction extends ActionSupport {


    static {
        FactoryRegistry registry = FactoryRegistry.getRegistry();
        registry.registerFactory(MOF_CLASS, EnhancedMofClassImpl.class);
        registry.registerFactory(MOF_OPERATION, EnhancedMofOperationImpl.class);
        registry.registerFactory(XmlModelReader.READER_VISITOR, ConditionVisitor.class);
    }


}
