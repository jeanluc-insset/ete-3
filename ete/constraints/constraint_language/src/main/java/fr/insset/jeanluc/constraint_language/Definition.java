

package fr.insset.jeanluc.constraint_language;

import java.util.LinkedList;
import java.util.List;
import static model.ModelParser.DefinitionBodyContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * This class reflects a definition in a constraint file.<br>
 * The definition can be in any customized language.<br>
 * It keeps the signature as a list of "signature elements" and the body
 * as the original parse tree.<br>
 * A signature element is a String with a particular type.<br>
 *
 * @author jldeleage
 */
public class Definition {

    public Definition(DefinitionBodyContext body) {
        this.body = body;
    }


    public void addElement(SignatureElement inElement) {
        signature.add(inElement);
    }


    public List<SignatureElement> getSignature() {
        return signature;
    }


    public  void addToBody(String inString) {
        bodyAsString.append(inString);
    }

    public String getBody() {
        return bodyAsString.toString();
    }

    public void setBody(DefinitionBodyContext body) {
        this.body = body;
    }



    private  List<SignatureElement>     signature = new LinkedList<>();
    private  DefinitionBodyContext      body;
    private  StringBuilder              bodyAsString = new StringBuilder();

}       // Definition
