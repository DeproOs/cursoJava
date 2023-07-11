public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgón", "Auto utilitario", 4),
    SUV("SUV", "Todo terreno deprotivo", 5);

    private final String nombre;
    private final String descripcion;
    private final int numoeroPuertas;

    TipoAutomovil(String nombre, String descripcion, int numoeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numoeroPuertas = numoeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumoeroPuertas() {
        return numoeroPuertas;
    }
}
