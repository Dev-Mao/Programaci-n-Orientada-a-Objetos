package com.mycompany.ejercicio12;

public class CalculadoraSalario {
    public static double calcularSalario(Trabajador trabajador) {
        int horasTrabajadas = trabajador.getHorasTrabajadas();
        double valorHoraNormal = trabajador.getValorHoraNormal();
        double salario = 0;

        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;

            if (horasExtras > 8) {
                int horasExtrasExcedentes = horasExtras - 8;
                salario = (40 * valorHoraNormal) + (valorHoraNormal * 2 * 8) + (valorHoraNormal * 3 * horasExtrasExcedentes);
            } else {
                salario = (valorHoraNormal * 2 * horasExtras) + (valorHoraNormal * 40);
            }
        } else {
            salario = valorHoraNormal * horasTrabajadas;
        }

        return salario;
    }
}

