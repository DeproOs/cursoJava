public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabular = '\t';
        char nuevaLinea = '\n';
        char retroCarro = '\r';

        System.out.println();
        System.out.println("char corresponde en byte a:" + retroCarro + Character.BYTES);
        System.out.println("char corresponde en bites a = " + Character.SIZE);
        System.out.println("char valor para float = " + Character.MIN_VALUE);
        System.out.println("char valor para float = " + Character.MAX_VALUE);
    }
}
