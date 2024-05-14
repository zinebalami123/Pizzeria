package com.example.pizzeriaproject.repository;


import com.example.pizzeriaproject.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PizzaRepository extends JpaRepository<Pizza,Long> {

    Pizza findByName(String name);
}
