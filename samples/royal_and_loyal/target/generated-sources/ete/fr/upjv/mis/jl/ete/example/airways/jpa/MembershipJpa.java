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
public class MembershipJpa extends AbstractJpa<Membership> {

    @PersistenceContext(unitName = "fr.upjv.mis.ete.samples.ete_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MembershipJpa() {
        super(Membership.class);
    }


    //========================================================================//


    public List<Membership> findByCard(CustomerCard inValue) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Membership> cq = cb.createQuery(Membership.class);
        Root<Membership> from = cq.from(Membership.class);
        // There is an "unkown compilation error" if we try to use the metamodel
        // generator processor so we use the metamodel on runtime only
        Metamodel metamodel = em.getMetamodel();
        EntityType<Membership> entity = metamodel.entity(Membership.class);
        SingularAttribute<? super Membership, ?> singularAttribute = entity.getSingularAttribute("customerCard");
        from.join(singularAttribute);
        cq.where(cb.equal(from.get(singularAttribute), inValue));
        TypedQuery<Membership> query = em.createQuery(cq);
        return query.getResultList();
    }

    public List<Membership> findByAccount(LoyaltyAccount inValue) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Membership> cq = cb.createQuery(Membership.class);
        Root<Membership> from = cq.from(Membership.class);
        // There is an "unkown compilation error" if we try to use the metamodel
        // generator processor so we use the metamodel on runtime only
        Metamodel metamodel = em.getMetamodel();
        EntityType<Membership> entity = metamodel.entity(Membership.class);
        SingularAttribute<? super Membership, ?> singularAttribute = entity.getSingularAttribute("loyaltyAccount");
        from.join(singularAttribute);
        cq.where(cb.equal(from.get(singularAttribute), inValue));
        TypedQuery<Membership> query = em.createQuery(cq);
        return query.getResultList();
    }

    public List<Membership> findByCurrentLevel(ServiceLevel inValue) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Membership> cq = cb.createQuery(Membership.class);
        Root<Membership> from = cq.from(Membership.class);
        // There is an "unkown compilation error" if we try to use the metamodel
        // generator processor so we use the metamodel on runtime only
        Metamodel metamodel = em.getMetamodel();
        EntityType<Membership> entity = metamodel.entity(Membership.class);
        SingularAttribute<? super Membership, ?> singularAttribute = entity.getSingularAttribute("serviceLevel");
        from.join(singularAttribute);
        cq.where(cb.equal(from.get(singularAttribute), inValue));
        TypedQuery<Membership> query = em.createQuery(cq);
        return query.getResultList();
    }


    //========================================================================//
    //           F I L T E R S   F O R   I N V A R I A N T S   O F            //
    //            E V E N T U A L L Y   O T H E R   C L A S S E S             //
    //========================================================================//





}
