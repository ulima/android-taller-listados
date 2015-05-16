package pe.edu.ulima.layoutsapp;

import java.util.ArrayList;
import java.util.List;

public class GestorPersonas {

    private static GestorPersonas gestor = null;

    public static GestorPersonas getInstance(){
        if (gestor == null){
            gestor = new GestorPersonas();
        }
        return gestor;
    }

    private GestorPersonas(){}

    public List<Persona> obtenerPersonas(){
        List<Persona> personas =
                new ArrayList<>();
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        personas.add(persona);

        persona = new Persona();
        persona.setNombre("Luis");
        persona.setApellido("Lopez");
        personas.add(persona);

        return personas;
    }
}
