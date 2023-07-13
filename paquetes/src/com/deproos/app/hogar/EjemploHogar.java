package com.deproos.app.hogar;

import com.deproos.app.jardin.Perro;

import static com.deproos.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
