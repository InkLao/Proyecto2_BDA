package DAOs;

import entidades.PrestamoEntidad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PrestamoDAO implements AutoCloseable {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PrestamoDAO() {
        this.emf = Persistence.createEntityManagerFactory("com.mycompany_pagoBeneficiariosPersistencia_jar_1.0-SNAPSHOTPU");
        this.em = emf.createEntityManager();
    }

    public void guardarPrestamo(PrestamoEntidad prestamo) {
        em.getTransaction().begin();
        em.persist(prestamo);
        em.getTransaction().commit();
    }

    public PrestamoEntidad obtenerPrestamoPorId(Long id) {
        return em.find(PrestamoEntidad.class, id);
    }

    public List<PrestamoEntidad> obtenerTodosLosPrestamos() {
        return em.createQuery("from PrestamoEntidad", PrestamoEntidad.class).getResultList();
    }

    @Override
    public void close() {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }
}
