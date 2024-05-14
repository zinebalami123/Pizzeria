package com.example.pizzeriaproject.services;

import com.example.pizzeriaproject.entity.Client;
import com.example.pizzeriaproject.entity.Pizza;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ClientService {


    static void deleteClientById(Long id) {
    }

    void createClient(Client client);
    Client findUser(long id);

    List<Client> findAllClients();
    void editClient(Client client);
    void updateClient(Client client);
    void deleteClient(long id);

    static Client getClientByID(long id) {
        return null;
    }

    void fillInfoAboutClient(Client client);
    List<Pizza> findAllPizzaOfUserByUsername(String username);
    List<Client> getAllClients();
    Page<Client> getAllClientsByPage(int page, int size);
    @CacheEvict(value = "userCache")
    void clearCache();

    Client saveClient(Client client);

    List<Client> getAllclient();



    Client findUserByEmail(String email);


}
