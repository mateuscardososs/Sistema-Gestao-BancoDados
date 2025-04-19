package com.mateus.empresa_crud.controller;

import com.mateus.empresa_crud.model.Servico;
import com.mateus.empresa_crud.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicos")
@CrossOrigin(origins = "*")
public class ServicoController {

    @Autowired
    private ServicoRepository repo;

    @GetMapping
    public List<Servico> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Servico salvar(@RequestBody Servico s) {
        return repo.save(s);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
