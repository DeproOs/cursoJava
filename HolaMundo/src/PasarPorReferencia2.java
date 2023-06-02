class Persona{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Claudio");

        System.out.println("iniciamos el método main");

        System.out.println("persona = " + persona.getNombre());

        System.out.println("Antes de llamar al método test");

        test(persona);

        System.out.println("Después de llamar al método test");

        System.out.println("persona = " + persona.getNombre());

        System.out.println("Finaliza el método main con los datos del arreglo modificados!");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");

        persona.setNombre("juan");

        System.out.println("Finaliza el método test");
    }

}
