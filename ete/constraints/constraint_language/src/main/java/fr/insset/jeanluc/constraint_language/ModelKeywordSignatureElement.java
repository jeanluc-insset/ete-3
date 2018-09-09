

package fr.insset.jeanluc.constraint_language;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * These keywords are defined by the model. Currently only entities are turned
 * to keywords.
 *
 * @author jldeleage
 */
public class ModelKeywordSignatureElement extends SignatureElement {

    public ModelKeywordSignatureElement(String value, ParseTree parseTree, int inNum) {
        super(value, parseTree);
        num = inNum;
    }

    @Override
    public String toString() {
        return "";
    }



    private     int     num;

}
