package com.mycompany.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A:");
        int valorA = scanner.nextInt();
     
        System.out.println("Ingrese el valor de B:");
        int valorB = scanner.nextInt();
        
        Numero numeros = new Numero(valorA, valorB);
        numeros.comparar();
        
        scanner.close();
    }
}


