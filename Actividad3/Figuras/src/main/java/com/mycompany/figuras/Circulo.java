package com.mycompany.figuras;

public class Circulo {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double CalcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double CalcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
