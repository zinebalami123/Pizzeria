package com.example.pizzeriaproject.services;

import com.example.pizzeriaproject.entity.Pizza;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.SortedSet;
@Service
public interface PizzaService {


    Pizza createPizza(Pizza user);

    Pizza getPizza(long id);
    Pizza updatePizza(Pizza user);
    void deletePizza(long id);
    SortedSet<Pizza> getAllPizza();
    Pizza createPizza(Pizza pizza,String[] products,String[] amounts);
    Pizza updatePizza(long id,String[] products,String[] amounts);

    Pizza findByName(String name);

    @CacheEvict
    void clearCache();
}
