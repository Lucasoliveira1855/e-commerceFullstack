package com.ecommerce.backend.service;
import com.ecommerce.backend.dto.UserResponseDTO;
import com.ecommerce.backend.models.User;
import com.ecommerce.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.backend.Enum.UserRole;
import com.ecommerce.backend.dto.*;
import com.ecommerce.backend.config.SecurityConfig;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //cadastro usuario
    public UserResponseDTO registerUser(UserRequestDTO userRequest){
        if(userRepository.exexistsByEmail(userRequest.getEmail())){
            throw new RuntimeException("email já cadastrado!");
        }
        User user = User.builder()
            .name(userRequest.getName())
            .email(userRequest.getEmail())
            .password(passwordEncoder.encode(userRequest.getPassword()))
            .role(userRequest.getRole() != null ? userRequest.getRole() : UserRole.ROLE_USER)
            .build();
    }
}
