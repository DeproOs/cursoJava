import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {


        String numeroStr = JOptionPane.showInputDialog(null,"ingrese un número entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresa un número entero");
            main(args);
            System.exit(0);
        }



        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println();

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println();

        String resultadoOctal = "numero Octal de " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println();

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}

