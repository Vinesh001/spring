package com.amdocs.springboot;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learning")
public class HelloController implements ErrorController {

    @GetMapping("/login")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Guest") String name,
            @RequestParam(value = "password", defaultValue = "password") String password) {
        return "Hello, " + name + "! You have successfully logged in .";
    }

    @GetMapping("/logout")
    public String greet() {
        return "You are logged out!!! ";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/error")
    public String error() {
        return "An error occurred. Please try again later.";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name;
    }

}
