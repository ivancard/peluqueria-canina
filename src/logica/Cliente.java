package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String numCliente;
    private String nombreMascota;
    private String razaMascota;
    private String colorMascota;
    private Boolean esAlergico;
    private Boolean atencionEscpecial ;
    private String nombreDuenio;
    private String telefonoDuenio;
    private String observaciones;

    public Cliente() {
    }

    public Cliente( String numCliente, String nombreMascota, String razaMascota, String colorMascota, Boolean esAlergico, Boolean atencionEscpecial, String nombreDuenio, String telefonoDuenio, String observaciones) {
        
        this.numCliente = numCliente;
        this.nombreMascota = nombreMascota;
        this.razaMascota = razaMascota;
        this.colorMascota = colorMascota;
        this.esAlergico = esAlergico;
        this.atencionEscpecial = atencionEscpecial;
        this.nombreDuenio = nombreDuenio;
        this.telefonoDuenio = telefonoDuenio;
        this.observaciones = observaciones;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRazaMascota() {
        return razaMascota;
    }

    public void setRazaMascota(String razaMascota) {
        this.razaMascota = razaMascota;
    }

    public String getColorMascota() {
        return colorMascota;
    }

    public void setColorMascota(String colorMascota) {
        this.colorMascota = colorMascota;
    }

    public Boolean getEsAlergico() {
        return esAlergico;
    }

    public void setEsAlergico(Boolean esAlergico) {
        this.esAlergico = esAlergico;
    }

    public Boolean getAtencionEscpecial() {
        return atencionEscpecial;
    }

    public void setAtencionEscpecial(Boolean atencionEscpecial) {
        this.atencionEscpecial = atencionEscpecial;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getTelefonoDuenio() {
        return telefonoDuenio;
    }

    public void setTelefonoDuenio(String telefonoDuenio) {
        this.telefonoDuenio = telefonoDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", numCliente=" + numCliente + ", nombreMascota=" + nombreMascota + ", razaMascota=" + razaMascota + ", colorMascota=" + colorMascota + ", esAlergico=" + esAlergico + ", atencionEscpecial=" + atencionEscpecial + ", nombreDuenio=" + nombreDuenio + ", telefonoDuenio=" + telefonoDuenio + ", observaciones=" + observaciones + '}';
    }
    
    
    
}
