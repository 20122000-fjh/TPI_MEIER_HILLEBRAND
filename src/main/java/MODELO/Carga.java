package MODELO;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carga implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private LocalDate fechaPartida;
    private String observacion;
    private String destino;
    private Almacen almacen;

    public Carga() {
    }

    public Carga(long id, LocalDate fechaPartida, String observacion, String destino,Almacen almacen) {
        this.id = id;
        this.fechaPartida = fechaPartida;
        this.observacion = observacion;
        this.destino = destino;
        this.almacen = almacen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Almacen getId_almacen() {
        return almacen;
    }

    public void setId_almacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
}
      package MODELO;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carga implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private LocalDate fechaPartida;
    private String observacion;
    private String destino;
    private Almacen almacen;

    public Carga() {
    }

    public Carga(long id, LocalDate fechaPartida, String observacion, String destino,Almacen almacen) {
        this.id = id;
        this.fechaPartida = fechaPartida;
        this.observacion = observacion;
        this.destino = destino;
        this.almacen = almacen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Almacen getId_almacen() {
        return almacen;
    }

    public void setId_almacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
}
