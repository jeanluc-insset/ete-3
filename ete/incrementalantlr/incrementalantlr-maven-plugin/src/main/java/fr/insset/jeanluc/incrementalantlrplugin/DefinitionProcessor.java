package fr.insset.jeanluc.incrementalantlrplugin;



import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;



/**
 * Parses the "Definitions.g" grammar then modifies the RulesLexer and
 * RulesParser.g4 grammar, finally parses that grammar and creates corresponding
 * abstract tree.
 *
 * @author jldeleage
 */
@Mojo(name = "definition-processor", requiresProject = true, threadSafe = true)
public class DefinitionProcessor extends AbstractMojo {


    @Parameter(property = "definitions-file", defaultValue = "src/main/antlr4/Definitions.g")
    private String definitionsFilePath;

    @Parameter(property = "rules-file", defaultValue = "target/tmp/incant/Rules.g4")
    private String rulesFilePath;

    @Parameter(property = "output-dir", defaultValue = "target/tmp/incantlr")
    private String outputDir;


    public void execute() {
        System.out.println("Hello from the DefinitionProcessor");
        org.antlr.v4.Tool.main(new String[] {
            "-o",
            outputDir,
            definitionsFilePath
        });
    }

    public void setDefinitionsFilePath(String definitionsFilePath) {
        this.definitionsFilePath = definitionsFilePath;
    }

    public void setRulesFilePath(String rulesFilePath) {
        this.rulesFilePath = rulesFilePath;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }



}
