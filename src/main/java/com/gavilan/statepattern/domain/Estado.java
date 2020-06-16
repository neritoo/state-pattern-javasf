package com.gavilan.statepattern.domain;

import javax.persistence.*;

/**
 * @author Ezequiel Gavilán
 */
@Entity
@Inheritance
@DiscriminatorColumn(name = "tipo_estado")
@Table(name = "estados")
public abstract class Estado {

    @Id
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String descripcion) {
        this.nombre = descripcion;
    }

    public void abrir(Pedido pedido) {

    }

    public void cerrar(Pedido pedido) {

    }

    @Override
    public String toString() {
        return "Estado{" +
                "descripcion='" + nombre + '\'' +
                '}';
    }
}
