import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        String[] productos = {"Kingstone Pendrive 64GB","Samsung Galaxy", "Disco Duro SSD Samsung Externo","Asus Notebook", "Mackbook Air","Chromecast 4ta generación","Bicicleta Oxford"};

        Arrays.sort(productos);

        System.out.println("-----usando for-------");

        for(int i =0; i < productos.length; i++){
            System.out.println("para indice "+ i + " : "+ productos[i]);
        }

      /*  for (int i=0 ; i < productos.length / 2 ; i++){
            String actual = productos[i];
            String inverso = productos[productos.length - 1 -i];
            productos[i] = inverso;
            productos[productos.length - 1 -i] = actual;
        }*/

        Collections.reverse(Arrays.asList(productos));

        System.out.println("-----usando for-------");

        for(int i =0; i < productos.length; i++){
            System.out.println("para indice "+ i + " : "+ productos[i]);
        }
    }
}
