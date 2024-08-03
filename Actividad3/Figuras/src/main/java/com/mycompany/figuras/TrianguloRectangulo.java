package com.mycompany.figuras;

public class TrianguloRectangulo {

    double base;
    double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double CalcularArea() {
        return (base * altura / 2);
    }

    public double CalcularPerimetro() {
        return (base + altura + CalcularHipotenusa());
    }

    public double CalcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    public String DeterminarTipoTriangulo() {
        if ((base == altura) && (base == CalcularHipotenusa()) && (altura == CalcularHipotenusa())) {
            return "Equilatero";
        } else if ((base != altura) && (base != CalcularHipotenusa()) && (altura != CalcularHipotenusa())) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }
}
