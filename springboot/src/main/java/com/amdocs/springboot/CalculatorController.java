package com.amdocs.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return "Result: " + (a + b);
    }

    @GetMapping("/sub/{a}/{b}")
    public String subtract(@PathVariable int a, @PathVariable int b) {
        return "Result: " + (a - b);
    }

    @GetMapping("/mul/{a}/{b}")
    public String multiply(@PathVariable int a, @PathVariable int b) {
        return "Result: " + (a * b);
    }

    @GetMapping("/div/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b) {
        if (b == 0) {
            return "Error: Division by zero!";
        }
        return "Result: " + (a / b);
    }
}
