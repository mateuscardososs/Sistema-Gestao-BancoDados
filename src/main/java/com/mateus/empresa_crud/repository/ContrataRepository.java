package com.mateus.empresa_crud.repository;

import com.mateus.empresa_crud.model.Contrata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContrataRepository extends JpaRepository<Contrata, Integer> {
}