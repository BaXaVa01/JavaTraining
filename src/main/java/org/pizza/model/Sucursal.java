package org.pizza.model;

public class Sucursal extends Identified {
    //Tenemos los tipos primitivos que tienen un valor por default: Int, char, short, etc..

    // String es un objeto, por lo que al declararlo no se le asigna valor en memoria

    private String primerNombre;
    private String descripcion;

    private Departament departamento;

    public Departament getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departament departamento) {
        this.departamento = departamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

}
