package fr.insset.jeanluc.constraint_language;

import org.antlr.v4.runtime.tree.ParseTree;



/**
 *
 * @author jldeleage
 */
public class SignatureElement {

    public SignatureElement(String value, ParseTree parseTree) {
        this.value = value;
        this.parseTree = parseTree;
    }

    public String getValue() {
        return value;
    }

    public ParseTree getParseTree() {
        return parseTree;
    }


    private     String      value;
    private     ParseTree   parseTree;

}
