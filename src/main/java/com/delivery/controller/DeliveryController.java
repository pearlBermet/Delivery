package com.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DeliveryController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
