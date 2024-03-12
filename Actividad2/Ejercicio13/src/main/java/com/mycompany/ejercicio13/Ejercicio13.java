package com.mycompany.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Ingrese el color de la bolita (blanca, verde, amarilla, azul):");
        String colorBolita = scanner.next();

        Cliente cliente = new Cliente(valorCompra, colorBolita);
        double valorPagar = CalculadoraDescuento.calcularValorPagar(cliente);

        System.out.println("El cliente deberá pagar: " + valorPagar);

        scanner.close();
    }
}
