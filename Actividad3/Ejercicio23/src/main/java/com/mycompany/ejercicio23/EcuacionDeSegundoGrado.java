package com.mycompany.ejercicio23;

public class EcuacionDeSegundoGrado {

    private final double A, B, C;

    public EcuacionDeSegundoGrado(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public String[] calcularSoluciones() {
        double discriminante = (B * B) - (4 * A * C);

        if (discriminante > 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            return new String[]{"x1 = " + x1, "x2 = " + x2};
        } else if (discriminante == 0) {
            double x = -B / (2 * A);
            return new String[]{"x = " + x};
        } else {
            double parteReal = -B / (2 * A);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * A);
            return new String[]{"x1 = " + parteReal + " + " + parteImaginaria + "i", "x2 = " + parteReal + " - " + parteImaginaria + "i"};
        }
    }
}
