package com.mateus.empresa_crud.repository;

import com.mateus.empresa_crud.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {}
