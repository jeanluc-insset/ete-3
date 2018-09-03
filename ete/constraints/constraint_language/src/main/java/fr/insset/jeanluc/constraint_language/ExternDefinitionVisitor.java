

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.constraint_language.tmp.FrenchModelParser;
import fr.insset.jeanluc.constraint_language.tmp.FrenchModelParserBaseVisitor;



/**
 *
 * @author jldeleage
 */
public class ExternDefinitionVisitor extends FrenchModelParserBaseVisitor {



    public void sayHello() {
        System.out.println("Hello");
    }




    @Override
    public Object visitDefinition(FrenchModelParser.DefinitionContext ctx) {
        System.out.println("Visiting a definition...");
        return super.visitDefinition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFile(FrenchModelParser.FileContext ctx) {
        return super.visitFile(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDefinitionSignature(FrenchModelParser.DefinitionSignatureContext ctx) {
        return super.visitDefinitionSignature(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    


}
