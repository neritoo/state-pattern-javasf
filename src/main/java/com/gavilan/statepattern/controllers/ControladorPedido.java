package com.gavilan.statepattern.controllers;

import com.gavilan.statepattern.domain.Pedido;
import com.gavilan.statepattern.services.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ezequiel Gavilán
 */

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class ControladorPedido {

    private final PedidoService pedidoService;

    public ControladorPedido(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/pedidos")
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return this.pedidoService.save(pedido);
    }

    @GetMapping("/pedidos")
    public List<Pedido> mostrarPedidos() {
        return this.pedidoService.findAll();
    }

    @GetMapping("/pedidos/{id}")
    public Pedido mostrarPedido(@PathVariable Long id) {
        return this.pedidoService.findById(id);
    }

    @PutMapping("/pedidos/abrir")
    public Pedido abrirPedido(@RequestBody Pedido pedido) {
        return this.pedidoService.abrirPedido(pedido);
    }

    @PutMapping("/pedidos/cerrar")
    public Pedido cerrarPedido(@RequestBody Pedido pedido) {
        return this.pedidoService.cerrarPedido(pedido);
    }
}
