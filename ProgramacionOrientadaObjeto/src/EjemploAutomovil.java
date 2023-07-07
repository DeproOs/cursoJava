public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru", "Impreza");

        auto.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        auto.setEstanque(new Estanque());
        auto.setColor( Color.ROJO );
        auto.setTipo(TipoAutomovil.PICKUP);

        System.out.println(auto.detalle());
        System.out.println(auto.acelerar(150));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(300));

        System.out.println();

        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 60));


        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL), new Estanque());

        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales? " + (nissan.equals(nissan2)));

        System.out.println();
        System.out.println(nissan2);
    }
}
