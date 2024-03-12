package com.mycompany.ejercicio13;

public class Cliente {
    private final double valorCompra;
    private final String colorBolita;

    public Cliente(double valorCompra, String colorBolita) {
        this.valorCompra = valorCompra;
        this.colorBolita = colorBolita;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public String getColorBolita() {
        return colorBolita;
    }
}

