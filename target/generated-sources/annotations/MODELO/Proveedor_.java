package MODELO;

import MODELO.Contrato;
import MODELO.Envio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-24T17:20:13", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, Long> CUIT;
    public static volatile SingularAttribute<Proveedor, String> correo_electronico;
    public static volatile SingularAttribute<Proveedor, Integer> rendimiento;
    public static volatile SingularAttribute<Proveedor, String> categoria;
    public static volatile SingularAttribute<Proveedor, String> razon_social;
    public static volatile Lipackage MODELO;

import MODELO.Contrato;
import MODELO.Envio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-24T17:20:13", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, Long> CUIT;
    public static volatile SingularAttribute<Proveedor, String> correo_electronico;
    public static volatile SingularAttribute<Proveedor, Integer> rendimiento;
    public static volatile SingularAttribute<Proveedor, String> categoria;
    public static volatile SingularAttribute<Proveedor, String> razon_social;
    public static volatile ListAttribute<Proveedor, Contrato> contratos;
    public static volatile SingularAttribute<Proveedor, Integer> id;
    public static volatile SingularAttribute<Proveedor, Long> telefono;
    public static volatile ListAttribute<Proveedor, Envio> envios;

}