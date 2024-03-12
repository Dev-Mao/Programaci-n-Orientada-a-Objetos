package com.mycompany.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private final List<Departamento> departamentos;

    public Empresa() {
        departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public double calcularTotalVentas() {
        double totalVentas = 0;
        for (Departamento departamento : departamentos) {
            totalVentas += departamento.getVentas();
        }
        return totalVentas;
    }

    public double calcularPorcentajeVentas() {
        return calcularTotalVentas() * 0.33;
    }

    public void calcularSalarios() {
        double porcentajeVentas = calcularPorcentajeVentas();
        for (Departamento departamento : departamentos) {
            double ventas = departamento.getVentas();
            double salario = departamento.getSalario();
            if (ventas > porcentajeVentas) {
                salario += salario * 0.2;
            }
            System.out.println("Salario en departamento " + departamento.getId() + ": " + salario);
        }
    }
}