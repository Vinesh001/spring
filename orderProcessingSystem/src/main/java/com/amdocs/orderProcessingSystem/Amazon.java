package com.amdocs.orderProcessingSystem;

import org.springframework.stereotype.Component;

@Component("amazon")
public class Amazon implements Order {

    public void processOrder() {
        System.out.println("Processing order in Amazon");
    }
}