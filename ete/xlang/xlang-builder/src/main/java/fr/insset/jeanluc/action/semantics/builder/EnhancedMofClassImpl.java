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


    public void addQuery(EteQuery inQuery) {
        MofProperty property = inQuery.getProperty();
        support.put(property, inQuery);
    }


    public Map<MofProperty, EteQuery> getSupport() {
        System.out.println("Requesting support of " + getName() + " -> " + support.size() + " queries");
        return support;
    }


    //========================================================================//


    /**
     * <div>
     * We need to generate a "query" for every property in the model.<br>
     * For example, in the "airways" model, the properties {@code Flight::captain}
     * and {@code Flight::copilot} are mirrored by queries in the {@code
     * PilotJDO} class {@code getPilotAvailableAsCaptainFor(Flight aFlight)}
     * and {@code getPilotAvailableAsCopilotFor(Flight aFlight}.<br>
     * The {@code Pilot} class is the "target" class, the {@code Flight} class
     * is the "client" class of the query.
     * </div>
     * <div>
     * Furthermore, the property may be involved in invariants.<br>
     * In the same example, we have such an invariant&nbsp;:<br>
     * {@code captain.certificates.planeModel-&gt;includes(self.plane.planeMode)}<br>
     * The query must be able to select only pilots which are certified for the
     * plane of flight.<br>
     * So the query performs joins to select the certificates and contains a
     * "filter" which is translated to a "where" clause.
     * </div>
     */
    private Map<MofProperty, EteQuery>   support = new HashMap<>();


}
