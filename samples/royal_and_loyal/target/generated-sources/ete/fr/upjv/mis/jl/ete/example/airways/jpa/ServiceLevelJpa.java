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
public class ServiceLevelJpa extends AbstractJpa<ServiceLevel> {

    @PersistenceContext(unitName = "fr.upjv.mis.ete.samples.ete_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServiceLevelJpa() {
        super(ServiceLevel.class);
    }


    //========================================================================//



    //========================================================================//
    //           F I L T E R S   F O R   I N V A R I A N T S   O F            //
    //            E V E N T U A L L Y   O T H E R   C L A S S E S             //
    //========================================================================//


    /**
     * Should return all the instances of ServiceLevel which are acceptable
     * as values of currentLevel of Membership
     * without violating any constraint on Membership
     */
    public List<ServiceLevel> getAllServiceLevelAsCurrentLevelForMembership(Membership inFor) throws InstantiationException {
        StringBuilder   builder = new StringBuilder("SELECT DISTINCT v0.* FROM SERVICELEVEL AS v0");
        System.out.println("====================================================\nBuilding the query for currentLevel");
        // Some JPA implementations don't support named SQL parameters
        // We keep the ordered collection of the parameters we have in our query
        List    parameters = new LinkedList();
        String sqlQuery = builder.toString();
        Query  query = getEntityManager().createNativeQuery(sqlQuery, ServiceLevel.class);
        System.out.println("Resulting query : " + query);
        List<ServiceLevel>  result = query.getResultList();
        System.out.println("The result is : " + result + " (" + result.size() + " items)");
        return result;
    }





}
