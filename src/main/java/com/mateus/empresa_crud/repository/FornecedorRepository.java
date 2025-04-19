package com.mateus.empresa_crud.repository;

import com.mateus.empresa_crud.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
}
