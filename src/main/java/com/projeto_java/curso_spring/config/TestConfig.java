package com.projeto_java.curso_spring.config;

import com.projeto_java.curso_spring.entities.Category;
import com.projeto_java.curso_spring.entities.Order;
import com.projeto_java.curso_spring.entities.User;
import com.projeto_java.curso_spring.entities.enums.OrderStatus;
import com.projeto_java.curso_spring.repositories.CategoryRepository;
import com.projeto_java.curso_spring.repositories.OrderRepository;
import com.projeto_java.curso_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;



    @Override
    public void run(String... args) throws Exception {

        Category c1 = new Category(null, "Games");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");

        User u1 = new User(null, "Maria Brown", "Maria@gmail.com", "999888888", "123456");
        User u2 = new User(null, "Alex green", "AlexGay@gmail.com", "97777777", "123456");
        List<User> list = Arrays.asList(u1, u2);

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID,u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT ,u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT ,u1);

        userRepository.saveAll(list);
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
    }
}
