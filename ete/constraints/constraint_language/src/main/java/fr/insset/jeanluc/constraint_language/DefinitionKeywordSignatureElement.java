

package fr.insset.jeanluc.constraint_language;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * These keywords come from the constraint file.
 *
 * @author jldeleage
 */
public class DefinitionKeywordSignatureElement extends SignatureElement {

    public DefinitionKeywordSignatureElement(String value, ParseTree parseTree) {
        super(value, parseTree);
    }

}
