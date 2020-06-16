package com.gavilan.statepattern.domain;

import javax.persistence.*;

/**
 * @author Ezequiel Gavilán
 */
@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fechaPedido;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "estado")
    private Estado estado;

    public Pedido() {
        this.estado = new Abierto();
    }

    public Pedido(String fechaPedido, Estado estado) {
        this.fechaPedido = fechaPedido;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /*
    public void abrirPedido() {
        this.estado.abrir(this);
    }

    public void cerrarPedido() {
        this.estado.cerrar(this);
    }
     */

    @Override
    public String toString() {
        return "Pedido{" +
                "fechaPedido='" + fechaPedido + '\'' +
                ", estado=" + estado +
                '}';
    }
}
