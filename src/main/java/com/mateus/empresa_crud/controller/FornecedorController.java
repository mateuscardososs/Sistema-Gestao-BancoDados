package com.mateus.empresa_crud.controller;

import com.mateus.empresa_crud.model.Fornecedor;
import com.mateus.empresa_crud.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fornecedores")
@CrossOrigin(origins = "*")
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepo;

    @GetMapping
    public List<Fornecedor> listar() {
        return fornecedorRepo.findAll();
    }

    @PostMapping
    public Fornecedor salvar(@RequestBody Fornecedor fornecedor) {
        return fornecedorRepo.save(fornecedor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        fornecedorRepo.deleteById(id);
    }
}