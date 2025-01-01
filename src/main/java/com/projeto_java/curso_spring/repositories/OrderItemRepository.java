package com.projeto_java.curso_spring.repositories;

import com.projeto_java.curso_spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
