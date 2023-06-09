package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleController {
    
    @Value("Welcome")
    private String welcome;

    @GetMapping(value = "/")
    public String Welcome(){
        return welcome;
    }

    @Value("Tangkas")
    private String name;

    @GetMapping(value = "/profile")
    public String Profile(){
        return "This API is Created By "+name;
    }

    @Value("${master.role}")
    private String role;

    @GetMapping(value = "/role")
    public String Role(){
        return "My Role is "+role;
    }


}
