package com.clouddevops.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome Cloud Devops Project!";
    }
}