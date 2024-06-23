/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOs;

import DTO.BeneficiarioDTO;
import entidades.PagoEntidad;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author eduar
 */
public interface IPagoDAO {
    
    void crear(PagoEntidad pago);
    PagoEntidad obtenerPorId(Long id);
    List<PagoEntidad> obtenerTodos();
    void actualizar(PagoEntidad pago);
    void eliminar(Long id);
}
