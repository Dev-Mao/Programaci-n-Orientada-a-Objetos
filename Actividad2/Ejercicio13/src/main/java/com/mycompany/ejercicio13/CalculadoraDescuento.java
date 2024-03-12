package com.mycompany.ejercicio13;

public class CalculadoraDescuento {
    public static double calcularValorPagar(Cliente cliente) {
        double valorCompra = cliente.getValorCompra();
        String colorBolita = cliente.getColorBolita();
        double porcentajeDescuento = 0;

        porcentajeDescuento = switch (colorBolita) {
            case "verde" -> 0.10;
            case "amarilla" -> 0.25;
            case "azul" -> 0.50;
            case "blanca" -> 0;
            default -> 1;
        };

        return valorCompra * (1 - porcentajeDescuento);
    }
}

