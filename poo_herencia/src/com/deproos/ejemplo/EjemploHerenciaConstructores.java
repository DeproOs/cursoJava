package com.deproos.ejemplo;

import com.deproos.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimir los datos de tipo persona: ");
        System.out.println("nombre: " + persona.getNombre() + ", apellido: " + persona.getApellido() + ", edad: " + persona.getEdad() + ", email: " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("Imprimir los datos del tipo Alumno:");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota castellano: " + ((Alumno) persona).getNotaCastellano());
            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimir los datos del tipo Alumno Internacional: ");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println(((AlumnoInternacional) persona).getPais());
            }
            System.out.println("--------------sobre escritura promedio------------------------------");
            System.out.println("Promedio: " + ((Alumno) persona).calculaPromedio());
            System.out.println("--------------------------------------------------------------------");
        }

        if (persona instanceof Profesor){
            System.out.println("Imprimir los datos de profesor: ");
            System.out.println("asignatura: " + ((Profesor) persona).getAsignatura()    );
        }

        System.out.println("--------------sobre escritura saludar------------------------------");
        System.out.println(persona.saludar());
        System.out.println("-------------------------------------------------------------------");
    }
}
