public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadEstanque = 40;

    private TipoAutomovil tipo;

    private static String colorPatente = "Naranja";
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 50;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO= "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante) {
        this();
        this.fabricante = fabricante;
    }

    public Automovil(String fabricante, String modelo) {
        this(fabricante);
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String detalle() {
        return "auto.modelo = " + this.modelo +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.color = " + this.color +
                "\nauto.colorPatente = " + Automovil.colorPatente +
                "\nauto.cilindrada = " + this.cilindrada+
                "\nauto.id = " + this.id +
                "\nauto.tipo = "+ this.getTipo().getDescripcion();
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm.";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " a frenado!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadEstanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadEstanque * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Automovil)) {
            return false;
        }

        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id='" + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}
