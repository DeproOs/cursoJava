package com.deproos.app;

import com.deproos.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.nombre = "andres";

        System.out.println(persona.nombre);

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";
    }
}
