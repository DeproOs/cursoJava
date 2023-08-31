package com.deproos.pooclasesabstractas.form;

import com.deproos.pooclasesabstractas.form.elementos.ElementoForm;
import com.deproos.pooclasesabstractas.form.elementos.*;
import com.deproos.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experencia = new TextareaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");

        lenguaje.addOpcion(new Opcion("1","java"))
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript").setSelected())
                .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludar") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" + this.nombre + "' value='" + this.valor + "'>";
            }
        };

        saludar.setValor("Hola que tal esta campo esta deshabilitado!");
        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experencia.setValor("... más de 10 años de experencia ...");

        List<ElementoForm> elementos = Arrays.asList(username, password, email, edad, experencia, lenguaje, saludar);

        elementos.forEach( e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }
}
