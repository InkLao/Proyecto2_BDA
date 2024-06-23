/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import entidades.BeneficiarioEntidad;
import excepciones.PersistenciaException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eduar
 */
public class BeneficiarioDAO implements IBeneficiarioDAO{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_pagoBeneficiariosPersistencia_jar_1.0-SNAPSHOTPU");

    @Override
    public void crear(BeneficiarioEntidad beneficiario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(beneficiario);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public BeneficiarioEntidad obtenerPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        BeneficiarioEntidad beneficiario = em.find(BeneficiarioEntidad.class, id);
        em.close();
        return beneficiario;
    }

    @Override
    public List<BeneficiarioEntidad> obtenerTodos() throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        List<BeneficiarioEntidad> beneficiarios = em.createQuery("SELECT b FROM BeneficiarioEntidad b", BeneficiarioEntidad.class).getResultList();
        em.close();
        return beneficiarios;
    }

    @Override
    public void actualizar(BeneficiarioEntidad beneficiario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(beneficiario);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager em = emf.createEntityManager();
        BeneficiarioEntidad beneficiario = em.find(BeneficiarioEntidad.class, id);
        if (beneficiario != null) {
            em.getTransaction().begin();
            em.remove(beneficiario);
            em.getTransaction().commit();
        }
        em.close();
    }
}
