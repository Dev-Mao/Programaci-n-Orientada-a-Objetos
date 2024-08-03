package com.mycompany.ejercicio19;

class Triangulo {

    private final double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }

    public double calcularAltura() {
        return Math.sqrt(3) / 2 * lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }
}
