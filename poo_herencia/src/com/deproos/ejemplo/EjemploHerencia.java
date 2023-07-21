package com.deproos.ejemplo;

import com.deproos.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("------------- Creando la instancia de la clase alumno -------------");
        Alumno alumno = new Alumno();
        alumno.setNombre("Claudio");
        alumno.setApellido("Alvarez");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaMatematica(6.3);
        alumno.setNotaHistoria(4.9);

        System.out.println("------------- Creando la instancia de la clase alumno internacional -------------");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaMatematica(5.8);
        alumnoInt.setNotaHistoria(6.5);
        alumnoInt.setNotaIdiomas(6.8);

        System.out.println("------------- Creando la instancia de la clase profesor -------------");
        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Matematicas");

        System.out.println("-------------   -------------");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getInstitucion());
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + alumnoInt.getInstitucion() + " " + alumnoInt.getPais());
        System.out.println("Profesor de " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
