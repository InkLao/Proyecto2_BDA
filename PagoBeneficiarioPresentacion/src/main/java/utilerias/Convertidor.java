/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilerias;




import entidades.PrestamoEntidad;
import DTO.PrestamoDTO;

public class Convertidor {

    public static PrestamoEntidad convertirDTOPrestamo(PrestamoDTO prestamoDTO) {
        PrestamoEntidad prestamoEntidad = new PrestamoEntidad();
        prestamoEntidad.setMonto(prestamoDTO.getMonto());
        prestamoEntidad.setFecha(prestamoDTO.getFecha());
        prestamoEntidad.setParcialidades(prestamoDTO.getParcialidades());
        // Puedes establecer más atributos según sea necesario
        return prestamoEntidad;
    }

    public static PrestamoDTO convertirPrestamoDTO(PrestamoEntidad prestamoEntidad) {
        PrestamoDTO prestamoDTO = new PrestamoDTO();
  
        prestamoDTO.setMonto(prestamoEntidad.getMonto());
        prestamoDTO.setFecha(prestamoEntidad.getFecha());
        prestamoDTO.setParcialidades(prestamoEntidad.getParcialidades());
        // Puedes establecer más atributos según sea necesario
        return prestamoDTO;
    }
}

