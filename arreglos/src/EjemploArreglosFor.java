import java.util.Arrays;

public class EjemploArreglosFor {
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

        System.out.println("-----usando for-------");

        for(int i =0; i < productos.length; i++){
            System.out.println("para indice "+ i + " : "+ productos[i]);
        }

        System.out.println("-----usando foreach-------");

        for (String prod:
             productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("-----usando while-------");
        int i =0;
        while ( i < productos.length){
            System.out.println("para indice "+ i + " : "+ productos[i]);
            i++;
        }

        System.out.println("-----usando do while-------");
        int j =0;
        do{
            System.out.println("para indice "+ j + " : "+ productos[j]);
            j++;
        }while ( j < productos.length);

        System.out.println("-----iterando numeros-------");

        int[] numeros = new int[10];

        for(int k = 0 ; k < numeros.length; k++){
            numeros[k] = k * 3;
        }

        for(int k = 0 ; k < numeros.length; k++){
            System.out.println("para indice "+ k + " : "+ numeros[k]);
        }

    }
}
