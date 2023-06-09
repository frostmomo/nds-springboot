package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Context as SpringBoot App
@SpringBootApplication
// REST API Controller
@RestController
// Mapping starts with "url/world"
@RequestMapping("/world")
public class HttpController {

    // Hello World 
    @GetMapping(value = "/world")
    public String HelloController(){
        return "Hello";
    }

    // Using @Value for Injection
    @Value("Tangkas")
    private String name;

    @GetMapping(value =  "/user")
    public String UserController(){
        return name;
    }

    // Using @Value from application.properties
    @Value("${master.user.name}")
    private String username;

    @GetMapping(value = "/username")
    public String UsernameController(){
        return username;
    }
}
