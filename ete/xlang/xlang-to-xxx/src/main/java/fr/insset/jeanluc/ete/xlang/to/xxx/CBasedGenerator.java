package fr.insset.jeanluc.ete.xlang.to.xxx;

import fr.insset.jeanluc.ete.gel.And;
import fr.insset.jeanluc.ete.gel.Different;
import fr.insset.jeanluc.ete.gel.Equal;
import fr.insset.jeanluc.ete.gel.Not;
import fr.insset.jeanluc.ete.gel.Or;

/**
 *
 * @author jldeleage
 */
public class CBasedGenerator extends GeneratorSupport {


    public CBasedGenerator() throws InstantiationException {
        this("    ");
    }


    public CBasedGenerator(String inIndentation) throws InstantiationException {
        super(inIndentation);
        setSymbol(And.class,"&&");
        setSymbol(Or.class, "||");
        setSymbol(Different.class, "!=");
        setSymbol(Equal.class, "==");
        setSymbol(Not.class, "!");
    }


}
