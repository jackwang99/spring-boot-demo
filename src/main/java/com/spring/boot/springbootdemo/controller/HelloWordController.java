package com.spring.boot.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping("/hello")
    public String index(){
        System.out.println("Hello World");
        return "Hello Wordss!";
    }
}
