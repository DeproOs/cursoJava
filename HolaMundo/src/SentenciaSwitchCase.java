import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes");
        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1 :
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }

        System.out.println("nombreMes = " + nombreMes);

        char num = '3';

        switch(num){
            case '0':
                System.out.println("el numero es cero");
                break;
            case '1':
                System.out.println("el numero es uno");
                break;
            case '2':
                System.out.println("el numero es dos");
                break;
            case '3':
                System.out.println("el numero es tres");
                break;
            case 'a':
                System.out.println("el caracter es a");
            default:
                System.out.println("número o caracter desconocido");
        }

        String nombre = "andres";

        switch (nombre){
            case "admin":
                System.out.println("hola admin, bienvenido!");
                break;
            case "andres":
                System.out.println("hola andres!");
                break;
            case "pepe":
                System.out.println("hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido!");
        }
    }
}
