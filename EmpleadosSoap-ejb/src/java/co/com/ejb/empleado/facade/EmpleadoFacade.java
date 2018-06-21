/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ejb.empleado.facade;

import co.com.ejb.empleado.entity.Empelado;
import co.com.ejb.empleado.manager.EmpleadoManager;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USUARIO
 */
@Stateless
public class EmpleadoFacade implements EmpleadoFacadeLocal {

    @PersistenceContext(unitName = "EmpleadoPU")
    private EntityManager em;
    private EmpleadoManager empleadoManager;

    @PostConstruct
    public void init() {
        if (empleadoManager == null) {
            empleadoManager = new EmpleadoManager(em);
        }
    }

    @Override
    public String crearEmpleado(Empelado empleado) {
        try {
            this.empleadoManager.crearEmpleado(empleado);
            return "Empleado creado exítosamente";
        } catch (Exception e) {
            System.out.println("Se presento un error creando el empleado " + e);
            return "Se presento un error creando el empleado ";
        }
    }

    @Override
    public String editarEmpleado(Empelado empleado) {
        try {
            this.empleadoManager.editarEmpleado(empleado);
            return "Empleado editado exítosamente";
        } catch (Exception e) {
            System.out.println("Se presento un error editado el empleado " + e);
            return "Se presento un error editado el empleado ";
        }

    }

    @Override
    public String eliminarEmpleado(Empelado empleado) {
        try {
            this.empleadoManager.eliminarEmpleado(empleado);
            return "Empleado eliminado exítosamente";
        } catch (Exception e) {
            System.out.println("Se presento un error eliminado el empleado " + e);
            return "Se presento un error eliminado el empleado ";
        }
    }

    @Override
    public List<Empelado> listarEmpleados() {
        try {
            return this.empleadoManager.listarEmpleados();
        } catch (Exception e) {
            System.out.println("Se presento un error listando los empleados " + e);
            return null;
        }
    }

}
