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



/**
 *
 * @author jldeleage
 */
@Stateless
public class StereotypeJpa extends AbstractJpa<Stereotype> {

    @PersistenceContext(unitName = "fr.insset.jeanluc.ete_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StereotypeJpa() {
        super(Stereotype.class);
    }


}
