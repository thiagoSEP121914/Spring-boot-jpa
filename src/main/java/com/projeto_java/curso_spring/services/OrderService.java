package com.projeto_java.curso_spring.services;

import com.projeto_java.curso_spring.entities.Order;
import com.projeto_java.curso_spring.entities.User;
import com.projeto_java.curso_spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
     private OrderRepository repository;

    public List<Order> findAll () {
        return repository.findAll();
    }

    public Order findById (Long id) {
        Optional<Order> order = repository.findById(id);
        return order.get();
    }

}
