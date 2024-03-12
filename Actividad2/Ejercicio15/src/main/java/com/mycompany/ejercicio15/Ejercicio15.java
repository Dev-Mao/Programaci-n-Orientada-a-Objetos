package com.mycompany.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        double pesoA = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera B:");
        double pesoB = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera C:");
        double pesoC = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera D:");
        double pesoD = scanner.nextDouble();

        scanner.close();

        Esfera esfera = new Esfera(pesoA, pesoB, pesoC, pesoD);
        String resultado = esfera.obtenerResultado();
        System.out.println(resultado);
    }
}
