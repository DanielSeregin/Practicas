package com.example.MenuSpring.repositories;

import com.example.MenuSpring.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink,Long> {
}
