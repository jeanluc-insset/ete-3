package fr.insset.jeanluc.ete.maven.plugin;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


/**
 *
 * @author jldeleage
 */
@Mojo(name = "ete-clean", requiresProject = true, threadSafe = true)
public class CleanMojo extends AbstractMojo {

    @Parameter(property = "dir", defaultValue = ".")
    private String  dir;


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        Logger logger = Logger.getGlobal();
        logger.log(Level.FINE, "Cleaning ete : {0}", dir);
        String[] dirs = dir.split(",");
        for (String dir1 : dirs) {
            String aDirName = dir1.trim();
            File aDir = new File("target/" + aDirName);
            try {
                delete(aDir, "");
            } catch (IOException ex) {
                throw new MojoExecutionException(ex.getMessage());
            }
        }
    }


    private void delete(File aFile, String inIndent) throws IOException {
        Logger logger = Logger.getGlobal();
        logger.log(Level.FINER, "{0}deleting {1}", new Object[]{inIndent, aFile.getAbsolutePath()});
        if (!aFile.isDirectory()) {
            java.nio.file.Files.delete(aFile.toPath());
            return;
        }
        File[] listFiles = aFile.listFiles();
        String indent = inIndent + "  ";
        for (File listFile : listFiles) {
            delete(listFile, indent);
        }
    }


}
