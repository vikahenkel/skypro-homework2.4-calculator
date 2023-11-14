package com.github.skyprohomework2.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String hello(){
        return "Добро пожаловать!";
    }


}
