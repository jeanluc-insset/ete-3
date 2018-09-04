package fr.insset.jeanluc.constraint_language;


import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.util.List;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;


/**
 * The actual grammar builder parses the constraint file with the model parser
 * then creates a definition visitor to visit the resulting parse tree.<br>
 * The definition visitor collects the actual keywords in the definitions and
 * the body of the definition as well. 
 * 
 * This class is intented to be dynamically extended.
 *
 * @author jldeleage
 */
public class DefinitionVisitor extends DynamicVisitorSupport {





    protected void addElement(SignatureElement inElement) {
            
    }


    private StringBuilder           name;
    private List<SignatureElement>  elements;


}
