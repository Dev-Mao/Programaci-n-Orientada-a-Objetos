/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número de inscripción:");
        int numeroInscripcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        System.out.println("Ingrese los nombres:");
        String nombres = scanner.nextLine();
        
        System.out.println("Ingrese el patrimonio:");
        double patrimonio = scanner.nextDouble();
        
        System.out.println("Ingrese el estrato social:");
        int estratoSocial = scanner.nextInt();
        
        Estudiante estudiante = new Estudiante(numeroInscripcion, nombres, patrimonio, estratoSocial);
        
        double pagoMatricula = Universidad.calcularPagoMatricula(estudiante);
        
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + estudiante.getNumeroInscripcion() + " Y NOMBRE " + estudiante.getNombres() + " DEBE PAGAR $" + pagoMatricula);
        scanner.close();
    }
}