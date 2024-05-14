package com.example.pizzeriaproject.services;

import com.example.pizzeriaproject.entity.Commande;
import com.example.pizzeriaproject.entity.Pizza;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CommandeService {



    Commande findOrderById(long id);
    List<Commande> findAllOrder();
    List<Commande> findAllOrderOfUserByUsername(String username);
    void createOrder(Commande order, List<Pizza> pizza, String username);
    void updateOrder(Commande order);
    void deleteOrder(long id);
    public List<Commande> findOrdersInProcessByUsername(List<Commande> orderList);
}
