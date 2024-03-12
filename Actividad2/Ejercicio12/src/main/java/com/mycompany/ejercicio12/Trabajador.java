package com.mycompany.ejercicio12;

public class Trabajador {
    private final String nombre;
    private final int horasTrabajadas;
    private final double valorHoraNormal;

    public Trabajador(String nombre, int horasTrabajadas, double valorHoraNormal) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraNormal = valorHoraNormal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getValorHoraNormal() {
        return valorHoraNormal;
    }
}
