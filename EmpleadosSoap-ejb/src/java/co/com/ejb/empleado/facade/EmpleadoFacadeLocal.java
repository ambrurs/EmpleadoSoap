/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ejb.empleado.facade;

import co.com.ejb.empleado.entity.Empelado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author USUARIO
 */
@Local
public interface EmpleadoFacadeLocal {
 
    
    String crearEmpleado(Empelado empleado);
    String editarEmpleado(Empelado empleado);
    String eliminarEmpleado(Empelado empleado);
    List<Empelado> listarEmpleados();
}
