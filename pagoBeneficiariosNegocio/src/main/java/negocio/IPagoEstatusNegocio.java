/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import DTO.PagoEstatusDTO;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface IPagoEstatusNegocio {
    PagoEstatusDTO crear(PagoEstatusDTO pagoEstatus) throws NegocioException;
    PagoEstatusDTO obtenerPorId(Long id) throws NegocioException;
    List<PagoEstatusDTO> obtenerTodos() throws NegocioException;
    PagoEstatusDTO actualizar(PagoEstatusDTO pagoEstatus) throws NegocioException;
    void eliminar(Long id) throws NegocioException;
}
