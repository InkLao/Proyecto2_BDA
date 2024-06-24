package DAOs;

import entidades.PrestamoEntidad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PrestamoDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PrestamoDAO() {
        // Crear el EntityManagerFactory usando el nombre de la unidad de persistencia
        emf = Persistence.createEntityManagerFactory("com.mycompany_pagoBeneficiariosPersistencia_jar_1.0-SNAPSHOTPU");
        // Crear el EntityManager a partir del EntityManagerFactory
        em = emf.createEntityManager();
    }

    public void guardarPrestamo(PrestamoEntidad prestamo) {
        // Iniciar la transacción
        em.getTransaction().begin();
        // Persistir el objeto prestamo en la base de datos
        em.persist(prestamo);
        // Commit de la transacción
        em.getTransaction().commit();
    }

    public PrestamoEntidad obtenerPrestamoPorId(Long id) {
        return em.find(PrestamoEntidad.class, id);
    }

    public List<PrestamoEntidad> obtenerTodosLosPrestamos() {
        return em.createQuery("from PrestamoEntidad", PrestamoEntidad.class).getResultList();
    }

    // Método para cerrar el EntityManager y el EntityManagerFactory
    public void cerrar() {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }
}
