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
public class CustomerCardJpa extends AbstractJpa<CustomerCard> {

    @PersistenceContext(unitName = "fr.upjv.mis.ete.samples.ete_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerCardJpa() {
        super(CustomerCard.class);
    }


    //========================================================================//


    public List<CustomerCard> findByOwner(Customer inValue) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<CustomerCard> cq = cb.createQuery(CustomerCard.class);
        Root<CustomerCard> from = cq.from(CustomerCard.class);
        // There is an "unkown compilation error" if we try to use the metamodel
        // generator processor so we use the metamodel on runtime only
        Metamodel metamodel = em.getMetamodel();
        EntityType<CustomerCard> entity = metamodel.entity(CustomerCard.class);
        SingularAttribute<? super CustomerCard, ?> singularAttribute = entity.getSingularAttribute("customer");
        from.join(singularAttribute);
        cq.where(cb.equal(from.get(singularAttribute), inValue));
        TypedQuery<CustomerCard> query = em.createQuery(cq);
        return query.getResultList();
    }


    //========================================================================//
    //           F I L T E R S   F O R   I N V A R I A N T S   O F            //
    //            E V E N T U A L L Y   O T H E R   C L A S S E S             //
    //========================================================================//


    /**
     * Should return all the instances of CustomerCard which are acceptable
     * as values of card of Membership
     * without violating any constraint on Membership
     */
    public List<CustomerCard> getAllCustomerCardAsCardForMembership(Membership inFor) throws InstantiationException {
        StringBuilder   builder = new StringBuilder("SELECT DISTINCT v0.* FROM CUSTOMERCARD AS v0");
        System.out.println("====================================================\nBuilding the query for card");
        // Some JPA implementations don't support named SQL parameters
        // We keep the ordered collection of the parameters we have in our query
        List    parameters = new LinkedList();
        String sqlQuery = builder.toString();
        Query  query = getEntityManager().createNativeQuery(sqlQuery, CustomerCard.class);
        System.out.println("Resulting query : " + query);
        List<CustomerCard>  result = query.getResultList();
        System.out.println("The result is : " + result + " (" + result.size() + " items)");
        return result;
    }





}
