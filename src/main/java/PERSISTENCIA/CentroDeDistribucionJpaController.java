package PERSISTENCIA;

import MODELO.CentroDeDistribucion;
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

public class CentroDeDistribucionJpaController implements Serializable {

    public CentroDeDistribucionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public CentroDeDistribucionJpaController(){
        emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CentroDeDistribucion centroDeDistribucion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(centroDeDistribucion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CentroDeDistribucion centroDeDistribucion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            centroDeDistribucion = em.merge(centroDeDistribucion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = centroDeDistribucion.getId();
                if (findCentroDeDistribucion(id) == null) {
                    throw new NonexistentEntityException("The centroDeDistribucion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CentroDeDistribucion centroDeDistribucion;
            try {
                centroDeDistribucion = em.getReference(CentroDeDistribucion.class, id);
                centroDeDistribucion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The centroDeDistribucion with id " + id + " no longer exists.", enfe);
            }
            em.remove(centroDeDistribucion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CentroDeDistribucion> findCentroDeDistribucionEntities() {
        return findCentroDeDistribucionEntities(true, -1, -1);
    }

    public List<CentroDeDistribucion> findCentroDeDistribucionEntities(int maxResults, int firstResult) {
        return findCentroDeDistribucionEntities(false, maxResults, firstResult);
    }

    private List<CentroDeDistribucion> findCentroDeDistribucionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CentroDeDistribucion.class));
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

    public CentroDeDistribucion findCentroDeDistribucion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CentroDeDistribucion.class, id);
        } finally {
   package PERSISTENCIA;

import MODELO.CentroDeDistribucion;
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

public class CentroDeDistribucionJpaController implements Serializable {

    public CentroDeDistribucionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public CentroDeDistribucionJpaController(){
        emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CentroDeDistribucion centroDeDistribucion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(centroDeDistribucion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CentroDeDistribucion centroDeDistribucion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            centroDeDistribucion = em.merge(centroDeDistribucion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = centroDeDistribucion.getId();
                if (findCentroDeDistribucion(id) == null) {
                    throw new NonexistentEntityException("The centroDeDistribucion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CentroDeDistribucion centroDeDistribucion;
            try {
                centroDeDistribucion = em.getReference(CentroDeDistribucion.class, id);
                centroDeDistribucion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The centroDeDistribucion with id " + id + " no longer exists.", enfe);
            }
            em.remove(centroDeDistribucion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CentroDeDistribucion> findCentroDeDistribucionEntities() {
        return findCentroDeDistribucionEntities(true, -1, -1);
    }

    public List<CentroDeDistribucion> findCentroDeDistribucionEntities(int maxResults, int firstResult) {
        return findCentroDeDistribucionEntities(false, maxResults, firstResult);
    }

    private List<CentroDeDistribucion> findCentroDeDistribucionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CentroDeDistribucion.class));
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

    public CentroDeDistribucion findCentroDeDistribucion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CentroDeDistribucion.class, id);
        } finally {
            em.close();
        }
    }

    public int getCentroDeDistribucionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CentroDeDistribucion> rt = cq.from(CentroDeDistribucion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
