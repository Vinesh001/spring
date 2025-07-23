package com.example.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Welcome to new World");
        return "Hello"; // Maps to Hello.jsp in view resolver
    }
}
