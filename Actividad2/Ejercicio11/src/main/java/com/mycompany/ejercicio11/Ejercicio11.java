package com.mycompany.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();
        
        Numero numero = new Numero();
        int mayor = numero.encontrarMayor(num1, num2, num3);
        
        System.out.println("El mayor número es: " + mayor);
        
        scanner.close();
    }
}
