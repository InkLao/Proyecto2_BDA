/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import entidades.AbonoEntidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eduar
 */
public class AbonoDAO implements IAbonoDAO{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence_unit_name");

    @Override
    public void crear(AbonoEntidad abono) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(abono);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public AbonoEntidad obtenerPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        AbonoEntidad abono = em.find(AbonoEntidad.class, id);
        em.close();
        return abono;
    }

    @Override
    public List<AbonoEntidad> obtenerTodos() {
        EntityManager em = emf.createEntityManager();
        List<AbonoEntidad> abonos = em.createQuery("SELECT a FROM AbonoEntidad a", AbonoEntidad.class).getResultList();
        em.close();
        return abonos;
    }

    @Override
    public void actualizar(AbonoEntidad abono) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(abono);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager em = emf.createEntityManager();
        AbonoEntidad abono = em.find(AbonoEntidad.class, id);
        if (abono != null) {
            em.getTransaction().begin();
            em.remove(abono);
            em.getTransaction().commit();
        }
        em.close();
    }
}
