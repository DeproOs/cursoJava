import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("ingrese un número: ");
            a[i] = s.nextInt();
        }

        System.out.println("\r\nIngrese un número a buscar: ");
        int num = s.nextInt();

        int indice = -1;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == num){
                indice = i;
            }
        }

        if(indice == -1){
            System.out.println("no se encuentra el numero ingresado");
        }else{
            System.out.println("encontrado en la posición :" + indice);
        }
    }
}
