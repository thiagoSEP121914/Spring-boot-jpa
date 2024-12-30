package com.projeto_java.curso_spring.repositories;

import com.projeto_java.curso_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
