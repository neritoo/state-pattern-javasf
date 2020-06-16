package com.gavilan.statepattern.domain;

import javax.persistence.Entity;

/**
 * @author Ezequiel Gavilán
 */
@Entity
public class Cerrado extends Estado {

    public Cerrado() {
        super.setNombre("Cerrado");
    }

    @Override
    public void abrir(Pedido pedido) {
        Estado abierto = new Abierto();
        pedido.setEstado(abierto);
    }
}
