package fr.insset.jeanluc.ete.maven.plugin;


import java.io.File;
import java.lang.reflect.Field;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author jldeleage
 */
public class EteMojoTest extends TestCase {
    
    public EteMojoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of execute method, of class EteMojo.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        EteMojo instance = new EteMojo();
        instance.setConfigFilePath("../../src/test/mda/ete-config.xml");
        instance.setOutputBase("../../target");
        instance.setBasedir(new File(".").getAbsolutePath());
        instance.execute();
    }
    
}
