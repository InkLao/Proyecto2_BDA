/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOs;

import entidades.PrestamoEntidad;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface IPrestamoDAO {
    void crear(PrestamoEntidad prestamo);
    PrestamoEntidad obtenerPorId(Long id);
    List<PrestamoEntidad> obtenerTodos();
    void actualizar(PrestamoEntidad prestamo);
    void eliminar(Long id);
}
