package com.projeto_java.curso_spring.services;

import com.projeto_java.curso_spring.entities.User;
import com.projeto_java.curso_spring.repositories.UserRepository;
import com.projeto_java.curso_spring.services.exeception.DataBaseException;
import com.projeto_java.curso_spring.services.exeception.ResourceNotFoundExecption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll () {
        return userRepository.findAll();
    }

    public User findById (Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundExecption(id));
    }

    public User insert (User user) {
        return userRepository.save(user);
    }

    public void delete (Long id) {
        try {
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException  e) {
            throw new ResourceNotFoundExecption(e);
        } catch (DataIntegrityViolationException e){
            throw new DataBaseException(e.getMessage());
        }
    }

    public User update (long id, User obj) {
        User entity = userRepository.getReferenceById(id);
        updateData(entity, obj);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
