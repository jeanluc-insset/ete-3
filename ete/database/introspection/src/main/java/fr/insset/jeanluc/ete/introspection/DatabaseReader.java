package fr.insset.jeanluc.ete.introspection;

import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import static fr.insset.jeanluc.ete.meta.model.emof.MofClass.MOF_CLASS;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import static fr.insset.jeanluc.ete.meta.model.emof.MofProperty.MOF_PROPERTY;
import fr.insset.jeanluc.ete.meta.model.emof.Stereotype;
import static fr.insset.jeanluc.ete.meta.model.emof.Stereotype.STEREOTYPE;
import fr.insset.jeanluc.ete.meta.model.emof.impl.StereotypeImpl;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import static fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel.MODEL;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.sql.DataSource;



/**
 * Reads an EteModel from a database
 *
 * @author jldeleage
 */
public class DatabaseReader {


    /**
     * Reads all the tables of the "app" schema.<br>
     * When a table has at least one "true" primary key, it is added to the
     * model as an "entity".<br>
     * A "true" primary key is a key which is not a foreign key.
     * 
     * @param inUrl
     * @param inLogin
     * @param inPassword
     * @return
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public EteModel read(String inUrl, String inLogin, String inPassword) throws SQLException, InstantiationException, IllegalAccessException {
        Connection connection = DriverManager.getConnection(inUrl, inLogin, inPassword);
        return read(connection);
    }

    /**
     * Reads all the tables of the "app" schema.<br>
     * When a table has at least one "true" primary key, it is added to the
     * model as an "entity".<br>
     * A "true" primary key is a key which is not a foreign key.
     * 
     * @param inDataSource
     * @return
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public EteModel read(DataSource inDataSource) throws SQLException, InstantiationException, IllegalAccessException {
        Connection connection = inDataSource.getConnection();
        return read(connection);
    }

    /**
     * Reads all the tables of the "app" schema.<br>
     * When a table has at least one "true" primary key, it is added to the
     * model as an "entity".<br>
     * A "true" primary key is a key which is not a foreign key.
     * 
     * @param inConnection
     * @return
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public EteModel read(Connection inConnection) throws SQLException, InstantiationException, IllegalAccessException {
        // Prepare the meta-model
        Factories.init();
        Stereotype      entity = (Stereotype)FactoryRegistry.newInstance(STEREOTYPE);
        entity.setName("Entity");

        EteModel    result = (EteModel) FactoryRegistry.newInstance(MODEL);
        DatabaseMetaData metaData = inConnection.getMetaData();
        ResultSet tables = metaData.getTables(null, "APP", "%", null);
        ResultSetMetaData resultMetaData = tables.getMetaData();
        int columnCount = resultMetaData.getColumnCount();
        for (int i=1 ; i<=columnCount ; i++) {
            System.out.println(resultMetaData.getColumnClassName(i) + " = " + resultMetaData.getColumnName(i));
        }
        while (tables.next()) {
            MofClass aClass = readAClass(tables.getString(3), inConnection);
            if (aClass != null) {
                result.addElement(aClass);
            }
        }
        return result;
    }


    /**
     * Reads the structure of a table and creates a MofClass from that
     * structure if it contains at least one "true" primary key.<br>
     * 
     * @param inName the name of the table to read
     * @param inConnection
     * @return an instance of MofClass it the table contains at least one
     * primary key, null otherwise
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws SQLException 
     */
    public MofClass readAClass(String inName, Connection inConnection) throws InstantiationException, IllegalAccessException, SQLException {
        DatabaseMetaData metaData = inConnection.getMetaData();
        ResultSet primaryKeys = metaData.getPrimaryKeys(null, null, inName);
        if (!primaryKeys.next()) {
            return null;
        }
        MofClass    newEntity = (MofClass) FactoryRegistry.newInstance(MOF_CLASS);
        newEntity.setName(inName);
        System.out.println("Reading an entity : " + inName);
        boolean isEntity = readAttributes(newEntity, inConnection);
        return isEntity ? newEntity : null;
    }

    /**
     * Reads the structure of the table corresponding to inoutClass.
     * 
     * @param inoutClass
     * @param inConnection
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public boolean readAttributes(MofClass inoutClass, Connection inConnection) throws SQLException, InstantiationException, IllegalAccessException {
        DatabaseMetaData metaData = inConnection.getMetaData();
        // What are the foreign keys in this table ?
        ResultSet crossReferences = metaData.getImportedKeys(null, null, inoutClass.getName());
        System.out.println("    foreign keys in " + inoutClass.getName());
        ResultSetMetaData metaDataForeignKeys = crossReferences.getMetaData();
        List<String>        foreignKeys = new LinkedList<>();
        while (crossReferences.next()) {
            System.out.print("    foreign key : ");
            for (int i=1 ; i<=metaDataForeignKeys.getColumnCount() ; i++) {
                System.out.print("[" + crossReferences.getObject(i) + "]");
            }
            foreignKeys.add(crossReferences.getString(8));
            System.out.println();
        }

        // Are there primary keys in this table ?
        // Warning : some databases turn the foreign keys of a linking table to
        // primary keys
        ResultSet primaryKeys = metaData.getPrimaryKeys(null, null, inoutClass.getName());
        List<String>    keys = new LinkedList<>();
        while (primaryKeys.next()) {
            String  primaryKey = primaryKeys.getString(4);
            if (foreignKeys.contains(primaryKey)) {
                continue;
            }
            System.out.println("    primary key : " + primaryKey + " : " + primaryKeys.getObject(6));
            keys.add(primaryKey);
        }
        ResultSet columns = metaData.getColumns(null, null, inoutClass.getName(), "%");
        ResultSetMetaData metaData2 = columns.getMetaData();
        for (int i=1 ; i <= metaData2.getColumnCount() ; i++) {
            
        }
        while (columns.next()) {
            System.out.println("    colonne : " + columns.getString(4) + " of type " + columns.getString(5));
        }
        while (columns.next()) {
            System.out.println("    colonne : " + columns.getString(4) + " of type " + columns.getString(5));
            String  columnName = columns.getString(4);
            MofProperty aProperty = (MofProperty) FactoryRegistry.newInstance(MOF_PROPERTY);
            aProperty.setName(columnName);
            inoutClass.addOwnedAttribute(aProperty);
        }
        return keys.size() > 0;
    }

}
