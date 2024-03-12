package com.mycompany.ejercicio14;

public class Departamento {

    private final int id;
    private final double ventas;
    private final double salario;

    public Departamento(int id, double ventas, double salario) {
        this.id = id;
        this.ventas = ventas;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public double getVentas() {
        return ventas;
    }

    public double getSalario() {
        return salario;
    }
}
