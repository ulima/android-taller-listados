package pe.edu.ulima.layoutsapp;

import java.io.Serializable;

/**
 * Created by hquintana on 9/05/15.
 */
public class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
