package com.sistema.repository;

import com.sistema.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

//extende interfce JpaRespository
//trás metodos de find, save, delete etc
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
