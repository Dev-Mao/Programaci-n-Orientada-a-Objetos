package com.mycompany.inmuebles;

public class Local extends Inmueble {

    public enum tipo {
        INTERNO, CALLE
    };
    
    protected tipo tipoLocal;

    public Local(int identificadorInmobiliario, int área, String dirección,
            tipo tipoLocal) {

        super(identificadorInmobiliario, área, dirección);
        this.tipoLocal = tipoLocal;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
