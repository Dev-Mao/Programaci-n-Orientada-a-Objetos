package com.mycompany.ejercicio18;

class Empleado {

    private final int codigoEmpleado;
    private final String nombres;
    private final int horasTrabajadas;
    private final double valorHora;
    private final double retencion;

    public Empleado(int codigoEmpleado, String nombres, int horasTrabajadas, double valorHora, double retencion) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencion = retencion;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto - (salarioBruto * retencion / 100);
    }
}
