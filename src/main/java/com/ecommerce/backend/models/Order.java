package com.ecommerce.backend.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date orderDate;

    @OneToMany(mappedBy = "order")
    private Set<OrderItem>ordemItems;

    private BigDecimal totalPrice;

    //getters e setters
}
