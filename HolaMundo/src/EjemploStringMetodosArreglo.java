public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo =  trabalenguas.toCharArray();
        int largo = arreglo.length;

        for (int i = 0; i < largo ; i++){
            System.out.println(arreglo[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int i = 0 ; i < l ; i++){
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArray = archivo.split("\\.");
        for (int i = 0 ; i <  archivoArray.length ; i++){
            System.out.println(archivoArray[i]);
        }

        System.out.println("extensión = " + archivoArray[archivoArray.length - 1]);
    }
}
