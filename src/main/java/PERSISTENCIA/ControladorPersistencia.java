
package PERSISTENCIA;

import MODELO.Cliente;
import PERSISTENCIA.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorPersistencia {
    AlmacenJpaController almacenJpa = new AlmacenJpaController();
    CentroDeDistribucionJpaController centroDeDistribucionJpa = new CentroDeDistribucionJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    ContratoJpaController contratoJpa = new ContratoJpaController();
    DescargaJpaController descargaJpa = new DescargaJpaController();
    EntregaJpaController entregaJpa = new EntregaJpaController();
    EnvioJpaController envioJpa = new EnvioJpaController();
    MetodoDePagoJpaController metodoDePagoJpa = new MetodoDePagoJpaController();
    OrdenDeCompraJpaController ordenDeCompraJpa = new OrdenDeCompraJpaController();
    PedidoJpaController pedidoJpa = new PedidoJpaController();
    ProductoJpaController productoJpa = new ProductoJpaController();
    ProveedorJpaController proveedorJpa = new ProveedorJpaController();
    TransportistaJpaController transportistaJpa = new TransportistaJpaController();
    UbicacionDeAlmacenamientoJpaController ubicacionDeAlmacenamientoJpa = new UbicacionDeAlmacenamientoJpaController(); 
    
    public void crearCliente(Cliente cliente){
        try {
            clienteJpa.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void borrarCliente(int id){
        try {
            clienteJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
package PERSISTENCIA;

import MODELO.Cliente;
import PERSISTENCIA.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorPersistencia {
    AlmacenJpaController almacenJpa = new AlmacenJpaController();
    CentroDeDistribucionJpaController centroDeDistribucionJpa = new CentroDeDistribucionJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();
    ContratoJpaController contratoJpa = new ContratoJpaController();
    DescargaJpaController descargaJpa = new DescargaJpaController();
    EntregaJpaController entregaJpa = new EntregaJpaController();
    EnvioJpaController envioJpa = new EnvioJpaController();
    MetodoDePagoJpaController metodoDePagoJpa = new MetodoDePagoJpaController();
    OrdenDeCompraJpaController ordenDeCompraJpa = new OrdenDeCompraJpaController();
    PedidoJpaController pedidoJpa = new PedidoJpaController();
    ProductoJpaController productoJpa = new ProductoJpaController();
    ProveedorJpaController proveedorJpa = new ProveedorJpaController();
    TransportistaJpaController transportistaJpa = new TransportistaJpaController();
    UbicacionDeAlmacenamientoJpaController ubicacionDeAlmacenamientoJpa = new UbicacionDeAlmacenamientoJpaController(); 
    
    public void crearCliente(Cliente cliente){
        try {
            clienteJpa.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void borrarCliente(int id){
        try {
            clienteJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
