public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.cilindrada = 2.0;
        auto.color = "rojo";
        auto.fabricante = "Subaru";
        auto.modelo = "Impreza";

        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);
    }
}
