public class PrimitivosFloat {
    public static void main(String[] args) {


        float realFloat = 1.5e-10F;//1.5e4F;//2.12e3F;//2120F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        System.out.println();
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("double valor para float = " + Double.MAX_VALUE);
        System.out.println("double valor para float = " + Double.MIN_VALUE);

        System.out.println();
        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
