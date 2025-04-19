package com.mateus.empresa_crud.repository;

import com.mateus.empresa_crud.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
}