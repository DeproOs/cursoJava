import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"Kingstone Pendrive 64GB","Samsung Galaxy", "Disco Duro SSD Samsung Externo","Asus Notebook", "Mackbook Air","Chromecast 4ta generación","Bicicleta Oxford"};

        sortBurbuja(productos);

        System.out.println("-----usando for-------");

        for(int i =0; i < productos.length; i++){
            System.out.println("para indice "+ i + " : "+ productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for(int i =0; i < numeros.length; i++){
            System.out.println("para indice "+ i + " : "+ numeros[i]);
        }

    }

    public static void sortBurbuja(Object[] arreglo){
        for(int i =0; i < arreglo.length - 1 ; i++){

            for (int j = 0; j < (arreglo.length - 1 - i); j++){
                if( ((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }

        }
    }
}
