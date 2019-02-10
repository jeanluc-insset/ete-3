
package fr.insset.jeanluc.ete.introspection;

import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import java.sql.SQLException;
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
public class DataBaseReaderTest {

    public DataBaseReaderTest() {
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
    public void testIntrospection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("Test database introspection : NOT DONE YET");

//        Class.forName("org.apache.derby.jdbc.ClientDriver");
//        DatabaseReader databaseReader = new DatabaseReader();
//        databaseReader.read("jdbc:derby://localhost:1527/sample", "app", "app");
    }

}

