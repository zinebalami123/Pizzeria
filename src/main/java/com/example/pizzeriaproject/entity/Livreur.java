package com.example.pizzeriaproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Livreur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String telephone;
    private String statut;
    private String positionGPS;
    private double noteMoyenne;
  @OneToMany(mappedBy = "livreur",fetch =FetchType.LAZY)
   private List<Commande> commande=new ArrayList<>();
}
