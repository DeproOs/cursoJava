public class SentenciaSwitchCase {
    public static void main(String[] args) {

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
