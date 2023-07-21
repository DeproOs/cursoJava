package com.deproos.poosobrecarga;
import static com.deproos.poosobrecarga.Calculadora.*;
public class EjemploSobrecarga{
    public static void main(String[] args) {

        System.out.println("sumar int : " + sumar(10, 5));
        System.out.println("sumar float : " + sumar(10.0f, 5f));
        System.out.println("sumar float-int : " + sumar(10f , 5));
        System.out.println("sumar int-float : " + sumar(10, 5.0f));
        System.out.println("sumar double : " + sumar(10.0 ,5.0));
        System.out.println("sumar string : " + sumar("10", "5"));
        System.out.println("sumar 3 int : " + sumar(10, 5, 3));
        System.out.println("sumar x int : " + sumar(10, 5, 3, 5, 6, 8, 95, 102));
        System.out.println("sumar float + x int : " + sumar(10.5F, 5, 3, 5, 6, 8, 95, 102));
        System.out.println("sumar 3 double : " + sumar(10.5, 5.5, 3.5));

        System.out.println();
        System.out.println("suma Long : " + sumar(10L, 5L));
        System.out.println("suma int : " + sumar(10, '@'));
        System.out.println("sumar float-int : " + sumar(10F, '@'));
    }
}
