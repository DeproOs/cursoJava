import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencia = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingres la nota de matemáticas entre 2.0 a 7.0:");
        matematicas = s.nextDouble();

        System.out.println("Ingres la nota de ciencia entre 2.0 a 7.0:");
        ciencia = s.nextDouble();

        System.out.println("Ingres la nota de historia entre 2.0 a 7.0:");
        historia = s.nextDouble();

        promedio = (matematicas + historia + ciencia) / 3 ;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49? "aprobado" : "rechazado";
        System.out.println("estado = " + estado);


    }
}
