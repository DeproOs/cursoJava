package com.deproos.app.jardin;

import com.deproos.app.hogar.*;
import static com.deproos.app.hogar.Persona.saludar;
import static com.deproos.app.hogar.Persona.GENERO_FEMENINO;
import static com.deproos.app.hogar.Persona.*;
import static com.deproos.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Claudio");
        persona.setApellido("Alvarez");
        persona.setColorPelo(NEGRO);

        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;

        String generoHombre = GENERO_MASCULINO;
    }
}
