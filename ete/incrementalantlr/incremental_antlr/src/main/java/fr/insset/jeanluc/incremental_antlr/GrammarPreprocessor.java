package fr.insset.jeanluc.incremental_antlr;



/**
 *
 * @author jldeleage
 */
public class GrammarPreprocessor {


    public static void main(String[] args) {
        new GrammarPreprocessor().processGrammars();
    }


    public void processGrammars() {
        org.antlr.v4.Tool.main(new String[]{"-visitor","-lib", "src/main/antlr4/", "fr/insset/jeanluc/incrementalantlr/DefinitionsParser.g4"});
    }
}
