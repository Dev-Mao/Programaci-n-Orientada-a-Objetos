package com.mycompany.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las ventas del departamento 1:");
        double ventas1 = scanner.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2:");
        double ventas2 = scanner.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3:");
        double ventas3 = scanner.nextDouble();

        System.out.println("Ingrese el salario de los vendedores:");
        double salario = scanner.nextDouble();

        Empresa empresa = new Empresa();
        empresa.agregarDepartamento(new Departamento(1, ventas1, salario));
        empresa.agregarDepartamento(new Departamento(2, ventas2, salario));
        empresa.agregarDepartamento(new Departamento(3, ventas3, salario));

        System.out.println("Resultados:");
        empresa.calcularSalarios();

        scanner.close();
    }
}