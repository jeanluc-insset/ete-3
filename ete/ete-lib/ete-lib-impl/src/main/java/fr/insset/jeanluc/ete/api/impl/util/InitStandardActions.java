package fr.insset.jeanluc.ete.api.impl.util;




import static fr.insset.jeanluc.ete.api.ActionSupport.ACTION_READER;
import fr.insset.jeanluc.ete.api.impl.DialectAction;
import fr.insset.jeanluc.ete.api.impl.DumpAction;
import static fr.insset.jeanluc.ete.api.impl.DumpAction.DUMP_ACTION;
import fr.insset.jeanluc.ete.api.impl.ForEachAction;
import static fr.insset.jeanluc.ete.api.impl.ForEachAction.FOREACH_ACTION;
import static fr.insset.jeanluc.ete.api.impl.ForEachAction.FOR_EACH_ACTION;
import fr.insset.jeanluc.ete.api.impl.IfAction;
import static fr.insset.jeanluc.ete.api.impl.IfAction.IF_ACTION;
import fr.insset.jeanluc.ete.api.impl.ModelAction;
import static fr.insset.jeanluc.ete.api.impl.ModelAction.MODEL_ACTION;
import static fr.insset.jeanluc.ete.api.impl.ModelAction.MODEL_READER;
import fr.insset.jeanluc.ete.api.impl.ModuleAction;
import static fr.insset.jeanluc.ete.api.impl.ModuleAction.MODULE_DEFINITION_ACTION;
import static fr.insset.jeanluc.ete.api.impl.ModuleAction.TRANSFORMATION_SET_ACTION;
import fr.insset.jeanluc.ete.api.impl.ModuleCallAction;
import static fr.insset.jeanluc.ete.api.impl.ModuleCallAction.MODULE_CALL_ACTION;
import fr.insset.jeanluc.ete.api.impl.ParameterAction;
import static fr.insset.jeanluc.ete.api.impl.ParameterAction.PARAM;
import static fr.insset.jeanluc.ete.api.impl.ParameterAction.PARAMETER;
import fr.insset.jeanluc.ete.api.impl.RegisterAction;
import static fr.insset.jeanluc.ete.api.impl.RegisterAction.REGISTER_ACTION;
import static fr.insset.jeanluc.ete.api.impl.RegisterAction.register;
import fr.insset.jeanluc.ete.api.impl.VelocityAction;
import static fr.insset.jeanluc.ete.api.impl.VelocityAction.VELOCITY_ACTION;
import fr.insset.jeanluc.ete.api.impl.io.XmlActionReader;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import static fr.insset.jeanluc.ete.api.impl.DialectAction.DIALECT_ACTION;




/**
 *
 * @author jldeleage
 */
public class InitStandardActions {



    /**
     * Registers standard actions
     */
    public static void init() {
        FactoryRegistry.register(DUMP_ACTION, DumpAction.class);
        FactoryRegistry.register(FOR_EACH_ACTION, ForEachAction.class);
        FactoryRegistry.register(FOREACH_ACTION, ForEachAction.class);
        FactoryRegistry.register(IF_ACTION, IfAction.class);
        FactoryRegistry.register(MODEL_ACTION, ModelAction.class);
        FactoryRegistry.register(MODULE_CALL_ACTION, ModuleCallAction.class);
        FactoryRegistry.register(MODULE_DEFINITION_ACTION, ModuleAction.class);
        FactoryRegistry.register(REGISTER_ACTION, RegisterAction.class);
        FactoryRegistry.register(TRANSFORMATION_SET_ACTION, ModuleAction.class);
        FactoryRegistry.register(VELOCITY_ACTION, VelocityAction.class);
        FactoryRegistry.register(ACTION_READER, XmlActionReader.class);
        FactoryRegistry.register(MODEL_READER, XmlModelReader.class);
        FactoryRegistry.register(PARAM, ParameterAction.class);
        FactoryRegistry.register(PARAMETER, ParameterAction.class);
        FactoryRegistry.register(DIALECT_ACTION, DialectAction.class);
        register("text-writer", "fr.insset.jeanluc.plain.text.io.TextModelWriter");
    }


}


