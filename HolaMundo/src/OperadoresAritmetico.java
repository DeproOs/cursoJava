import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        int suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j  = " +  (i - j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int divicion = i / j;
        float divicion2 = (float) i / (float) j;
        System.out.println("divicion = " + divicion);
        System.out.println("divicion2 = " + divicion2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("numero = " + numero + " es par");
        }else{
            System.out.println("numero = " + numero + " es in-par");
        }

    }
}
