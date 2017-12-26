package fr.insset.jeanluc.ete.api.impl;

import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import static fr.insset.jeanluc.ete.api.Action.OUTPUT_BASE;
import static fr.insset.jeanluc.ete.api.impl.GenericTemplate.ITEMS;
import static fr.insset.jeanluc.ete.api.impl.GenericTemplate.TARGET;
import static fr.insset.jeanluc.ete.api.impl.GenericTemplate.TEMPLATE;
import static fr.insset.jeanluc.ete.api.impl.ParameterAction.PARAM;
import static fr.insset.jeanluc.ete.api.impl.ParameterAction.PARAMETER;
import fr.insset.jeanluc.ete.api.impl.util.InitStandardActions;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage.MOF_PACKAGE;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author jldeleage
 */
public class ParameterActionTest {
    
    public ParameterActionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of postProcess method, of class ParameterAction.
     * @throws java.lang.Exception
     */
    @Test
    public void testParameterAction() throws Exception {
        System.out.println("parameter action");
        Factories.init();
        // Registers default actions
        InitStandardActions.init();

        EteModel model = (EteModel) FactoryRegistry.newInstance(MODEL);
        MofClass aClass = (MofClass) FactoryRegistry.newInstance(MOF_CLASS);
        MofPackage aPackage = (MofPackage) FactoryRegistry.newInstance(MOF_PACKAGE);
        aPackage.setName("mypackage");
        aPackage.addPackagedElement(aClass);
        aClass.setOwningPackage(aPackage);
        aClass.setName("MyClass");
        model.addElement(aClass);

        ModuleCallAction instance = new ModuleCallAction();
        ParameterAction parameter = (ParameterAction) FactoryRegistry.newInstance(PARAM);
        instance.addChild(parameter);
        parameter.addParameter("name", BASE_DIR);
        parameter.addParameter("value", "src/test/mda/");
        parameter = (ParameterAction) FactoryRegistry.newInstance(PARAM);
        instance.addChild(parameter);
        parameter.addParameter("name", MODEL);
        parameter.addParameter("value", model);
        parameter = (ParameterAction) FactoryRegistry.newInstance(PARAM);
        instance.addChild(parameter);
        parameter.addParameter("name", OUTPUT_BASE);
        parameter.addParameter("value", "target/test-generated/ete/");

        VelocityAction velocityAction = new VelocityAction();
        velocityAction.addParameter(ITEMS, "${classes}");
        velocityAction.addParameter(TEMPLATE, "templates/umlclass2interface.vm");
        velocityAction.addParameter(TARGET, "${current.owningPackage.name.replace('.', '/')}/${packagename}/${current.name}.java");
        velocityAction.addParameter("project_name", "[inline TestProject]");
        velocityAction.addParameter("packagename", "modulecall");
        
        instance.addChild(velocityAction);
        instance.process((MofPackage) model);
    }
    
}
