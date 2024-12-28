package com.projeto_java.curso_spring.repositories;

import com.projeto_java.curso_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
