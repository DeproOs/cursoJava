import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(s.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fechaActual = new Date();

            if (fecha.after(fechaActual)){
                System.out.println("Fecha del usuario es después que fecha actual");
            } else if (fecha.before(fechaActual)) {
                System.out.println("Fecha del usuario es anterior que fecha actual");
            } else if (fecha.equals(fechaActual)){
                System.out.println("Fecha del usuario es igual que fecha actual");
            }

            if(fecha.compareTo(fechaActual) > 0){
                System.out.println("Fecha del usuario es después que fecha actual");
            } else if(fecha.compareTo(fechaActual) < 0){
                System.out.println("Fecha del usuario es anterior que fecha actual");
            } else if(fecha.compareTo(fechaActual) == 0){
                System.out.println("Fecha del usuario es igual que fecha actual");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
