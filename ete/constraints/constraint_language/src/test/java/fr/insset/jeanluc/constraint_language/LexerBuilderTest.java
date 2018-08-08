
package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.ete.meta.model.core.PrimitiveDataTypes;
import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.impl.EteModelImpl;
import fr.insset.jeanluc.xmi.io.impl.XmlModelReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
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
public class LexerBuilderTest {

    private     String      url = "src/test/mda/model.xml";
    private     MofPackage  model;


    public LexerBuilderTest() {
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
     * Test of generateLexerGrammar method, of class LexerBuilder.
     */
    @Test
    public void testGenerateLexerGrammar() throws Exception {
        System.out.println("generateLexerGrammar");
        readModel();
        String inName = "french";
        String fileName = "target/tmp/FrenchModelLexer.g4";
        LexerBuilder instance = new LexerBuilder();
        instance.generateLexerGrammar(inName, model, fileName);

        // Currently, we cannot check the content of the file (this will be
        // done in the ParserBuilderTest). We just check the file exists and
        // has a correct length.
        File file = new File(fileName);
        assertTrue(file.exists());
        assertEquals(256, file.length());
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
        
    }
    
}