

package fr.insset.jeanluc.constraint_language;

import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * This class reflects a definition in a constraint file.<br>
 * The definition can be in any customized language.
 *
 * @author jldeleage
 */
public class Definition {


    
    private  ParserRuleContext  src;
    private  ParserRuleContext  body;
    private  List<ParseTree>    definitionKeyWords;

}
