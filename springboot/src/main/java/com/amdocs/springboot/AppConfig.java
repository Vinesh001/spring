package com.amdocs.springboot;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    public String printConfig() {
       return "AppConfig is loaded successfully! hello";
    }
}
