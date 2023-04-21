package com.edu.gabriel.restapi.aprendendo.spring.web.e.rest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
}
