package com.gavilan.statepattern.domain;

import javax.persistence.Entity;

/**
 * @author Ezequiel Gavilán
 */
@Entity
public class Abierto extends Estado {

    public Abierto() {
        super.setNombre("Abierto");
    }

    @Override
    public void cerrar(Pedido pedido) {
        Estado cerrado = new Cerrado();
        pedido.setEstado(cerrado);
    }
}
