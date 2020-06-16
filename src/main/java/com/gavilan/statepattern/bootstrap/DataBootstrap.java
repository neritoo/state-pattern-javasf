package com.gavilan.statepattern.bootstrap;

import com.gavilan.statepattern.domain.Abierto;
import com.gavilan.statepattern.domain.Cerrado;
import com.gavilan.statepattern.domain.Estado;
import com.gavilan.statepattern.services.EstadoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Ezequiel Gavilán
 */

@Component
public class DataBootstrap implements CommandLineRunner {
    private final EstadoService estadoService;

    public DataBootstrap(EstadoService estadoService) {
        this.estadoService = estadoService;
    }


    @Override
    public void run(String... args) throws Exception {

        Estado abierto = new Abierto();
        Estado cerrado = new Cerrado();

        this.estadoService.save(abierto);
        this.estadoService.save(cerrado);

    }
}
