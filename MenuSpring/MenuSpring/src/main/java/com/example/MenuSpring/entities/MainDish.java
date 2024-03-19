package com.example.MenuSpring.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Dishes")

public class MainDish implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    public MainDish(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public MainDish() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
