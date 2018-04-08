
package fr.insset.jeanluc.ete.api.impl;

import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.api.impl.util.InitStandardActions;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.MofPackageImpl;
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
public class ModelActionTest {


    public final static String      MODELS      = "src/test/mda/";
    public final static String      GEL_MODEL   = MODELS + "Gel.xml";
    public final static String      WITH_STEREO = MODELS + "project_with_stereotypes.xml";


    public ModelActionTest() {
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


    @Test
    public void readTwoModels() throws InstantiationException, EteException {
        // We need MOF items factories
        Factories.init();
        // and standard actions
        InitStandardActions.init();
        ModuleAction    parent = new ModuleAction();
        MofPackage     aPackage = new EteModelImpl();
        ModelAction    first = new ModelAction();
        first.addParameter("url", WITH_STEREO);
        parent.addChild(first);
        MofPackage firstResult = first.process(aPackage);
        ModelAction    second = new ModelAction();
        second.addParameter("url", GEL_MODEL);
        parent.addChild(second);
        MofPackage secondResult = second.process(firstResult);

        assertEquals(5,firstResult.getAllClasses().size());
        assertEquals(12,secondResult.getAllClasses().size());
        assertEquals(7, secondResult.getClasses().size());
     }

}