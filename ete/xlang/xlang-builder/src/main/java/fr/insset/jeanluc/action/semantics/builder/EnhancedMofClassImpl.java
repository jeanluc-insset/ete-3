package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.api.EteException;
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


    public EnhancedMofClassImpl() throws EteException, InstantiationException {
        Map     map = FactoryMethods.newMap(String.class, List.class);
        statements = map;
    }


    public EnhancedMofClassImpl(Map<String, List<Statement>> statements) throws EteException, InstantiationException {
        this.statements = statements;
    }


    public void addQuery(EteQuery inFilter) throws InstantiationException {
        System.out.println("ADDING " + inFilter + " to " + getName());
        MofProperty filteredProperty = inFilter.getFilteredProperty();
        List<EteQuery> filters = support.get(filteredProperty);
        if (filters == null) {
            System.out.println("It is the first query for this class");
            filters = FactoryMethods.newList(EteQuery.class);
            support.put(filteredProperty, filters);
        }
        filters.add(inFilter);
        System.out.println("Number of filters : " + filters.size());
    }



    public Map<MofProperty, List<EteQuery>> getSupport() {
        return support;
    }



    //========================================================================//


    /**
     * The key (a String) denotes the purpose of the associated list of
     * statements.<br>
     * For example the statements associated to the key "__check__yyy" are
     * instructions which check whether <code>this</code> is OK regarding to the
     * class invariant "yyy".<br>
     * The statements associate to the key "__find_available_xxxx__" are
     * instructions retrieving objects able to fulfill the role of xxxx
     * regarding to this.
     */
    private Map<String, List<Statement>>                statements;


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
