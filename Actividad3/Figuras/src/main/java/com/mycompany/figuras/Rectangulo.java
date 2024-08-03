package com.mycompany.figuras;

public class Rectangulo {

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double CalcularArea() {
        return base * altura;
    }

    public double CalcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
