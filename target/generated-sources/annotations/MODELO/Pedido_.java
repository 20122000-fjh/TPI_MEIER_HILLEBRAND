package MODELO;

import MODELO.Cliente;
import MODELO.MetodoDePago;
import MODELO.Producto;
import MODELO.Transportista;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-24T17:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, MetodoDePago> metodoDePago;
    public static volatile package MODELO;

import MODELO.Cliente;
import MODELO.MetodoDePago;
import MODELO.Producto;
import MODELO.Transportista;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-24T17:20:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, MetodoDePago> metodoDePago;
    public static volatile SingularAttribute<Pedido, Long> codigo;
    public static volatile SingularAttribute<Pedido, String> estado;
    public static volatile SingularAttribute<Pedido, Transportista> transportista;
    public static volatile SingularAttribute<Pedido, Integer> id_centrodistribucion;
    public static volatile SingularAttribute<Pedido, LocalDate> fechaEntrega;
    public static volatile SingularAttribute<Pedido, LocalDate> fechaCreacion;
    public static volatile SingularAttribute<Pedido, String> destino;
    public static volatile ListAttribute<Pedido, Cliente> clientes;
    public static volatile ListAttribute<Pedido, Producto> productos;

}