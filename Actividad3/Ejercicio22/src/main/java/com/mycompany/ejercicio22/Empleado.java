package com.mycompany.ejercicio22;

public class Empleado {
    private final String nombre;
    private final double salarioHora;
    private final int horasTrabajadas;

    public Empleado(String nombre, double salarioHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioHora * horasTrabajadas;
    }
}
