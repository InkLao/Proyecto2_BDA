/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOs;

import entidades.EstatusEntidad;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface IEstatusDAO {
    void crear(EstatusEntidad estatus);
    EstatusEntidad obtenerPorId(Long id);
    List<EstatusEntidad> obtenerTodos();
    void actualizar(EstatusEntidad estatus);
    void eliminar(Long id);
}
