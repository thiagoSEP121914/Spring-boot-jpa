package com.projeto_java.curso_spring.config;

import com.projeto_java.curso_spring.entities.User;
import com.projeto_java.curso_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "Maria@gmail.com", "999888888", "123456");
        User u2 = new User(null, "Alex green", "AlexGay@gmail.com", "97777777", "123456");
        List<User> list = Arrays.asList(u1, u2);
        userRepository.saveAll(list);

    }
}
