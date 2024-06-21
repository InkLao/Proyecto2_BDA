/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import entidades.CuentaBancariaEntidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eduar
 */
public class CuentaBancariaDAO implements ICuentaBancariaDAO{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence_unit_name");

    @Override
    public void crear(CuentaBancariaEntidad cuentaBancaria) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cuentaBancaria);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public CuentaBancariaEntidad obtenerPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        CuentaBancariaEntidad cuentaBancaria = em.find(CuentaBancariaEntidad.class, id);
        em.close();
        return cuentaBancaria;
    }

    @Override
    public List<CuentaBancariaEntidad> obtenerTodos() {
        EntityManager em = emf.createEntityManager();
        List<CuentaBancariaEntidad> cuentasBancarias = em.createQuery("SELECT c FROM CuentaBancariaEntidad c", CuentaBancariaEntidad.class).getResultList();
        em.close();
        return cuentasBancarias;
    }

    @Override
    public void actualizar(CuentaBancariaEntidad cuentaBancaria) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(cuentaBancaria);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminar(Long id) {
        EntityManager em = emf.createEntityManager();
        CuentaBancariaEntidad cuentaBancaria = em.find(CuentaBancariaEntidad.class, id);
        if (cuentaBancaria != null) {
            em.getTransaction().begin();
            em.remove(cuentaBancaria);
            em.getTransaction().commit();
        }
        em.close();
    }
}
