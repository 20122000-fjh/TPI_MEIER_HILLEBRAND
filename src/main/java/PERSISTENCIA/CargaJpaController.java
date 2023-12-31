package PERSISTENCIA;

import MODELO.Carga;
import PERSISTENCIA.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CargaJpaController implements Serializable {

    public CargaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public CargaJpaController(){
        emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Carga carga) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(carga);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Carga carga) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            carga = em.merge(carga);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = carga.getId();
                if (findCarga(id) == null) {
                    throw new NonexistentEntityException("The carga with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carga carga;
            try {
                carga = em.getReference(Carga.class, id);
                carga.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The carga with id " + id + " no longer exists.", enfe);
            }
            em.remove(carga);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carga> findCargaEntities() {
        return findCargaEntities(true, -1, -1);
    }

    public List<Carga> findCargaEntities(int maxResults, int firstResult) {
        return findCargaEntities(false, maxResults, firstResult);
    }

    private List<Carga> findCargaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Carga.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Carga findCarga(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carga.class, id);
        } finally {
            em.close();
        }
    }

    public int getCargaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Carga> rt = cq.from(Carga.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
                                                                  package PERSISTENCIA;

import MODELO.Carga;
import PERSISTENCIA.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CargaJpaController implements Serializable {

    public CargaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public CargaJpaController(){
        emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Carga carga) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(carga);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Carga carga) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            carga = em.merge(carga);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = carga.getId();
                if (findCarga(id) == null) {
                    throw new NonexistentEntityException("The carga with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carga carga;
            try {
                carga = em.getReference(Carga.class, id);
                carga.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The carga with id " + id + " no longer exists.", enfe);
            }
            em.remove(carga);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carga> findCargaEntities() {
        return findCargaEntities(true, -1, -1);
    }

    public List<Carga> findCargaEntities(int maxResults, int firstResult) {
        return findCargaEntities(false, maxResults, firstResult);
    }

    private List<Carga> findCargaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Carga.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Carga findCarga(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carga.class, id);
        } finally {
            em.close();
        }
    }

    public int getCargaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Carga> rt = cq.from(Carga.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
