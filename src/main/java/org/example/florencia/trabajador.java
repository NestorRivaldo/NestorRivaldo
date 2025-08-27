package org.example.florencia;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data 
public class trabajador {
    private String nombre;
    private int edad;
    private String apellido;
    private String area;
    private char genero;

    @Override
    public String toString() {
        return "Tiene la siguiente característica:\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido;
    }
}
