package com.deproos.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{

    private String mensaje = "el formato del email inválido";

    private final static String EMAIL_REGEX = "^(.+)@(.+)&";
    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
