package com.gavilan.statepattern.services;

import com.gavilan.statepattern.domain.Pedido;

import java.util.List;

/**
 * @author Ezequiel Gavilán
 */
public interface PedidoService {

    Pedido save(Pedido pedido);

    Pedido findById(Long id);

    List<Pedido> findAll();

    Pedido abrirPedido(Pedido pedido);

    Pedido cerrarPedido(Pedido pedido);

}
