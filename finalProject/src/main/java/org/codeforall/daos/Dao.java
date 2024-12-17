package org.codeforall.daos;

import org.codeforall.model.Family;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class Dao {

    private EntityManager em;

    public List<Family> read(){
        TypedQuery<Family> query = em.createQuery("SELECT family FROM Family family", Family.class);
        return query.getResultList();
    }

    public Family create(Family family) {return em.merge(family);}


    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
