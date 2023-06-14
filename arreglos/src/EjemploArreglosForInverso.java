import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        /*String[] productos = new String[7];

        productos[0] = "Kingstone Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Mackbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";*/

        String[] productos = {"Kingstone Pendrive 64GB","Samsung Galaxy", "Disco Duro SSD Samsung Externo","Asus Notebook", "Mackbook Air","Chromecast 4ta generación","Bicicleta Oxford"};

        Arrays.sort(productos);

        System.out.println("-----usando for-------");

        for(int i =0; i < productos.length; i++){
            System.out.println("para indice "+ i + " : "+ productos[i]);
        }

        System.out.println("-----usando for Inverso-------");

        for (int i=0; i < productos.length; i++){
            System.out.println("para i = "+ (productos.length - 1 - i) + " valor: "+ productos[(productos.length - 1 - i)]);
        }

        System.out.println("-----usando for Inverso 2 -------");

        for (int i= productos.length - 1 ; i >= 0 ; i--){
            System.out.println("para i = "+ ( i) + " valor: "+ productos[i]);
        }
    }
}
