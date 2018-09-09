package fr.insset.jeanluc.constraint_language;


import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import model.ModelParser;
import model.ModelParser.BusinessRuleContext;
import model.ModelParser.DefinitionBodyContext;
import model.ModelParser.DefinitionContext;
import model.ModelParser.KeywordContext;
import model.ModelParser.ModelTermGroupContext;
import model.ModelParser.WordContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;


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



    public DefinitionVisitor() {
        register("visit", "org.antlr.v4.runtime");
        register(DefinitionBodyContext.class, "visitDefinitionBodyContext");
        register(WordContext.class, "visitWordContext");
        register(BusinessRuleContext.class, "visitBusinessRuleContext");
        register(DefinitionContext.class, "visitDefinitionContext");
        register(ModelTermGroupContext.class, "visitModelTermGroupContext");
        register(KeywordContext.class, "visitKeywordContext");
    }


    //========================================================================//


    public Object visitParseTree(ParseTree inParseTree, Object... inParams) {
        return inParams[0];
    }


    public Object visitParserRuleContext(ParserRuleContext inContext, Object... inParams) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<ParseTree> children = inContext.children;
        for (ParseTree aChild : children) {
            genericVisit(aChild, inParams);
        }
        return inParams[0];
    }


    public Object visitDefinitionContext(DefinitionContext inContext, Object... inParams) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Definition currentDefinition = new Definition(inContext.definitionBody());
        List<Definition> definitions = (List<Definition>) inParams[1];
        definitions.add(currentDefinition);
        List<ParseTree> children = inContext.children;
        for (ParseTree aChild : children) {
            genericVisit(aChild, inParams[0], inParams[1], 0, currentDefinition);
        }
        return inParams[0];
    }


    public Object visitModelTermGroupContext(ModelTermGroupContext inContext, Object... inParams) {
        Integer num = (Integer) inParams[2];
        num++;
        inParams[2] = num;
        ModelKeywordSignatureElement    element = new ModelKeywordSignatureElement(inContext.getText(), inContext, num);
        Definition definition = (Definition) inParams[3];
        definition.addElement(element);
        return inParams[0];
    }


    public Object visitWordContext(WordContext inContext, Object... inParams) {
        String text = inContext.getText();
        Set<String>     keywords = (Set<String>) inParams[0];
        keywords.add(text);
        Integer num = (Integer) inParams[2];
        num++;
        inParams[2] = num;
        SignatureElement    element = new DefinitionKeywordSignatureElement(inContext.getText(), inContext);
        Definition definition = (Definition) inParams[3];
        definition.addElement(element);
        return inParams[0];
    }


    /**
     * 
     */
    public Object visitKeywordContext(ModelParser.KeywordContext inContext, Object... inParams) {
        SignatureElement    element = new KeywordSignatureElement(inContext.getText(), inContext);
        Definition definition = (Definition) inParams[3];
        definition.addElement(element);
        return inParams[0];
    }


    /**
     * 
     */
    public Object visitDefinitionBodyContext(ModelParser.DefinitionBodyContext inContext, Object... inParams) {
        return inParams[0];
    }


    /**
     * The business rules are ignored during this phase.
     */
    public Object visitBusinessRuleContext(BusinessRuleContext inBusinessRuleContext, Object... inParam) {
        return inBusinessRuleContext;
    }


    //========================================================================//


//    public List<Definition> getDefinitions() {
//        return definitions;
//    }


//    private StringBuilder           name;
//    private List<Definition>    definitions = new LinkedList<>();


}
