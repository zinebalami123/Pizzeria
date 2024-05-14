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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Category;
    private String ParentId;
  @OneToMany(mappedBy = "category",fetch =FetchType.LAZY)
private List<Pizza> pizza=new ArrayList<>();
}
