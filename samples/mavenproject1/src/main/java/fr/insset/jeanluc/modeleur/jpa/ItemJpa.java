package fr.insset.jeanluc.modeleur.jpa;


import fr.insset.jeanluc.ete.jpa.AbstractJpa;
import fr.insset.jeanluc.modeleur.model.*;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import javax.persistence.metamodel.SingularAttribute;



/**
 *
 * @author jldeleage
 */
@Stateless
public class ItemJpa extends AbstractJpa<Item> {

    @PersistenceContext(unitName = "fr.insset.jeanluc.ete_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemJpa() {
        super(Item.class);
    }


    public List<TypeItem> findAllTypeItemFor(Item item) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(TypeItem.class));
        // we must now add all constraints to the request
        // now we can build the query
        TypedQuery query = getEntityManager().createQuery(cq);
        // we must set the parameters
        // finally we can fetch the data and return the result
        return query.getResultList();
    }



    public List<Item> findBy(TypeItem inValue) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Item> cq = cb.createQuery(Item.class);
        Root<Item> from = cq.from(Item.class);
        Metamodel metamodel = em.getMetamodel();
        EntityType<Item> entity = metamodel.entity(Item.class);
        SingularAttribute<? super Item, ?> singularAttribute = entity.getSingularAttribute("typeItem");
        from.join(singularAttribute);
        cq.where(cb.equal(from.get(singularAttribute), inValue));
        TypedQuery<Item> query = em.createQuery(cq);
        return query.getResultList();
    }



}
