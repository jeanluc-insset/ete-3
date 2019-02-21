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
public class CustomerJpa extends AbstractJpa<Customer> {

    @PersistenceContext(unitName = "fr.upjv.mis.ete.samples.ete_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerJpa() {
        super(Customer.class);
    }


    //========================================================================//



    //========================================================================//
    //           F I L T E R S   F O R   I N V A R I A N T S   O F            //
    //            E V E N T U A L L Y   O T H E R   C L A S S E S             //
    //========================================================================//


    /**
     * Should return all the instances of Customer which are acceptable
     * as values of owner of CustomerCard
     * without violating any constraint on CustomerCard
     */
    public List<Customer> getAllCustomerAsOwnerForCustomerCard(CustomerCard inFor) throws InstantiationException {
        StringBuilder   builder = new StringBuilder("SELECT DISTINCT v0.* FROM CUSTOMER AS v0");
        System.out.println("====================================================\nBuilding the query for owner");
        // Some JPA implementations don't support named SQL parameters
        // We keep the ordered collection of the parameters we have in our query
        List    parameters = new LinkedList();
        String sqlQuery = builder.toString();
        Query  query = getEntityManager().createNativeQuery(sqlQuery, Customer.class);
        System.out.println("Resulting query : " + query);
        List<Customer>  result = query.getResultList();
        System.out.println("The result is : " + result + " (" + result.size() + " items)");
        return result;
    }





}
