package com.mateus.empresa_crud.controller;

import com.mateus.empresa_crud.model.Execucao;
import com.mateus.empresa_crud.repository.ExecucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/execucoes")
@CrossOrigin(origins = "*")
public class ExecucaoController {

    @Autowired
    private ExecucaoRepository repo;

    @GetMapping
    public List<Execucao> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Execucao salvar(@RequestBody Execucao e) {
        return repo.save(e);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
