import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "DeproOs";
        passwords[0] = "123456";

        usernames[1] = "admin";
        passwords[1] = "123456";

        usernames[2] = "Claudio";
        passwords[2] = "123456";*/

        String[] usernames = {"DeproOs", "admin", "Claudio"};
        String[] passwords = {"123456", "123456", "123456"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String u = scanner.next();

        System.out.println("Ingrese el password");

        String p = scanner.next();

        boolean esAutoticado = false;

        for ( int i = 0; i < usernames.length; i++){
            if(u.equals(usernames[i]) && p.equals(passwords[i])){
                esAutoticado = true;
                break;
            }
        }

        if(esAutoticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Username o password incorrectos!");
            System.out.println("Lo siento, requiere autenticación");
            main(args);
        }

    }
}
