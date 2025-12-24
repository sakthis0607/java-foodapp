package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

//    @GetMapping("/foods")
//    public String foodList() {
//        return "food-list";
//    }
    @GetMapping("/foods")
    public String foods() {
        return "food-list";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }
}
