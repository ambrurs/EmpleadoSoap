/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ejb.empleado.manager;

import co.com.ejb.empleado.dao.EmpleadoDao;
import co.com.ejb.empleado.entity.Empelado;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author USUARIO
 */
public class EmpleadoManager {

    private EmpleadoDao empleadoDao;
    
    public EmpleadoManager(EntityManager em) {
        this.empleadoDao = new EmpleadoDao(em);
    }
    
    public void crearEmpleado(Empelado empleado){
        this.empleadoDao.crearEmpleado(empleado);
    }
    
    public void editarEmpleado(Empelado empleado){
        this.empleadoDao.editarEmpleado(empleado);
    }
    
    public void eliminarEmpleado(Empelado empleado){
        this.empleadoDao.eliminarEmpleado(empleado);
    }
    
    public List<Empelado> listarEmpleados(){
        return this.empleadoDao.listarEmpleados();
    }
    
}
