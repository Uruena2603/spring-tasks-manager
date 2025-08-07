package com.elsombras.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @RequestMapping("/hello")
    public String helloworld() {
        return "Awesome! Welcome to Spring Boot!";
    }
}