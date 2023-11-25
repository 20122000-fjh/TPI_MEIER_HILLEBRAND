/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADORA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VISTA.*;
import MODELO.*;
import PERSISTENCIA.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fedem
 */
public class Controladora implements ActionListener{
    private VistaMenuPrincipal menuPrincipal;
    private VistaRegistroCliente registroCliente;
    private VistaBajaCliente bajaCliente;
    ControladorPersistencia controladorPersistencia = new ControladorPersistencia();

    public Controladora(VistaMenuPrincipal menuPrincipal, VistaRegistroCliente registroCliente, VistaBajaCliente bajaCliente){
        this.menuPrincipal = menuPrincipal;
        this.registroCliente = registroCliente;
        this.bajaCliente = bajaCliente;
        
        
        menuPrincipal.btnAlta.setActionCommand("MenuAlta");
        menuPrincipal.btnAlta.addActionListener(this);
        menuPrincipal.btnBaja.setActionCommand("MenuBaja");
        menuPrincipal.btnBaja.addActionListener(this);
        menuPrincipal.btnModificacion.setActionCommand("MenuModificacion");
        menuPrincipal.btnModificacion.addActionListener(this);
        
        registroCliente.btnRegistrar.setActionCommand("ClienteRegistrar");
        registroCliente.btnRegistrar.addActionListener(this);
        registroCliente.btnVolver.setActionCommand("ClienteVolver");
        registroCliente.btnVolver.addActionListener(this);
        
        bajaCliente.btnBaja.setActionCommand("BajaCliente");
        bajaCliente.btnBaja.addActionListener(this);
        bajaCliente.btnVolver.setActionCommand("BajaVolver");
        bajaCliente.btnVolver.addActionListener(this);
        
        this.menuPrincipal.setLocationRelativeTo(null);
        this.registroCliente.setLocationRelativeTo(null);
        this.bajaCliente.setLocationRelativeTo(null);
        
    }
    public void mostrarMenu(){
        this.menuPrincipal.setVisible(true);
    }
    
    public void altaCliente(Cliente cliente) throws Exception{
        
        controladorPersistencia.crearCliente(cliente);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("ClienteRegistrar".equals(e.getActionCommand()))
        {
            long dni = Long.parseLong(registroCliente.getTxtDni().getText/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADORA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import VISTA.*;
import MODELO.*;
import PERSISTENCIA.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fedem
 */
public class Controladora implements ActionListener{
    private VistaMenuPrincipal menuPrincipal;
    private VistaRegistroCliente registroCliente;
    private VistaBajaCliente bajaCliente;
    ControladorPersistencia controladorPersistencia = new ControladorPersistencia();

    public Controladora(VistaMenuPrincipal menuPrincipal, VistaRegistroCliente registroCliente, VistaBajaCliente bajaCliente){
        this.menuPrincipal = menuPrincipal;
        this.registroCliente = registroCliente;
        this.bajaCliente = bajaCliente;
        
        
        menuPrincipal.btnAlta.setActionCommand("MenuAlta");
        menuPrincipal.btnAlta.addActionListener(this);
        menuPrincipal.btnBaja.setActionCommand("MenuBaja");
        menuPrincipal.btnBaja.addActionListener(this);
        menuPrincipal.btnModificacion.setActionCommand("MenuModificacion");
        menuPrincipal.btnModificacion.addActionListener(this);
        
        registroCliente.btnRegistrar.setActionCommand("ClienteRegistrar");
        registroCliente.btnRegistrar.addActionListener(this);
        registroCliente.btnVolver.setActionCommand("ClienteVolver");
        registroCliente.btnVolver.addActionListener(this);
        
        bajaCliente.btnBaja.setActionCommand("BajaCliente");
        bajaCliente.btnBaja.addActionListener(this);
        bajaCliente.btnVolver.setActionCommand("BajaVolver");
        bajaCliente.btnVolver.addActionListener(this);
        
        this.menuPrincipal.setLocationRelativeTo(null);
        this.registroCliente.setLocationRelativeTo(null);
        this.bajaCliente.setLocationRelativeTo(null);
        
    }
    public void mostrarMenu(){
        this.menuPrincipal.setVisible(true);
    }
    
    public void altaCliente(Cliente cliente) throws Exception{
        
        controladorPersistencia.crearCliente(cliente);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("ClienteRegistrar".equals(e.getActionCommand()))
        {
            long dni = Long.parseLong(registroCliente.getTxtDni().getText());
            String nombre = registroCliente.getTxtNombre().getText();
            String apellido = registroCliente.getTxtApellido().getText();
            long telefono = Long.parseLong(registroCliente.getTxtTelefono().getText());
            String correo = registroCliente.getTxtCorreo().getText();
            String direccion = registroCliente.getTxtDireccion().getText();
            String usuario = registroCliente.getTxtUsuario().getText();
            String contraseña = registroCliente.getTxtContraseña().getText();
            LocalDate date = LocalDate.now();
            Cliente clienteAlta;
            clienteAlta = new Cliente(dni,nombre,apellido,telefono,correo,direccion,usuario,contraseña,date);
            try {
                controladorPersistencia.crearCliente(clienteAlta);
            } catch (Exception ex) {
                Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if("ClienteVolver".equals(e.getActionCommand())){
            menuPrincipal.setVisible(true);
            registroCliente.setVisible(false);
        }
        if("MenuAlta".equals(e.getActionCommand())){
            menuPrincipal.setVisible(false);
            registroCliente.setVisible(true);
        }
        if("MenuBaja".equals(e.getActionCommand())){
            menuPrincipal.setVisible(false);
            bajaCliente.setVisible(true);
        }
        if("BajaCliente".equals(e.getActionCommand())){
            int id = Integer.parseInt(bajaCliente.txtDni.getText());
            controladorPersistencia.borrarCliente(id);
        }
        if("BajaVolver".equals(e.getActionCommand())){
            menuPrincipal.setVisible(true);
            bajaCliente.setVisible(false);
        }
        
    }
}
