package com.example.pizzeriaproject.dtos;

import com.example.pizzeriaproject.entity.Client;
import com.example.pizzeriaproject.entity.Pizza;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Commande {



    private long id;
    private List<Pizza> orderedPizza = new ArrayList<>();
    private Client client;
    private LocalDateTime createdTime;
    private boolean prepared;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Pizza> getOrderedPizza() {
        return orderedPizza;
    }

    public void setOrderedPizza(List<Pizza> orderedPizza) {
        this.orderedPizza = orderedPizza;
    }

    public Client getUser() {
        return client;
    }

    public void setUser(Client user) {
        this.client = user;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    @Override
    public String toString() {
        return "OrderPojo{" +
                "id=" + id +
                ", orderedPizza=" + orderedPizza +
                ", client=" + client +
                ", createdTime=" + createdTime +
                ", prepared=" + prepared +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commande)) return false;
        Commande pojo = (Commande) o;
        return id == pojo.id && Objects.equals(orderedPizza, pojo.orderedPizza) && Objects.equals(client, pojo.client) && Objects.equals(createdTime, pojo.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderedPizza, client, createdTime);
    }
}


