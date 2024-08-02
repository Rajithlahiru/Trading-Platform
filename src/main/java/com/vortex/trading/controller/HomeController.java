package com.vortex.trading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String home() {
        return "Welcome to the trading application!";
    }
    @GetMapping("/api")
    public String secured() {
        return "Welcome to the secured trading application!";
    }
}
