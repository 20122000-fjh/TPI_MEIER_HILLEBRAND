package VISTA;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class VistaRegistroCliente extends JFrame {
    private JTextField txtDni, txtNombre, txtApellido, txtTelefono, txtCorreo, txtDireccion, txtUsuario, txtContraseña;
    public JButton btnRegistrar, btnVolver;
    
    public VistaRegistroCliente(){
        setTitle("Registro de Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        txtDni = new JTextField(10);
        txtNombre = new JTextField(10);
        txtApellido = new JTextField(10);
        txtTelefono = new JTextField(10);
        txtCorreo = new JTextField(10);
        txtDireccion = new JTextField(10);
        txtUsuario = new JTextField(10);
        txtContraseña = new JTextField(10);
        btnRegistrar = new JButton("Registrar");
        btnVolver = new JButton("Volver");

        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5)); // 0 filas para que se ajuste automáticamente, 2 columnas, con espacio entre celdas de 10 píxeles

        panel.add(new JLabel("DNI:"));
        panel.add(txtDni);
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Apellido:"));
        panel.add(txtApellido);
        panel.add(new JLabel("Teléfono:"));
        panel.add(txtTelefono);
        panel.add(new JLabel("Correo:"));
        panel.add(txtCorreo);
        panel.add(new JLabel("Dirección:"));
        panel.add(txtDireccion);
        panel.add(new JLabel("Usuario:"));
        panel.add(txtUsuario);
        panel.add(new JLabel("Contraseña:"));
        panel.add(txtContraseña);

        // Agregar panel al BorderLayout.CENTER para que se expanda
        add(panel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.X_AXIS));
        btnPanel.add(btnRegistrar);
        btnPanel.add(btnVolver);
        add(btnPanel, BorderLayout.SOUTH);
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public void setTxtDni(JTextField txtDni) {
        this.txtDni = txtDni;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JTextField getTxtContraseña() {
        return txtContraseña;
    }

    public void setTxtContraseña(JTextField txtContraseña) {
        this.txtContraseña = txtContraseña;
    }
    
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               package VISTA;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class VistaRegistroCliente extends JFrame {
    private JTextField txtDni, txtNombre, txtApellido, txtTelefono, txtCorreo, txtDireccion, txtUsuario, txtContraseña;
    public JButton btnRegistrar, btnVolver;
    
    public VistaRegistroCliente(){
        setTitle("Registro de Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        txtDni = new JTextField(10);
        txtNombre = new JTextField(10);
        txtApellido = new JTextField(10);
        txtTelefono = new JTextField(10);
        txtCorreo = new JTextField(10);
        txtDireccion = new JTextField(10);
        txtUsuario = new JTextField(10);
        txtContraseña = new JTextField(10);
        btnRegistrar = new JButton("Registrar");
        btnVolver = new JButton("Volver");

        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5)); // 0 filas para que se ajuste automáticamente, 2 columnas, con espacio entre celdas de 10 píxeles

        panel.add(new JLabel("DNI:"));
        panel.add(txtDni);
        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Apellido:"));
        panel.add(txtApellido);
        panel.add(new JLabel("Teléfono:"));
        panel.add(txtTelefono);
        panel.add(new JLabel("Correo:"));
        panel.add(txtCorreo);
        panel.add(new JLabel("Dirección:"));
        panel.add(txtDireccion);
        panel.add(new JLabel("Usuario:"));
        panel.add(txtUsuario);
        panel.add(new JLabel("Contraseña:"));
        panel.add(txtContraseña);

        // Agregar panel al BorderLayout.CENTER para que se expanda
        add(panel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.X_AXIS));
        btnPanel.add(btnRegistrar);
        btnPanel.add(btnVolver);
        add(btnPanel, BorderLayout.SOUTH);
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    public void setTxtDni(JTextField txtDni) {
        this.txtDni = txtDni;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JTextField getTxtContraseña() {
        return txtContraseña;
    }

    public void setTxtContraseña(JTextField txtContraseña) {
        this.txtContraseña = txtContraseña;
    }
    
}