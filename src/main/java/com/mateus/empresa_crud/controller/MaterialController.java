package com.mateus.empresa_crud.controller;

import com.mateus.empresa_crud.model.Material;
import com.mateus.empresa_crud.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiais")
@CrossOrigin(origins = "*")
public class MaterialController {

    @Autowired
    private MaterialRepository materialRepo;

    @GetMapping
    public List<Material> listar() {
        return materialRepo.findAll();
    }

    @PostMapping
    public Material salvar(@RequestBody Material material) {
        return materialRepo.save(material);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        materialRepo.deleteById(id);
    }
}