package com.deproos.pooclasesabstractas.form.elementos;

public class InoutForm extends ElementoForm{

    private String tipo = "text";

    public InoutForm(String nombre) {
        super(nombre);
    }

    public InoutForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type='" + this.tipo + "' name='" + this.nombre + "' value='" + this.valor + "'/>";
    }
}
