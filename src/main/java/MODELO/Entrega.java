/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Lenovo
 */
@Entity
public class Entrega implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long numeroSeguimiento;
    private LocalDate fecha;
    private String destino;
    private String estado;

    public Entrega() {
    }

    public Entrega(long numeroSeguimiento, LocalDate fecha, String destino, String estado) {
        this.numeroSeguimiento = numeroSeguimiento;
        this.fecha = fecha;
        this.destino = destino;
        this.estado = estado;
    }

    public long getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(long numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDestino() {
        retu/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Lenovo
 */
@Entity
public class Entrega implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long numeroSeguimiento;
    private LocalDate fecha;
    private String destino;
    private String estado;

    public Entrega() {
    }

    public Entrega(long numeroSeguimiento, LocalDate fecha, String destino, String estado) {
        this.numeroSeguimiento = numeroSeguimiento;
        this.fecha = fecha;
        this.destino = destino;
        this.estado = estado;
    }

    public long getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(long numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
