package com.example.pizzeriaproject.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("TPE")
@AllArgsConstructor
@NoArgsConstructor
public class Tpe extends Payment {
    private String bankId;
    private String bankName;
}
