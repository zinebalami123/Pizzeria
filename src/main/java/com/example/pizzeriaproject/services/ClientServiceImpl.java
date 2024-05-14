package com.example.pizzeriaproject.services;

import com.example.pizzeriaproject.dtos.UserDto;
import com.example.pizzeriaproject.entity.Client;
import com.example.pizzeriaproject.entity.Pizza;
import com.example.pizzeriaproject.entity.Role;
import com.example.pizzeriaproject.repository.ClientRepository;
import com.example.pizzeriaproject.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.pizzeriaproject.repository.RoleRepository.*;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public void createClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client findUser(long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void editClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void updateClient(Client client) {

    }

    @Override
    public void deleteClient(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public void fillInfoAboutClient(Client client) {
        // Vous pouvez implémenter cette méthode selon vos besoins
    }

    @Override
    public List<Pizza> findAllPizzaOfUserByUsername(String username) {
        // Vous pouvez implémenter cette méthode selon vos besoins
        return null;
    }

    @Override
    public Page<Client> getAllClientsByPage(int page, int size) {
        return clientRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public void clearCache() {
        // Vous pouvez implémenter cette méthode selon vos besoins
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllclient() {
        return null;
    }

    @Override
    public Client findUserByEmail(String email) {
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }


    private UserDto mapToUserDto(Client user){
        UserDto userDto = new UserDto();
        String[] str = user.getFirstName().split(" ");
        userDto.setFirstName(str[0]);
        userDto.setLastName(str[1]);
        userDto.setEmail(user.getEmail());
        return userDto;
    }


}
