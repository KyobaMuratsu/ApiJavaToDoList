package br.todolist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.todolist.entities.User;
import br.todolist.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createNewUser(String name, String email, String password){
        String encriptedPassword = passwordEncoder.encode(password);
        User user = new User(name, email, encriptedPassword);
        return userRepository.save(user);
    }
}
