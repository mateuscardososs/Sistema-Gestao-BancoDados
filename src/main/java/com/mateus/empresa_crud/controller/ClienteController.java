package com.mateus.empresa_crud.controller;

import com.mateus.empresa_crud.model.Cliente;
import com.mateus.empresa_crud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteRepository repo;

    @GetMapping
    public List<Cliente> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente c) {
        return repo.save(c);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
