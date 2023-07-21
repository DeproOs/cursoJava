package com.deproos.pooherencia;

public class AlumnoInternacional extends Alumno{
    private  String pais;
    private  double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("Alumno Internacional: inicializando constructor...");
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
}
