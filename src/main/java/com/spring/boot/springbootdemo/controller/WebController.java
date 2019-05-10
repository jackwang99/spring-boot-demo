package com.spring.boot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/viewProducts")
    public String viewProducts() {
        return "viewProducts";
    }

    @RequestMapping("/addProducts")
    public String addProducts() {
        return "addProducts";
    }
}
