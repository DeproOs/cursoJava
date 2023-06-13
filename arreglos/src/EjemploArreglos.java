import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingstone Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        Arrays.sort(numeros);

        int i  = numeros[0];
        int j  = numeros[1];
        int k  = numeros[2];
        int l  = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}

