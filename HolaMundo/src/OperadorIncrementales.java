public class OperadorIncrementales {
    public static void main(String[] args) {

        //pre incremento
        int i= 1;
        int j= ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();
        //post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();
        //pre decremento
        i = 3;
        j = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();
        //post decremento
        i = 4;
        j = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();
        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++));
        System.out.println("j = " + j);
    }
}
