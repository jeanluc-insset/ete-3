

package fr.insset.jeanluc.constraint_language;

import fr.insset.jeanluc.el.dialect.Dialect;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public interface ModelGeneratorDialect extends Dialect {


    public default List<List<String>>     translate(String aString) {
        List<List<String> >     result = new LinkedList<>();
        List<String>            aValue;
        aValue = new LinkedList();
        aValue.add(i2lc(aString));
        result.add(aValue);
        aValue = new LinkedList();
        aValue.add(i2uc(aString));
        result.add(aValue);
        String[] split = aString.split("(?<!^)(?=[A-Z])");
        if (split.length > 1) {
            aValue = new LinkedList();
            result.add(aValue);
            for (String aFragment : split) {
                aValue.add(i2lc(aFragment));
            }
        }
        return result;
    }

}
