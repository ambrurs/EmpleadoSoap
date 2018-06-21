package co.com.ejb.empleado.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-19T22:28:58")
@StaticMetamodel(Empelado.class)
public class Empelado_ { 

    public static volatile SingularAttribute<Empelado, String> apellidos;
    public static volatile SingularAttribute<Empelado, String> tipoDocumento;
    public static volatile SingularAttribute<Empelado, Date> fechaVinculacion;
    public static volatile SingularAttribute<Empelado, Integer> idEmpleado;
    public static volatile SingularAttribute<Empelado, Date> fechaNacimiento;
    public static volatile SingularAttribute<Empelado, Double> salario;
    public static volatile SingularAttribute<Empelado, String> cargo;
    public static volatile SingularAttribute<Empelado, String> nombres;

}