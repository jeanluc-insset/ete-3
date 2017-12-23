package fr.insset.jeanluc.ete.api.impl;

import static fr.insset.jeanluc.ete.api.Action.BASE_DIR;
import static fr.insset.jeanluc.ete.api.Action.OUTPUT_BASE;
import fr.insset.jeanluc.ete.api.EteException;
import static fr.insset.jeanluc.ete.api.impl.GenericTemplate.ITEMS;
import fr.insset.jeanluc.ete.api.impl.util.InitStandardActions;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage.MOF_PACKAGE;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.io.File;
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
public class IfTest {

    private ModuleAction    module;
    private IfAction        ifAction;
    private String          fileName = "target/test.txt";
    private File            file;
    private EteModel        model;

    
    public IfTest() {
    }


    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    @Before
    public void setUp() throws InstantiationException, IllegalAccessException {
        Factories.init();
        // Registers default actions
        InitStandardActions.init();
        module = new ModuleAction();
        ifAction = new IfAction();
        ifAction.addParameter(BASE_DIR, "src/test/mda/");
        ifAction.addParameter(OUTPUT_BASE, "target/test-generated/");
        ifAction.addParameter("test", "${javase==true}");
        DumpAction  dump = new DumpAction();
        dump.addParameter("file", fileName);
        ifAction.addChild(dump);
        module.addChild(ifAction);
        file  = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        model = (EteModel) FactoryRegistry.newInstance(MODEL);
        MofClass aClass = (MofClass) FactoryRegistry.newInstance(MOF_CLASS);
        MofPackage aPackage = (MofPackage) FactoryRegistry.newInstance(MOF_PACKAGE);
        aPackage.setName("mypackage");
        aPackage.addPackagedElement(aClass);
        aClass.setOwningPackage(aPackage);
        aClass.setName("MyClass");
        model.addElement(aClass);
    }


    @After
    public void tearDown() {
    }


    @Test
    public void ifTrueTest() throws EteException {
        module.addParameter("javase", "true");
        module.process(model);
        File result  = new File(fileName);
        assertTrue(result.exists());
    }

    @Test
    public void ifFalseTest() throws EteException {
        module.process(model);
        File result  = new File(fileName);
        assertFalse(result.exists());
    }


}
