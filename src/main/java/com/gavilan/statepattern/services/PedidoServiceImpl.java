package com.gavilan.statepattern.services;

import com.gavilan.statepattern.dao.PedidoDAO;
import com.gavilan.statepattern.domain.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ezequiel Gavilán
 */

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoDAO pedidoDAO;

    public PedidoServiceImpl(PedidoDAO pedidoDAO) {
        this.pedidoDAO = pedidoDAO;
    }

    @Override
    public Pedido save(Pedido pedido) {
        return pedidoDAO.save(pedido);
    }

    @Override
    public Pedido findById(Long id) {
        return pedidoDAO.findById(id).orElse(null);
    }

    @Override
    public List<Pedido> findAll() {
        return (List<Pedido>) pedidoDAO.findAll();
    }

    @Override
    public Pedido abrirPedido(Pedido pedido) {
        Pedido cambiadoEstado;

        pedido.getEstado().abrir(pedido);

        cambiadoEstado = this.save(pedido);
        return cambiadoEstado;
    }

    @Override
    public Pedido cerrarPedido(Pedido pedido) {
        Pedido cambiadoEstado;

        pedido.getEstado().cerrar(pedido);

        cambiadoEstado = this.save(pedido);
        return cambiadoEstado;
    }
}
