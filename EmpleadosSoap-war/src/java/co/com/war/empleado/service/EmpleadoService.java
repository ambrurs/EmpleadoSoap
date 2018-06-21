/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.war.empleado.service;

import co.com.ejb.empleado.entity.Empelado;
import co.com.ejb.empleado.facade.EmpleadoFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USUARIO
 */
@WebService(serviceName = "EmpleadoService")
public class EmpleadoService {

    @EJB
    public EmpleadoFacadeLocal empleadoFacadeLocal;
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "crearEmpleado")
    public String crearEmpleado(Empelado empleado){
        return empleadoFacadeLocal.crearEmpleado(empleado);
    }
    
    @WebMethod(operationName = "editarEmpleado")
    public String editarEmpleado(Empelado empleado){
        return empleadoFacadeLocal.editarEmpleado(empleado);
    }

    @WebMethod(operationName = "eliminarEmpleado")
    public String eliminarEmpleado(Empelado empleado){
        return empleadoFacadeLocal.eliminarEmpleado(empleado);
    }

    @WebMethod(operationName = "listarEmpleados")
    public List<Empelado> listarEmpleados(){
        return empleadoFacadeLocal.listarEmpleados();
    }
    
    
    
}
