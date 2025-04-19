// Controller atualizado
package com.mateus.empresa_crud.controller;

import com.mateus.empresa_crud.model.Material;
import com.mateus.empresa_crud.model.MovimentacaoEstoque;
import com.mateus.empresa_crud.repository.MaterialRepository;
import com.mateus.empresa_crud.repository.MovimentacaoEstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimentacoes")
@CrossOrigin(origins = "*")
public class MovimentacaoEstoqueController {

    @Autowired
    private MovimentacaoEstoqueRepository movimentacaoRepo;

    @Autowired
    private MaterialRepository materialRepo;

    @GetMapping
    public List<MovimentacaoEstoque> listar() {
        return movimentacaoRepo.findAll();
    }

    @PostMapping
    public MovimentacaoEstoque salvar(@RequestBody MovimentacaoEstoque mov) {
        if (mov.getMaterial() != null && mov.getMaterial().getIdMaterial() != null) {
            Material mat = materialRepo.findById(mov.getMaterial().getIdMaterial())
                    .orElseThrow(() -> new RuntimeException("Material não encontrado"));
            mov.setMaterial(mat);
        } else {
            throw new RuntimeException("ID do material obrigatório");
        }
        return movimentacaoRepo.save(mov);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        movimentacaoRepo.deleteById(id);
    }
}