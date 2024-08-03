package com.mycompany.ejercicio10;

public class Universidad {
    private static final double COSTO_MATRICULA = 50000;

    public static double calcularPagoMatricula(Estudiante estudiante) {
        double pagoMatricula = COSTO_MATRICULA;
        
        if (estudiante.getPatrimonio() > 2000000 && estudiante.getEstratoSocial() > 3) {
            pagoMatricula += 0.03 * estudiante.getPatrimonio();
        }
        
        return pagoMatricula;
    }
}