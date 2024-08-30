package org.pizza.model;

public class Cocina extends Identified{
    private TIPOPIZZA tipoPizza;
    private TAMANIO tamano;
    private Double precio;

    public TIPOPIZZA getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(TIPOPIZZA tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public TAMANIO getTamano() {
        return tamano;
    }

    public void setTamano(TAMANIO tamano) {
        this.tamano = tamano;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
