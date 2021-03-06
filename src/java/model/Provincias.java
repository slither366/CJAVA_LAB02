package model;
// Generated 11/03/2016 01:59:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Provincias generated by hbm2java
 */
public class Provincias  implements java.io.Serializable {


     private Integer idprovincia;
     private Departamentos departamentos;
     private String provincia;
     private Set distritoses = new HashSet(0);

    public Provincias() {
    }

	
    public Provincias(Departamentos departamentos, String provincia) {
        this.departamentos = departamentos;
        this.provincia = provincia;
    }
    public Provincias(Departamentos departamentos, String provincia, Set distritoses) {
       this.departamentos = departamentos;
       this.provincia = provincia;
       this.distritoses = distritoses;
    }
   
    public Integer getIdprovincia() {
        return this.idprovincia;
    }
    
    public void setIdprovincia(Integer idprovincia) {
        this.idprovincia = idprovincia;
    }
    public Departamentos getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public Set getDistritoses() {
        return this.distritoses;
    }
    
    public void setDistritoses(Set distritoses) {
        this.distritoses = distritoses;
    }




}


