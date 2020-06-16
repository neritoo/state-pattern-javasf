package com.gavilan.statepattern.dao;

import com.gavilan.statepattern.domain.Estado;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ezequiel Gavilán
 */
public interface EstadoDAO extends CrudRepository<Estado, String> {
}
