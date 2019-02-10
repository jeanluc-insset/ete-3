
package fr.insset.jeanluc.ete.sbvr.impl;

import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.ete.gel.impl.GelParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author jldeleage
 */
public class ModelLexerBuilderTest {

    private EteModel model;
    private MofClass accountClass;
    private MofOperation deposit;
    private MofOperation withdraw;
    private MofClass customerClass;
    private MofOperation transfer;
    private MofProperty accounts;

    public ModelLexerBuilderTest() {
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
     * Test of addTokens method, of class ModelLexerBuilder.
     */
    @Test
    public void testAddTokens() throws Exception {
        System.out.println("add tokens");
        readModel();
        File    targetDir = new File("target");
        if (! targetDir.exists()) {
            targetDir.mkdir();
        }
        File file = new File("target/Antlr4mde.g4");
        PrintWriter pw = new PrintWriter(new FileWriter(file)); 
        pw.println("lexer grammar Antlr4mde.g4;");
        pw.println();
        pw.println("import SbvrLexerGrammar.g4;");
        pw.println();
        ModelLexerBuilder instance = new ModelLexerBuilder();
        instance.addTokens(model, pw);
        pw.flush();
        pw.close();
        // TODO check the lexer.
    }


    @Test
    public void testBuildLexer() throws Exception {
        System.out.println("build lexer");
        readModel();
        ModelLexerBuilder instance = new ModelLexerBuilder();
        instance.buildLexer(model, "Antlr4ete", "target/test/generated-sources/ete");
    }



    protected void  readModel() throws InstantiationException, IOException, IllegalAccessException {
        // 1- Initialize framework
        Factories.init();

        // 2- read the model
        XmlModelReader instance = new XmlModelReader();
        EteModel parent = new EteModelImpl();
        PrimitiveDataTypes.init(parent);
        String url = "src/test/mda/model.xml";
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