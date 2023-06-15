import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("ingrese un nombre: ");
            a[i] = s.next();
        }

        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre = s.next();

        int indice = -1;

        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(nombre)){
                indice = i;
            }
        }

        if(indice == -1){
            System.out.println("no se encuentra el nombre ingresado");
        }else{
            System.out.println("encontrado en la posición :" + indice);
        }
    }
}
