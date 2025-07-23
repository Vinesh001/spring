package com.amdocs.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fetching")
public class FetchingFromApplication {

    @Value("${name}")
    private String name;


    @GetMapping("/fetching")
    public String fetch() {
        return "Fetching from Application Property" + name;
    }
    
}
