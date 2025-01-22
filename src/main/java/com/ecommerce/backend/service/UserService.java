package com.ecommerce.backend.service;
import com.ecommerce.backend.models.User;
import com.ecommerce.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username){
        return userRepository.findUsername(username);
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
