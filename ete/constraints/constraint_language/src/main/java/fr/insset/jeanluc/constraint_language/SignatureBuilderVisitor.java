

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import model.ModelParser.KeywordContext;
import model.ModelParser.ModelTermGroupContext;
import model.ModelParser.NavExpressionContext;
import model.ModelParser.WordContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;



/**
 *
 * @author jldeleage
 */
public class SignatureBuilderVisitor extends DynamicVisitorSupport {


    public SignatureBuilderVisitor(Map<Integer, String> inSymbols) {
        register(TerminalNode.class, "visitTerminalNode");
        register(ParserRuleContext.class, "visitParserRuleContext");
        register(ModelTermGroupContext.class, "visitModelTermGroupContext");
        register(WordContext.class, "visitWordContext");
        register(KeywordContext.class, "visitKeywordContext");
//        register(NavExpressionContext.class, "visitNavExpressionContext");
        symbols = inSymbols;
    }


    public Object visitTerminalNode(TerminalNode inContext, Object... inParams) {
        PrintWriter writer = (PrintWriter) inParams[0];
        writer.print(" ");
        writer.print(inContext.getText());
        return inContext;
    }


    public Object visitModelTermGroupContext(ModelTermGroupContext inWord, Object... inParams) {
        PrintWriter writer = (PrintWriter) inParams[0];
        writer.print(" navExpression");
        return inWord;
    }


    public Object visitKeywordContext(KeywordContext inContext, Object... inParams) {
        List<ParseTree> children = inContext.children;
        TerminalNode node = (TerminalNode) children.get(0);
        Token symbol = node.getSymbol();
        PrintWriter writer = (PrintWriter) inParams[0];
        writer.print(" ");
        String text = symbols.get(symbol.getType());
        writer.print(text);
        return inContext;
    }


    public Object visitParserRuleContext(ParserRuleContext inContext, Object... inParams) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (ParseTree aChild : inContext.children) {
            genericVisit(aChild, inParams);
        }
        return inContext;
    }


    public Object visitWordContext(WordContext inContext, Object... inParams) {
        PrintWriter writer = (PrintWriter) inParams[0];
        writer.print(" ");
        writer.print(inContext.getText().toUpperCase());
        return inContext;
    }


    Map<Integer, String>    symbols;

}
