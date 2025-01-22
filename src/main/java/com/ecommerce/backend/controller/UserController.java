package com.ecommerce.backend.controller;
import com.ecommerce.backend.repositories.UserRepository;
import com.ecommerce.backend.models.User;
import com.ecommerce.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
public class UserController {
    @Autowired
    private UserService userService;

}
