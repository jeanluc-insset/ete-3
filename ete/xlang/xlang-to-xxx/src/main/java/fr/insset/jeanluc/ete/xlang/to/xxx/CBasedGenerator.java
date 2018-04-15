

package fr.insset.jeanluc.ete.xlang.to.xxx;

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
        setSymbol("and","&&");
        setSymbol("oe", "||");
    }


}
