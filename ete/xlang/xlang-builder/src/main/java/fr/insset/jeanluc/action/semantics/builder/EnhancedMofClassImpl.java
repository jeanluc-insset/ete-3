package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.defs.EteException;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofClassImpl;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * This class contains compiled versions of invariants.<br>
 * A single invariant may lead to several versions.<br>
 *
 * @author jldeleage
 */
public class EnhancedMofClassImpl extends MofClassImpl {


    public EnhancedMofClassImpl() throws InstantiationException {
    }


    public EnhancedMofClassImpl(Map<String, List<Statement>> statements) {
    }


    public void addQuery(EteQuery inFilter) {
        MofProperty filteredProperty = inFilter.getFilteredProperty();
        
        List<EteQuery> filters = support.computeIfAbsent(filteredProperty, f -> {
            try {
                return FactoryMethods.newList(EteQuery.class);
            } catch (InstantiationException ex) {
                throw new EteException(ex);
            }
        });
        filters.add(inFilter);
    }



    public Map<MofProperty, List<EteQuery>> getSupport() {
        return support;
    }



    //========================================================================//



    /**
     * Every invariant of the class is scanned.<br>
     * It is added to the list associated with any property it contains.<br>
     * That list helps to build requests to find out matching values for
     * an in work entity.<br>
     * Remark : the MofProperties used as keys do not need to be owned by
     * the "this" object. Usually they do not.<br>
     * For example, in the "airways" model, the constraint<br>
     * <code>captain &lt;&gt; copilot</code><br>
     * the properties <code>captain</code> and <code>copilot</code> belong to
     * the Flight entity and are used as keys in the support property of the
     * Pilot entity.
     */
    private Map<MofProperty, List<EteQuery>>   support = new HashMap<>();


}
