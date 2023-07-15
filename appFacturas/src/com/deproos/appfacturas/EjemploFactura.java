package com.deproos.appfacturas;

import com.deproos.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNumeroFiscal("5555-5");
        cliente.setNombre("Claudio");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        System.out.println();
        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese el nombre del producto N° " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura( new ItemFactura( s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura);
    }
}
