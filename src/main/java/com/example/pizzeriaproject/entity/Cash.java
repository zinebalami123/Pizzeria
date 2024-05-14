package com.example.pizzeriaproject.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("CASH")
@AllArgsConstructor
@NoArgsConstructor
public class Cash extends Payment {
    private Double cashTendered;
    private String currency;
}
