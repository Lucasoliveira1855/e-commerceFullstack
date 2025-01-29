package com.ecommerce.backend.repositories;

import com.ecommerce.backend.models.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    boolean exexistsByEmail(String email);
}
