public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru", "Impreza");

        auto.setCilindrada( 2.0 );
        auto.setColor( "rojo" );

        System.out.println(auto.detalle());
        System.out.println(auto.acelerar(150));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(300));

        System.out.println();

        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 60));
    }
}
