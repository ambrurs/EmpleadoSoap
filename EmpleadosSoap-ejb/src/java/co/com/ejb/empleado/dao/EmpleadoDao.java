/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ejb.empleado.dao;

import co.com.ejb.empleado.entity.Empelado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author USUARIO
 */
public class EmpleadoDao {
    
    private EntityManager em;

    public EmpleadoDao(EntityManager em) {
        this.em = em;
    }
    
    public void crearEmpleado(Empelado empleado){
        this.em.persist(empleado);
    }
    
    public void editarEmpleado(Empelado empleado){
        this.em.merge(empleado);
    }
    
    public void eliminarEmpleado(Empelado empleado){
        this.em.remove(this.em.merge(empleado));
    }
    
    public List<Empelado> listarEmpleados(){
        Query query = this.em.createNamedQuery("Empleado.findAll");
        return (List<Empelado>) query.getResultList();
    }
    
}
