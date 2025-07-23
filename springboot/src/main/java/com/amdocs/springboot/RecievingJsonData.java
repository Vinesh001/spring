package com.amdocs.springboot;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/receive")
@RestController
public class RecievingJsonData {

    @PostMapping("/data")
    public ResponseEntity<String> receiveData(@RequestBody List<String> jsonData) {
        System.out.println("Received JSON data: " + jsonData);
        return ResponseEntity.ok("Data received");
    }
}
