import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matemáticas:");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia:");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje:");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }


        for (int i = 0; i < claseMatematicas.length; i++) {
             sumNotasMatematicas += claseMatematicas[i];
             sumNotasHistoria += claseHistoria[i];
             sumNotasLenguaje += claseLenguaje[i];
        }


        double promedioMatematicas = sumNotasMatematicas / claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria / claseHistoria.length;
        double promedioLenguaje = sumNotasLenguaje / claseLenguaje.length;

        System.out.println("Promedio clase matemáticas: " + promedioMatematicas);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);

        System.out.println("Promedio total del curso: "+ (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3);

        System.out.println("Ingrese el identificador del alumno (de 1 - 7):");
        int id = s.nextInt() - 1;

        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;

        System.out.println("el promedio del alumno con el id " + (id + 1) + " es el siguiente: "+ promedioAlumno);
    }
}
