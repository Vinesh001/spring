package com.amdocs.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calling")
public class CallingAppConfig {
   

    @Autowired
    private AppConfig appConfig;
    @GetMapping("/config")
    public String getConfig() {
        return appConfig.printConfig();
    }
}
