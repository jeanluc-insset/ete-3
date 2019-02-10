
package ${package};

import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.nl.impl.${artifactIdI2uc}ParserWrapper;
import fr.insset.jeanluc.external_constraint_file.ConstraintFileReader;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jldeleage
 */
public class TestExternalConstraintFile {


    public final String  constraintFileUrl = "src/test/mda/myconstraints.txt";
    public final String  url = "src/test/mda/Compagnie_aerienne.xml";

    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    public EteModel     model;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    private MofClass     accountClass;
    private MofClass     customerClass;
    /**
     * Some tests but not all use a model. This variable is initialized by
     * the readModel method.
     */
    private MofOperation withdraw;
    private MofOperation deposit;
    private MofOperation transfer;

    private MofProperty  accounts;


    public TestExternalConstraintFile() {
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
     * Reads a model, then adds constraints from an external file, finally
     * generates some code.
     */
    @Test
    public void testAnExternalFile() throws InstantiationException, IOException, IllegalAccessException {
        readModel();
        ConstraintFileReader reader = new ConstraintFileReader();
        ${artifactIdI2uc}ParserWrapper wrapper = new  ${artifactIdI2uc}ParserWrapper();
        File        file = new File(constraintFileUrl);

        reader.readConstraints(file, model, wrapper, "UTF-8");
    }


    /**
     * Reads the standard test model
     */
    protected void  readModel() throws InstantiationException, IOException, IllegalAccessException {
        // 1- Initialize framework
        Factories.init();

        // 2- read the model
        XmlModelReader instance = new XmlModelReader();
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        model = instance.readModel(url, parent);

        // 3- set the data
        accountClass = (MofClass) model.getElementByName("Compte");
        deposit = accountClass.getOwnedOperation("déposer");
        withdraw = accountClass.getOwnedOperation("retirer");
        customerClass = (MofClass)model.getElementByName("Client");
        transfer = accountClass.getOwnedOperation("transférer");
        accounts = customerClass.getOwnedAttribute("comptes");

    }


}