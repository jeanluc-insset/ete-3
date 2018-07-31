
package fr.insset.jeanluc.incrementalantlrplugin;

//import org.junit.After;

import java.io.File;
import org.apache.maven.plugin.testing.AbstractMojoTestCase;

//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author jldeleage
 */
public class DefinitionProcessorTest extends AbstractMojoTestCase {

    public DefinitionProcessorTest() {
    }

//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of execute method, of class DefinitionProcessor.
//     */
//    @Test
    public void testExecute() throws Exception {
//        System.out.println("execute");
//        try {
//            DefinitionProcessor definitionProcessor = new DefinitionProcessor();
//            definitionProcessor.setDefinitionsFilePath("src/test/antlr4/Definitions.g");
//            definitionProcessor.setOutputDir("target/tmp/incantlr/");
//            definitionProcessor.execute();
//        }
//        catch (Throwable ex) {
//            System.out.println("Exception : " + ex);
//        }

        File pom = getTestFile( "src/test/resources/unit/project-to-test/pom.xml" );
        assertNotNull( pom );
        assertTrue( pom.exists() );

        DefinitionProcessor myMojo = (DefinitionProcessor) lookupMojo( "incrementalantlr", pom );
        assertNotNull( myMojo );
        myMojo.execute();
    }



}