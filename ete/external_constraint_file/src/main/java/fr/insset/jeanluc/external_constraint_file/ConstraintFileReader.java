

package fr.insset.jeanluc.external_constraint_file;

import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * It could be useful to specify the constraints outside of the UML model
 * itself, for example to add local constraints.<br>
 * The constraints are added to the model as if they were embedded in the model.
 *
 * @author jldeleage
 */
public class ConstraintFileReader {



    public void readConstraints(InputStream inConstraintsStream, EteModel inoutModel, ParserWrapper wrapper) {
        readConstraints(new InputStreamReader(inConstraintsStream), inoutModel, wrapper);
    }

    public void readConstraints(Reader inConstraintsReader, EteModel inoutModel, ParserWrapper wrapper) {
        
    }

    public void readConstraints(String inConstraints, EteModel inoutModel, ParserWrapper wrapper) {
        
    }

}
