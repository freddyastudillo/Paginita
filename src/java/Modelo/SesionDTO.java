/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class SesionDTO {
    private String correo;
    private String clave;
    private String nombre;
    private String tel;

    public SesionDTO(String correo, String clave, String nombre, String tel) {
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.tel = tel;
    }
    
     public SesionDTO(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }
     
    public SesionDTO() {
    
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.correo);
        hash = 23 * hash + Objects.hashCode(this.clave);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.tel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SesionDTO other = (SesionDTO) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.tel, other.tel);
    }


    
    
    
}
