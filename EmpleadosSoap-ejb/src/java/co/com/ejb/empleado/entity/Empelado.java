/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ejb.empleado.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "EMPELADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empelado.findAll", query = "SELECT e FROM Empelado e")
    , @NamedQuery(name = "Empelado.findByIdEmpleado", query = "SELECT e FROM Empelado e WHERE e.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "Empelado.findByNombres", query = "SELECT e FROM Empelado e WHERE e.nombres = :nombres")
    , @NamedQuery(name = "Empelado.findByApellidos", query = "SELECT e FROM Empelado e WHERE e.apellidos = :apellidos")
    , @NamedQuery(name = "Empelado.findByTipoDocumento", query = "SELECT e FROM Empelado e WHERE e.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "Empelado.findByFechaNacimiento", query = "SELECT e FROM Empelado e WHERE e.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Empelado.findByFechaVinculacion", query = "SELECT e FROM Empelado e WHERE e.fechaVinculacion = :fechaVinculacion")
    , @NamedQuery(name = "Empelado.findByCargo", query = "SELECT e FROM Empelado e WHERE e.cargo = :cargo")
    , @NamedQuery(name = "Empelado.findBySalario", query = "SELECT e FROM Empelado e WHERE e.salario = :salario")})
public class Empelado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EMPLEADO")
    private Integer idEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRES")
    private String nombres;
    @Size(max = 50)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Size(max = 5)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "FECHA_VINCULACION")
    @Temporal(TemporalType.DATE)
    private Date fechaVinculacion;
    @Size(max = 50)
    @Column(name = "CARGO")
    private String cargo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALARIO")
    private Double salario;

    public Empelado() {
    }

    public Empelado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empelado(Integer idEmpleado, String nombres) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empelado)) {
            return false;
        }
        Empelado other = (Empelado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.ejb.empleado.entity.Empelado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
