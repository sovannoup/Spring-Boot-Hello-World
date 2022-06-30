package com.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello guys. Welcome to home page !!!";
    }
}
