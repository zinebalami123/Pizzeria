package com.example.pizzeriaproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "payment_type")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;



    @OneToMany(mappedBy = "commande", fetch = FetchType.LAZY)
    private Collection<Commande> commandes;  // Correction ici

//    @ManyToOne
//    @JoinColumn(name = "commande_id") // Nom de la colonne faisant référence à l'ID de la commande dans la table de paiement
//    private Commande commande;

    // Ajoutez d'autres attributs et méthodes si nécessaire


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
}
