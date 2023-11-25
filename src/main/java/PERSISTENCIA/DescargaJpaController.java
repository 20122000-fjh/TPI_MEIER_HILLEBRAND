package PERSISTENCIA;

import MODELO.Descarga;
import PERSISTENCIA.exceptions.NonexistentEntityException;
import PERSISTENCIA.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class DescargaJpaController implements Serializable {

    public DescargaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DescargaJpaController(){
        emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Descarga descarga) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(descarga);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDescarga(descarga.getId()) != null) {
                throw new PreexistingEntityException("Descarga " + descarga + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Descarga descarga) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
           package PERSISTENCIA;

import MODELO.Descarga;
import PERSISTENCIA.exceptions.NonexistentEntityException;
import PERSISTENCIA.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class DescargaJpaController implements Serializable {

    public DescargaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DescargaJpaController(){
        emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Descarga descarga) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(descarga);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDescarga(descarga.getId()) != null) {
                throw new PreexistingEntityException("Descarga " + descarga + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Descarga descarga) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            descarga = em.merge(descarga);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = descarga.getId();
                if (findDescarga(id) == null) {
                    throw new NonexistentEntityException("The descarga with id " + id + " no longer exists.");
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
            Descarga descarga;
            try {
                descarga = em.getReference(Descarga.class, id);
                descarga.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The descarga with id " + id + " no longer exists.", enfe);
            }
            em.remove(descarga);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Descarga> findDescargaEntities() {
        return findDescargaEntities(true, -1, -1);
    }

    public List<Descarga> findDescargaEntities(int maxResults, int firstResult) {
        return findDescargaEntities(false, maxResults, firstResult);
    }

    private List<Descarga> findDescargaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Descarga.class));
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

    public Descarga findDescarga(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Descarga.class, id);
        } finally {
            em.close();
        }
    }

    public int getDescargaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Descarga> rt = cq.from(Descarga.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
