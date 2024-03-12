package com.mycompany.ejercicio15;

public class Esfera {

    private final double pesoA;
    private final double pesoB;
    private final double pesoC;
    private final double pesoD;
    private String esferaDiferente;
    private String pesoRelativo;

    public Esfera(double pesoA, double pesoB, double pesoC, double pesoD) {
        this.pesoA = pesoA;
        this.pesoB = pesoB;
        this.pesoC = pesoC;
        this.pesoD = pesoD;
        obtenerDiferenteYPesoRelativo();
    }

    private void obtenerDiferenteYPesoRelativo() {
        if (pesoA == pesoB && pesoA == pesoC) {
            esferaDiferente = "D";
            pesoRelativo = pesoD > pesoA ? "mayor" : "menor";
        } else if (pesoA == pesoB && pesoA == pesoD) {
            esferaDiferente = "C";
            pesoRelativo = pesoC > pesoA ? "mayor" : "menor";
        } else if (pesoA == pesoC && pesoA == pesoD) {
            esferaDiferente = "B";
            pesoRelativo = pesoB > pesoD ? "mayor" : "menor";
        } else {
            esferaDiferente = "A";
            pesoRelativo = pesoA > pesoB ? "mayor" : "menor";
        }
    }

    public String obtenerResultado() {
        return "La esfera " + esferaDiferente + " es diferente y es de " + pesoRelativo + " peso que las otras tres.";
    }
}
