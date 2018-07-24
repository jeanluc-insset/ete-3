

package fr.insset.jeanluc.external_constraint_file;

import fr.insset.jeanluc.ete.gel.ParserWrapper;
import fr.insset.jeanluc.ete.meta.model.mofpackage.EteModel;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * It could be useful to specify the constraints outside of the UML model
 * itself, for example to add local constraints.<br>
 * The constraints are added to the model as if they were embedded in the model.
 *
 * @author jldeleage
 */
public class ConstraintFileReader {



    public void readConstraints(File inConstraintFile, EteModel inoutModel, ParserWrapper wrapper, String encoding) throws IOException {
        Path path = inConstraintFile.toPath();
        byte[] bytes = Files.readAllBytes(path);
        String constraintsString = encoding == null  ? new String(bytes) : new String(bytes, encoding);
        parse(constraintsString, inoutModel, wrapper);
    }


    public void parse(String constraintsString, EteModel inoutModel, ParserWrapper wrapper) {
        wrapper.buildAbstractTree(constraintsString, inoutModel, null);
    }

}
