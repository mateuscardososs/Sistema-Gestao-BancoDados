package com.mateus.empresa_crud.repository;

import com.mateus.empresa_crud.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {}
