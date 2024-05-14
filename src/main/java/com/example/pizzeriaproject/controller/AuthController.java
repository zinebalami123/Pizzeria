package com.example.pizzeriaproject.controller;

import ch.qos.logback.core.model.Model;
import com.example.pizzeriaproject.dtos.UserDto;
import com.example.pizzeriaproject.entity.Client;
import com.example.pizzeriaproject.services.ClientService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AuthController {
    private ClientService clientService;
    public AuthController(ClientService clientService) {
        this.clientService = clientService;
    }

    // handler method to handle home page request
    @GetMapping("/index")
    public String home(){
        return "Index";
    }

    // handler method to handle user registration form request
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        // create model object to store form data
        UserDto user = new UserDto();
        model.addText("user", user);
        return "register";
    }

    // handler method to handle user registration form submit request
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               Model model){
        Client existingUser = ClientService.findUserByEmail(userDto.getEmail());

        if(existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()){
            result.rejectValue("email", null,
                    "There is already an account registered with the same email");
        }

        if(result.hasErrors()){
            model.addText("user", userDto);
            return "/register";
        }

        ClientService.saveClient(UserDto);
        return "redirect:/register?success";



    }

    // handler method to handle list of users
    @GetMapping("/users")
    public String users(Model model){
        List<Client> users = clientService.findAllClients();
        model.addText("users", client);
        return "users";
    }

}