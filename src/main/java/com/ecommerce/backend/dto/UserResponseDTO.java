package com.ecommerce.backend.dto;

import java.time.LocalDateTime;

import com.ecommerce.backend.Enum.UserRole;
import com.ecommerce.backend.dto.UserRequestDTO;
import com.ecommerce.backend.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private UserRole role;
    private LocalDateTime createdAt;
}
