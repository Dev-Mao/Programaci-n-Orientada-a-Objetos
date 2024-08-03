package com.mycompany.figuras;

public class Cuadrado {

    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double CalcularArea() {
        return lado * lado;
    }

    public double CalcularPerimetro() {
        return (4 * lado);
    }
}
