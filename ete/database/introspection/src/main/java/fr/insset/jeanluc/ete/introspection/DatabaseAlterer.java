

package fr.insset.jeanluc.ete.introspection;

import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * Modifies an existing database to match a model.<br>
 * Useful when modifying a model ; this class makes possible to keep some
 * data by adding/deleting tables, columns without disturbing stable elements.
 *
 * @author jldeleage
 */
public class DatabaseAlterer {

    public void alterDataBase(EteModel inModel, Connection inConnection) throws SQLException {
        addEntities(inModel, inConnection);
        addAttributes(inModel, inConnection);
        addAssociations(inModel, inConnection);
    }


    public void addEntities(EteModel inModel, Connection inConnection) throws SQLException {
        getAllEntities(inModel).forEach(e -> addAnEntity(e, inModel, inConnection));
    }


    public void addAnEntity(MofClass anEntity, EteModel inModel, Connection inConnection) {
        try {
            DatabaseMetaData metaData = inConnection.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAlterer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void addAttributes(EteModel inModel, Connection inConnection) throws SQLException {
        try {
            DatabaseMetaData metaData = inConnection.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAlterer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void addAssociations(EteModel inModel, Connection inConnection) throws SQLException {
        try {
            DatabaseMetaData metaData = inConnection.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAlterer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    //========================================================================//


    public Stream<MofClass> getAllEntities(EteModel inModel) {
        return inModel.getAllClassesAsStream().filter(c -> c.hasStereotype("Entity"));
    }


}
