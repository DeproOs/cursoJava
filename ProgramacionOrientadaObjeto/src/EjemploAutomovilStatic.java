public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan2.setTipo(TipoAutomovil.HATCHBACK);

        Automovil.setColorPatente("azul");

        System.out.println(nissan2.detalle());

        System.out.println();

        System.out.println("Kilómetros por litros " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println(nissan2);

        System.out.println();

        System.out.println("velocidad maxima de la carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("velocidad maxima de la ciudad = " +Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}
