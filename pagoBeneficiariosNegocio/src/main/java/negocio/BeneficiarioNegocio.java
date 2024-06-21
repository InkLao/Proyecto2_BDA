/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAOs.IBeneficiarioDAO;
import DTO.BeneficiarioDTO;
import entidades.BeneficiarioEntidad;
import excepciones.NegocioException;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author eduar
 */
public class BeneficiarioNegocio implements IBeneficiarioNegocio{
    private IBeneficiarioDAO beneficiarioDAO;

    public BeneficiarioNegocio(IBeneficiarioDAO beneficiarioDAO) {
        this.beneficiarioDAO = beneficiarioDAO;
    }

    @Override
    public void crear(BeneficiarioDTO beneficiario) throws NegocioException {
        try {
            BeneficiarioEntidad entidad = new BeneficiarioEntidad();
            entidad.setClaveContrato(beneficiario.getClaveContrato());
            entidad.setSaldo(beneficiario.getSaldo());
            entidad.setUsuario(beneficiario.getUsuario());
            entidad.setContraseña(beneficiario.getContrasena());
            entidad.setNombres(beneficiario.getNombres());
            entidad.setPaterno(beneficiario.getPaterno());
            entidad.setMaterno(beneficiario.getMaterno());
            beneficiarioDAO.crear(entidad);
        } catch (Exception e) {
            throw new NegocioException("Error al crear el beneficiario", e);
        }
    }

    @Override
    public BeneficiarioDTO obtenerPorId(Long id) throws NegocioException {
        try {
            BeneficiarioEntidad entidad = beneficiarioDAO.obtenerPorId(id);
            if (entidad == null) {
                throw new NegocioException("Beneficiario no encontrado");
            }
            return new BeneficiarioDTO(entidad.getId(), entidad.getClaveContrato(), entidad.getSaldo(), entidad.getUsuario(), entidad.getContraseña(), entidad.getNombres(), entidad.getPaterno(), entidad.getMaterno());
        } catch (Exception e) {
            throw new NegocioException("Error al obtener el beneficiario por id", e);
        }
    }

    @Override
    public List<BeneficiarioDTO> obtenerTodos() throws NegocioException {
        try {
            return beneficiarioDAO.obtenerTodos().stream()
                    .map(entidad -> new BeneficiarioDTO(entidad.getId(), entidad.getClaveContrato(), entidad.getSaldo(), entidad.getUsuario(), entidad.getContraseña(), entidad.getNombres(), entidad.getPaterno(), entidad.getMaterno()))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new NegocioException("Error al obtener todos los beneficiarios", e);
        }
    }

    @Override
    public void actualizar(BeneficiarioDTO beneficiario) throws NegocioException {
        try {
            BeneficiarioEntidad entidad = beneficiarioDAO.obtenerPorId(beneficiario.getId());
            if (entidad == null) {
                throw new NegocioException("Beneficiario no encontrado");
            }
            entidad.setClaveContrato(beneficiario.getClaveContrato());
            entidad.setSaldo(beneficiario.getSaldo());
            entidad.setUsuario(beneficiario.getUsuario());
            entidad.setContraseña(beneficiario.getContrasena());
            entidad.setNombres(beneficiario.getNombres());
            entidad.setPaterno(beneficiario.getPaterno());
            entidad.setMaterno(beneficiario.getMaterno());
            beneficiarioDAO.actualizar(entidad);
        } catch (Exception e) {
            throw new NegocioException("Error al actualizar el beneficiario", e);
        }
    }

    @Override
    public void eliminar(Long id) throws NegocioException {
        try {
            beneficiarioDAO.eliminar(id);
        } catch (Exception e) {
            throw new NegocioException("Error al eliminar el beneficiario", e);
        }
    }
}
