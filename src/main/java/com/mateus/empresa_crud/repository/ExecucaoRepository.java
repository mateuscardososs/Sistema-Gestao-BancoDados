package com.mateus.empresa_crud.repository;

import com.mateus.empresa_crud.model.Execucao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExecucaoRepository extends JpaRepository<Execucao, Integer> {}
