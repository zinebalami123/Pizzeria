package com.example.pizzeriaproject.repository;

import com.example.pizzeriaproject.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
