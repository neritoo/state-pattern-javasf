package com.gavilan.statepattern.dao;

import com.gavilan.statepattern.domain.Pedido;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ezequiel Gavilán
 */
public interface PedidoDAO extends CrudRepository<Pedido, Long> {
}
