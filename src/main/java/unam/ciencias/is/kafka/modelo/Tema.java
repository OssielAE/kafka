package unam.ciencias.is.kafka.modelo;
// Generated 17/03/2018 02:05:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tema generated by hbm2java
 */
public class Tema  implements java.io.Serializable {


     private int idTema;
     private Usuario usuario;
     private String nombreTema;
     private String descripcion;
     private Set respondes = new HashSet(0);
     private Set temaTags = new HashSet(0);

    public Tema() {
    }

	
    public Tema(int idTema, Usuario usuario, String nombreTema, String descripcion) {
        this.idTema = idTema;
        this.usuario = usuario;
        this.nombreTema = nombreTema;
        this.descripcion = descripcion;
    }
    public Tema(int idTema, Usuario usuario, String nombreTema, String descripcion, Set respondes, Set temaTags) {
       this.idTema = idTema;
       this.usuario = usuario;
       this.nombreTema = nombreTema;
       this.descripcion = descripcion;
       this.respondes = respondes;
       this.temaTags = temaTags;
    }
   
    public int getIdTema() {
        return this.idTema;
    }
    
    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombreTema() {
        return this.nombreTema;
    }
    
    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getRespondes() {
        return this.respondes;
    }
    
    public void setRespondes(Set respondes) {
        this.respondes = respondes;
    }
    public Set getTemaTags() {
        return this.temaTags;
    }
    
    public void setTemaTags(Set temaTags) {
        this.temaTags = temaTags;
    }




}


