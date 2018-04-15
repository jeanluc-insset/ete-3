

package fr.insset.jeanluc.ete.xlang.to.xxx;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;

/**
 *
 * @author jldeleage
 */
public class GeneratorSupport extends DynamicVisitorSupport implements Generator {

    public GeneratorSupport() {
        this.register(GelExpression.class, "visitGelExpression");
    }


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameter) {
        return inExpression;
    }


}
