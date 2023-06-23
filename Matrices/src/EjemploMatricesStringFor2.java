public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = { {"pepe", "pepa"}, {"josefa","Paco"}, { "lucas","Pancha"} };

        System.out.println("iterando for each:-------------------------------------------------");

        for (String[] fila: nombres) {

            for (String nombre: fila) {

                System.out.print(nombre + "\t");
            }

            System.out.println();

        }
    }
}
