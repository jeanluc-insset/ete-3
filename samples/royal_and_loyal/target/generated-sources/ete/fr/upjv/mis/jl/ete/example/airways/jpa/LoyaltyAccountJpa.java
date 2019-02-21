package fr.upjv.mis.jl.ete.example.airways.jpa;


import fr.upjv.mis.ete.samples.ete.jpa.AbstractJpa;
import fr.upjv.mis.jl.ete.example.airways.model.*;
import fr.upjv.mis.ete.util.OptionalList;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.*;
import javax.persistence.criteria.*;
import javax.persistence.metamodel.*;



/**
 *
 * @author jldeleage
 */
@Stateless
public class LoyaltyAccountJpa extends AbstractJpa<LoyaltyAccount> {

    @PersistenceContext(unitName = "fr.upjv.mis.ete.samples.ete_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LoyaltyAccountJpa() {
        super(LoyaltyAccount.class);
    }


    //========================================================================//



    //========================================================================//
    //           F I L T E R S   F O R   I N V A R I A N T S   O F            //
    //            E V E N T U A L L Y   O T H E R   C L A S S E S             //
    //========================================================================//


    /**
     * Should return all the instances of LoyaltyAccount which are acceptable
     * as values of account of Membership
     * without violating any constraint on Membership
     */
    public List<LoyaltyAccount> getAllLoyaltyAccountAsAccountForMembership(Membership inFor) throws InstantiationException {
        StringBuilder   builder = new StringBuilder("SELECT DISTINCT v0.* FROM LOYALTYACCOUNT AS v0");
        System.out.println("====================================================\nBuilding the query for account");
        // Some JPA implementations don't support named SQL parameters
        // We keep the ordered collection of the parameters we have in our query
        List    parameters = new LinkedList();
        String sqlQuery = builder.toString();
        Query  query = getEntityManager().createNativeQuery(sqlQuery, LoyaltyAccount.class);
        System.out.println("Resulting query : " + query);
        List<LoyaltyAccount>  result = query.getResultList();
        System.out.println("The result is : " + result + " (" + result.size() + " items)");
        return result;
    }


    /**
     * Should return all the instances of LoyaltyAccount which are acceptable
     * as values of account of EarningBurning
     * without violating any constraint on EarningBurning
     */
    public List<LoyaltyAccount> getAllLoyaltyAccountAsAccountForEarningBurning(EarningBurning inFor) throws InstantiationException {
        StringBuilder   builder = new StringBuilder("SELECT DISTINCT v0.* FROM LOYALTYACCOUNT AS v0");
        System.out.println("====================================================\nBuilding the query for account");
        // Some JPA implementations don't support named SQL parameters
        // We keep the ordered collection of the parameters we have in our query
        List    parameters = new LinkedList();
        String sqlQuery = builder.toString();
        Query  query = getEntityManager().createNativeQuery(sqlQuery, LoyaltyAccount.class);
        System.out.println("Resulting query : " + query);
        List<LoyaltyAccount>  result = query.getResultList();
        System.out.println("The result is : " + result + " (" + result.size() + " items)");
        return result;
    }





}
