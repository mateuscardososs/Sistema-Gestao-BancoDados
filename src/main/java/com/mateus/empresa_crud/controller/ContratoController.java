package com.mateus.empresa_crud.controller;

import com.mateus.empresa_crud.model.Cliente;
import com.mateus.empresa_crud.model.Contrata;
import com.mateus.empresa_crud.model.Servico;
import com.mateus.empresa_crud.repository.ClienteRepository;
import com.mateus.empresa_crud.repository.ContrataRepository;
import com.mateus.empresa_crud.repository.ServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/api/contratos")
@CrossOrigin(origins = "*")
public class ContratoController {

    @Autowired
    private ContrataRepository contratoRepo;

    @Autowired
    private ClienteRepository clienteRepo;

    @Autowired
    private ServicoRepository servicoRepo;

    @GetMapping
    public List<Map<String, Object>> listar() {
        List<Contrata> contratos = contratoRepo.findAll();
        List<Map<String, Object>> resposta = new ArrayList<>();

        for (Contrata c : contratos) {
            Map<String, Object> dados = new HashMap<>();
            dados.put("id", c.getId());
            dados.put("dataAtendimento", c.getDataAtendimento());
            dados.put("cliente", c.getCliente() != null ? c.getCliente().getNome() : "Sem nome");
            dados.put("servico", c.getServico() != null ? c.getServico().getIdServico() : "Sem ID");
            resposta.add(dados);
        }

        return resposta;
    }

    @PostMapping
    public Contrata salvar(@RequestBody Map<String, String> dados) {
        Contrata contrato = new Contrata();

        Integer idCliente = Integer.parseInt(dados.get("idCliente"));
        Integer idServico = Integer.parseInt(dados.get("idServico"));
        LocalDate data = LocalDate.parse(dados.get("dataAtendimento"));

        Cliente cliente = clienteRepo.findById(idCliente).orElse(null);
        Servico servico = servicoRepo.findById(idServico).orElse(null);

        contrato.setCliente(cliente);
        contrato.setServico(servico);
        contrato.setDataAtendimento(data);

        return contratoRepo.save(contrato);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        contratoRepo.deleteById(id);
    }
}