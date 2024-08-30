package org.pizza.model;

import java.time.LocalDate;

public class Orden extends  Identified {
    private Long noOrden;

    private Client cliente;
    private User usuario;
    private LocalDate fecha;

    private Double total;

    public Long getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(Long noOrden) {
        this.noOrden = noOrden;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
