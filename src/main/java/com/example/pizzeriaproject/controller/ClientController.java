package com.example.pizzeriaproject.controller;

import com.example.pizzeriaproject.entity.Client;
import com.example.pizzeriaproject.services.ClientService;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.modeler.BaseAttributeFilter;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor

public class ClientController {
    private ClientService clientService;
    @RequestMapping("/createClient")
    public String createClient(){
        return "CreateClient";
    }
    @RequestMapping("saveClient")
    public String saveClient(@ModelAttribute ("clientView ") Client ClientController){
        Client saveClient = clientService.saveClient(ClientController);
        return "CreateClient";
    }
    @RequestMapping("/clientList")
    public String clientList(ModelMap modelMap,
                             @RequestParam(name= "page", defaultValue = "0") int page,
                             @RequestParam(name= "size", defaultValue = "4") int size
                             ){
        Page<Client> clientController = clientService.getAllClientsByPage(page, size);
        modelMap.addAttribute("clients",clientController);
        modelMap.addAttribute("currentPage",page);
        modelMap.addAttribute("pages",new int[Client.getTotalPages()]);
        return "ClientList";
    }
    @RequestMapping("/deleteClient")
    public String deleteClient(@RequestParam("id")Long id ,ModelMap modelMap){
        ClientService.deleteClientById(id);
        List<Client> clientController = clientService.getAllclient();
        modelMap.addAttribute("clientView", clientController);
        return  "ClientList";

    }
    @RequestMapping("/EditClient")
    public String editClient(@RequestParam("id")Long id ,ModelMap modelMap){
        Client clientController = ClientService.getClientByID(id);
        modelMap.addAttribute("clientView", clientController);
        return  "EditClient";

    }
    @RequestMapping("updateClient")
    public String updateClient(@ModelAttribute ("clientView ") Client ClientController){
       clientService.updateClient(ClientController);
        return "CreateClient";
    }




}
