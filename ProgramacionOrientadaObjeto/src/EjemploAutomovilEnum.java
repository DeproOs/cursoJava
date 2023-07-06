public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("subaru", "Impresa");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo desc. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("El automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("El automovil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("El automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("El automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("El automovil mediano");
            case STATION_WAGON -> System.out.println("El automovil mas grande, con maleta grande...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta : tipos) {
            System.out.println(ta + " => " + ta.name() + ", " + ta.getNombre() + ", " + ta.getDescripcion() + ", " + ta.getNumoeroPuertas());
        }

    }
}
