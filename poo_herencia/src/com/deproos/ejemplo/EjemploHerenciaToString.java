package com.deproos.ejemplo;

import com.deproos.pooherencia.Alumno;
import com.deproos.pooherencia.AlumnoInternacional;
import com.deproos.pooherencia.Persona;
import com.deproos.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("------------- Creando la instancia de la clase alumno -------------");
        Alumno alumno = new Alumno("Claudio", "Alvarez", 16, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaMatematica(6.3);
        alumno.setNotaHistoria(4.9);
        alumno.setEmail("claudio@correo.cl");

        System.out.println("------------- Creando la instancia de la clase alumno internacional -------------");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaMatematica(5.8);
        alumnoInt.setNotaHistoria(6.5);
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setEmail("peter@correo.cl");

        System.out.println("------------- Creando la instancia de la clase profesor -------------");
        Profesor profesor = new Profesor("Andres", "Guzman", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@colegio.com");

        System.out.println("-------------   -------------");
        impirimir(alumno);
        System.out.println();
        impirimir(alumnoInt);
        System.out.println();
        impirimir(profesor);
    }

    public static void impirimir(Persona persona) {
        System.out.println(persona);
    }
}
