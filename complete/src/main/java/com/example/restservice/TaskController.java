package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/array")
    public String[] test(){
        return new String[]{"Hello", "World"};
    }
}
