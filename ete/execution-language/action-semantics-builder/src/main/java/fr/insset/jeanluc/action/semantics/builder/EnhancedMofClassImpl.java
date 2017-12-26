package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.as.Statement;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofClassImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
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
    private Map<String, List<Statement>>       statements;


}
