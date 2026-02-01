package com.wellsfargo.counselor.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity// This marks the class as a database table
public class Security {

    @Id // Requirement: Auto-generated ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer security_id; // [cite: 44]

    @Column(nullable = false)

    private String name; // [cite: 50]

    @Column(nullable = false)
    private String category; // [cite: 53]

    @Column(nullable = false)
    private Date purchase_date; // [cite: 56]

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal purchase_price; // [cite: 59, 60]

    @Column(nullable = false)
    private Integer quantity; // [cite: 62]

    // Requirement: Empty constructor for JPA
    public Security(Integer security_id) {
        this.security_id = security_id;
    }

    // Requirement: Constructor with all fields
    public Security(String name, String category, Date purchase_date, BigDecimal purchase_price, Integer quantity) {
        this.name = name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
    }

    // Requirement: Getters and Setters (IntelliJ can generate these!)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    // ... repeat for other fields ...
}