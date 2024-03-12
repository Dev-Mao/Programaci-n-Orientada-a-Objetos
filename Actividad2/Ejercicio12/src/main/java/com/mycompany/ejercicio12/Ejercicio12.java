package com.mycompany.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el número de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.println("Ingrese el valor de la hora normal de trabajo:");
        double valorHoraNormal = scanner.nextDouble();
        
        Trabajador trabajador = new Trabajador(nombre, horasTrabajadas, valorHoraNormal);
        double salario = CalculadoraSalario.calcularSalario(trabajador);
        
        System.out.println("EL TRABAJADOR " + trabajador.getNombre() + " DEVENGÓ " + salario);
        
        scanner.close();
    }
}