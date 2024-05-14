package com.example.pizzeriaproject.repository;

import com.example.pizzeriaproject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role, Long> {


    Role findByName(String name);
}
