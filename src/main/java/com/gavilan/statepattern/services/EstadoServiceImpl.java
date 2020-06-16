package com.gavilan.statepattern.services;

import com.gavilan.statepattern.dao.EstadoDAO;
import com.gavilan.statepattern.domain.Estado;
import org.springframework.stereotype.Service;

/**
 * @author Ezequiel Gavilán
 */
@Service
public class EstadoServiceImpl implements EstadoService {
    private final EstadoDAO estadoDAO;

    public EstadoServiceImpl(EstadoDAO estadoDAO) {
        this.estadoDAO = estadoDAO;
    }

    @Override
    public Estado save(Estado estado) {
        return estadoDAO.save(estado);
    }
}
