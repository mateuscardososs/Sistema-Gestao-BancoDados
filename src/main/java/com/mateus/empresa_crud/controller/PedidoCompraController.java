package com.mateus.empresa_crud.controller;

import com.mateus.empresa_crud.model.PedidoCompra;
import com.mateus.empresa_crud.repository.PedidoCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoCompraController {

    @Autowired
    private PedidoCompraRepository repo;

    @GetMapping
    public List<PedidoCompra> listar() {
        return repo.findAll();
    }

    @PostMapping
    public PedidoCompra salvar(@RequestBody PedidoCompra p) {
        return repo.save(p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
