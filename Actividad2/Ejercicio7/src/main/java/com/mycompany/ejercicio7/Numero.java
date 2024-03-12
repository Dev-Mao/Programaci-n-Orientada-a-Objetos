package com.mycompany.ejercicio7;

public class Numero {
    private final int valorA;
    private final int valorB;
    
    public Numero(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }
    
    public void comparar() {
        if (valorA > valorB) {
            System.out.println("A es mayor que B.");
        } else if (valorA < valorB) {
            System.out.println("A es menor que B.");
        } else {
            System.out.println("A es igual a B.");
        }
    }
}
