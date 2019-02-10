

package fr.insset.jeanluc.constraint_language;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * These keywords come from the basic or the language grammar.
 *
 * @author jldeleage
 */
public class KeywordSignatureElement extends SignatureElement {

    public KeywordSignatureElement(String value, ParseTree parseTree) {
        super(value, parseTree);
    }

}
