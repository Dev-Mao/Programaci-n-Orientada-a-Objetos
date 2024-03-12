package com.mycompany.ejercicio10;

public class Estudiante {
     private final int numeroInscripcion;
    private final String nombres;
    private final double patrimonio;
    private final int estratoSocial;

    public Estudiante(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }
}

