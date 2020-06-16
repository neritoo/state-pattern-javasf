package com.gavilan.statepattern;

import com.gavilan.statepattern.controllers.ControladorPedido;
import com.gavilan.statepattern.domain.Abierto;
import com.gavilan.statepattern.domain.Cerrado;
import com.gavilan.statepattern.domain.Estado;
import com.gavilan.statepattern.domain.Pedido;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StatePatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatePatternApplication.class, args);
    }
}
