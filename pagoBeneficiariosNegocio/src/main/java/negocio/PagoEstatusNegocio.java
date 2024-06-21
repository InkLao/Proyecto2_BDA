/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAOs.IPagoEstatusDAO;
import DTO.PagoEstatusDTO;
import entidades.EstatusEntidad;
import entidades.PagoEntidad;
import entidades.PagoEstatusEntidad;
import excepciones.NegocioException;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author eduar
 */
public class PagoEstatusNegocio implements IPagoEstatusNegocio{
    private IPagoEstatusDAO pagoEstatusDAO;

    public PagoEstatusNegocio(IPagoEstatusDAO pagoEstatusDAO) {
        this.pagoEstatusDAO = pagoEstatusDAO;
    }

    @Override
    public void crear(PagoEstatusDTO pagoEstatus) throws NegocioException {
        try {
            PagoEstatusEntidad entidad = new PagoEstatusEntidad();
            entidad.setFechaHora(pagoEstatus.getFechaHora());
            entidad.setMensaje(pagoEstatus.getMensaje());
            
            PagoEntidad pago = new PagoEntidad();
            pago.setId(pagoEstatus.getPagoId());
            entidad.setPago(pago);
            
            EstatusEntidad estatus = new EstatusEntidad();
            estatus.setId(pagoEstatus.getEstatusId());
            entidad.setEstatus(estatus);
            
            pagoEstatusDAO.crear(entidad);
        } catch (Exception e) {
            throw new NegocioException("Error al crear el pago estatus", e);
        }
    }

    @Override
    public PagoEstatusDTO obtenerPorId(Long id) throws NegocioException {
        try {
            PagoEstatusEntidad entidad = pagoEstatusDAO.obtenerPorId(id);
            if (entidad == null) {
                throw new NegocioException("Pago estatus no encontrado");
            }
            return new PagoEstatusDTO(entidad.getId(), entidad.getFechaHora(), entidad.getMensaje(), entidad.getPago().getId(), entidad.getEstatus().getId());
        } catch (Exception e) {
            throw new NegocioException("Error al obtener el pago estatus por id", e);
        }
    }

    @Override
    public List<PagoEstatusDTO> obtenerTodos() throws NegocioException {
        try {
            return pagoEstatusDAO.obtenerTodos().stream()
                    .map(entidad -> new PagoEstatusDTO(entidad.getId(), entidad.getFechaHora(), entidad.getMensaje(), entidad.getPago().getId(), entidad.getEstatus().getId()))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new NegocioException("Error al obtener todos los pago estatus", e);
        }
    }

    @Override
    public void actualizar(PagoEstatusDTO pagoEstatus) throws NegocioException {
        try {
            PagoEstatusEntidad entidad = pagoEstatusDAO.obtenerPorId(pagoEstatus.getId());
            if (entidad == null) {
                throw new NegocioException("Pago estatus no encontrado");
            }
            entidad.setFechaHora(pagoEstatus.getFechaHora());
            entidad.setMensaje(pagoEstatus.getMensaje());
            
            PagoEntidad pago = new PagoEntidad();
            pago.setId(pagoEstatus.getPagoId());
            entidad.setPago(pago);
            
            EstatusEntidad estatus = new EstatusEntidad();
            estatus.setId(pagoEstatus.getEstatusId());
            entidad.setEstatus(estatus);
            
            pagoEstatusDAO.actualizar(entidad);
        } catch (Exception e) {
            throw new NegocioException("Error al actualizar el pago estatus", e);
        }
    }

    @Override
    public void eliminar(Long id) throws NegocioException {
        try {
            pagoEstatusDAO.eliminar(id);
        } catch (Exception e) {
            throw new NegocioException("Error al eliminar el pago estatus", e);
        }
    }

}