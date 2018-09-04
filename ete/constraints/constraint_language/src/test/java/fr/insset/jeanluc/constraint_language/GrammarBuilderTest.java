
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
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
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
public class GrammarBuilderTest {

    private     String      url = "src/test/mda/model.xml";
    private     MofPackage  model;


    public GrammarBuilderTest() {
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
     * Test of generateGrammars method, of class LexerBuilder.
     */
    @Test
    public void testGenerateModelGrammars() throws Exception {
        System.out.println("generate model grammars");

        // 1- prepare all the stuff
        clean("target/tmp");
        readModel();
        String inName = "french";
        String directoryName = "target/tmp";
        File   tmpDirectory = new File(directoryName);
        if (! tmpDirectory.exists()) {
            tmpDirectory.mkdirs();
        }
        File    srcImportDirectory = new File("src/test/antlr4/imports/");
        File    importDirectory = new File(directoryName, "antlr4/imports/");
        if (! importDirectory.exists()) {
            importDirectory.mkdirs();
        }

        File[] listFiles = srcImportDirectory.listFiles();
        for (File aFile : listFiles) {
            Files.copy(aFile.toPath(), new File(importDirectory, aFile.getName()).toPath(), REPLACE_EXISTING);
        }

        // 2- run the generateGrammars method
        LanguageBuilder instance = new LanguageBuilder();
        instance.generateGrammars(inName, model, directoryName,
                "src/test/mda/constraints.txt", "target/tmp/antlr4/imports");

        // 3- Check the result
        // Currently, we do not check the content of the files (this will be
        // done in the ParserBuilderTest). We just check the files exist and
        // have a correct length.
        checkFile("target/tmp/antlr4/imports/ModelLexer.g4", 290);
        checkFile("target/tmp/antlr4/imports/ModelParser.g4", 439);
        checkFile("target/tmp/antlr4/actual/ActualLexer.g4",0);
        checkFile("target/tmp/antlr4/actual/ActualParser.g4",0);
    }


        /**
     * Test of generateGrammars method, of class LexerBuilder.
     */
//    @Test
    public void testGenerateActualGrammars() throws Exception {
        System.out.println("generate actual grammars");
        readModel();
        String inName = "french";
        String directory = "target/tmp";
        String fileName = "target/tmp/antlr4/FrenchModelParser.g4";
        LanguageBuilder instance = new LanguageBuilder();
        instance.generateGrammars(inName, model, directory,
                "src/test/mda/constraints.txt", "target/tmp/antlr4/imports");

        // Currently, we cannot check the content of the file (this will be
        // done in the ParserBuilderTest). We just check the file exists and
        // has a correct length.
        checkFile(fileName, 187);
    }


    protected void checkFile(String fileName, int inExpectedLength) {
        File file = new File(fileName);
        assertTrue(file.exists());
        if (inExpectedLength > 0) {
            assertEquals(inExpectedLength, file.length());
        }
        else {
            System.out.println("Length of fileName : " + file.length());
        }
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
    
    protected void clean(String inFileName) throws IOException {
        File file = new File(inFileName);
        if (!file.exists()) return;
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String aFile : list) {
                clean(inFileName+ "/" + aFile);
            }
        }
        Files.delete(file.toPath());
    }

}