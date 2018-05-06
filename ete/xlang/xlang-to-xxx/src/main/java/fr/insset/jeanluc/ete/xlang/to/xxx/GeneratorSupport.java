

package fr.insset.jeanluc.ete.xlang.to.xxx;

import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jldeleage
 */
public class GeneratorSupport extends DynamicVisitorSupport  implements Generator {

    public GeneratorSupport() {
        this("    ");
    }

    public GeneratorSupport(String indentation) {
        this.indentation = indentation;
    }

    public void setSymbol(String gel, String language) {
        symbols.put(gel, language);
    }

    public String getSymbol(String gel) {
        return symbols.get(gel);
    }

    private     Map<String, String>     symbols = new HashMap<>();
    private     String                  indentation;

}
